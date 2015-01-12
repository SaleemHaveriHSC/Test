package com.tesco.priceintegrity.common.json;

//import com.sun.rowset.internal.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileInputStream;
import java.util.Iterator;

/**
 * Created by XY89 on 12/19/2014.
 */
public class ExcelToJson {

    public String readExceltoJson(){
        FileInputStream inp=null;
        JSONObject json =null;

        try {
            inp = new FileInputStream( "D:/kumar.xlsx" );


            Workbook workbook = WorkbookFactory.create(inp);

            // Get the first Sheet.
            Sheet sheet = workbook.getSheetAt( 0 );

            // Start constructing JSON.
            json = new JSONObject();

            // Iterate through the rows.
            JSONArray rows = new JSONArray();
            int rowIndex=0;
            String[] colNames=new String[6];
            for ( Iterator<Row> rowsIT = sheet.rowIterator(); rowsIT.hasNext(); )
            {
                Row row = rowsIT.next();
                JSONObject jRow = new JSONObject();
                JSONObject jObject = new JSONObject();

                // Iterate through the cells.
                JSONArray cells = new JSONArray();
                int i=0;
                int j=0;
                //int k=0;
                for ( Iterator<Cell> cellsIT = row.cellIterator(); cellsIT.hasNext(); )
                {
                    Cell cell = cellsIT.next();
//                    System.out.println("rowIndex="+rowIndex);
                    try{
                        if (rowIndex==0) {
                            //                          System.out.println("Entry 1");
                            //System.out.println(i);
                            colNames[i] = cell.toString();
                            //System.out.println(colNames[i]);
                        }
                        else {
                            //if (cell.)
                            //cells.add(cell.toString());
                            jObject.put(colNames[i],cell.toString());
                            //System.out.println(jObject.toString());
                        }

                    }catch(Exception e){
                        //cells.add( cell.toString() );
                        jObject.put(colNames[i],cell.toString());
                    }
                    i++;
                    /*if (rowIndex>0)
                        cells.add(jObject);*/
                }
                //jRow.put( colNames[j], cells );
                if (rowIndex>0)
                    rows.add(jObject);
                rowIndex++;
                j++;
            }

            // Create the JSON.
            json.put( "data", rows );
            //System.out.println(json.toString());
            return json.toString();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
// Get the JSON text.
        //return json.toString();
    }
}
