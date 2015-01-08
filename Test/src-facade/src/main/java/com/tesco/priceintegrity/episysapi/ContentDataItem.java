/**
 * ContentDataItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class ContentDataItem  extends com.tesco.priceintegrity.episysapi.ContentDataBaseItem  implements java.io.Serializable {
    private com.tesco.priceintegrity.episysapi.ContentFieldItem[] fieldItems;

    public ContentDataItem() {
    }

    public ContentDataItem(
           Integer messageType,
           String productCode,
           String productTypeCode,
           String sourceIPAddress,
           String srcSystem,
           com.tesco.priceintegrity.episysapi.ContentFieldItem[] fieldItems) {
        super(
            messageType,
            productCode,
            productTypeCode,
            sourceIPAddress,
            srcSystem);
        this.fieldItems = fieldItems;
    }


    /**
     * Gets the fieldItems value for this ContentDataItem.
     * 
     * @return fieldItems
     */
    public com.tesco.priceintegrity.episysapi.ContentFieldItem[] getFieldItems() {
        return fieldItems;
    }


    /**
     * Sets the fieldItems value for this ContentDataItem.
     * 
     * @param fieldItems
     */
    public void setFieldItems(com.tesco.priceintegrity.episysapi.ContentFieldItem[] fieldItems) {
        this.fieldItems = fieldItems;
    }

    public com.tesco.priceintegrity.episysapi.ContentFieldItem getFieldItems(int i) {
        return this.fieldItems[i];
    }

    public void setFieldItems(int i, com.tesco.priceintegrity.episysapi.ContentFieldItem _value) {
        this.fieldItems[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ContentDataItem)) return false;
        ContentDataItem other = (ContentDataItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.fieldItems==null && other.getFieldItems()==null) || 
             (this.fieldItems!=null &&
              java.util.Arrays.equals(this.fieldItems, other.getFieldItems())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getFieldItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFieldItems());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getFieldItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentDataItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ContentDataItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "fieldItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ContentFieldItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
