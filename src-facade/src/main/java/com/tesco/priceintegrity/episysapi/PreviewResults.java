/**
 * PreviewResults.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class PreviewResults  implements java.io.Serializable {
    private byte[] data;

    private Integer imageHeight;

    private Integer imageWidth;

    private String productCode;

    private String requestID;

    private Integer status;

    private String styleName;

    private String type;

    public PreviewResults() {
    }

    public PreviewResults(
           byte[] data,
           Integer imageHeight,
           Integer imageWidth,
           String productCode,
           String requestID,
           Integer status,
           String styleName,
           String type) {
           this.data = data;
           this.imageHeight = imageHeight;
           this.imageWidth = imageWidth;
           this.productCode = productCode;
           this.requestID = requestID;
           this.status = status;
           this.styleName = styleName;
           this.type = type;
    }


    /**
     * Gets the data value for this PreviewResults.
     * 
     * @return data
     */
    public byte[] getData() {
        return data;
    }


    /**
     * Sets the data value for this PreviewResults.
     * 
     * @param data
     */
    public void setData(byte[] data) {
        this.data = data;
    }


    /**
     * Gets the imageHeight value for this PreviewResults.
     * 
     * @return imageHeight
     */
    public Integer getImageHeight() {
        return imageHeight;
    }


    /**
     * Sets the imageHeight value for this PreviewResults.
     * 
     * @param imageHeight
     */
    public void setImageHeight(Integer imageHeight) {
        this.imageHeight = imageHeight;
    }


    /**
     * Gets the imageWidth value for this PreviewResults.
     * 
     * @return imageWidth
     */
    public Integer getImageWidth() {
        return imageWidth;
    }


    /**
     * Sets the imageWidth value for this PreviewResults.
     * 
     * @param imageWidth
     */
    public void setImageWidth(Integer imageWidth) {
        this.imageWidth = imageWidth;
    }


    /**
     * Gets the productCode value for this PreviewResults.
     * 
     * @return productCode
     */
    public String getProductCode() {
        return productCode;
    }


    /**
     * Sets the productCode value for this PreviewResults.
     * 
     * @param productCode
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }


    /**
     * Gets the requestID value for this PreviewResults.
     * 
     * @return requestID
     */
    public String getRequestID() {
        return requestID;
    }


    /**
     * Sets the requestID value for this PreviewResults.
     * 
     * @param requestID
     */
    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }


    /**
     * Gets the status value for this PreviewResults.
     * 
     * @return status
     */
    public Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PreviewResults.
     * 
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }


    /**
     * Gets the styleName value for this PreviewResults.
     * 
     * @return styleName
     */
    public String getStyleName() {
        return styleName;
    }


    /**
     * Sets the styleName value for this PreviewResults.
     * 
     * @param styleName
     */
    public void setStyleName(String styleName) {
        this.styleName = styleName;
    }


    /**
     * Gets the type value for this PreviewResults.
     * 
     * @return type
     */
    public String getType() {
        return type;
    }


    /**
     * Sets the type value for this PreviewResults.
     * 
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PreviewResults)) return false;
        PreviewResults other = (PreviewResults) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              java.util.Arrays.equals(this.data, other.getData()))) &&
            ((this.imageHeight==null && other.getImageHeight()==null) || 
             (this.imageHeight!=null &&
              this.imageHeight.equals(other.getImageHeight()))) &&
            ((this.imageWidth==null && other.getImageWidth()==null) || 
             (this.imageWidth!=null &&
              this.imageWidth.equals(other.getImageWidth()))) &&
            ((this.productCode==null && other.getProductCode()==null) || 
             (this.productCode!=null &&
              this.productCode.equals(other.getProductCode()))) &&
            ((this.requestID==null && other.getRequestID()==null) || 
             (this.requestID!=null &&
              this.requestID.equals(other.getRequestID()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.styleName==null && other.getStyleName()==null) || 
             (this.styleName!=null &&
              this.styleName.equals(other.getStyleName()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getData());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImageHeight() != null) {
            _hashCode += getImageHeight().hashCode();
        }
        if (getImageWidth() != null) {
            _hashCode += getImageWidth().hashCode();
        }
        if (getProductCode() != null) {
            _hashCode += getProductCode().hashCode();
        }
        if (getRequestID() != null) {
            _hashCode += getRequestID().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStyleName() != null) {
            _hashCode += getStyleName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PreviewResults.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "PreviewResults"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageHeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "imageHeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageWidth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "imageWidth"));
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
        elemField.setFieldName("requestID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "requestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "status"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "type"));
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
