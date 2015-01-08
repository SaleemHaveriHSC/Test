/**
 * ProductStoreContentFieldItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class ProductStoreContentFieldItem  implements java.io.Serializable {
    private String contentField;

    private String contentValue;

    public ProductStoreContentFieldItem() {
    }

    public ProductStoreContentFieldItem(
           String contentField,
           String contentValue) {
           this.contentField = contentField;
           this.contentValue = contentValue;
    }


    /**
     * Gets the contentField value for this ProductStoreContentFieldItem.
     * 
     * @return contentField
     */
    public String getContentField() {
        return contentField;
    }


    /**
     * Sets the contentField value for this ProductStoreContentFieldItem.
     * 
     * @param contentField
     */
    public void setContentField(String contentField) {
        this.contentField = contentField;
    }


    /**
     * Gets the contentValue value for this ProductStoreContentFieldItem.
     * 
     * @return contentValue
     */
    public String getContentValue() {
        return contentValue;
    }


    /**
     * Sets the contentValue value for this ProductStoreContentFieldItem.
     * 
     * @param contentValue
     */
    public void setContentValue(String contentValue) {
        this.contentValue = contentValue;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProductStoreContentFieldItem)) return false;
        ProductStoreContentFieldItem other = (ProductStoreContentFieldItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contentField==null && other.getContentField()==null) || 
             (this.contentField!=null &&
              this.contentField.equals(other.getContentField()))) &&
            ((this.contentValue==null && other.getContentValue()==null) || 
             (this.contentValue!=null &&
              this.contentValue.equals(other.getContentValue())));
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
        if (getContentField() != null) {
            _hashCode += getContentField().hashCode();
        }
        if (getContentValue() != null) {
            _hashCode += getContentValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductStoreContentFieldItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ProductStoreContentFieldItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "contentField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "contentValue"));
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
