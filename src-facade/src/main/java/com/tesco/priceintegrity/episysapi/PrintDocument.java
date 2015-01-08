/**
 * PrintDocument.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class PrintDocument  implements java.io.Serializable {
    private String outputMode;

    private com.tesco.priceintegrity.episysapi.PrintElement[] printElements;

    private String printMode;

    private String printerName;

    public PrintDocument() {
    }

    public PrintDocument(
           String outputMode,
           com.tesco.priceintegrity.episysapi.PrintElement[] printElements,
           String printMode,
           String printerName) {
           this.outputMode = outputMode;
           this.printElements = printElements;
           this.printMode = printMode;
           this.printerName = printerName;
    }


    /**
     * Gets the outputMode value for this PrintDocument.
     * 
     * @return outputMode
     */
    public String getOutputMode() {
        return outputMode;
    }


    /**
     * Sets the outputMode value for this PrintDocument.
     * 
     * @param outputMode
     */
    public void setOutputMode(String outputMode) {
        this.outputMode = outputMode;
    }


    /**
     * Gets the printElements value for this PrintDocument.
     * 
     * @return printElements
     */
    public com.tesco.priceintegrity.episysapi.PrintElement[] getPrintElements() {
        return printElements;
    }


    /**
     * Sets the printElements value for this PrintDocument.
     * 
     * @param printElements
     */
    public void setPrintElements(com.tesco.priceintegrity.episysapi.PrintElement[] printElements) {
        this.printElements = printElements;
    }

    public com.tesco.priceintegrity.episysapi.PrintElement getPrintElements(int i) {
        return this.printElements[i];
    }

    public void setPrintElements(int i, com.tesco.priceintegrity.episysapi.PrintElement _value) {
        this.printElements[i] = _value;
    }


    /**
     * Gets the printMode value for this PrintDocument.
     * 
     * @return printMode
     */
    public String getPrintMode() {
        return printMode;
    }


    /**
     * Sets the printMode value for this PrintDocument.
     * 
     * @param printMode
     */
    public void setPrintMode(String printMode) {
        this.printMode = printMode;
    }


    /**
     * Gets the printerName value for this PrintDocument.
     * 
     * @return printerName
     */
    public String getPrinterName() {
        return printerName;
    }


    /**
     * Sets the printerName value for this PrintDocument.
     * 
     * @param printerName
     */
    public void setPrinterName(String printerName) {
        this.printerName = printerName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PrintDocument)) return false;
        PrintDocument other = (PrintDocument) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outputMode==null && other.getOutputMode()==null) || 
             (this.outputMode!=null &&
              this.outputMode.equals(other.getOutputMode()))) &&
            ((this.printElements==null && other.getPrintElements()==null) || 
             (this.printElements!=null &&
              java.util.Arrays.equals(this.printElements, other.getPrintElements()))) &&
            ((this.printMode==null && other.getPrintMode()==null) || 
             (this.printMode!=null &&
              this.printMode.equals(other.getPrintMode()))) &&
            ((this.printerName==null && other.getPrinterName()==null) || 
             (this.printerName!=null &&
              this.printerName.equals(other.getPrinterName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getOutputMode() != null) {
            _hashCode += getOutputMode().hashCode();
        }
        if (getPrintElements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrintElements());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPrintElements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrintMode() != null) {
            _hashCode += getPrintMode().hashCode();
        }
        if (getPrinterName() != null) {
            _hashCode += getPrinterName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrintDocument.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PrintDocument"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outputMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "outputMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printElements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "printElements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PrintElement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "printMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "printerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
