/**
 * PlanogramLocPrdDetailsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class PlanogramLocPrdDetailsRequest  implements java.io.Serializable {
    private Integer bay;

    private Integer display;

    private com.tesco.priceintegrity.episysapi.PlanogramProductSubItem[] product;

    private Integer shelf;

    private String srcSystem;

    private String storeID;

    private String userID;

    public PlanogramLocPrdDetailsRequest() {
    }

    public PlanogramLocPrdDetailsRequest(
           Integer bay,
           Integer display,
           com.tesco.priceintegrity.episysapi.PlanogramProductSubItem[] product,
           Integer shelf,
           String srcSystem,
           String storeID,
           String userID) {
           this.bay = bay;
           this.display = display;
           this.product = product;
           this.shelf = shelf;
           this.srcSystem = srcSystem;
           this.storeID = storeID;
           this.userID = userID;
    }


    /**
     * Gets the bay value for this PlanogramLocPrdDetailsRequest.
     * 
     * @return bay
     */
    public Integer getBay() {
        return bay;
    }


    /**
     * Sets the bay value for this PlanogramLocPrdDetailsRequest.
     * 
     * @param bay
     */
    public void setBay(Integer bay) {
        this.bay = bay;
    }


    /**
     * Gets the display value for this PlanogramLocPrdDetailsRequest.
     * 
     * @return display
     */
    public Integer getDisplay() {
        return display;
    }


    /**
     * Sets the display value for this PlanogramLocPrdDetailsRequest.
     * 
     * @param display
     */
    public void setDisplay(Integer display) {
        this.display = display;
    }


    /**
     * Gets the product value for this PlanogramLocPrdDetailsRequest.
     * 
     * @return product
     */
    public com.tesco.priceintegrity.episysapi.PlanogramProductSubItem[] getProduct() {
        return product;
    }


    /**
     * Sets the product value for this PlanogramLocPrdDetailsRequest.
     * 
     * @param product
     */
    public void setProduct(com.tesco.priceintegrity.episysapi.PlanogramProductSubItem[] product) {
        this.product = product;
    }

    public com.tesco.priceintegrity.episysapi.PlanogramProductSubItem getProduct(int i) {
        return this.product[i];
    }

    public void setProduct(int i, com.tesco.priceintegrity.episysapi.PlanogramProductSubItem _value) {
        this.product[i] = _value;
    }


    /**
     * Gets the shelf value for this PlanogramLocPrdDetailsRequest.
     * 
     * @return shelf
     */
    public Integer getShelf() {
        return shelf;
    }


    /**
     * Sets the shelf value for this PlanogramLocPrdDetailsRequest.
     * 
     * @param shelf
     */
    public void setShelf(Integer shelf) {
        this.shelf = shelf;
    }


    /**
     * Gets the srcSystem value for this PlanogramLocPrdDetailsRequest.
     * 
     * @return srcSystem
     */
    public String getSrcSystem() {
        return srcSystem;
    }


    /**
     * Sets the srcSystem value for this PlanogramLocPrdDetailsRequest.
     * 
     * @param srcSystem
     */
    public void setSrcSystem(String srcSystem) {
        this.srcSystem = srcSystem;
    }


    /**
     * Gets the storeID value for this PlanogramLocPrdDetailsRequest.
     * 
     * @return storeID
     */
    public String getStoreID() {
        return storeID;
    }


    /**
     * Sets the storeID value for this PlanogramLocPrdDetailsRequest.
     * 
     * @param storeID
     */
    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }


    /**
     * Gets the userID value for this PlanogramLocPrdDetailsRequest.
     * 
     * @return userID
     */
    public String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this PlanogramLocPrdDetailsRequest.
     * 
     * @param userID
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PlanogramLocPrdDetailsRequest)) return false;
        PlanogramLocPrdDetailsRequest other = (PlanogramLocPrdDetailsRequest) obj;
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
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              java.util.Arrays.equals(this.product, other.getProduct()))) &&
            ((this.shelf==null && other.getShelf()==null) || 
             (this.shelf!=null &&
              this.shelf.equals(other.getShelf()))) &&
            ((this.srcSystem==null && other.getSrcSystem()==null) || 
             (this.srcSystem!=null &&
              this.srcSystem.equals(other.getSrcSystem()))) &&
            ((this.storeID==null && other.getStoreID()==null) || 
             (this.storeID!=null &&
              this.storeID.equals(other.getStoreID()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID())));
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
        if (getProduct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProduct());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProduct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlanogramLocPrdDetailsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramLocPrdDetailsRequest"));
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
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PlanogramProductSubItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "userID"));
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
