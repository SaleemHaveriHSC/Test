/**
 * HierarchyObject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class HierarchyObject  implements java.io.Serializable {
    private String UID;

    private String endDate;

    private String productCode;

    private String productDescription;

    private String productTypeCode;

    private String result;

    private String startDate;

    public HierarchyObject() {
    }

    public HierarchyObject(
           String UID,
           String endDate,
           String productCode,
           String productDescription,
           String productTypeCode,
           String result,
           String startDate) {
           this.UID = UID;
           this.endDate = endDate;
           this.productCode = productCode;
           this.productDescription = productDescription;
           this.productTypeCode = productTypeCode;
           this.result = result;
           this.startDate = startDate;
    }


    /**
     * Gets the UID value for this HierarchyObject.
     * 
     * @return UID
     */
    public String getUID() {
        return UID;
    }


    /**
     * Sets the UID value for this HierarchyObject.
     * 
     * @param UID
     */
    public void setUID(String UID) {
        this.UID = UID;
    }


    /**
     * Gets the endDate value for this HierarchyObject.
     * 
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this HierarchyObject.
     * 
     * @param endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the productCode value for this HierarchyObject.
     * 
     * @return productCode
     */
    public String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this HierarchyObject.
     * 
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the productDescription value for this HierarchyObject.
     * 
     * @return productDescription
     */
    public String getProductDescription() {
        return productDescription;
    }


    /**
     * Sets the productDescription value for this HierarchyObject.
     * 
     * @param productDescription
     */
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }


    /**
     * Gets the productTypeCode value for this HierarchyObject.
     * 
     * @return productTypeCode
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }


    /**
     * Sets the productTypeCode value for this HierarchyObject.
     * 
     * @param productTypeCode
     */
    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode;
    }


    /**
     * Gets the result value for this HierarchyObject.
     * 
     * @return result
     */
    public String getResult() {
        return result;
    }


    /**
     * Sets the result value for this HierarchyObject.
     * 
     * @param result
     */
    public void setResult(String result) {
        this.result = result;
    }


    /**
     * Gets the startDate value for this HierarchyObject.
     * 
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this HierarchyObject.
     * 
     * @param startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof HierarchyObject)) return false;
        HierarchyObject other = (HierarchyObject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.UID==null && other.getUID()==null) || 
             (this.UID!=null &&
              this.UID.equals(other.getUID()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.productCode==null && other.getProductCode()==null) || 
             (this.productCode!=null &&
              this.productCode.equals(other.getProductCode()))) &&
            ((this.productDescription==null && other.getProductDescription()==null) || 
             (this.productDescription!=null &&
              this.productDescription.equals(other.getProductDescription()))) &&
            ((this.productTypeCode==null && other.getProductTypeCode()==null) || 
             (this.productTypeCode!=null &&
              this.productTypeCode.equals(other.getProductTypeCode()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate())));
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
        if (getUID() != null) {
            _hashCode += getUID().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getProductCode() != null) {
            _hashCode += getProductCode().hashCode();
        }
        if (getProductDescription() != null) {
            _hashCode += getProductDescription().hashCode();
        }
        if (getProductTypeCode() != null) {
            _hashCode += getProductTypeCode().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HierarchyObject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "HierarchyObject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "UID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "productCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "productDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "productTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "startDate"));
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
