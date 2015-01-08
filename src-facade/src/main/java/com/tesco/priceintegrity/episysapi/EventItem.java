/**
 * EventItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class EventItem  implements java.io.Serializable {
    private String allowAlternateDatesFlag;

    private String allowPriceExtension;

    private String eventEndDate;

    private String eventId;

    private String eventName;

    private String eventStartDate;

    private String eventStatusCode;

    private String eventTagLine;

    private String eventTypeCode;

    private Integer messageType;

    private String sourceIPAddress;

    private String srcSystem;

    private String[] storeGroupList;

    private String[] storeList;

    public EventItem() {
    }

    public EventItem(
           String allowAlternateDatesFlag,
           String allowPriceExtension,
           String eventEndDate,
           String eventId,
           String eventName,
           String eventStartDate,
           String eventStatusCode,
           String eventTagLine,
           String eventTypeCode,
           Integer messageType,
           String sourceIPAddress,
           String srcSystem,
           String[] storeGroupList,
           String[] storeList) {
           this.allowAlternateDatesFlag = allowAlternateDatesFlag;
           this.allowPriceExtension = allowPriceExtension;
           this.eventEndDate = eventEndDate;
           this.eventId = eventId;
           this.eventName = eventName;
           this.eventStartDate = eventStartDate;
           this.eventStatusCode = eventStatusCode;
           this.eventTagLine = eventTagLine;
           this.eventTypeCode = eventTypeCode;
           this.messageType = messageType;
           this.sourceIPAddress = sourceIPAddress;
           this.srcSystem = srcSystem;
           this.storeGroupList = storeGroupList;
           this.storeList = storeList;
    }


    /**
     * Gets the allowAlternateDatesFlag value for this EventItem.
     * 
     * @return allowAlternateDatesFlag
     */
    public String getAllowAlternateDatesFlag() {
        return allowAlternateDatesFlag;
    }


    /**
     * Sets the allowAlternateDatesFlag value for this EventItem.
     * 
     * @param allowAlternateDatesFlag
     */
    public void setAllowAlternateDatesFlag(String allowAlternateDatesFlag) {
        this.allowAlternateDatesFlag = allowAlternateDatesFlag;
    }


    /**
     * Gets the allowPriceExtension value for this EventItem.
     * 
     * @return allowPriceExtension
     */
    public String getAllowPriceExtension() {
        return allowPriceExtension;
    }


    /**
     * Sets the allowPriceExtension value for this EventItem.
     * 
     * @param allowPriceExtension
     */
    public void setAllowPriceExtension(String allowPriceExtension) {
        this.allowPriceExtension = allowPriceExtension;
    }


    /**
     * Gets the eventEndDate value for this EventItem.
     * 
     * @return eventEndDate
     */
    public String getEventEndDate() {
        return eventEndDate;
    }


    /**
     * Sets the eventEndDate value for this EventItem.
     * 
     * @param eventEndDate
     */
    public void setEventEndDate(String eventEndDate) {
        this.eventEndDate = eventEndDate;
    }


    /**
     * Gets the eventId value for this EventItem.
     * 
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }


    /**
     * Sets the eventId value for this EventItem.
     * 
     * @param eventId
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }


    /**
     * Gets the eventName value for this EventItem.
     * 
     * @return eventName
     */
    public String getEventName() {
        return eventName;
    }


    /**
     * Sets the eventName value for this EventItem.
     * 
     * @param eventName
     */
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }


    /**
     * Gets the eventStartDate value for this EventItem.
     * 
     * @return eventStartDate
     */
    public String getEventStartDate() {
        return eventStartDate;
    }


    /**
     * Sets the eventStartDate value for this EventItem.
     * 
     * @param eventStartDate
     */
    public void setEventStartDate(String eventStartDate) {
        this.eventStartDate = eventStartDate;
    }


    /**
     * Gets the eventStatusCode value for this EventItem.
     * 
     * @return eventStatusCode
     */
    public String getEventStatusCode() {
        return eventStatusCode;
    }


    /**
     * Sets the eventStatusCode value for this EventItem.
     * 
     * @param eventStatusCode
     */
    public void setEventStatusCode(String eventStatusCode) {
        this.eventStatusCode = eventStatusCode;
    }


    /**
     * Gets the eventTagLine value for this EventItem.
     * 
     * @return eventTagLine
     */
    public String getEventTagLine() {
        return eventTagLine;
    }


    /**
     * Sets the eventTagLine value for this EventItem.
     * 
     * @param eventTagLine
     */
    public void setEventTagLine(String eventTagLine) {
        this.eventTagLine = eventTagLine;
    }


    /**
     * Gets the eventTypeCode value for this EventItem.
     * 
     * @return eventTypeCode
     */
    public String getEventTypeCode() {
        return eventTypeCode;
    }


    /**
     * Sets the eventTypeCode value for this EventItem.
     * 
     * @param eventTypeCode
     */
    public void setEventTypeCode(String eventTypeCode) {
        this.eventTypeCode = eventTypeCode;
    }


    /**
     * Gets the messageType value for this EventItem.
     * 
     * @return messageType
     */
    public Integer getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this EventItem.
     * 
     * @param messageType
     */
    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the sourceIPAddress value for this EventItem.
     * 
     * @return sourceIPAddress
     */
    public String getSourceIPAddress() {
        return sourceIPAddress;
    }


    /**
     * Sets the sourceIPAddress value for this EventItem.
     * 
     * @param sourceIPAddress
     */
    public void setSourceIPAddress(String sourceIPAddress) {
        this.sourceIPAddress = sourceIPAddress;
    }


    /**
     * Gets the srcSystem value for this EventItem.
     * 
     * @return srcSystem
     */
    public String getSrcSystem() {
        return srcSystem;
    }


    /**
     * Sets the srcSystem value for this EventItem.
     * 
     * @param srcSystem
     */
    public void setSrcSystem(String srcSystem) {
        this.srcSystem = srcSystem;
    }


    /**
     * Gets the storeGroupList value for this EventItem.
     * 
     * @return storeGroupList
     */
    public String[] getStoreGroupList() {
        return storeGroupList;
    }


    /**
     * Sets the storeGroupList value for this EventItem.
     * 
     * @param storeGroupList
     */
    public void setStoreGroupList(String[] storeGroupList) {
        this.storeGroupList = storeGroupList;
    }

    public String getStoreGroupList(int i) {
        return this.storeGroupList[i];
    }

    public void setStoreGroupList(int i, String _value) {
        this.storeGroupList[i] = _value;
    }


    /**
     * Gets the storeList value for this EventItem.
     * 
     * @return storeList
     */
    public String[] getStoreList() {
        return storeList;
    }


    /**
     * Sets the storeList value for this EventItem.
     * 
     * @param storeList
     */
    public void setStoreList(String[] storeList) {
        this.storeList = storeList;
    }

    public String getStoreList(int i) {
        return this.storeList[i];
    }

    public void setStoreList(int i, String _value) {
        this.storeList[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EventItem)) return false;
        EventItem other = (EventItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allowAlternateDatesFlag==null && other.getAllowAlternateDatesFlag()==null) || 
             (this.allowAlternateDatesFlag!=null &&
              this.allowAlternateDatesFlag.equals(other.getAllowAlternateDatesFlag()))) &&
            ((this.allowPriceExtension==null && other.getAllowPriceExtension()==null) || 
             (this.allowPriceExtension!=null &&
              this.allowPriceExtension.equals(other.getAllowPriceExtension()))) &&
            ((this.eventEndDate==null && other.getEventEndDate()==null) || 
             (this.eventEndDate!=null &&
              this.eventEndDate.equals(other.getEventEndDate()))) &&
            ((this.eventId==null && other.getEventId()==null) || 
             (this.eventId!=null &&
              this.eventId.equals(other.getEventId()))) &&
            ((this.eventName==null && other.getEventName()==null) || 
             (this.eventName!=null &&
              this.eventName.equals(other.getEventName()))) &&
            ((this.eventStartDate==null && other.getEventStartDate()==null) || 
             (this.eventStartDate!=null &&
              this.eventStartDate.equals(other.getEventStartDate()))) &&
            ((this.eventStatusCode==null && other.getEventStatusCode()==null) || 
             (this.eventStatusCode!=null &&
              this.eventStatusCode.equals(other.getEventStatusCode()))) &&
            ((this.eventTagLine==null && other.getEventTagLine()==null) || 
             (this.eventTagLine!=null &&
              this.eventTagLine.equals(other.getEventTagLine()))) &&
            ((this.eventTypeCode==null && other.getEventTypeCode()==null) || 
             (this.eventTypeCode!=null &&
              this.eventTypeCode.equals(other.getEventTypeCode()))) &&
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
            ((this.sourceIPAddress==null && other.getSourceIPAddress()==null) || 
             (this.sourceIPAddress!=null &&
              this.sourceIPAddress.equals(other.getSourceIPAddress()))) &&
            ((this.srcSystem==null && other.getSrcSystem()==null) || 
             (this.srcSystem!=null &&
              this.srcSystem.equals(other.getSrcSystem()))) &&
            ((this.storeGroupList==null && other.getStoreGroupList()==null) || 
             (this.storeGroupList!=null &&
              java.util.Arrays.equals(this.storeGroupList, other.getStoreGroupList()))) &&
            ((this.storeList==null && other.getStoreList()==null) || 
             (this.storeList!=null &&
              java.util.Arrays.equals(this.storeList, other.getStoreList())));
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
        if (getAllowAlternateDatesFlag() != null) {
            _hashCode += getAllowAlternateDatesFlag().hashCode();
        }
        if (getAllowPriceExtension() != null) {
            _hashCode += getAllowPriceExtension().hashCode();
        }
        if (getEventEndDate() != null) {
            _hashCode += getEventEndDate().hashCode();
        }
        if (getEventId() != null) {
            _hashCode += getEventId().hashCode();
        }
        if (getEventName() != null) {
            _hashCode += getEventName().hashCode();
        }
        if (getEventStartDate() != null) {
            _hashCode += getEventStartDate().hashCode();
        }
        if (getEventStatusCode() != null) {
            _hashCode += getEventStatusCode().hashCode();
        }
        if (getEventTagLine() != null) {
            _hashCode += getEventTagLine().hashCode();
        }
        if (getEventTypeCode() != null) {
            _hashCode += getEventTypeCode().hashCode();
        }
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
        }
        if (getSourceIPAddress() != null) {
            _hashCode += getSourceIPAddress().hashCode();
        }
        if (getSrcSystem() != null) {
            _hashCode += getSrcSystem().hashCode();
        }
        if (getStoreGroupList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoreGroupList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getStoreGroupList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStoreList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoreList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getStoreList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EventItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "EventItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAlternateDatesFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "allowAlternateDatesFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowPriceExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "allowPriceExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "eventEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "eventId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "eventName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "eventStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventStatusCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "eventStatusCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTagLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "eventTagLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "eventTypeCode"));
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
        elemField.setFieldName("storeGroupList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "storeGroupList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "storeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
