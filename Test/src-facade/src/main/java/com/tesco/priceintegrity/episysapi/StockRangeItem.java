/**
 * StockRangeItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class StockRangeItem  implements java.io.Serializable {
    private Integer messageType;

    private String productCode;

    private String productTypeCode;

    private String rangeEndDate;

    private String rangeStartDate;

    private String ranged;

    private String sellUnitID;

    private String sourceIPAddress;

    private String srcSystem;

    private Integer stock;

    public StockRangeItem() {
    }

    public StockRangeItem(
           Integer messageType,
           String productCode,
           String productTypeCode,
           String rangeEndDate,
           String rangeStartDate,
           String ranged,
           String sellUnitID,
           String sourceIPAddress,
           String srcSystem,
           Integer stock) {
           this.messageType = messageType;
           this.productCode = productCode;
           this.productTypeCode = productTypeCode;
           this.rangeEndDate = rangeEndDate;
           this.rangeStartDate = rangeStartDate;
           this.ranged = ranged;
           this.sellUnitID = sellUnitID;
           this.sourceIPAddress = sourceIPAddress;
           this.srcSystem = srcSystem;
           this.stock = stock;
    }


    /**
     * Gets the messageType value for this StockRangeItem.
     * 
     * @return messageType
     */
    public Integer getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this StockRangeItem.
     * 
     * @param messageType
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the productCode value for this StockRangeItem.
     * 
     * @return productCode
     */
    public String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this StockRangeItem.
     * 
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the productTypeCode value for this StockRangeItem.
     * 
     * @return productTypeCode
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }


    /**
     * Sets the productTypeCode value for this StockRangeItem.
     * 
     * @param productTypeCode
     */
    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode;
    }


    /**
     * Gets the rangeEndDate value for this StockRangeItem.
     * 
     * @return rangeEndDate
     */
    public String getRangeEndDate() {
        return rangeEndDate;
    }


    /**
     * Sets the rangeEndDate value for this StockRangeItem.
     * 
     * @param rangeEndDate
     */
    public void setRangeEndDate(String rangeEndDate) {
        this.rangeEndDate = rangeEndDate;
    }


    /**
     * Gets the rangeStartDate value for this StockRangeItem.
     * 
     * @return rangeStartDate
     */
    public String getRangeStartDate() {
        return rangeStartDate;
    }


    /**
     * Sets the rangeStartDate value for this StockRangeItem.
     * 
     * @param rangeStartDate
     */
    public void setRangeStartDate(String rangeStartDate) {
        this.rangeStartDate = rangeStartDate;
    }


    /**
     * Gets the ranged value for this StockRangeItem.
     * 
     * @return ranged
     */
    public String getRanged() {
        return ranged;
    }


    /**
     * Sets the ranged value for this StockRangeItem.
     * 
     * @param ranged
     */
    public void setRanged(String ranged) {
        this.ranged = ranged;
    }


    /**
     * Gets the sellUnitID value for this StockRangeItem.
     * 
     * @return sellUnitID
     */
    public String getSellUnitID() {
        return sellUnitID;
    }


    /**
     * Sets the sellUnitID value for this StockRangeItem.
     * 
     * @param sellUnitID
     */
    public void setSellUnitID(String sellUnitID) {
        this.sellUnitID = sellUnitID;
    }


    /**
     * Gets the sourceIPAddress value for this StockRangeItem.
     * 
     * @return sourceIPAddress
     */
    public String getSourceIPAddress() {
        return sourceIPAddress;
    }


    /**
     * Sets the sourceIPAddress value for this StockRangeItem.
     * 
     * @param sourceIPAddress
     */
    public void setSourceIPAddress(String sourceIPAddress) {
        this.sourceIPAddress = sourceIPAddress;
    }


    /**
     * Gets the srcSystem value for this StockRangeItem.
     * 
     * @return srcSystem
     */
    public String getSrcSystem() {
        return srcSystem;
    }


    /**
     * Sets the srcSystem value for this StockRangeItem.
     * 
     * @param srcSystem
     */
    public void setSrcSystem(String srcSystem) {
        this.srcSystem = srcSystem;
    }


    /**
     * Gets the stock value for this StockRangeItem.
     * 
     * @return stock
     */
    public Integer getStock() {
        return stock;
    }


    /**
     * Sets the stock value for this StockRangeItem.
     * 
     * @param stock
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof StockRangeItem)) return false;
        StockRangeItem other = (StockRangeItem) obj;
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
            ((this.productCode==null && other.getProductCode()==null) || 
             (this.productCode!=null &&
              this.productCode.equals(other.getProductCode()))) &&
            ((this.productTypeCode==null && other.getProductTypeCode()==null) || 
             (this.productTypeCode!=null &&
              this.productTypeCode.equals(other.getProductTypeCode()))) &&
            ((this.rangeEndDate==null && other.getRangeEndDate()==null) || 
             (this.rangeEndDate!=null &&
              this.rangeEndDate.equals(other.getRangeEndDate()))) &&
            ((this.rangeStartDate==null && other.getRangeStartDate()==null) || 
             (this.rangeStartDate!=null &&
              this.rangeStartDate.equals(other.getRangeStartDate()))) &&
            ((this.ranged==null && other.getRanged()==null) || 
             (this.ranged!=null &&
              this.ranged.equals(other.getRanged()))) &&
            ((this.sellUnitID==null && other.getSellUnitID()==null) || 
             (this.sellUnitID!=null &&
              this.sellUnitID.equals(other.getSellUnitID()))) &&
            ((this.sourceIPAddress==null && other.getSourceIPAddress()==null) || 
             (this.sourceIPAddress!=null &&
              this.sourceIPAddress.equals(other.getSourceIPAddress()))) &&
            ((this.srcSystem==null && other.getSrcSystem()==null) || 
             (this.srcSystem!=null &&
              this.srcSystem.equals(other.getSrcSystem()))) &&
            ((this.stock==null && other.getStock()==null) || 
             (this.stock!=null &&
              this.stock.equals(other.getStock())));
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
        if (getProductCode() != null) {
            _hashCode += getProductCode().hashCode();
        }
        if (getProductTypeCode() != null) {
            _hashCode += getProductTypeCode().hashCode();
        }
        if (getRangeEndDate() != null) {
            _hashCode += getRangeEndDate().hashCode();
        }
        if (getRangeStartDate() != null) {
            _hashCode += getRangeStartDate().hashCode();
        }
        if (getRanged() != null) {
            _hashCode += getRanged().hashCode();
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
        if (getStock() != null) {
            _hashCode += getStock().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StockRangeItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StockRangeItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "messageType"));
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
        elemField.setFieldName("rangeEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "rangeEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangeStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "rangeStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ranged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "ranged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("stock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "stock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
