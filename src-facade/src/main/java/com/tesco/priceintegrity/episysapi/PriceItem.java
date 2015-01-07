/**
 * PriceItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class PriceItem  implements java.io.Serializable {
    private Integer offerType;

    private Float price;

    private String priceCode;

    private String priceEndDate;

    private String priceStartDate;

    private Integer priceType;

    private Float wasPrice;

    private Float wasWasPrice;

    public PriceItem() {
    }

    public PriceItem(
           Integer offerType,
           Float price,
           String priceCode,
           String priceEndDate,
           String priceStartDate,
           Integer priceType,
           Float wasPrice,
           Float wasWasPrice) {
           this.offerType = offerType;
           this.price = price;
           this.priceCode = priceCode;
           this.priceEndDate = priceEndDate;
           this.priceStartDate = priceStartDate;
           this.priceType = priceType;
           this.wasPrice = wasPrice;
           this.wasWasPrice = wasWasPrice;
    }


    /**
     * Gets the offerType value for this PriceItem.
     * 
     * @return offerType
     */
    public Integer getOfferType() {
        return offerType;
    }


    /**
     * Sets the offerType value for this PriceItem.
     * 
     * @param offerType
     */
    public void setOfferType(Integer offerType) {
        this.offerType = offerType;
    }


    /**
     * Gets the price value for this PriceItem.
     * 
     * @return price
     */
    public Float getPrice() {
        return price;
    }


    /**
     * Sets the price value for this PriceItem.
     * 
     * @param price
     */
    public void setPrice(Float price) {
        this.price = price;
    }


    /**
     * Gets the priceCode value for this PriceItem.
     * 
     * @return priceCode
     */
    public String getPriceCode() {
        return priceCode;
    }


    /**
     * Sets the priceCode value for this PriceItem.
     * 
     * @param priceCode
     */
    public void setPriceCode(String priceCode) {
        this.priceCode = priceCode;
    }


    /**
     * Gets the priceEndDate value for this PriceItem.
     * 
     * @return priceEndDate
     */
    public String getPriceEndDate() {
        return priceEndDate;
    }


    /**
     * Sets the priceEndDate value for this PriceItem.
     * 
     * @param priceEndDate
     */
    public void setPriceEndDate(String priceEndDate) {
        this.priceEndDate = priceEndDate;
    }


    /**
     * Gets the priceStartDate value for this PriceItem.
     * 
     * @return priceStartDate
     */
    public String getPriceStartDate() {
        return priceStartDate;
    }


    /**
     * Sets the priceStartDate value for this PriceItem.
     * 
     * @param priceStartDate
     */
    public void setPriceStartDate(String priceStartDate) {
        this.priceStartDate = priceStartDate;
    }


    /**
     * Gets the priceType value for this PriceItem.
     * 
     * @return priceType
     */
    public Integer getPriceType() {
        return priceType;
    }


    /**
     * Sets the priceType value for this PriceItem.
     * 
     * @param priceType
     */
    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }


    /**
     * Gets the wasPrice value for this PriceItem.
     * 
     * @return wasPrice
     */
    public Float getWasPrice() {
        return wasPrice;
    }


    /**
     * Sets the wasPrice value for this PriceItem.
     * 
     * @param wasPrice
     */
    public void setWasPrice(Float wasPrice) {
        this.wasPrice = wasPrice;
    }


    /**
     * Gets the wasWasPrice value for this PriceItem.
     * 
     * @return wasWasPrice
     */
    public Float getWasWasPrice() {
        return wasWasPrice;
    }


    /**
     * Sets the wasWasPrice value for this PriceItem.
     * 
     * @param wasWasPrice
     */
    public void setWasWasPrice(Float wasWasPrice) {
        this.wasWasPrice = wasWasPrice;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PriceItem)) return false;
        PriceItem other = (PriceItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offerType==null && other.getOfferType()==null) || 
             (this.offerType!=null &&
              this.offerType.equals(other.getOfferType()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.priceCode==null && other.getPriceCode()==null) || 
             (this.priceCode!=null &&
              this.priceCode.equals(other.getPriceCode()))) &&
            ((this.priceEndDate==null && other.getPriceEndDate()==null) || 
             (this.priceEndDate!=null &&
              this.priceEndDate.equals(other.getPriceEndDate()))) &&
            ((this.priceStartDate==null && other.getPriceStartDate()==null) || 
             (this.priceStartDate!=null &&
              this.priceStartDate.equals(other.getPriceStartDate()))) &&
            ((this.priceType==null && other.getPriceType()==null) || 
             (this.priceType!=null &&
              this.priceType.equals(other.getPriceType()))) &&
            ((this.wasPrice==null && other.getWasPrice()==null) || 
             (this.wasPrice!=null &&
              this.wasPrice.equals(other.getWasPrice()))) &&
            ((this.wasWasPrice==null && other.getWasWasPrice()==null) || 
             (this.wasWasPrice!=null &&
              this.wasWasPrice.equals(other.getWasWasPrice())));
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
        if (getOfferType() != null) {
            _hashCode += getOfferType().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getPriceCode() != null) {
            _hashCode += getPriceCode().hashCode();
        }
        if (getPriceEndDate() != null) {
            _hashCode += getPriceEndDate().hashCode();
        }
        if (getPriceStartDate() != null) {
            _hashCode += getPriceStartDate().hashCode();
        }
        if (getPriceType() != null) {
            _hashCode += getPriceType().hashCode();
        }
        if (getWasPrice() != null) {
            _hashCode += getWasPrice().hashCode();
        }
        if (getWasWasPrice() != null) {
            _hashCode += getWasWasPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PriceItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "offerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "priceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "priceEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "priceStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "priceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wasPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "wasPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wasWasPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "wasWasPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
