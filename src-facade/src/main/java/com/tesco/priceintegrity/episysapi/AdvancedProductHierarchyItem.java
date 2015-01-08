/**
 * AdvancedProductHierarchyItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class AdvancedProductHierarchyItem  implements java.io.Serializable {
    private com.tesco.priceintegrity.episysapi.HierarchyObject[] children;

    private String deepCopy;

    private String description;

    private String endDate;

    private Integer messageType;

    private String parentProductCode;

    private String parentTypeCode;

    private String productCode;

    private String productTypeCode;

    private String sourceIPAddress;

    private String srcSystem;

    private String startDate;

    private String userID;

    public AdvancedProductHierarchyItem() {
    }

    public AdvancedProductHierarchyItem(
           com.tesco.priceintegrity.episysapi.HierarchyObject[] children,
           String deepCopy,
           String description,
           String endDate,
           Integer messageType,
           String parentProductCode,
           String parentTypeCode,
           String productCode,
           String productTypeCode,
           String sourceIPAddress,
           String srcSystem,
           String startDate,
           String userID) {
           this.children = children;
           this.deepCopy = deepCopy;
           this.description = description;
           this.endDate = endDate;
           this.messageType = messageType;
           this.parentProductCode = parentProductCode;
           this.parentTypeCode = parentTypeCode;
           this.productCode = productCode;
           this.productTypeCode = productTypeCode;
           this.sourceIPAddress = sourceIPAddress;
           this.srcSystem = srcSystem;
           this.startDate = startDate;
           this.userID = userID;
    }


    /**
     * Gets the children value for this AdvancedProductHierarchyItem.
     * 
     * @return children
     */
    public com.tesco.priceintegrity.episysapi.HierarchyObject[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this AdvancedProductHierarchyItem.
     * 
     * @param children
     */
    public void setChildren(com.tesco.priceintegrity.episysapi.HierarchyObject[] children) {
        this.children = children;
    }

    public com.tesco.priceintegrity.episysapi.HierarchyObject getChildren(int i) {
        return this.children[i];
    }

    public void setChildren(int i, com.tesco.priceintegrity.episysapi.HierarchyObject _value) {
        this.children[i] = _value;
    }


    /**
     * Gets the deepCopy value for this AdvancedProductHierarchyItem.
     * 
     * @return deepCopy
     */
    public String getDeepCopy() {
        return deepCopy;
    }


    /**
     * Sets the deepCopy value for this AdvancedProductHierarchyItem.
     * 
     * @param deepCopy
     */
    public void setDeepCopy(String deepCopy) {
        this.deepCopy = deepCopy;
    }


    /**
     * Gets the description value for this AdvancedProductHierarchyItem.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this AdvancedProductHierarchyItem.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the endDate value for this AdvancedProductHierarchyItem.
     * 
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this AdvancedProductHierarchyItem.
     * 
     * @param endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the messageType value for this AdvancedProductHierarchyItem.
     * 
     * @return messageType
     */
    public Integer getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this AdvancedProductHierarchyItem.
     * 
     * @param messageType
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the parentProductCode value for this AdvancedProductHierarchyItem.
     * 
     * @return parentProductCode
     */
    public String getParentProductCode() {
        return parentProductCode;
    }


    /**
     * Sets the parentProductCode value for this AdvancedProductHierarchyItem.
     * 
     * @param parentProductCode
     */
    public void setParentProductCode(String parentProductCode) {
        this.parentProductCode = parentProductCode;
    }


    /**
     * Gets the parentTypeCode value for this AdvancedProductHierarchyItem.
     * 
     * @return parentTypeCode
     */
    public String getParentTypeCode() {
        return parentTypeCode;
    }


    /**
     * Sets the parentTypeCode value for this AdvancedProductHierarchyItem.
     * 
     * @param parentTypeCode
     */
    public void setParentTypeCode(String parentTypeCode) {
        this.parentTypeCode = parentTypeCode;
    }


    /**
     * Gets the productCode value for this AdvancedProductHierarchyItem.
     * 
     * @return productCode
     */
    public String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this AdvancedProductHierarchyItem.
     * 
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the productTypeCode value for this AdvancedProductHierarchyItem.
     * 
     * @return productTypeCode
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }


    /**
     * Sets the productTypeCode value for this AdvancedProductHierarchyItem.
     * 
     * @param productTypeCode
     */
    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode;
    }


    /**
     * Gets the sourceIPAddress value for this AdvancedProductHierarchyItem.
     * 
     * @return sourceIPAddress
     */
    public String getSourceIPAddress() {
        return sourceIPAddress;
    }


    /**
     * Sets the sourceIPAddress value for this AdvancedProductHierarchyItem.
     * 
     * @param sourceIPAddress
     */
    public void setSourceIPAddress(String sourceIPAddress) {
        this.sourceIPAddress = sourceIPAddress;
    }


    /**
     * Gets the srcSystem value for this AdvancedProductHierarchyItem.
     * 
     * @return srcSystem
     */
    public String getSrcSystem() {
        return srcSystem;
    }


    /**
     * Sets the srcSystem value for this AdvancedProductHierarchyItem.
     * 
     * @param srcSystem
     */
    public void setSrcSystem(String srcSystem) {
        this.srcSystem = srcSystem;
    }


    /**
     * Gets the startDate value for this AdvancedProductHierarchyItem.
     * 
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this AdvancedProductHierarchyItem.
     * 
     * @param startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the userID value for this AdvancedProductHierarchyItem.
     * 
     * @return userID
     */
    public String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this AdvancedProductHierarchyItem.
     * 
     * @param userID
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AdvancedProductHierarchyItem)) return false;
        AdvancedProductHierarchyItem other = (AdvancedProductHierarchyItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              java.util.Arrays.equals(this.children, other.getChildren()))) &&
            ((this.deepCopy==null && other.getDeepCopy()==null) || 
             (this.deepCopy!=null &&
              this.deepCopy.equals(other.getDeepCopy()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
            ((this.parentProductCode==null && other.getParentProductCode()==null) || 
             (this.parentProductCode!=null &&
              this.parentProductCode.equals(other.getParentProductCode()))) &&
            ((this.parentTypeCode==null && other.getParentTypeCode()==null) || 
             (this.parentTypeCode!=null &&
              this.parentTypeCode.equals(other.getParentTypeCode()))) &&
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
              this.srcSystem.equals(other.getSrcSystem()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID())));
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
        if (getChildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildren());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getChildren(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeepCopy() != null) {
            _hashCode += getDeepCopy().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
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
        if (getProductTypeCode() != null) {
            _hashCode += getProductTypeCode().hashCode();
        }
        if (getSourceIPAddress() != null) {
            _hashCode += getSourceIPAddress().hashCode();
        }
        if (getSrcSystem() != null) {
            _hashCode += getSrcSystem().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdvancedProductHierarchyItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "AdvancedProductHierarchyItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "HierarchyObject"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deepCopy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "deepCopy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "description"));
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
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "messageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "userID"));
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
