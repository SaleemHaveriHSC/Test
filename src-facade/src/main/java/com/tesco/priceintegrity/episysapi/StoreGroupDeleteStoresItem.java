/**
 * StoreGroupDeleteStoresItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class StoreGroupDeleteStoresItem  implements java.io.Serializable {
    private String srcSystem;

    private String storeGroupID;

    private String storeGroupType;

    private String[] storeList;

    public StoreGroupDeleteStoresItem() {
    }

    public StoreGroupDeleteStoresItem(
           String srcSystem,
           String storeGroupID,
           String storeGroupType,
           String[] storeList) {
           this.srcSystem = srcSystem;
           this.storeGroupID = storeGroupID;
           this.storeGroupType = storeGroupType;
           this.storeList = storeList;
    }


    /**
     * Gets the srcSystem value for this StoreGroupDeleteStoresItem.
     * 
     * @return srcSystem
     */
    public String getSrcSystem() {
        return srcSystem;
    }


    /**
     * Sets the srcSystem value for this StoreGroupDeleteStoresItem.
     * 
     * @param srcSystem
     */
    public void setSrcSystem(String srcSystem) {
        this.srcSystem = srcSystem;
    }


    /**
     * Gets the storeGroupID value for this StoreGroupDeleteStoresItem.
     * 
     * @return storeGroupID
     */
    public String getStoreGroupID() {
        return storeGroupID;
    }


    /**
     * Sets the storeGroupID value for this StoreGroupDeleteStoresItem.
     * 
     * @param storeGroupID
     */
    public void setStoreGroupID(String storeGroupID) {
        this.storeGroupID = storeGroupID;
    }


    /**
     * Gets the storeGroupType value for this StoreGroupDeleteStoresItem.
     * 
     * @return storeGroupType
     */
    public String getStoreGroupType() {
        return storeGroupType;
    }


    /**
     * Sets the storeGroupType value for this StoreGroupDeleteStoresItem.
     * 
     * @param storeGroupType
     */
    public void setStoreGroupType(String storeGroupType) {
        this.storeGroupType = storeGroupType;
    }


    /**
     * Gets the storeList value for this StoreGroupDeleteStoresItem.
     * 
     * @return storeList
     */
    public String[] getStoreList() {
        return storeList;
    }


    /**
     * Sets the storeList value for this StoreGroupDeleteStoresItem.
     * 
     * @param storeList
     */
    public void setStoreList(String[] storeList) {
        this.storeList = storeList;
    }

    public String getStoreList(int i) {
        return this.storeList[i];
    }

    public void setStoreList(int i, String _value) {
        this.storeList[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof StoreGroupDeleteStoresItem)) return false;
        StoreGroupDeleteStoresItem other = (StoreGroupDeleteStoresItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.srcSystem==null && other.getSrcSystem()==null) || 
             (this.srcSystem!=null &&
              this.srcSystem.equals(other.getSrcSystem()))) &&
            ((this.storeGroupID==null && other.getStoreGroupID()==null) || 
             (this.storeGroupID!=null &&
              this.storeGroupID.equals(other.getStoreGroupID()))) &&
            ((this.storeGroupType==null && other.getStoreGroupType()==null) || 
             (this.storeGroupType!=null &&
              this.storeGroupType.equals(other.getStoreGroupType()))) &&
            ((this.storeList==null && other.getStoreList()==null) || 
             (this.storeList!=null &&
              java.util.Arrays.equals(this.storeList, other.getStoreList())));
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
        if (getSrcSystem() != null) {
            _hashCode += getSrcSystem().hashCode();
        }
        if (getStoreGroupID() != null) {
            _hashCode += getStoreGroupID().hashCode();
        }
        if (getStoreGroupType() != null) {
            _hashCode += getStoreGroupType().hashCode();
        }
        if (getStoreList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoreList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getStoreList(), i);
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
        new org.apache.axis.description.TypeDesc(StoreGroupDeleteStoresItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreGroupDeleteStoresItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "srcSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeGroupID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "storeGroupID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeGroupType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "storeGroupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "storeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
