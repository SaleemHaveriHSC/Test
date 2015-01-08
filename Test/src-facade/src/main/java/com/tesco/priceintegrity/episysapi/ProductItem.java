/**
 * ProductItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class ProductItem  implements java.io.Serializable {
    private String description;

    private Integer messageType;

    private String newParentProductCode;

    private String newParentTypeCode;

    private String parentProductCode;

    private String parentTypeCode;

    private String productCode;

    private String productStatus;

    private String productTypeCode;

    private String sourceIPAddress;

    private String srcSystem;

    public ProductItem() {
    }

    public ProductItem(
           String description,
           Integer messageType,
           String newParentProductCode,
           String newParentTypeCode,
           String parentProductCode,
           String parentTypeCode,
           String productCode,
           String productStatus,
           String productTypeCode,
           String sourceIPAddress,
           String srcSystem) {
           this.description = description;
           this.messageType = messageType;
           this.newParentProductCode = newParentProductCode;
           this.newParentTypeCode = newParentTypeCode;
           this.parentProductCode = parentProductCode;
           this.parentTypeCode = parentTypeCode;
           this.productCode = productCode;
           this.productStatus = productStatus;
           this.productTypeCode = productTypeCode;
           this.sourceIPAddress = sourceIPAddress;
           this.srcSystem = srcSystem;
    }


    /**
     * Gets the description value for this ProductItem.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProductItem.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the messageType value for this ProductItem.
     * 
     * @return messageType
     */
    public Integer getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this ProductItem.
     * 
     * @param messageType
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the newParentProductCode value for this ProductItem.
     * 
     * @return newParentProductCode
     */
    public String getNewParentProductCode() {
        return newParentProductCode;
    }


    /**
     * Sets the newParentProductCode value for this ProductItem.
     * 
     * @param newParentProductCode
     */
    public void setNewParentProductCode(String newParentProductCode) {
        this.newParentProductCode = newParentProductCode;
    }


    /**
     * Gets the newParentTypeCode value for this ProductItem.
     * 
     * @return newParentTypeCode
     */
    public String getNewParentTypeCode() {
        return newParentTypeCode;
    }


    /**
     * Sets the newParentTypeCode value for this ProductItem.
     * 
     * @param newParentTypeCode
     */
    public void setNewParentTypeCode(String newParentTypeCode) {
        this.newParentTypeCode = newParentTypeCode;
    }


    /**
     * Gets the parentProductCode value for this ProductItem.
     * 
     * @return parentProductCode
     */
    public String getParentProductCode() {
        return parentProductCode;
    }


    /**
     * Sets the parentProductCode value for this ProductItem.
     * 
     * @param parentProductCode
     */
    public void setParentProductCode(String parentProductCode) {
        this.parentProductCode = parentProductCode;
    }


    /**
     * Gets the parentTypeCode value for this ProductItem.
     * 
     * @return parentTypeCode
     */
    public String getParentTypeCode() {
        return parentTypeCode;
    }


    /**
     * Sets the parentTypeCode value for this ProductItem.
     * 
     * @param parentTypeCode
     */
    public void setParentTypeCode(String parentTypeCode) {
        this.parentTypeCode = parentTypeCode;
    }


    /**
     * Gets the productCode value for this ProductItem.
     * 
     * @return productCode
     */
    public String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this ProductItem.
     * 
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the productStatus value for this ProductItem.
     * 
     * @return productStatus
     */
    public String getProductStatus() {
        return productStatus;
    }


    /**
     * Sets the productStatus value for this ProductItem.
     * 
     * @param productStatus
     */
    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
    }


    /**
     * Gets the productTypeCode value for this ProductItem.
     * 
     * @return productTypeCode
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }


    /**
     * Sets the productTypeCode value for this ProductItem.
     * 
     * @param productTypeCode
     */
    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode;
    }


    /**
     * Gets the sourceIPAddress value for this ProductItem.
     * 
     * @return sourceIPAddress
     */
    public String getSourceIPAddress() {
        return sourceIPAddress;
    }


    /**
     * Sets the sourceIPAddress value for this ProductItem.
     * 
     * @param sourceIPAddress
     */
    public void setSourceIPAddress(String sourceIPAddress) {
        this.sourceIPAddress = sourceIPAddress;
    }


    /**
     * Gets the srcSystem value for this ProductItem.
     * 
     * @return srcSystem
     */
    public String getSrcSystem() {
        return srcSystem;
    }


    /**
     * Sets the srcSystem value for this ProductItem.
     * 
     * @param srcSystem
     */
    public void setSrcSystem(String srcSystem) {
        this.srcSystem = srcSystem;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProductItem)) return false;
        ProductItem other = (ProductItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
            ((this.newParentProductCode==null && other.getNewParentProductCode()==null) || 
             (this.newParentProductCode!=null &&
              this.newParentProductCode.equals(other.getNewParentProductCode()))) &&
            ((this.newParentTypeCode==null && other.getNewParentTypeCode()==null) || 
             (this.newParentTypeCode!=null &&
              this.newParentTypeCode.equals(other.getNewParentTypeCode()))) &&
            ((this.parentProductCode==null && other.getParentProductCode()==null) || 
             (this.parentProductCode!=null &&
              this.parentProductCode.equals(other.getParentProductCode()))) &&
            ((this.parentTypeCode==null && other.getParentTypeCode()==null) || 
             (this.parentTypeCode!=null &&
              this.parentTypeCode.equals(other.getParentTypeCode()))) &&
            ((this.productCode==null && other.getProductCode()==null) || 
             (this.productCode!=null &&
              this.productCode.equals(other.getProductCode()))) &&
            ((this.productStatus==null && other.getProductStatus()==null) || 
             (this.productStatus!=null &&
              this.productStatus.equals(other.getProductStatus()))) &&
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
        }
        if (getNewParentProductCode() != null) {
            _hashCode += getNewParentProductCode().hashCode();
        }
        if (getNewParentTypeCode() != null) {
            _hashCode += getNewParentTypeCode().hashCode();
        }
        if (getParentProductCode() != null) {
            _hashCode += getParentProductCode().hashCode();
        }
        if (getParentTypeCode() != null) {
            _hashCode += getParentTypeCode().hashCode();
        }
        if (getProductCode() != null) {
            _hashCode += getProductCode().hashCode();
        }
        if (getProductStatus() != null) {
            _hashCode += getProductStatus().hashCode();
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
        new org.apache.axis.description.TypeDesc(ProductItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ProductItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("parentProductCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "parentProductCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "parentTypeCode"));
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
        elemField.setFieldName("productStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "productStatus"));
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
