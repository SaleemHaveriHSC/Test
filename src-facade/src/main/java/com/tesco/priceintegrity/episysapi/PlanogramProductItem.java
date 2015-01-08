/**
 * PlanogramProductItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class PlanogramProductItem  implements java.io.Serializable {
    private com.tesco.priceintegrity.episysapi.PlanogramAttributeItem[] attributes;

    private Integer bay;

    private Integer capacity;

    private Integer display;

    private String endDate;

    private Integer messageType;

    private Integer printQty;

    private String productCode;

    private String productTypeCode;

    private Integer sequence;

    private Integer shelf;

    private String srcSystem;

    private String startDate;

    private String storeID;

    private Integer styleUID;

    private Integer width;

    public PlanogramProductItem() {
    }

    public PlanogramProductItem(
           com.tesco.priceintegrity.episysapi.PlanogramAttributeItem[] attributes,
           Integer bay,
           Integer capacity,
           Integer display,
           String endDate,
           Integer messageType,
           Integer printQty,
           String productCode,
           String productTypeCode,
           Integer sequence,
           Integer shelf,
           String srcSystem,
           String startDate,
           String storeID,
           Integer styleUID,
           Integer width) {
           this.attributes = attributes;
           this.bay = bay;
           this.capacity = capacity;
           this.display = display;
           this.endDate = endDate;
           this.messageType = messageType;
           this.printQty = printQty;
           this.productCode = productCode;
           this.productTypeCode = productTypeCode;
           this.sequence = sequence;
           this.shelf = shelf;
           this.srcSystem = srcSystem;
           this.startDate = startDate;
           this.storeID = storeID;
           this.styleUID = styleUID;
           this.width = width;
    }


    /**
     * Gets the attributes value for this PlanogramProductItem.
     * 
     * @return attributes
     */
    public com.tesco.priceintegrity.episysapi.PlanogramAttributeItem[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this PlanogramProductItem.
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
     * Gets the bay value for this PlanogramProductItem.
     * 
     * @return bay
     */
    public Integer getBay() {
        return bay;
    }


    /**
     * Sets the bay value for this PlanogramProductItem.
     * 
     * @param bay
     */
    public void setBay(Integer bay) {
        this.bay = bay;
    }


    /**
     * Gets the capacity value for this PlanogramProductItem.
     * 
     * @return capacity
     */
    public Integer getCapacity() {
        return capacity;
    }


    /**
     * Sets the capacity value for this PlanogramProductItem.
     * 
     * @param capacity
     */
    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }


    /**
     * Gets the display value for this PlanogramProductItem.
     * 
     * @return display
     */
    public Integer getDisplay() {
        return display;
    }


    /**
     * Sets the display value for this PlanogramProductItem.
     * 
     * @param display
     */
    public void setDisplay(Integer display) {
        this.display = display;
    }


    /**
     * Gets the endDate value for this PlanogramProductItem.
     * 
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this PlanogramProductItem.
     * 
     * @param endDate
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the messageType value for this PlanogramProductItem.
     * 
     * @return messageType
     */
    public Integer getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this PlanogramProductItem.
     * 
     * @param messageType
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the printQty value for this PlanogramProductItem.
     * 
     * @return printQty
     */
    public Integer getPrintQty() {
        return printQty;
    }


    /**
     * Sets the printQty value for this PlanogramProductItem.
     * 
     * @param printQty
     */
    public void setPrintQty(Integer printQty) {
        this.printQty = printQty;
    }


    /**
     * Gets the productCode value for this PlanogramProductItem.
     * 
     * @return productCode
     */
    public String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this PlanogramProductItem.
     * 
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the productTypeCode value for this PlanogramProductItem.
     * 
     * @return productTypeCode
     */
    public String getProductTypeCode() {
        return productTypeCode;
    }


    /**
     * Sets the productTypeCode value for this PlanogramProductItem.
     * 
     * @param productTypeCode
     */
    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode;
    }


    /**
     * Gets the sequence value for this PlanogramProductItem.
     * 
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this PlanogramProductItem.
     * 
     * @param sequence
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the shelf value for this PlanogramProductItem.
     * 
     * @return shelf
     */
    public Integer getShelf() {
        return shelf;
    }


    /**
     * Sets the shelf value for this PlanogramProductItem.
     * 
     * @param shelf
     */
    public void setShelf(Integer shelf) {
        this.shelf = shelf;
    }


    /**
     * Gets the srcSystem value for this PlanogramProductItem.
     * 
     * @return srcSystem
     */
    public String getSrcSystem() {
        return srcSystem;
    }


    /**
     * Sets the srcSystem value for this PlanogramProductItem.
     * 
     * @param srcSystem
     */
    public void setSrcSystem(String srcSystem) {
        this.srcSystem = srcSystem;
    }


    /**
     * Gets the startDate value for this PlanogramProductItem.
     * 
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this PlanogramProductItem.
     * 
     * @param startDate
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the storeID value for this PlanogramProductItem.
     * 
     * @return storeID
     */
    public String getStoreID() {
        return storeID;
    }


    /**
     * Sets the storeID value for this PlanogramProductItem.
     * 
     * @param storeID
     */
    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }


    /**
     * Gets the styleUID value for this PlanogramProductItem.
     * 
     * @return styleUID
     */
    public Integer getStyleUID() {
        return styleUID;
    }


    /**
     * Sets the styleUID value for this PlanogramProductItem.
     * 
     * @param styleUID
     */
    public void setStyleUID(Integer styleUID) {
        this.styleUID = styleUID;
    }


    /**
     * Gets the width value for this PlanogramProductItem.
     * 
     * @return width
     */
    public Integer getWidth() {
        return width;
    }


    /**
     * Sets the width value for this PlanogramProductItem.
     * 
     * @param width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PlanogramProductItem)) return false;
        PlanogramProductItem other = (PlanogramProductItem) obj;
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
            ((this.bay==null && other.getBay()==null) || 
             (this.bay!=null &&
              this.bay.equals(other.getBay()))) &&
            ((this.capacity==null && other.getCapacity()==null) || 
             (this.capacity!=null &&
              this.capacity.equals(other.getCapacity()))) &&
            ((this.display==null && other.getDisplay()==null) || 
             (this.display!=null &&
              this.display.equals(other.getDisplay()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
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
            ((this.shelf==null && other.getShelf()==null) || 
             (this.shelf!=null &&
              this.shelf.equals(other.getShelf()))) &&
            ((this.srcSystem==null && other.getSrcSystem()==null) || 
             (this.srcSystem!=null &&
              this.srcSystem.equals(other.getSrcSystem()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.storeID==null && other.getStoreID()==null) || 
             (this.storeID!=null &&
              this.storeID.equals(other.getStoreID()))) &&
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
        if (getBay() != null) {
            _hashCode += getBay().hashCode();
        }
        if (getCapacity() != null) {
            _hashCode += getCapacity().hashCode();
        }
        if (getDisplay() != null) {
            _hashCode += getDisplay().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
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
        if (getShelf() != null) {
            _hashCode += getShelf().hashCode();
        }
        if (getSrcSystem() != null) {
            _hashCode += getSrcSystem().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStoreID() != null) {
            _hashCode += getStoreID().hashCode();
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
        new org.apache.axis.description.TypeDesc(PlanogramProductItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramProductItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramAttributeItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "bay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("display");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "display"));
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
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "messageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("shelf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "shelf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcSystem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "srcSystem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
