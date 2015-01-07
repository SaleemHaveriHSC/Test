/**
 * PreviewSignSetItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class PreviewSignSetItem  implements java.io.Serializable {
    private com.tesco.priceintegrity.episysapi.PrintAttribute[] contentData;

    private Integer dpi;

    private String offerID;

    private String offerType;

    private String productCode;

    private String requestID;

    private String saveContent;

    private String templateSetID;

    private String userID;

    public PreviewSignSetItem() {
    }

    public PreviewSignSetItem(
           com.tesco.priceintegrity.episysapi.PrintAttribute[] contentData,
           Integer dpi,
           String offerID,
           String offerType,
           String productCode,
           String requestID,
           String saveContent,
           String templateSetID,
           String userID) {
           this.contentData = contentData;
           this.dpi = dpi;
           this.offerID = offerID;
           this.offerType = offerType;
           this.productCode = productCode;
           this.requestID = requestID;
           this.saveContent = saveContent;
           this.templateSetID = templateSetID;
           this.userID = userID;
    }


    /**
     * Gets the contentData value for this PreviewSignSetItem.
     * 
     * @return contentData
     */
    public com.tesco.priceintegrity.episysapi.PrintAttribute[] getContentData() {
        return contentData;
    }


    /**
     * Sets the contentData value for this PreviewSignSetItem.
     * 
     * @param contentData
     */
    public void setContentData(com.tesco.priceintegrity.episysapi.PrintAttribute[] contentData) {
        this.contentData = contentData;
    }

    public com.tesco.priceintegrity.episysapi.PrintAttribute getContentData(int i) {
        return this.contentData[i];
    }

    public void setContentData(int i, com.tesco.priceintegrity.episysapi.PrintAttribute _value) {
        this.contentData[i] = _value;
    }


    /**
     * Gets the dpi value for this PreviewSignSetItem.
     * 
     * @return dpi
     */
    public Integer getDpi() {
        return dpi;
    }


    /**
     * Sets the dpi value for this PreviewSignSetItem.
     * 
     * @param dpi
     */
    public void setDpi(Integer dpi) {
        this.dpi = dpi;
    }


    /**
     * Gets the offerID value for this PreviewSignSetItem.
     * 
     * @return offerID
     */
    public String getOfferID() {
        return offerID;
    }


    /**
     * Sets the offerID value for this PreviewSignSetItem.
     * 
     * @param offerID
     */
    public void setOfferID(String offerID) {
        this.offerID = offerID;
    }


    /**
     * Gets the offerType value for this PreviewSignSetItem.
     * 
     * @return offerType
     */
    public String getOfferType() {
        return offerType;
    }


    /**
     * Sets the offerType value for this PreviewSignSetItem.
     * 
     * @param offerType
     */
    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }


    /**
     * Gets the productCode value for this PreviewSignSetItem.
     * 
     * @return productCode
     */
    public String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this PreviewSignSetItem.
     * 
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the requestID value for this PreviewSignSetItem.
     * 
     * @return requestID
     */
    public String getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this PreviewSignSetItem.
     * 
     * @param requestID
     */
    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the saveContent value for this PreviewSignSetItem.
     * 
     * @return saveContent
     */
    public String getSaveContent() {
        return saveContent;
    }


    /**
     * Sets the saveContent value for this PreviewSignSetItem.
     * 
     * @param saveContent
     */
    public void setSaveContent(String saveContent) {
        this.saveContent = saveContent;
    }


    /**
     * Gets the templateSetID value for this PreviewSignSetItem.
     * 
     * @return templateSetID
     */
    public String getTemplateSetID() {
        return templateSetID;
    }


    /**
     * Sets the templateSetID value for this PreviewSignSetItem.
     * 
     * @param templateSetID
     */
    public void setTemplateSetID(String templateSetID) {
        this.templateSetID = templateSetID;
    }


    /**
     * Gets the userID value for this PreviewSignSetItem.
     * 
     * @return userID
     */
    public String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this PreviewSignSetItem.
     * 
     * @param userID
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PreviewSignSetItem)) return false;
        PreviewSignSetItem other = (PreviewSignSetItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contentData==null && other.getContentData()==null) || 
             (this.contentData!=null &&
              java.util.Arrays.equals(this.contentData, other.getContentData()))) &&
            ((this.dpi==null && other.getDpi()==null) || 
             (this.dpi!=null &&
              this.dpi.equals(other.getDpi()))) &&
            ((this.offerID==null && other.getOfferID()==null) || 
             (this.offerID!=null &&
              this.offerID.equals(other.getOfferID()))) &&
            ((this.offerType==null && other.getOfferType()==null) || 
             (this.offerType!=null &&
              this.offerType.equals(other.getOfferType()))) &&
            ((this.productCode==null && other.getProductCode()==null) || 
             (this.productCode!=null &&
              this.productCode.equals(other.getProductCode()))) &&
            ((this.requestID==null && other.getRequestID()==null) || 
             (this.requestID!=null &&
              this.requestID.equals(other.getRequestID()))) &&
            ((this.saveContent==null && other.getSaveContent()==null) || 
             (this.saveContent!=null &&
              this.saveContent.equals(other.getSaveContent()))) &&
            ((this.templateSetID==null && other.getTemplateSetID()==null) || 
             (this.templateSetID!=null &&
              this.templateSetID.equals(other.getTemplateSetID()))) &&
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
        if (getContentData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContentData());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getContentData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDpi() != null) {
            _hashCode += getDpi().hashCode();
        }
        if (getOfferID() != null) {
            _hashCode += getOfferID().hashCode();
        }
        if (getOfferType() != null) {
            _hashCode += getOfferType().hashCode();
        }
        if (getProductCode() != null) {
            _hashCode += getProductCode().hashCode();
        }
        if (getRequestID() != null) {
            _hashCode += getRequestID().hashCode();
        }
        if (getSaveContent() != null) {
            _hashCode += getSaveContent().hashCode();
        }
        if (getTemplateSetID() != null) {
            _hashCode += getTemplateSetID().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PreviewSignSetItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PreviewSignSetItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "contentData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PrintAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpi");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "dpi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "offerID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "offerType"));
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
        elemField.setFieldName("requestID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "requestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saveContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "saveContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templateSetID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "templateSetID"));
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
