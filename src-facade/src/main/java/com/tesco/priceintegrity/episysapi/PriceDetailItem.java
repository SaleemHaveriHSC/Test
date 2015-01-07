/**
 * PriceDetailItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class PriceDetailItem  extends com.tesco.priceintegrity.episysapi.PriceItem  implements java.io.Serializable {
    private String eventTypeCode;

    private String productCode;

    private String productTypeCode;

    public PriceDetailItem() {
    }

    public PriceDetailItem(
           Integer offerType,
           Float price,
           String priceCode,
           String priceEndDate,
           String priceStartDate,
           Integer priceType,
           Float wasPrice,
           Float wasWasPrice,
           String eventTypeCode,
           String productCode,
           String productTypeCode) {
        super(
            offerType,
            price,
            priceCode,
            priceEndDate,
            priceStartDate,
            priceType,
            wasPrice,
            wasWasPrice);
        this.eventTypeCode = eventTypeCode;
        this.productCode = productCode;
        this.productTypeCode = productTypeCode;
    }


    /**
     * Gets the eventTypeCode value for this PriceDetailItem.
     * 
     * @return eventTypeCode
     */
    public String getEventTypeCode() {
        return eventTypeCode;
    }


    /**
     * Sets the eventTypeCode value for this PriceDetailItem.
     * 
     * @param eventTypeCode
     */
    public void setEventTypeCode(String eventTypeCode) {
        this.eventTypeCode = eventTypeCode;
    }


    /**
     * Gets the productCode value for this PriceDetailItem.
     * 
     * @return productCode
     */
    public String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this PriceDetailItem.
     * 
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the productTypeCode value for this PriceDetailItem.
     * 
     * @return productTypeCode
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }


    /**
     * Sets the productTypeCode value for this PriceDetailItem.
     * 
     * @param productTypeCode
     */
    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PriceDetailItem)) return false;
        PriceDetailItem other = (PriceDetailItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.eventTypeCode==null && other.getEventTypeCode()==null) || 
             (this.eventTypeCode!=null &&
              this.eventTypeCode.equals(other.getEventTypeCode()))) &&
            ((this.productCode==null && other.getProductCode()==null) || 
             (this.productCode!=null &&
              this.productCode.equals(other.getProductCode()))) &&
            ((this.productTypeCode==null && other.getProductTypeCode()==null) || 
             (this.productTypeCode!=null &&
              this.productTypeCode.equals(other.getProductTypeCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getEventTypeCode() != null) {
            _hashCode += getEventTypeCode().hashCode();
        }
        if (getProductCode() != null) {
            _hashCode += getProductCode().hashCode();
        }
        if (getProductTypeCode() != null) {
            _hashCode += getProductTypeCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceDetailItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PriceDetailItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "eventTypeCode"));
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
