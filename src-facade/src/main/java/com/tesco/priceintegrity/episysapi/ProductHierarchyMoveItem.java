/**
 * ProductHierarchyMoveItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class ProductHierarchyMoveItem  implements java.io.Serializable {
    private Integer messageType;

    private String newParentProductCode;

    private String newParentTypeCode;

    private String productCode;

    private String productTypeCode;

    private String sourceIPAddress;

    private String srcSystem;

    public ProductHierarchyMoveItem() {
    }

    public ProductHierarchyMoveItem(
           Integer messageType,
           String newParentProductCode,
           String newParentTypeCode,
           String productCode,
           String productTypeCode,
           String sourceIPAddress,
           String srcSystem) {
           this.messageType = messageType;
           this.newParentProductCode = newParentProductCode;
           this.newParentTypeCode = newParentTypeCode;
           this.productCode = productCode;
           this.productTypeCode = productTypeCode;
           this.sourceIPAddress = sourceIPAddress;
           this.srcSystem = srcSystem;
    }


    /**
     * Gets the messageType value for this ProductHierarchyMoveItem.
     * 
     * @return messageType
     */
    public Integer getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this ProductHierarchyMoveItem.
     * 
     * @param messageType
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the newParentProductCode value for this ProductHierarchyMoveItem.
     * 
     * @return newParentProductCode
     */
    public String getNewParentProductCode() {
        return newParentProductCode;
    }


    /**
     * Sets the newParentProductCode value for this ProductHierarchyMoveItem.
     * 
     * @param newParentProductCode
     */
    public void setNewParentProductCode(String newParentProductCode) {
        this.newParentProductCode = newParentProductCode;
    }


    /**
     * Gets the newParentTypeCode value for this ProductHierarchyMoveItem.
     * 
     * @return newParentTypeCode
     */
    public String getNewParentTypeCode() {
        return newParentTypeCode;
    }


    /**
     * Sets the newParentTypeCode value for this ProductHierarchyMoveItem.
     * 
     * @param newParentTypeCode
     */
    public void setNewParentTypeCode(String newParentTypeCode) {
        this.newParentTypeCode = newParentTypeCode;
    }


    /**
     * Gets the productCode value for this ProductHierarchyMoveItem.
     * 
     * @return productCode
     */
    public String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this ProductHierarchyMoveItem.
     * 
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the productTypeCode value for this ProductHierarchyMoveItem.
     * 
     * @return productTypeCode
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }


    /**
     * Sets the productTypeCode value for this ProductHierarchyMoveItem.
     * 
     * @param productTypeCode
     */
    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode;
    }


    /**
     * Gets the sourceIPAddress value for this ProductHierarchyMoveItem.
     * 
     * @return sourceIPAddress
     */
    public String getSourceIPAddress() {
        return sourceIPAddress;
    }


    /**
     * Sets the sourceIPAddress value for this ProductHierarchyMoveItem.
     * 
     * @param sourceIPAddress
     */
    public void setSourceIPAddress(String sourceIPAddress) {
        this.sourceIPAddress = sourceIPAddress;
    }


    /**
     * Gets the srcSystem value for this ProductHierarchyMoveItem.
     * 
     * @return srcSystem
     */
    public String getSrcSystem() {
        return srcSystem;
    }


    /**
     * Sets the srcSystem value for this ProductHierarchyMoveItem.
     * 
     * @param srcSystem
     */
    public void setSrcSystem(String srcSystem) {
        this.srcSystem = srcSystem;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProductHierarchyMoveItem)) return false;
        ProductHierarchyMoveItem other = (ProductHierarchyMoveItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
            ((this.newParentProductCode==null && other.getNewParentProductCode()==null) || 
             (this.newParentProductCode!=null &&
              this.newParentProductCode.equals(other.getNewParentProductCode()))) &&
            ((this.newParentTypeCode==null && other.getNewParentTypeCode()==null) || 
             (this.newParentTypeCode!=null &&
              this.newParentTypeCode.equals(other.getNewParentTypeCode()))) &&
            ((this.productCode==null && other.getProductCode()==null) || 
             (this.productCode!=null &&
              this.productCode.equals(other.getProductCode()))) &&
            ((this.productTypeCode==null && other.getProductTypeCode()==null) || 
             (this.productTypeCode!=null &&
              this.productTypeCode.equals(other.getProductTypeCode()))) &&
            ((this.sourceIPAddress==null && other.getSourceIPAddress()==null) || 
             (this.sourceIPAddress!=null &&
              this.sourceIPAddress.equals(other.getSourceIPAddress()))) &&
            ((this.srcSystem==null && other.getSrcSystem()==null) || 
             (this.srcSystem!=null &&
              this.srcSystem.equals(other.getSrcSystem())));
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
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
        }
        if (getNewParentProductCode() != null) {
            _hashCode += getNewParentProductCode().hashCode();
        }
        if (getNewParentTypeCode() != null) {
            _hashCode += getNewParentTypeCode().hashCode();
        }
        if (getProductCode() != null) {
            _hashCode += getProductCode().hashCode();
        }
        if (getProductTypeCode() != null) {
            _hashCode += getProductTypeCode().hashCode();
        }
        if (getSourceIPAddress() != null) {
            _hashCode += getSourceIPAddress().hashCode();
        }
        if (getSrcSystem() != null) {
            _hashCode += getSrcSystem().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductHierarchyMoveItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ProductHierarchyMoveItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "messageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newParentProductCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "newParentProductCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newParentTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "newParentTypeCode"));
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
        elemField.setFieldName("productTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "productTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "sourceIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "srcSystem"));
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
