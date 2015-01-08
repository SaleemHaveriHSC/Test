/**
 * PlanogramLocationItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class PlanogramLocationItem  implements java.io.Serializable {
    private Integer bay;

    private Integer defaultPrintQty;

    private Integer defaultStyleUID;

    private Integer display;

    private String displayDescription;

    private String displaySubTypeName;

    private String displayTypeName;

    private String hierarchyCode;

    private String hierarchyTypeCode;

    private Integer messageType;

    private String prodLocType;

    private Integer shelf;

    private String srcSystem;

    private String storeID;

    public PlanogramLocationItem() {
    }

    public PlanogramLocationItem(
           Integer bay,
           Integer defaultPrintQty,
           Integer defaultStyleUID,
           Integer display,
           String displayDescription,
           String displaySubTypeName,
           String displayTypeName,
           String hierarchyCode,
           String hierarchyTypeCode,
           Integer messageType,
           String prodLocType,
           Integer shelf,
           String srcSystem,
           String storeID) {
           this.bay = bay;
           this.defaultPrintQty = defaultPrintQty;
           this.defaultStyleUID = defaultStyleUID;
           this.display = display;
           this.displayDescription = displayDescription;
           this.displaySubTypeName = displaySubTypeName;
           this.displayTypeName = displayTypeName;
           this.hierarchyCode = hierarchyCode;
           this.hierarchyTypeCode = hierarchyTypeCode;
           this.messageType = messageType;
           this.prodLocType = prodLocType;
           this.shelf = shelf;
           this.srcSystem = srcSystem;
           this.storeID = storeID;
    }


    /**
     * Gets the bay value for this PlanogramLocationItem.
     * 
     * @return bay
     */
    public Integer getBay() {
        return bay;
    }


    /**
     * Sets the bay value for this PlanogramLocationItem.
     * 
     * @param bay
     */
    public void setBay(Integer bay) {
        this.bay = bay;
    }


    /**
     * Gets the defaultPrintQty value for this PlanogramLocationItem.
     * 
     * @return defaultPrintQty
     */
    public Integer getDefaultPrintQty() {
        return defaultPrintQty;
    }


    /**
     * Sets the defaultPrintQty value for this PlanogramLocationItem.
     * 
     * @param defaultPrintQty
     */
    public void setDefaultPrintQty(Integer defaultPrintQty) {
        this.defaultPrintQty = defaultPrintQty;
    }


    /**
     * Gets the defaultStyleUID value for this PlanogramLocationItem.
     * 
     * @return defaultStyleUID
     */
    public Integer getDefaultStyleUID() {
        return defaultStyleUID;
    }


    /**
     * Sets the defaultStyleUID value for this PlanogramLocationItem.
     * 
     * @param defaultStyleUID
     */
    public void setDefaultStyleUID(Integer defaultStyleUID) {
        this.defaultStyleUID = defaultStyleUID;
    }


    /**
     * Gets the display value for this PlanogramLocationItem.
     * 
     * @return display
     */
    public Integer getDisplay() {
        return display;
    }


    /**
     * Sets the display value for this PlanogramLocationItem.
     * 
     * @param display
     */
    public void setDisplay(Integer display) {
        this.display = display;
    }


    /**
     * Gets the displayDescription value for this PlanogramLocationItem.
     * 
     * @return displayDescription
     */
    public String getDisplayDescription() {
        return displayDescription;
    }


    /**
     * Sets the displayDescription value for this PlanogramLocationItem.
     * 
     * @param displayDescription
     */
    public void setDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
    }


    /**
     * Gets the displaySubTypeName value for this PlanogramLocationItem.
     * 
     * @return displaySubTypeName
     */
    public String getDisplaySubTypeName() {
        return displaySubTypeName;
    }


    /**
     * Sets the displaySubTypeName value for this PlanogramLocationItem.
     * 
     * @param displaySubTypeName
     */
    public void setDisplaySubTypeName(String displaySubTypeName) {
        this.displaySubTypeName = displaySubTypeName;
    }


    /**
     * Gets the displayTypeName value for this PlanogramLocationItem.
     * 
     * @return displayTypeName
     */
    public String getDisplayTypeName() {
        return displayTypeName;
    }


    /**
     * Sets the displayTypeName value for this PlanogramLocationItem.
     * 
     * @param displayTypeName
     */
    public void setDisplayTypeName(String displayTypeName) {
        this.displayTypeName = displayTypeName;
    }


    /**
     * Gets the hierarchyCode value for this PlanogramLocationItem.
     * 
     * @return hierarchyCode
     */
    public String getHierarchyCode() {
        return hierarchyCode;
    }


    /**
     * Sets the hierarchyCode value for this PlanogramLocationItem.
     * 
     * @param hierarchyCode
     */
    public void setHierarchyCode(String hierarchyCode) {
        this.hierarchyCode = hierarchyCode;
    }


    /**
     * Gets the hierarchyTypeCode value for this PlanogramLocationItem.
     * 
     * @return hierarchyTypeCode
     */
    public String getHierarchyTypeCode() {
        return hierarchyTypeCode;
    }


    /**
     * Sets the hierarchyTypeCode value for this PlanogramLocationItem.
     * 
     * @param hierarchyTypeCode
     */
    public void setHierarchyTypeCode(String hierarchyTypeCode) {
        this.hierarchyTypeCode = hierarchyTypeCode;
    }


    /**
     * Gets the messageType value for this PlanogramLocationItem.
     * 
     * @return messageType
     */
    public Integer getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this PlanogramLocationItem.
     * 
     * @param messageType
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the prodLocType value for this PlanogramLocationItem.
     * 
     * @return prodLocType
     */
    public String getProdLocType() {
        return prodLocType;
    }


    /**
     * Sets the prodLocType value for this PlanogramLocationItem.
     * 
     * @param prodLocType
     */
    public void setProdLocType(String prodLocType) {
        this.prodLocType = prodLocType;
    }


    /**
     * Gets the shelf value for this PlanogramLocationItem.
     * 
     * @return shelf
     */
    public Integer getShelf() {
        return shelf;
    }


    /**
     * Sets the shelf value for this PlanogramLocationItem.
     * 
     * @param shelf
     */
    public void setShelf(Integer shelf) {
        this.shelf = shelf;
    }


    /**
     * Gets the srcSystem value for this PlanogramLocationItem.
     * 
     * @return srcSystem
     */
    public String getSrcSystem() {
        return srcSystem;
    }


    /**
     * Sets the srcSystem value for this PlanogramLocationItem.
     * 
     * @param srcSystem
     */
    public void setSrcSystem(String srcSystem) {
        this.srcSystem = srcSystem;
    }


    /**
     * Gets the storeID value for this PlanogramLocationItem.
     * 
     * @return storeID
     */
    public String getStoreID() {
        return storeID;
    }


    /**
     * Sets the storeID value for this PlanogramLocationItem.
     * 
     * @param storeID
     */
    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PlanogramLocationItem)) return false;
        PlanogramLocationItem other = (PlanogramLocationItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bay==null && other.getBay()==null) || 
             (this.bay!=null &&
              this.bay.equals(other.getBay()))) &&
            ((this.defaultPrintQty==null && other.getDefaultPrintQty()==null) || 
             (this.defaultPrintQty!=null &&
              this.defaultPrintQty.equals(other.getDefaultPrintQty()))) &&
            ((this.defaultStyleUID==null && other.getDefaultStyleUID()==null) || 
             (this.defaultStyleUID!=null &&
              this.defaultStyleUID.equals(other.getDefaultStyleUID()))) &&
            ((this.display==null && other.getDisplay()==null) || 
             (this.display!=null &&
              this.display.equals(other.getDisplay()))) &&
            ((this.displayDescription==null && other.getDisplayDescription()==null) || 
             (this.displayDescription!=null &&
              this.displayDescription.equals(other.getDisplayDescription()))) &&
            ((this.displaySubTypeName==null && other.getDisplaySubTypeName()==null) || 
             (this.displaySubTypeName!=null &&
              this.displaySubTypeName.equals(other.getDisplaySubTypeName()))) &&
            ((this.displayTypeName==null && other.getDisplayTypeName()==null) || 
             (this.displayTypeName!=null &&
              this.displayTypeName.equals(other.getDisplayTypeName()))) &&
            ((this.hierarchyCode==null && other.getHierarchyCode()==null) || 
             (this.hierarchyCode!=null &&
              this.hierarchyCode.equals(other.getHierarchyCode()))) &&
            ((this.hierarchyTypeCode==null && other.getHierarchyTypeCode()==null) || 
             (this.hierarchyTypeCode!=null &&
              this.hierarchyTypeCode.equals(other.getHierarchyTypeCode()))) &&
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
            ((this.prodLocType==null && other.getProdLocType()==null) || 
             (this.prodLocType!=null &&
              this.prodLocType.equals(other.getProdLocType()))) &&
            ((this.shelf==null && other.getShelf()==null) || 
             (this.shelf!=null &&
              this.shelf.equals(other.getShelf()))) &&
            ((this.srcSystem==null && other.getSrcSystem()==null) || 
             (this.srcSystem!=null &&
              this.srcSystem.equals(other.getSrcSystem()))) &&
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
        if (getBay() != null) {
            _hashCode += getBay().hashCode();
        }
        if (getDefaultPrintQty() != null) {
            _hashCode += getDefaultPrintQty().hashCode();
        }
        if (getDefaultStyleUID() != null) {
            _hashCode += getDefaultStyleUID().hashCode();
        }
        if (getDisplay() != null) {
            _hashCode += getDisplay().hashCode();
        }
        if (getDisplayDescription() != null) {
            _hashCode += getDisplayDescription().hashCode();
        }
        if (getDisplaySubTypeName() != null) {
            _hashCode += getDisplaySubTypeName().hashCode();
        }
        if (getDisplayTypeName() != null) {
            _hashCode += getDisplayTypeName().hashCode();
        }
        if (getHierarchyCode() != null) {
            _hashCode += getHierarchyCode().hashCode();
        }
        if (getHierarchyTypeCode() != null) {
            _hashCode += getHierarchyTypeCode().hashCode();
        }
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
        }
        if (getProdLocType() != null) {
            _hashCode += getProdLocType().hashCode();
        }
        if (getShelf() != null) {
            _hashCode += getShelf().hashCode();
        }
        if (getSrcSystem() != null) {
            _hashCode += getSrcSystem().hashCode();
        }
        if (getStoreID() != null) {
            _hashCode += getStoreID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlanogramLocationItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramLocationItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "bay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultPrintQty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "defaultPrintQty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultStyleUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "defaultStyleUID"));
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
        elemField.setFieldName("displayDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "displayDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displaySubTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "displaySubTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "displayTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hierarchyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "hierarchyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hierarchyTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "hierarchyTypeCode"));
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
        elemField.setFieldName("prodLocType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "prodLocType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
