/**
 * CustomSignBuilderRequestItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class CustomSignBuilderRequestItem  implements java.io.Serializable {
    private String endDate;

    private String[] productCodes;

    private String[] productTypeCodes;

    private String startDate;

    private String storeID;

    private Integer styleID;

    private String userID;

    public CustomSignBuilderRequestItem() {
    }

    public CustomSignBuilderRequestItem(
           String endDate,
           String[] productCodes,
           String[] productTypeCodes,
           String startDate,
           String storeID,
           Integer styleID,
           String userID) {
           this.endDate = endDate;
           this.productCodes = productCodes;
           this.productTypeCodes = productTypeCodes;
           this.startDate = startDate;
           this.storeID = storeID;
           this.styleID = styleID;
           this.userID = userID;
    }


    /**
     * Gets the endDate value for this CustomSignBuilderRequestItem.
     * 
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CustomSignBuilderRequestItem.
     * 
     * @param endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the productCodes value for this CustomSignBuilderRequestItem.
     * 
     * @return productCodes
     */
    public String[] getProductCodes() {
        return productCodes;
    }


    /**
     * Sets the productCodes value for this CustomSignBuilderRequestItem.
     * 
     * @param productCodes
     */
    public void setProductCodes(String[] productCodes) {
        this.productCodes = productCodes;
    }

    public String getProductCodes(int i) {
        return this.productCodes[i];
    }

    public void setProductCodes(int i, String _value) {
        this.productCodes[i] = _value;
    }


    /**
     * Gets the productTypeCodes value for this CustomSignBuilderRequestItem.
     * 
     * @return productTypeCodes
     */
    public String[] getProductTypeCodes() {
        return productTypeCodes;
    }


    /**
     * Sets the productTypeCodes value for this CustomSignBuilderRequestItem.
     * 
     * @param productTypeCodes
     */
    public void setProductTypeCodes(String[] productTypeCodes) {
        this.productTypeCodes = productTypeCodes;
    }

    public String getProductTypeCodes(int i) {
        return this.productTypeCodes[i];
    }

    public void setProductTypeCodes(int i, String _value) {
        this.productTypeCodes[i] = _value;
    }


    /**
     * Gets the startDate value for this CustomSignBuilderRequestItem.
     * 
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CustomSignBuilderRequestItem.
     * 
     * @param startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the storeID value for this CustomSignBuilderRequestItem.
     * 
     * @return storeID
     */
    public String getStoreID() {
        return storeID;
    }


    /**
     * Sets the storeID value for this CustomSignBuilderRequestItem.
     * 
     * @param storeID
     */
    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }


    /**
     * Gets the styleID value for this CustomSignBuilderRequestItem.
     * 
     * @return styleID
     */
    public Integer getStyleID() {
        return styleID;
    }


    /**
     * Sets the styleID value for this CustomSignBuilderRequestItem.
     * 
     * @param styleID
     */
    public void setStyleID(Integer styleID) {
        this.styleID = styleID;
    }


    /**
     * Gets the userID value for this CustomSignBuilderRequestItem.
     * 
     * @return userID
     */
    public String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this CustomSignBuilderRequestItem.
     * 
     * @param userID
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomSignBuilderRequestItem)) return false;
        CustomSignBuilderRequestItem other = (CustomSignBuilderRequestItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.productCodes==null && other.getProductCodes()==null) || 
             (this.productCodes!=null &&
              java.util.Arrays.equals(this.productCodes, other.getProductCodes()))) &&
            ((this.productTypeCodes==null && other.getProductTypeCodes()==null) || 
             (this.productTypeCodes!=null &&
              java.util.Arrays.equals(this.productTypeCodes, other.getProductTypeCodes()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.storeID==null && other.getStoreID()==null) || 
             (this.storeID!=null &&
              this.storeID.equals(other.getStoreID()))) &&
            ((this.styleID==null && other.getStyleID()==null) || 
             (this.styleID!=null &&
              this.styleID.equals(other.getStyleID()))) &&
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
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getProductCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductCodes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProductCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductTypeCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductTypeCodes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProductTypeCodes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStoreID() != null) {
            _hashCode += getStoreID().hashCode();
        }
        if (getStyleID() != null) {
            _hashCode += getStyleID().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomSignBuilderRequestItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "CustomSignBuilderRequestItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "productCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTypeCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "productTypeCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "storeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("styleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "styleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
