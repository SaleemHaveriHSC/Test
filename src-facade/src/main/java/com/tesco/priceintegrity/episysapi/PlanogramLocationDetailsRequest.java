/**
 * PlanogramLocationDetailsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class PlanogramLocationDetailsRequest  implements java.io.Serializable {
    private Integer bay;

    private Integer display;

    private String displayDescription;

    private String displayTypeName;

    private String prodLocType;

    private Integer shelf;

    private String srcSystem;

    private String storeID;

    public PlanogramLocationDetailsRequest() {
    }

    public PlanogramLocationDetailsRequest(
           Integer bay,
           Integer display,
           String displayDescription,
           String displayTypeName,
           String prodLocType,
           Integer shelf,
           String srcSystem,
           String storeID) {
           this.bay = bay;
           this.display = display;
           this.displayDescription = displayDescription;
           this.displayTypeName = displayTypeName;
           this.prodLocType = prodLocType;
           this.shelf = shelf;
           this.srcSystem = srcSystem;
           this.storeID = storeID;
    }


    /**
     * Gets the bay value for this PlanogramLocationDetailsRequest.
     * 
     * @return bay
     */
    public Integer getBay() {
        return bay;
    }


    /**
     * Sets the bay value for this PlanogramLocationDetailsRequest.
     * 
     * @param bay
     */
    public void setBay(Integer bay) {
        this.bay = bay;
    }


    /**
     * Gets the display value for this PlanogramLocationDetailsRequest.
     * 
     * @return display
     */
    public Integer getDisplay() {
        return display;
    }


    /**
     * Sets the display value for this PlanogramLocationDetailsRequest.
     * 
     * @param display
     */
    public void setDisplay(Integer display) {
        this.display = display;
    }


    /**
     * Gets the displayDescription value for this PlanogramLocationDetailsRequest.
     * 
     * @return displayDescription
     */
    public String getDisplayDescription() {
        return displayDescription;
    }


    /**
     * Sets the displayDescription value for this PlanogramLocationDetailsRequest.
     * 
     * @param displayDescription
     */
    public void setDisplayDescription(String displayDescription) {
        this.displayDescription = displayDescription;
    }


    /**
     * Gets the displayTypeName value for this PlanogramLocationDetailsRequest.
     * 
     * @return displayTypeName
     */
    public String getDisplayTypeName() {
        return displayTypeName;
    }


    /**
     * Sets the displayTypeName value for this PlanogramLocationDetailsRequest.
     * 
     * @param displayTypeName
     */
    public void setDisplayTypeName(String displayTypeName) {
        this.displayTypeName = displayTypeName;
    }


    /**
     * Gets the prodLocType value for this PlanogramLocationDetailsRequest.
     * 
     * @return prodLocType
     */
    public String getProdLocType() {
        return prodLocType;
    }


    /**
     * Sets the prodLocType value for this PlanogramLocationDetailsRequest.
     * 
     * @param prodLocType
     */
    public void setProdLocType(String prodLocType) {
        this.prodLocType = prodLocType;
    }


    /**
     * Gets the shelf value for this PlanogramLocationDetailsRequest.
     * 
     * @return shelf
     */
    public Integer getShelf() {
        return shelf;
    }


    /**
     * Sets the shelf value for this PlanogramLocationDetailsRequest.
     * 
     * @param shelf
     */
    public void setShelf(Integer shelf) {
        this.shelf = shelf;
    }


    /**
     * Gets the srcSystem value for this PlanogramLocationDetailsRequest.
     * 
     * @return srcSystem
     */
    public String getSrcSystem() {
        return srcSystem;
    }


    /**
     * Sets the srcSystem value for this PlanogramLocationDetailsRequest.
     * 
     * @param srcSystem
     */
    public void setSrcSystem(String srcSystem) {
        this.srcSystem = srcSystem;
    }


    /**
     * Gets the storeID value for this PlanogramLocationDetailsRequest.
     * 
     * @return storeID
     */
    public String getStoreID() {
        return storeID;
    }


    /**
     * Sets the storeID value for this PlanogramLocationDetailsRequest.
     * 
     * @param storeID
     */
    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PlanogramLocationDetailsRequest)) return false;
        PlanogramLocationDetailsRequest other = (PlanogramLocationDetailsRequest) obj;
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
            ((this.display==null && other.getDisplay()==null) || 
             (this.display!=null &&
              this.display.equals(other.getDisplay()))) &&
            ((this.displayDescription==null && other.getDisplayDescription()==null) || 
             (this.displayDescription!=null &&
              this.displayDescription.equals(other.getDisplayDescription()))) &&
            ((this.displayTypeName==null && other.getDisplayTypeName()==null) || 
             (this.displayTypeName!=null &&
              this.displayTypeName.equals(other.getDisplayTypeName()))) &&
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
        if (getDisplay() != null) {
            _hashCode += getDisplay().hashCode();
        }
        if (getDisplayDescription() != null) {
            _hashCode += getDisplayDescription().hashCode();
        }
        if (getDisplayTypeName() != null) {
            _hashCode += getDisplayTypeName().hashCode();
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
        new org.apache.axis.description.TypeDesc(PlanogramLocationDetailsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramLocationDetailsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "bay"));
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
        elemField.setFieldName("displayTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "displayTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
