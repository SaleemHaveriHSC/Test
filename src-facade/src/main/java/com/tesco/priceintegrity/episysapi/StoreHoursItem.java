/**
 * StoreHoursItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class StoreHoursItem  implements java.io.Serializable {
    private String closeTime;

    private String dayOfWeek;

    private String openTime;

    public StoreHoursItem() {
    }

    public StoreHoursItem(
           String closeTime,
           String dayOfWeek,
           String openTime) {
           this.closeTime = closeTime;
           this.dayOfWeek = dayOfWeek;
           this.openTime = openTime;
    }


    /**
     * Gets the closeTime value for this StoreHoursItem.
     * 
     * @return closeTime
     */
    public String getCloseTime() {
        return closeTime;
    }


    /**
     * Sets the closeTime value for this StoreHoursItem.
     * 
     * @param closeTime
     */
    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }


    /**
     * Gets the dayOfWeek value for this StoreHoursItem.
     * 
     * @return dayOfWeek
     */
    public String getDayOfWeek() {
        return dayOfWeek;
    }


    /**
     * Sets the dayOfWeek value for this StoreHoursItem.
     * 
     * @param dayOfWeek
     */
    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }


    /**
     * Gets the openTime value for this StoreHoursItem.
     * 
     * @return openTime
     */
    public String getOpenTime() {
        return openTime;
    }


    /**
     * Sets the openTime value for this StoreHoursItem.
     * 
     * @param openTime
     */
    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof StoreHoursItem)) return false;
        StoreHoursItem other = (StoreHoursItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.closeTime==null && other.getCloseTime()==null) || 
             (this.closeTime!=null &&
              this.closeTime.equals(other.getCloseTime()))) &&
            ((this.dayOfWeek==null && other.getDayOfWeek()==null) || 
             (this.dayOfWeek!=null &&
              this.dayOfWeek.equals(other.getDayOfWeek()))) &&
            ((this.openTime==null && other.getOpenTime()==null) || 
             (this.openTime!=null &&
              this.openTime.equals(other.getOpenTime())));
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
        if (getCloseTime() != null) {
            _hashCode += getCloseTime().hashCode();
        }
        if (getDayOfWeek() != null) {
            _hashCode += getDayOfWeek().hashCode();
        }
        if (getOpenTime() != null) {
            _hashCode += getOpenTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoreHoursItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreHoursItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "closeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "dayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("openTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "openTime"));
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
