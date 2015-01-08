/**
 * AdvancedValidationResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class AdvancedValidationResult  implements java.io.Serializable {
    private com.tesco.priceintegrity.episysapi.HierarchyObject[] result;

    private Integer size;

    private Integer statusCode;

    private String statusMessage;

    public AdvancedValidationResult() {
    }

    public AdvancedValidationResult(
           com.tesco.priceintegrity.episysapi.HierarchyObject[] result,
           Integer size,
           Integer statusCode,
           String statusMessage) {
           this.result = result;
           this.size = size;
           this.statusCode = statusCode;
           this.statusMessage = statusMessage;
    }


    /**
     * Gets the result value for this AdvancedValidationResult.
     * 
     * @return result
     */
    public com.tesco.priceintegrity.episysapi.HierarchyObject[] getResult() {
        return result;
    }


    /**
     * Sets the result value for this AdvancedValidationResult.
     * 
     * @param result
     */
    public void setResult(com.tesco.priceintegrity.episysapi.HierarchyObject[] result) {
        this.result = result;
    }

    public com.tesco.priceintegrity.episysapi.HierarchyObject getResult(int i) {
        return this.result[i];
    }

    public void setResult(int i, com.tesco.priceintegrity.episysapi.HierarchyObject _value) {
        this.result[i] = _value;
    }


    /**
     * Gets the size value for this AdvancedValidationResult.
     * 
     * @return size
     */
    public Integer getSize() {
        return size;
    }


    /**
     * Sets the size value for this AdvancedValidationResult.
     * 
     * @param size
     */
    public void setSize(Integer size) {
        this.size = size;
    }


    /**
     * Gets the statusCode value for this AdvancedValidationResult.
     * 
     * @return statusCode
     */
    public Integer getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this AdvancedValidationResult.
     * 
     * @param statusCode
     */
    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the statusMessage value for this AdvancedValidationResult.
     * 
     * @return statusMessage
     */
    public String getStatusMessage() {
        return statusMessage;
    }


    /**
     * Sets the statusMessage value for this AdvancedValidationResult.
     * 
     * @param statusMessage
     */
    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AdvancedValidationResult)) return false;
        AdvancedValidationResult other = (AdvancedValidationResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              java.util.Arrays.equals(this.result, other.getResult()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
            ((this.statusMessage==null && other.getStatusMessage()==null) || 
             (this.statusMessage!=null &&
              this.statusMessage.equals(other.getStatusMessage())));
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
        if (getResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResult());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getStatusMessage() != null) {
            _hashCode += getStatusMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdvancedValidationResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "AdvancedValidationResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "HierarchyObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "statusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "statusMessage"));
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
