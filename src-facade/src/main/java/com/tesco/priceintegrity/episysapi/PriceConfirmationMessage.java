/**
 * PriceConfirmationMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class PriceConfirmationMessage  implements java.io.Serializable {
    private String UID;

    private String extractionDateTime;

    private com.tesco.priceintegrity.episysapi.PriceDetailItem[] priceDetailItem;

    private Integer priceUpdateUID;

    private com.tesco.priceintegrity.episysapi.ValidationResult result;

    private String storeID;

    public PriceConfirmationMessage() {
    }

    public PriceConfirmationMessage(
           String UID,
           String extractionDateTime,
           com.tesco.priceintegrity.episysapi.PriceDetailItem[] priceDetailItem,
           Integer priceUpdateUID,
           com.tesco.priceintegrity.episysapi.ValidationResult result,
           String storeID) {
           this.UID = UID;
           this.extractionDateTime = extractionDateTime;
           this.priceDetailItem = priceDetailItem;
           this.priceUpdateUID = priceUpdateUID;
           this.result = result;
           this.storeID = storeID;
    }


    /**
     * Gets the UID value for this PriceConfirmationMessage.
     * 
     * @return UID
     */
    public String getUID() {
        return UID;
    }


    /**
     * Sets the UID value for this PriceConfirmationMessage.
     * 
     * @param UID
     */
    public void setUID(String UID) {
        this.UID = UID;
    }


    /**
     * Gets the extractionDateTime value for this PriceConfirmationMessage.
     * 
     * @return extractionDateTime
     */
    public String getExtractionDateTime() {
        return extractionDateTime;
    }


    /**
     * Sets the extractionDateTime value for this PriceConfirmationMessage.
     * 
     * @param extractionDateTime
     */
    public void setExtractionDateTime(String extractionDateTime) {
        this.extractionDateTime = extractionDateTime;
    }


    /**
     * Gets the priceDetailItem value for this PriceConfirmationMessage.
     * 
     * @return priceDetailItem
     */
    public com.tesco.priceintegrity.episysapi.PriceDetailItem[] getPriceDetailItem() {
        return priceDetailItem;
    }


    /**
     * Sets the priceDetailItem value for this PriceConfirmationMessage.
     * 
     * @param priceDetailItem
     */
    public void setPriceDetailItem(com.tesco.priceintegrity.episysapi.PriceDetailItem[] priceDetailItem) {
        this.priceDetailItem = priceDetailItem;
    }

    public com.tesco.priceintegrity.episysapi.PriceDetailItem getPriceDetailItem(int i) {
        return this.priceDetailItem[i];
    }

    public void setPriceDetailItem(int i, com.tesco.priceintegrity.episysapi.PriceDetailItem _value) {
        this.priceDetailItem[i] = _value;
    }


    /**
     * Gets the priceUpdateUID value for this PriceConfirmationMessage.
     * 
     * @return priceUpdateUID
     */
    public Integer getPriceUpdateUID() {
        return priceUpdateUID;
    }


    /**
     * Sets the priceUpdateUID value for this PriceConfirmationMessage.
     * 
     * @param priceUpdateUID
     */
    public void setPriceUpdateUID(Integer priceUpdateUID) {
        this.priceUpdateUID = priceUpdateUID;
    }


    /**
     * Gets the result value for this PriceConfirmationMessage.
     * 
     * @return result
     */
    public com.tesco.priceintegrity.episysapi.ValidationResult getResult() {
        return result;
    }


    /**
     * Sets the result value for this PriceConfirmationMessage.
     * 
     * @param result
     */
    public void setResult(com.tesco.priceintegrity.episysapi.ValidationResult result) {
        this.result = result;
    }


    /**
     * Gets the storeID value for this PriceConfirmationMessage.
     * 
     * @return storeID
     */
    public String getStoreID() {
        return storeID;
    }


    /**
     * Sets the storeID value for this PriceConfirmationMessage.
     * 
     * @param storeID
     */
    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PriceConfirmationMessage)) return false;
        PriceConfirmationMessage other = (PriceConfirmationMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.UID==null && other.getUID()==null) || 
             (this.UID!=null &&
              this.UID.equals(other.getUID()))) &&
            ((this.extractionDateTime==null && other.getExtractionDateTime()==null) || 
             (this.extractionDateTime!=null &&
              this.extractionDateTime.equals(other.getExtractionDateTime()))) &&
            ((this.priceDetailItem==null && other.getPriceDetailItem()==null) || 
             (this.priceDetailItem!=null &&
              java.util.Arrays.equals(this.priceDetailItem, other.getPriceDetailItem()))) &&
            ((this.priceUpdateUID==null && other.getPriceUpdateUID()==null) || 
             (this.priceUpdateUID!=null &&
              this.priceUpdateUID.equals(other.getPriceUpdateUID()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              this.result.equals(other.getResult()))) &&
            ((this.storeID==null && other.getStoreID()==null) || 
             (this.storeID!=null &&
              this.storeID.equals(other.getStoreID())));
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
        if (getUID() != null) {
            _hashCode += getUID().hashCode();
        }
        if (getExtractionDateTime() != null) {
            _hashCode += getExtractionDateTime().hashCode();
        }
        if (getPriceDetailItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriceDetailItem());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPriceDetailItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriceUpdateUID() != null) {
            _hashCode += getPriceUpdateUID().hashCode();
        }
        if (getResult() != null) {
            _hashCode += getResult().hashCode();
        }
        if (getStoreID() != null) {
            _hashCode += getStoreID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceConfirmationMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PriceConfirmationMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("UID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "UID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extractionDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "extractionDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceDetailItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "priceDetailItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PriceDetailItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceUpdateUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "priceUpdateUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ValidationResult"));
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
