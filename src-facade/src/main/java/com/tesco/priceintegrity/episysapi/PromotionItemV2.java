/**
 * PromotionItemV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class PromotionItemV2  implements java.io.Serializable {
    private Integer messageType;

    private Boolean multiTicketFlag;

    private com.tesco.priceintegrity.episysapi.OfferTypeV2 offer;

    private String offerDesc;

    private Integer offerType;

    private String productCode;

    private String productTypeCode;

    private String promotionEndDate;

    private Integer promotionId;

    private String promotionName;

    private String promotionStartDate;

    private String promotionStatus;

    private String promotionTagLine;

    private String promotioncode;

    private String sourceIPAddress;

    private String srcSystem;

    private String[] storeList;

    private String userID;

    public PromotionItemV2() {
    }

    public PromotionItemV2(
           Integer messageType,
           Boolean multiTicketFlag,
           com.tesco.priceintegrity.episysapi.OfferTypeV2 offer,
           String offerDesc,
           Integer offerType,
           String productCode,
           String productTypeCode,
           String promotionEndDate,
           Integer promotionId,
           String promotionName,
           String promotionStartDate,
           String promotionStatus,
           String promotionTagLine,
           String promotioncode,
           String sourceIPAddress,
           String srcSystem,
           String[] storeList,
           String userID) {
           this.messageType = messageType;
           this.multiTicketFlag = multiTicketFlag;
           this.offer = offer;
           this.offerDesc = offerDesc;
           this.offerType = offerType;
           this.productCode = productCode;
           this.productTypeCode = productTypeCode;
           this.promotionEndDate = promotionEndDate;
           this.promotionId = promotionId;
           this.promotionName = promotionName;
           this.promotionStartDate = promotionStartDate;
           this.promotionStatus = promotionStatus;
           this.promotionTagLine = promotionTagLine;
           this.promotioncode = promotioncode;
           this.sourceIPAddress = sourceIPAddress;
           this.srcSystem = srcSystem;
           this.storeList = storeList;
           this.userID = userID;
    }


    /**
     * Gets the messageType value for this PromotionItemV2.
     * 
     * @return messageType
     */
    public Integer getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this PromotionItemV2.
     * 
     * @param messageType
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the multiTicketFlag value for this PromotionItemV2.
     * 
     * @return multiTicketFlag
     */
    public Boolean getMultiTicketFlag() {
        return multiTicketFlag;
    }


    /**
     * Sets the multiTicketFlag value for this PromotionItemV2.
     * 
     * @param multiTicketFlag
     */
    public void setMultiTicketFlag(Boolean multiTicketFlag) {
        this.multiTicketFlag = multiTicketFlag;
    }


    /**
     * Gets the offer value for this PromotionItemV2.
     * 
     * @return offer
     */
    public com.tesco.priceintegrity.episysapi.OfferTypeV2 getOffer() {
        return offer;
    }


    /**
     * Sets the offer value for this PromotionItemV2.
     * 
     * @param offer
     */
    public void setOffer(com.tesco.priceintegrity.episysapi.OfferTypeV2 offer) {
        this.offer = offer;
    }


    /**
     * Gets the offerDesc value for this PromotionItemV2.
     * 
     * @return offerDesc
     */
    public String getOfferDesc() {
        return offerDesc;
    }


    /**
     * Sets the offerDesc value for this PromotionItemV2.
     * 
     * @param offerDesc
     */
    public void setOfferDesc(String offerDesc) {
        this.offerDesc = offerDesc;
    }


    /**
     * Gets the offerType value for this PromotionItemV2.
     * 
     * @return offerType
     */
    public Integer getOfferType() {
        return offerType;
    }


    /**
     * Sets the offerType value for this PromotionItemV2.
     * 
     * @param offerType
     */
    public void setOfferType(Integer offerType) {
        this.offerType = offerType;
    }


    /**
     * Gets the productCode value for this PromotionItemV2.
     * 
     * @return productCode
     */
    public String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this PromotionItemV2.
     * 
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the productTypeCode value for this PromotionItemV2.
     * 
     * @return productTypeCode
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }


    /**
     * Sets the productTypeCode value for this PromotionItemV2.
     * 
     * @param productTypeCode
     */
    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode;
    }


    /**
     * Gets the promotionEndDate value for this PromotionItemV2.
     * 
     * @return promotionEndDate
     */
    public String getPromotionEndDate() {
        return promotionEndDate;
    }


    /**
     * Sets the promotionEndDate value for this PromotionItemV2.
     * 
     * @param promotionEndDate
     */
    public void setPromotionEndDate(String promotionEndDate) {
        this.promotionEndDate = promotionEndDate;
    }


    /**
     * Gets the promotionId value for this PromotionItemV2.
     * 
     * @return promotionId
     */
    public Integer getPromotionId() {
        return promotionId;
    }


    /**
     * Sets the promotionId value for this PromotionItemV2.
     * 
     * @param promotionId
     */
    public void setPromotionId(Integer promotionId) {
        this.promotionId = promotionId;
    }


    /**
     * Gets the promotionName value for this PromotionItemV2.
     * 
     * @return promotionName
     */
    public String getPromotionName() {
        return promotionName;
    }


    /**
     * Sets the promotionName value for this PromotionItemV2.
     * 
     * @param promotionName
     */
    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }


    /**
     * Gets the promotionStartDate value for this PromotionItemV2.
     * 
     * @return promotionStartDate
     */
    public String getPromotionStartDate() {
        return promotionStartDate;
    }


    /**
     * Sets the promotionStartDate value for this PromotionItemV2.
     * 
     * @param promotionStartDate
     */
    public void setPromotionStartDate(String promotionStartDate) {
        this.promotionStartDate = promotionStartDate;
    }


    /**
     * Gets the promotionStatus value for this PromotionItemV2.
     * 
     * @return promotionStatus
     */
    public String getPromotionStatus() {
        return promotionStatus;
    }


    /**
     * Sets the promotionStatus value for this PromotionItemV2.
     * 
     * @param promotionStatus
     */
    public void setPromotionStatus(String promotionStatus) {
        this.promotionStatus = promotionStatus;
    }


    /**
     * Gets the promotionTagLine value for this PromotionItemV2.
     * 
     * @return promotionTagLine
     */
    public String getPromotionTagLine() {
        return promotionTagLine;
    }


    /**
     * Sets the promotionTagLine value for this PromotionItemV2.
     * 
     * @param promotionTagLine
     */
    public void setPromotionTagLine(String promotionTagLine) {
        this.promotionTagLine = promotionTagLine;
    }


    /**
     * Gets the promotioncode value for this PromotionItemV2.
     * 
     * @return promotioncode
     */
    public String getPromotioncode() {
        return promotioncode;
    }


    /**
     * Sets the promotioncode value for this PromotionItemV2.
     * 
     * @param promotioncode
     */
    public void setPromotioncode(String promotioncode) {
        this.promotioncode = promotioncode;
    }


    /**
     * Gets the sourceIPAddress value for this PromotionItemV2.
     * 
     * @return sourceIPAddress
     */
    public String getSourceIPAddress() {
        return sourceIPAddress;
    }


    /**
     * Sets the sourceIPAddress value for this PromotionItemV2.
     * 
     * @param sourceIPAddress
     */
    public void setSourceIPAddress(String sourceIPAddress) {
        this.sourceIPAddress = sourceIPAddress;
    }


    /**
     * Gets the srcSystem value for this PromotionItemV2.
     * 
     * @return srcSystem
     */
    public String getSrcSystem() {
        return srcSystem;
    }


    /**
     * Sets the srcSystem value for this PromotionItemV2.
     * 
     * @param srcSystem
     */
    public void setSrcSystem(String srcSystem) {
        this.srcSystem = srcSystem;
    }


    /**
     * Gets the storeList value for this PromotionItemV2.
     * 
     * @return storeList
     */
    public String[] getStoreList() {
        return storeList;
    }


    /**
     * Sets the storeList value for this PromotionItemV2.
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


    /**
     * Gets the userID value for this PromotionItemV2.
     * 
     * @return userID
     */
    public String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this PromotionItemV2.
     * 
     * @param userID
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PromotionItemV2)) return false;
        PromotionItemV2 other = (PromotionItemV2) obj;
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
            ((this.multiTicketFlag==null && other.getMultiTicketFlag()==null) || 
             (this.multiTicketFlag!=null &&
              this.multiTicketFlag.equals(other.getMultiTicketFlag()))) &&
            ((this.offer==null && other.getOffer()==null) || 
             (this.offer!=null &&
              this.offer.equals(other.getOffer()))) &&
            ((this.offerDesc==null && other.getOfferDesc()==null) || 
             (this.offerDesc!=null &&
              this.offerDesc.equals(other.getOfferDesc()))) &&
            ((this.offerType==null && other.getOfferType()==null) || 
             (this.offerType!=null &&
              this.offerType.equals(other.getOfferType()))) &&
            ((this.productCode==null && other.getProductCode()==null) || 
             (this.productCode!=null &&
              this.productCode.equals(other.getProductCode()))) &&
            ((this.productTypeCode==null && other.getProductTypeCode()==null) || 
             (this.productTypeCode!=null &&
              this.productTypeCode.equals(other.getProductTypeCode()))) &&
            ((this.promotionEndDate==null && other.getPromotionEndDate()==null) || 
             (this.promotionEndDate!=null &&
              this.promotionEndDate.equals(other.getPromotionEndDate()))) &&
            ((this.promotionId==null && other.getPromotionId()==null) || 
             (this.promotionId!=null &&
              this.promotionId.equals(other.getPromotionId()))) &&
            ((this.promotionName==null && other.getPromotionName()==null) || 
             (this.promotionName!=null &&
              this.promotionName.equals(other.getPromotionName()))) &&
            ((this.promotionStartDate==null && other.getPromotionStartDate()==null) || 
             (this.promotionStartDate!=null &&
              this.promotionStartDate.equals(other.getPromotionStartDate()))) &&
            ((this.promotionStatus==null && other.getPromotionStatus()==null) || 
             (this.promotionStatus!=null &&
              this.promotionStatus.equals(other.getPromotionStatus()))) &&
            ((this.promotionTagLine==null && other.getPromotionTagLine()==null) || 
             (this.promotionTagLine!=null &&
              this.promotionTagLine.equals(other.getPromotionTagLine()))) &&
            ((this.promotioncode==null && other.getPromotioncode()==null) || 
             (this.promotioncode!=null &&
              this.promotioncode.equals(other.getPromotioncode()))) &&
            ((this.sourceIPAddress==null && other.getSourceIPAddress()==null) || 
             (this.sourceIPAddress!=null &&
              this.sourceIPAddress.equals(other.getSourceIPAddress()))) &&
            ((this.srcSystem==null && other.getSrcSystem()==null) || 
             (this.srcSystem!=null &&
              this.srcSystem.equals(other.getSrcSystem()))) &&
            ((this.storeList==null && other.getStoreList()==null) || 
             (this.storeList!=null &&
              java.util.Arrays.equals(this.storeList, other.getStoreList()))) &&
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
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
        }
        if (getMultiTicketFlag() != null) {
            _hashCode += getMultiTicketFlag().hashCode();
        }
        if (getOffer() != null) {
            _hashCode += getOffer().hashCode();
        }
        if (getOfferDesc() != null) {
            _hashCode += getOfferDesc().hashCode();
        }
        if (getOfferType() != null) {
            _hashCode += getOfferType().hashCode();
        }
        if (getProductCode() != null) {
            _hashCode += getProductCode().hashCode();
        }
        if (getProductTypeCode() != null) {
            _hashCode += getProductTypeCode().hashCode();
        }
        if (getPromotionEndDate() != null) {
            _hashCode += getPromotionEndDate().hashCode();
        }
        if (getPromotionId() != null) {
            _hashCode += getPromotionId().hashCode();
        }
        if (getPromotionName() != null) {
            _hashCode += getPromotionName().hashCode();
        }
        if (getPromotionStartDate() != null) {
            _hashCode += getPromotionStartDate().hashCode();
        }
        if (getPromotionStatus() != null) {
            _hashCode += getPromotionStatus().hashCode();
        }
        if (getPromotionTagLine() != null) {
            _hashCode += getPromotionTagLine().hashCode();
        }
        if (getPromotioncode() != null) {
            _hashCode += getPromotioncode().hashCode();
        }
        if (getSourceIPAddress() != null) {
            _hashCode += getSourceIPAddress().hashCode();
        }
        if (getSrcSystem() != null) {
            _hashCode += getSrcSystem().hashCode();
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
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PromotionItemV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PromotionItemV2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "messageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiTicketFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "multiTicketFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "offer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "OfferTypeV2"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "offerDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "offerType"));
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
        elemField.setFieldName("promotionEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "promotionEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "promotionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "promotionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "promotionStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "promotionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionTagLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "promotionTagLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotioncode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "promotioncode"));
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
        elemField.setFieldName("storeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "storeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
