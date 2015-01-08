/**
 * PriceChangeRequestItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class PriceChangeRequestItem  implements java.io.Serializable {
    private Integer eventUID;

    private String itemTag;

    private Integer messageType;

    private com.tesco.priceintegrity.episysapi.OfferDetailItem[] offerDetailExtension;

    private String priceDescription;

    private com.tesco.priceintegrity.episysapi.PriceItem priceItem;

    private Integer priceUID;

    private String productCode;

    private String productTypeCode;

    private String sourceIPAddress;

    private String srcSystem;

    private String statusCode;

    private String userID;

    public PriceChangeRequestItem() {
    }

    public PriceChangeRequestItem(
           Integer eventUID,
           String itemTag,
           Integer messageType,
           com.tesco.priceintegrity.episysapi.OfferDetailItem[] offerDetailExtension,
           String priceDescription,
           com.tesco.priceintegrity.episysapi.PriceItem priceItem,
           Integer priceUID,
           String productCode,
           String productTypeCode,
           String sourceIPAddress,
           String srcSystem,
           String statusCode,
           String userID) {
           this.eventUID = eventUID;
           this.itemTag = itemTag;
           this.messageType = messageType;
           this.offerDetailExtension = offerDetailExtension;
           this.priceDescription = priceDescription;
           this.priceItem = priceItem;
           this.priceUID = priceUID;
           this.productCode = productCode;
           this.productTypeCode = productTypeCode;
           this.sourceIPAddress = sourceIPAddress;
           this.srcSystem = srcSystem;
           this.statusCode = statusCode;
           this.userID = userID;
    }


    /**
     * Gets the eventUID value for this PriceChangeRequestItem.
     * 
     * @return eventUID
     */
    public Integer getEventUID() {
        return eventUID;
    }


    /**
     * Sets the eventUID value for this PriceChangeRequestItem.
     * 
     * @param eventUID
     */
    public void setEventUID(Integer eventUID) {
        this.eventUID = eventUID;
    }


    /**
     * Gets the itemTag value for this PriceChangeRequestItem.
     * 
     * @return itemTag
     */
    public String getItemTag() {
        return itemTag;
    }


    /**
     * Sets the itemTag value for this PriceChangeRequestItem.
     * 
     * @param itemTag
     */
    public void setItemTag(String itemTag) {
        this.itemTag = itemTag;
    }


    /**
     * Gets the messageType value for this PriceChangeRequestItem.
     * 
     * @return messageType
     */
    public Integer getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this PriceChangeRequestItem.
     * 
     * @param messageType
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the offerDetailExtension value for this PriceChangeRequestItem.
     * 
     * @return offerDetailExtension
     */
    public com.tesco.priceintegrity.episysapi.OfferDetailItem[] getOfferDetailExtension() {
        return offerDetailExtension;
    }


    /**
     * Sets the offerDetailExtension value for this PriceChangeRequestItem.
     * 
     * @param offerDetailExtension
     */
    public void setOfferDetailExtension(com.tesco.priceintegrity.episysapi.OfferDetailItem[] offerDetailExtension) {
        this.offerDetailExtension = offerDetailExtension;
    }


    /**
     * Gets the priceDescription value for this PriceChangeRequestItem.
     * 
     * @return priceDescription
     */
    public String getPriceDescription() {
        return priceDescription;
    }


    /**
     * Sets the priceDescription value for this PriceChangeRequestItem.
     * 
     * @param priceDescription
     */
    public void setPriceDescription(String priceDescription) {
        this.priceDescription = priceDescription;
    }


    /**
     * Gets the priceItem value for this PriceChangeRequestItem.
     * 
     * @return priceItem
     */
    public com.tesco.priceintegrity.episysapi.PriceItem getPriceItem() {
        return priceItem;
    }


    /**
     * Sets the priceItem value for this PriceChangeRequestItem.
     * 
     * @param priceItem
     */
    public void setPriceItem(com.tesco.priceintegrity.episysapi.PriceItem priceItem) {
        this.priceItem = priceItem;
    }


    /**
     * Gets the priceUID value for this PriceChangeRequestItem.
     * 
     * @return priceUID
     */
    public Integer getPriceUID() {
        return priceUID;
    }


    /**
     * Sets the priceUID value for this PriceChangeRequestItem.
     * 
     * @param priceUID
     */
    public void setPriceUID(Integer priceUID) {
        this.priceUID = priceUID;
    }


    /**
     * Gets the productCode value for this PriceChangeRequestItem.
     * 
     * @return productCode
     */
    public String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this PriceChangeRequestItem.
     * 
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the productTypeCode value for this PriceChangeRequestItem.
     * 
     * @return productTypeCode
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }


    /**
     * Sets the productTypeCode value for this PriceChangeRequestItem.
     * 
     * @param productTypeCode
     */
    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode;
    }


    /**
     * Gets the sourceIPAddress value for this PriceChangeRequestItem.
     * 
     * @return sourceIPAddress
     */
    public String getSourceIPAddress() {
        return sourceIPAddress;
    }


    /**
     * Sets the sourceIPAddress value for this PriceChangeRequestItem.
     * 
     * @param sourceIPAddress
     */
    public void setSourceIPAddress(String sourceIPAddress) {
        this.sourceIPAddress = sourceIPAddress;
    }


    /**
     * Gets the srcSystem value for this PriceChangeRequestItem.
     * 
     * @return srcSystem
     */
    public String getSrcSystem() {
        return srcSystem;
    }


    /**
     * Sets the srcSystem value for this PriceChangeRequestItem.
     * 
     * @param srcSystem
     */
    public void setSrcSystem(String srcSystem) {
        this.srcSystem = srcSystem;
    }


    /**
     * Gets the statusCode value for this PriceChangeRequestItem.
     * 
     * @return statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }


    /**
     * Sets the statusCode value for this PriceChangeRequestItem.
     * 
     * @param statusCode
     */
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }


    /**
     * Gets the userID value for this PriceChangeRequestItem.
     * 
     * @return userID
     */
    public String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this PriceChangeRequestItem.
     * 
     * @param userID
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PriceChangeRequestItem)) return false;
        PriceChangeRequestItem other = (PriceChangeRequestItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eventUID==null && other.getEventUID()==null) || 
             (this.eventUID!=null &&
              this.eventUID.equals(other.getEventUID()))) &&
            ((this.itemTag==null && other.getItemTag()==null) || 
             (this.itemTag!=null &&
              this.itemTag.equals(other.getItemTag()))) &&
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
            ((this.offerDetailExtension==null && other.getOfferDetailExtension()==null) || 
             (this.offerDetailExtension!=null &&
              java.util.Arrays.equals(this.offerDetailExtension, other.getOfferDetailExtension()))) &&
            ((this.priceDescription==null && other.getPriceDescription()==null) || 
             (this.priceDescription!=null &&
              this.priceDescription.equals(other.getPriceDescription()))) &&
            ((this.priceItem==null && other.getPriceItem()==null) || 
             (this.priceItem!=null &&
              this.priceItem.equals(other.getPriceItem()))) &&
            ((this.priceUID==null && other.getPriceUID()==null) || 
             (this.priceUID!=null &&
              this.priceUID.equals(other.getPriceUID()))) &&
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
            ((this.statusCode==null && other.getStatusCode()==null) || 
             (this.statusCode!=null &&
              this.statusCode.equals(other.getStatusCode()))) &&
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
        if (getEventUID() != null) {
            _hashCode += getEventUID().hashCode();
        }
        if (getItemTag() != null) {
            _hashCode += getItemTag().hashCode();
        }
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
        }
        if (getOfferDetailExtension() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferDetailExtension());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getOfferDetailExtension(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriceDescription() != null) {
            _hashCode += getPriceDescription().hashCode();
        }
        if (getPriceItem() != null) {
            _hashCode += getPriceItem().hashCode();
        }
        if (getPriceUID() != null) {
            _hashCode += getPriceUID().hashCode();
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
        if (getStatusCode() != null) {
            _hashCode += getStatusCode().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceChangeRequestItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PriceChangeRequestItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "eventUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemTag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "itemTag"));
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
        elemField.setFieldName("offerDetailExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "offerDetailExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "OfferDetailItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "offerDetailExtensionList"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "priceDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "priceItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PriceItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "priceUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("statusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "statusCode"));
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
