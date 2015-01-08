/**
 * PlanogramProductSubItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class PlanogramProductSubItem  implements java.io.Serializable {
    private com.tesco.priceintegrity.episysapi.PlanogramAttributeItem[] attributes;

    private Integer capacity;

    private String endDate;

    private Integer printQty;

    private String productCode;

    private String productTypeCode;

    private Integer sequence;

    private String startDate;

    private Integer styleUID;

    private Integer width;

    public PlanogramProductSubItem() {
    }

    public PlanogramProductSubItem(
           com.tesco.priceintegrity.episysapi.PlanogramAttributeItem[] attributes,
           Integer capacity,
           String endDate,
           Integer printQty,
           String productCode,
           String productTypeCode,
           Integer sequence,
           String startDate,
           Integer styleUID,
           Integer width) {
           this.attributes = attributes;
           this.capacity = capacity;
           this.endDate = endDate;
           this.printQty = printQty;
           this.productCode = productCode;
           this.productTypeCode = productTypeCode;
           this.sequence = sequence;
           this.startDate = startDate;
           this.styleUID = styleUID;
           this.width = width;
    }


    /**
     * Gets the attributes value for this PlanogramProductSubItem.
     * 
     * @return attributes
     */
    public com.tesco.priceintegrity.episysapi.PlanogramAttributeItem[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this PlanogramProductSubItem.
     * 
     * @param attributes
     */
    public void setAttributes(com.tesco.priceintegrity.episysapi.PlanogramAttributeItem[] attributes) {
        this.attributes = attributes;
    }

    public com.tesco.priceintegrity.episysapi.PlanogramAttributeItem getAttributes(int i) {
        return this.attributes[i];
    }

    public void setAttributes(int i, com.tesco.priceintegrity.episysapi.PlanogramAttributeItem _value) {
        this.attributes[i] = _value;
    }


    /**
     * Gets the capacity value for this PlanogramProductSubItem.
     * 
     * @return capacity
     */
    public Integer getCapacity() {
        return capacity;
    }


    /**
     * Sets the capacity value for this PlanogramProductSubItem.
     * 
     * @param capacity
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }


    /**
     * Gets the endDate value for this PlanogramProductSubItem.
     * 
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this PlanogramProductSubItem.
     * 
     * @param endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the printQty value for this PlanogramProductSubItem.
     * 
     * @return printQty
     */
    public Integer getPrintQty() {
        return printQty;
    }


    /**
     * Sets the printQty value for this PlanogramProductSubItem.
     * 
     * @param printQty
     */
    public void setPrintQty(Integer printQty) {
        this.printQty = printQty;
    }


    /**
     * Gets the productCode value for this PlanogramProductSubItem.
     * 
     * @return productCode
     */
    public String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this PlanogramProductSubItem.
     * 
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the productTypeCode value for this PlanogramProductSubItem.
     * 
     * @return productTypeCode
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }


    /**
     * Sets the productTypeCode value for this PlanogramProductSubItem.
     * 
     * @param productTypeCode
     */
    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode;
    }


    /**
     * Gets the sequence value for this PlanogramProductSubItem.
     * 
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this PlanogramProductSubItem.
     * 
     * @param sequence
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the startDate value for this PlanogramProductSubItem.
     * 
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this PlanogramProductSubItem.
     * 
     * @param startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the styleUID value for this PlanogramProductSubItem.
     * 
     * @return styleUID
     */
    public Integer getStyleUID() {
        return styleUID;
    }


    /**
     * Sets the styleUID value for this PlanogramProductSubItem.
     * 
     * @param styleUID
     */
    public void setStyleUID(Integer styleUID) {
        this.styleUID = styleUID;
    }


    /**
     * Gets the width value for this PlanogramProductSubItem.
     * 
     * @return width
     */
    public Integer getWidth() {
        return width;
    }


    /**
     * Sets the width value for this PlanogramProductSubItem.
     * 
     * @param width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PlanogramProductSubItem)) return false;
        PlanogramProductSubItem other = (PlanogramProductSubItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            ((this.capacity==null && other.getCapacity()==null) || 
             (this.capacity!=null &&
              this.capacity.equals(other.getCapacity()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.printQty==null && other.getPrintQty()==null) || 
             (this.printQty!=null &&
              this.printQty.equals(other.getPrintQty()))) &&
            ((this.productCode==null && other.getProductCode()==null) || 
             (this.productCode!=null &&
              this.productCode.equals(other.getProductCode()))) &&
            ((this.productTypeCode==null && other.getProductTypeCode()==null) || 
             (this.productTypeCode!=null &&
              this.productTypeCode.equals(other.getProductTypeCode()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.styleUID==null && other.getStyleUID()==null) || 
             (this.styleUID!=null &&
              this.styleUID.equals(other.getStyleUID()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth())));
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
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCapacity() != null) {
            _hashCode += getCapacity().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getPrintQty() != null) {
            _hashCode += getPrintQty().hashCode();
        }
        if (getProductCode() != null) {
            _hashCode += getProductCode().hashCode();
        }
        if (getProductTypeCode() != null) {
            _hashCode += getProductTypeCode().hashCode();
        }
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStyleUID() != null) {
            _hashCode += getStyleUID().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlanogramProductSubItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramProductSubItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramAttributeItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printQty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "printQty"));
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
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("styleUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "styleUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "width"));
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
