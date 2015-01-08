/**
 * StoreGroupInfoItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class StoreGroupInfoItem  implements java.io.Serializable {
    private String endDate;

    private String name;

    private String srcSystem;

    private String startDate;

    private String storeGroupID;

    private String storeGroupStatus;

    private String storeGroupType;

    public StoreGroupInfoItem() {
    }

    public StoreGroupInfoItem(
           String endDate,
           String name,
           String srcSystem,
           String startDate,
           String storeGroupID,
           String storeGroupStatus,
           String storeGroupType) {
           this.endDate = endDate;
           this.name = name;
           this.srcSystem = srcSystem;
           this.startDate = startDate;
           this.storeGroupID = storeGroupID;
           this.storeGroupStatus = storeGroupStatus;
           this.storeGroupType = storeGroupType;
    }


    /**
     * Gets the endDate value for this StoreGroupInfoItem.
     * 
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this StoreGroupInfoItem.
     * 
     * @param endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the name value for this StoreGroupInfoItem.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the name value for this StoreGroupInfoItem.
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Gets the srcSystem value for this StoreGroupInfoItem.
     * 
     * @return srcSystem
     */
    public String getSrcSystem() {
        return srcSystem;
    }


    /**
     * Sets the srcSystem value for this StoreGroupInfoItem.
     * 
     * @param srcSystem
     */
    public void setSrcSystem(String srcSystem) {
        this.srcSystem = srcSystem;
    }


    /**
     * Gets the startDate value for this StoreGroupInfoItem.
     * 
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this StoreGroupInfoItem.
     * 
     * @param startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the storeGroupID value for this StoreGroupInfoItem.
     * 
     * @return storeGroupID
     */
    public String getStoreGroupID() {
        return storeGroupID;
    }


    /**
     * Sets the storeGroupID value for this StoreGroupInfoItem.
     * 
     * @param storeGroupID
     */
    public void setStoreGroupID(String storeGroupID) {
        this.storeGroupID = storeGroupID;
    }


    /**
     * Gets the storeGroupStatus value for this StoreGroupInfoItem.
     * 
     * @return storeGroupStatus
     */
    public String getStoreGroupStatus() {
        return storeGroupStatus;
    }


    /**
     * Sets the storeGroupStatus value for this StoreGroupInfoItem.
     * 
     * @param storeGroupStatus
     */
    public void setStoreGroupStatus(String storeGroupStatus) {
        this.storeGroupStatus = storeGroupStatus;
    }


    /**
     * Gets the storeGroupType value for this StoreGroupInfoItem.
     * 
     * @return storeGroupType
     */
    public String getStoreGroupType() {
        return storeGroupType;
    }


    /**
     * Sets the storeGroupType value for this StoreGroupInfoItem.
     * 
     * @param storeGroupType
     */
    public void setStoreGroupType(String storeGroupType) {
        this.storeGroupType = storeGroupType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof StoreGroupInfoItem)) return false;
        StoreGroupInfoItem other = (StoreGroupInfoItem) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.srcSystem==null && other.getSrcSystem()==null) || 
             (this.srcSystem!=null &&
              this.srcSystem.equals(other.getSrcSystem()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.storeGroupID==null && other.getStoreGroupID()==null) || 
             (this.storeGroupID!=null &&
              this.storeGroupID.equals(other.getStoreGroupID()))) &&
            ((this.storeGroupStatus==null && other.getStoreGroupStatus()==null) || 
             (this.storeGroupStatus!=null &&
              this.storeGroupStatus.equals(other.getStoreGroupStatus()))) &&
            ((this.storeGroupType==null && other.getStoreGroupType()==null) || 
             (this.storeGroupType!=null &&
              this.storeGroupType.equals(other.getStoreGroupType())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSrcSystem() != null) {
            _hashCode += getSrcSystem().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStoreGroupID() != null) {
            _hashCode += getStoreGroupID().hashCode();
        }
        if (getStoreGroupStatus() != null) {
            _hashCode += getStoreGroupStatus().hashCode();
        }
        if (getStoreGroupType() != null) {
            _hashCode += getStoreGroupType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoreGroupInfoItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreGroupInfoItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "name"));
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
        elemField.setFieldName("storeGroupID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "storeGroupID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeGroupStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "storeGroupStatus"));
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
