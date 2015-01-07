/**
 * BatchLabelRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class BatchLabelRequest  implements java.io.Serializable {
    private String batchName;

    private com.tesco.priceintegrity.episysapi.BatchLabelRequestItem[] items;

    private Integer messageType;

    private String sellUnitID;

    private String sourceIPAddress;

    private String srcSystem;

    private String userName;

    public BatchLabelRequest() {
    }

    public BatchLabelRequest(
           String batchName,
           com.tesco.priceintegrity.episysapi.BatchLabelRequestItem[] items,
           Integer messageType,
           String sellUnitID,
           String sourceIPAddress,
           String srcSystem,
           String userName) {
           this.batchName = batchName;
           this.items = items;
           this.messageType = messageType;
           this.sellUnitID = sellUnitID;
           this.sourceIPAddress = sourceIPAddress;
           this.srcSystem = srcSystem;
           this.userName = userName;
    }


    /**
     * Gets the batchName value for this BatchLabelRequest.
     * 
     * @return batchName
     */
    public String getBatchName() {
        return batchName;
    }


    /**
     * Sets the batchName value for this BatchLabelRequest.
     * 
     * @param batchName
     */
    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }


    /**
     * Gets the items value for this BatchLabelRequest.
     * 
     * @return items
     */
    public com.tesco.priceintegrity.episysapi.BatchLabelRequestItem[] getItems() {
        return items;
    }


    /**
     * Sets the items value for this BatchLabelRequest.
     * 
     * @param items
     */
    public void setItems(com.tesco.priceintegrity.episysapi.BatchLabelRequestItem[] items) {
        this.items = items;
    }

    public com.tesco.priceintegrity.episysapi.BatchLabelRequestItem getItems(int i) {
        return this.items[i];
    }

    public void setItems(int i, com.tesco.priceintegrity.episysapi.BatchLabelRequestItem _value) {
        this.items[i] = _value;
    }


    /**
     * Gets the messageType value for this BatchLabelRequest.
     * 
     * @return messageType
     */
    public Integer getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this BatchLabelRequest.
     * 
     * @param messageType
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the sellUnitID value for this BatchLabelRequest.
     * 
     * @return sellUnitID
     */
    public String getSellUnitID() {
        return sellUnitID;
    }


    /**
     * Sets the sellUnitID value for this BatchLabelRequest.
     * 
     * @param sellUnitID
     */
    public void setSellUnitID(String sellUnitID) {
        this.sellUnitID = sellUnitID;
    }


    /**
     * Gets the sourceIPAddress value for this BatchLabelRequest.
     * 
     * @return sourceIPAddress
     */
    public String getSourceIPAddress() {
        return sourceIPAddress;
    }


    /**
     * Sets the sourceIPAddress value for this BatchLabelRequest.
     * 
     * @param sourceIPAddress
     */
    public void setSourceIPAddress(String sourceIPAddress) {
        this.sourceIPAddress = sourceIPAddress;
    }


    /**
     * Gets the srcSystem value for this BatchLabelRequest.
     * 
     * @return srcSystem
     */
    public String getSrcSystem() {
        return srcSystem;
    }


    /**
     * Sets the srcSystem value for this BatchLabelRequest.
     * 
     * @param srcSystem
     */
    public void setSrcSystem(String srcSystem) {
        this.srcSystem = srcSystem;
    }


    /**
     * Gets the userName value for this BatchLabelRequest.
     * 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this BatchLabelRequest.
     * 
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BatchLabelRequest)) return false;
        BatchLabelRequest other = (BatchLabelRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.batchName==null && other.getBatchName()==null) || 
             (this.batchName!=null &&
              this.batchName.equals(other.getBatchName()))) &&
            ((this.items==null && other.getItems()==null) || 
             (this.items!=null &&
              java.util.Arrays.equals(this.items, other.getItems()))) &&
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
            ((this.sellUnitID==null && other.getSellUnitID()==null) || 
             (this.sellUnitID!=null &&
              this.sellUnitID.equals(other.getSellUnitID()))) &&
            ((this.sourceIPAddress==null && other.getSourceIPAddress()==null) || 
             (this.sourceIPAddress!=null &&
              this.sourceIPAddress.equals(other.getSourceIPAddress()))) &&
            ((this.srcSystem==null && other.getSrcSystem()==null) || 
             (this.srcSystem!=null &&
              this.srcSystem.equals(other.getSrcSystem()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName())));
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
        if (getBatchName() != null) {
            _hashCode += getBatchName().hashCode();
        }
        if (getItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItems());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
        }
        if (getSellUnitID() != null) {
            _hashCode += getSellUnitID().hashCode();
        }
        if (getSourceIPAddress() != null) {
            _hashCode += getSourceIPAddress().hashCode();
        }
        if (getSrcSystem() != null) {
            _hashCode += getSrcSystem().hashCode();
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BatchLabelRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "BatchLabelRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "batchName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("items");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "items"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "BatchLabelRequestItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "messageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellUnitID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "sellUnitID"));
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
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "userName"));
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
