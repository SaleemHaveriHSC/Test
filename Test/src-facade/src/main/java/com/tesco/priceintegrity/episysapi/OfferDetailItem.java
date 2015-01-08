/**
 * OfferDetailItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class OfferDetailItem  implements java.io.Serializable {
    private String offerDetailName;

    private String offerDetailValue;

    public OfferDetailItem() {
    }

    public OfferDetailItem(
           String offerDetailName,
           String offerDetailValue) {
           this.offerDetailName = offerDetailName;
           this.offerDetailValue = offerDetailValue;
    }


    /**
     * Gets the offerDetailName value for this OfferDetailItem.
     * 
     * @return offerDetailName
     */
    public String getOfferDetailName() {
        return offerDetailName;
    }


    /**
     * Sets the offerDetailName value for this OfferDetailItem.
     * 
     * @param offerDetailName
     */
    public void setOfferDetailName(String offerDetailName) {
        this.offerDetailName = offerDetailName;
    }


    /**
     * Gets the offerDetailValue value for this OfferDetailItem.
     * 
     * @return offerDetailValue
     */
    public String getOfferDetailValue() {
        return offerDetailValue;
    }


    /**
     * Sets the offerDetailValue value for this OfferDetailItem.
     * 
     * @param offerDetailValue
     */
    public void setOfferDetailValue(String offerDetailValue) {
        this.offerDetailValue = offerDetailValue;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OfferDetailItem)) return false;
        OfferDetailItem other = (OfferDetailItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offerDetailName==null && other.getOfferDetailName()==null) || 
             (this.offerDetailName!=null &&
              this.offerDetailName.equals(other.getOfferDetailName()))) &&
            ((this.offerDetailValue==null && other.getOfferDetailValue()==null) || 
             (this.offerDetailValue!=null &&
              this.offerDetailValue.equals(other.getOfferDetailValue())));
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
        if (getOfferDetailName() != null) {
            _hashCode += getOfferDetailName().hashCode();
        }
        if (getOfferDetailValue() != null) {
            _hashCode += getOfferDetailValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfferDetailItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "OfferDetailItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerDetailName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "offerDetailName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerDetailValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "offerDetailValue"));
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
