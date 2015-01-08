/**
 * PrintElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class PrintElement  implements java.io.Serializable {
    private com.tesco.priceintegrity.episysapi.PrintAttribute[] printAttributes;

    private String productCode;

    private Integer quantity;

    private String requestID;

    private Integer style;

    private String styleName;

    private Integer styleSetId;

    public PrintElement() {
    }

    public PrintElement(
           com.tesco.priceintegrity.episysapi.PrintAttribute[] printAttributes,
           String productCode,
           Integer quantity,
           String requestID,
           Integer style,
           String styleName,
           Integer styleSetId) {
           this.printAttributes = printAttributes;
           this.productCode = productCode;
           this.quantity = quantity;
           this.requestID = requestID;
           this.style = style;
           this.styleName = styleName;
           this.styleSetId = styleSetId;
    }


    /**
     * Gets the printAttributes value for this PrintElement.
     * 
     * @return printAttributes
     */
    public com.tesco.priceintegrity.episysapi.PrintAttribute[] getPrintAttributes() {
        return printAttributes;
    }


    /**
     * Sets the printAttributes value for this PrintElement.
     * 
     * @param printAttributes
     */
    public void setPrintAttributes(com.tesco.priceintegrity.episysapi.PrintAttribute[] printAttributes) {
        this.printAttributes = printAttributes;
    }

    public com.tesco.priceintegrity.episysapi.PrintAttribute getPrintAttributes(int i) {
        return this.printAttributes[i];
    }

    public void setPrintAttributes(int i, com.tesco.priceintegrity.episysapi.PrintAttribute _value) {
        this.printAttributes[i] = _value;
    }


    /**
     * Gets the productCode value for this PrintElement.
     * 
     * @return productCode
     */
    public String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this PrintElement.
     * 
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the quantity value for this PrintElement.
     * 
     * @return quantity
     */
    public Integer getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this PrintElement.
     * 
     * @param quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the requestID value for this PrintElement.
     * 
     * @return requestID
     */
    public String getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this PrintElement.
     * 
     * @param requestID
     */
    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the style value for this PrintElement.
     * 
     * @return style
     */
    public Integer getStyle() {
        return style;
    }


    /**
     * Sets the style value for this PrintElement.
     * 
     * @param style
     */
    public void setStyle(Integer style) {
        this.style = style;
    }


    /**
     * Gets the styleName value for this PrintElement.
     * 
     * @return styleName
     */
    public String getStyleName() {
        return styleName;
    }


    /**
     * Sets the styleName value for this PrintElement.
     * 
     * @param styleName
     */
    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }


    /**
     * Gets the styleSetId value for this PrintElement.
     * 
     * @return styleSetId
     */
    public Integer getStyleSetId() {
        return styleSetId;
    }


    /**
     * Sets the styleSetId value for this PrintElement.
     * 
     * @param styleSetId
     */
    public void setStyleSetId(Integer styleSetId) {
        this.styleSetId = styleSetId;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PrintElement)) return false;
        PrintElement other = (PrintElement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.printAttributes==null && other.getPrintAttributes()==null) || 
             (this.printAttributes!=null &&
              java.util.Arrays.equals(this.printAttributes, other.getPrintAttributes()))) &&
            ((this.productCode==null && other.getProductCode()==null) || 
             (this.productCode!=null &&
              this.productCode.equals(other.getProductCode()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.requestID==null && other.getRequestID()==null) || 
             (this.requestID!=null &&
              this.requestID.equals(other.getRequestID()))) &&
            ((this.style==null && other.getStyle()==null) || 
             (this.style!=null &&
              this.style.equals(other.getStyle()))) &&
            ((this.styleName==null && other.getStyleName()==null) || 
             (this.styleName!=null &&
              this.styleName.equals(other.getStyleName()))) &&
            ((this.styleSetId==null && other.getStyleSetId()==null) || 
             (this.styleSetId!=null &&
              this.styleSetId.equals(other.getStyleSetId())));
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
        if (getPrintAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrintAttributes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPrintAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductCode() != null) {
            _hashCode += getProductCode().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getRequestID() != null) {
            _hashCode += getRequestID().hashCode();
        }
        if (getStyle() != null) {
            _hashCode += getStyle().hashCode();
        }
        if (getStyleName() != null) {
            _hashCode += getStyleName().hashCode();
        }
        if (getStyleSetId() != null) {
            _hashCode += getStyleSetId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrintElement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PrintElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "printAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PrintAttribute"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "productCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "requestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("style");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "style"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("styleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "styleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("styleSetId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "styleSetId"));
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
