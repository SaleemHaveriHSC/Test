/**
 * ContentFieldItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class ContentFieldItem  implements java.io.Serializable {
    private String comment;

    private String contentApproveValue;

    private String contentFieldName;

    private String contentNewValue;

    public ContentFieldItem() {
    }

    public ContentFieldItem(
           String comment,
           String contentApproveValue,
           String contentFieldName,
           String contentNewValue) {
           this.comment = comment;
           this.contentApproveValue = contentApproveValue;
           this.contentFieldName = contentFieldName;
           this.contentNewValue = contentNewValue;
    }


    /**
     * Gets the comment value for this ContentFieldItem.
     * 
     * @return comment
     */
    public String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this ContentFieldItem.
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }


    /**
     * Gets the contentApproveValue value for this ContentFieldItem.
     * 
     * @return contentApproveValue
     */
    public String getContentApproveValue() {
        return contentApproveValue;
    }


    /**
     * Sets the contentApproveValue value for this ContentFieldItem.
     * 
     * @param contentApproveValue
     */
    public void setContentApproveValue(String contentApproveValue) {
        this.contentApproveValue = contentApproveValue;
    }


    /**
     * Gets the contentFieldName value for this ContentFieldItem.
     * 
     * @return contentFieldName
     */
    public String getContentFieldName() {
        return contentFieldName;
    }


    /**
     * Sets the contentFieldName value for this ContentFieldItem.
     * 
     * @param contentFieldName
     */
    public void setContentFieldName(String contentFieldName) {
        this.contentFieldName = contentFieldName;
    }


    /**
     * Gets the contentNewValue value for this ContentFieldItem.
     * 
     * @return contentNewValue
     */
    public String getContentNewValue() {
        return contentNewValue;
    }


    /**
     * Sets the contentNewValue value for this ContentFieldItem.
     * 
     * @param contentNewValue
     */
    public void setContentNewValue(String contentNewValue) {
        this.contentNewValue = contentNewValue;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ContentFieldItem)) return false;
        ContentFieldItem other = (ContentFieldItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.contentApproveValue==null && other.getContentApproveValue()==null) || 
             (this.contentApproveValue!=null &&
              this.contentApproveValue.equals(other.getContentApproveValue()))) &&
            ((this.contentFieldName==null && other.getContentFieldName()==null) || 
             (this.contentFieldName!=null &&
              this.contentFieldName.equals(other.getContentFieldName()))) &&
            ((this.contentNewValue==null && other.getContentNewValue()==null) || 
             (this.contentNewValue!=null &&
              this.contentNewValue.equals(other.getContentNewValue())));
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
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getContentApproveValue() != null) {
            _hashCode += getContentApproveValue().hashCode();
        }
        if (getContentFieldName() != null) {
            _hashCode += getContentFieldName().hashCode();
        }
        if (getContentNewValue() != null) {
            _hashCode += getContentNewValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContentFieldItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ContentFieldItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentApproveValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "contentApproveValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentFieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "contentFieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentNewValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "contentNewValue"));
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
