package com.tesco.priceintegrity.common.json;

import com.tesco.priceintegrity.facade.producthierarchy.TescoProductHierarchyBean;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by XY89 on 12/15/2014.
 * This class parses JSOn content and,
 * generates o/p as key-value pairs and can be further designed to
 * pass the same to EPISYS in future
 */
public class JSonParser {

    private static Hashtable keyValues = null;
    private static int recordcount;

/*
    public  static void main(String[] args){

        //reset count to zero
        recordcount=0;
        parseJson();
        String key = null;
        String value = null;

        for (Enumeration<Integer> e = keyValues.keys(); e.hasMoreElements();) {
            key = e.nextElement().toString();
            System.out.println(key);
            TescoProductHierarchyBean bb = (TescoProductHierarchyBean) keyValues.get(new Integer(key));
            System.out.println(bb.getTpnc() + ":" + bb.getEan());
        }
    }
*/

    //This is the entry point to this class
    public static Hashtable parseJson() {
        ObjectMapper mapper = new ObjectMapper();

        keyValues = new Hashtable();

        //Json source file is found here
        //File jsonSource = new File("D:\\Episys\\excel1.json");
        try {
            //read Excel as Json
            ExcelToJson excelToJson = new ExcelToJson();
            String jsonSource = excelToJson.readExceltoJson();
            //Construct the tree based on the json file
            JsonNode rootNode = mapper.readTree(jsonSource);
            //Start processing json objects
            processJSonObject(rootNode);
        }
        //Any exceptions raised might end up here :)
        catch (Exception e) {
            e.printStackTrace();
        }
        return keyValues;
    }

    /**
     * This method is responsible to process Json arrays.
     * Written in a way to process the results recursively.
     */
    private static void processJSonArray(JsonNode rootNode) {
        //Loop through the array and
        //process appropriately
        for (int i = 0; i < rootNode.size(); i++) {
            //System.out.println(rootNode.get(i));
            //Check if the field is of type array
            if (rootNode.get(i).isArray()) {
                processJSonArray(rootNode.get(i));
            }
            //Otherwise process as an object
            else {
                processJSonObject(rootNode.get(i));
                recordcount++;
            }
        }
    }

    /**
     * This method is responsible to process Json objects.
     * Written in a way to process the results recursively.
     */
    private static void processJSonObject(JsonNode rootNode) {
        //Create an iterator to process json fields
        Iterator<Map.Entry<String, JsonNode>> fields = rootNode.getFields();
        //System.out.println(rootNode.toString());
        TescoProductHierarchyBean bean = new TescoProductHierarchyBean();
        //Now as we've the iterator ready, let us loop through
        while (fields.hasNext()) {
            Map.Entry<String, JsonNode> field = fields.next();
            //Check if the field is of type array
            if (field.getValue().isArray()) {
                //System.out.println("Array: "+field.getKey()+"="+field.getValue());
                processJSonArray(field.getValue());
            } else {//Otherwise process as an object
                //Following code changes are part of PER-258
                if (field.getKey().equals("EAN")) {
                    bean.setEan(field.getValue().toString());
                } else if (field.getKey().equals("TPNB")) {
                    bean.setTpnb(field.getValue().toString());
                } else if (field.getKey().equals("TPNC")) {
                    bean.setTpnc(field.getValue().toString());
                } else if (field.getKey().equals("Class")) {
                    bean.setCls(field.getValue().toString());
                } else if (field.getKey().equals("Subclass")) {
                    bean.setSubcls(field.getValue().toString());
                } else if (field.getKey().equals("Dept")) {
                    bean.setDept(field.getValue().toString());
                }
                processJSonObject(field.getValue());
            }
        }
        if (bean.getTpnc() != null) {
            keyValues.put(new Integer(recordcount), bean);
        }
    }
}
