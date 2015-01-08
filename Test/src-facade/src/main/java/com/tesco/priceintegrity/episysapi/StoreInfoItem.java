/**
 * StoreInfoItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class StoreInfoItem  implements java.io.Serializable {
    private String addressLine1;

    private String addressLine2;

    private String cityName;

    private String countryCode;

    private String[] nonTradingDates;

    private String postCode;

    private String regionCode;

    private String reportPrinterID;

    private String sellUnitCloseDate;

    private String sellUnitID;

    private String sellUnitName;

    private String sellUnitOpenDate;

    private String sellUnitTypeCode;

    private String signPrinterID;

    private String srcSystem;

    private String[] storeGroupNames;

    private com.tesco.priceintegrity.episysapi.StoreHoursItem[] storeHours;

    private com.tesco.priceintegrity.episysapi.StoreHoursOverrideItem[] storeHoursOverride;

    private Integer storeManagerUserID;

    public StoreInfoItem() {
    }

    public StoreInfoItem(
           String addressLine1,
           String addressLine2,
           String cityName,
           String countryCode,
           String[] nonTradingDates,
           String postCode,
           String regionCode,
           String reportPrinterID,
           String sellUnitCloseDate,
           String sellUnitID,
           String sellUnitName,
           String sellUnitOpenDate,
           String sellUnitTypeCode,
           String signPrinterID,
           String srcSystem,
           String[] storeGroupNames,
           com.tesco.priceintegrity.episysapi.StoreHoursItem[] storeHours,
           com.tesco.priceintegrity.episysapi.StoreHoursOverrideItem[] storeHoursOverride,
           Integer storeManagerUserID) {
           this.addressLine1 = addressLine1;
           this.addressLine2 = addressLine2;
           this.cityName = cityName;
           this.countryCode = countryCode;
           this.nonTradingDates = nonTradingDates;
           this.postCode = postCode;
           this.regionCode = regionCode;
           this.reportPrinterID = reportPrinterID;
           this.sellUnitCloseDate = sellUnitCloseDate;
           this.sellUnitID = sellUnitID;
           this.sellUnitName = sellUnitName;
           this.sellUnitOpenDate = sellUnitOpenDate;
           this.sellUnitTypeCode = sellUnitTypeCode;
           this.signPrinterID = signPrinterID;
           this.srcSystem = srcSystem;
           this.storeGroupNames = storeGroupNames;
           this.storeHours = storeHours;
           this.storeHoursOverride = storeHoursOverride;
           this.storeManagerUserID = storeManagerUserID;
    }


    /**
     * Gets the addressLine1 value for this StoreInfoItem.
     * 
     * @return addressLine1
     */
    public String getAddressLine1() {
        return addressLine1;
    }


    /**
     * Sets the addressLine1 value for this StoreInfoItem.
     * 
     * @param addressLine1
     */
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }


    /**
     * Gets the addressLine2 value for this StoreInfoItem.
     * 
     * @return addressLine2
     */
    public String getAddressLine2() {
        return addressLine2;
    }


    /**
     * Sets the addressLine2 value for this StoreInfoItem.
     * 
     * @param addressLine2
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }


    /**
     * Gets the cityName value for this StoreInfoItem.
     * 
     * @return cityName
     */
    public String getCityName() {
        return cityName;
    }


    /**
     * Sets the cityName value for this StoreInfoItem.
     * 
     * @param cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    /**
     * Gets the countryCode value for this StoreInfoItem.
     * 
     * @return countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this StoreInfoItem.
     * 
     * @param countryCode
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the nonTradingDates value for this StoreInfoItem.
     * 
     * @return nonTradingDates
     */
    public String[] getNonTradingDates() {
        return nonTradingDates;
    }


    /**
     * Sets the nonTradingDates value for this StoreInfoItem.
     * 
     * @param nonTradingDates
     */
    public void setNonTradingDates(String[] nonTradingDates) {
        this.nonTradingDates = nonTradingDates;
    }

    public String getNonTradingDates(int i) {
        return this.nonTradingDates[i];
    }

    public void setNonTradingDates(int i, String _value) {
        this.nonTradingDates[i] = _value;
    }


    /**
     * Gets the postCode value for this StoreInfoItem.
     * 
     * @return postCode
     */
    public String getPostCode() {
        return postCode;
    }


    /**
     * Sets the postCode value for this StoreInfoItem.
     * 
     * @param postCode
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }


    /**
     * Gets the regionCode value for this StoreInfoItem.
     * 
     * @return regionCode
     */
    public String getRegionCode() {
        return regionCode;
    }


    /**
     * Sets the regionCode value for this StoreInfoItem.
     * 
     * @param regionCode
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }


    /**
     * Gets the reportPrinterID value for this StoreInfoItem.
     * 
     * @return reportPrinterID
     */
    public String getReportPrinterID() {
        return reportPrinterID;
    }


    /**
     * Sets the reportPrinterID value for this StoreInfoItem.
     * 
     * @param reportPrinterID
     */
    public void setReportPrinterID(String reportPrinterID) {
        this.reportPrinterID = reportPrinterID;
    }


    /**
     * Gets the sellUnitCloseDate value for this StoreInfoItem.
     * 
     * @return sellUnitCloseDate
     */
    public String getSellUnitCloseDate() {
        return sellUnitCloseDate;
    }


    /**
     * Sets the sellUnitCloseDate value for this StoreInfoItem.
     * 
     * @param sellUnitCloseDate
     */
    public void setSellUnitCloseDate(String sellUnitCloseDate) {
        this.sellUnitCloseDate = sellUnitCloseDate;
    }


    /**
     * Gets the sellUnitID value for this StoreInfoItem.
     * 
     * @return sellUnitID
     */
    public String getSellUnitID() {
        return sellUnitID;
    }


    /**
     * Sets the sellUnitID value for this StoreInfoItem.
     * 
     * @param sellUnitID
     */
    public void setSellUnitID(String sellUnitID) {
        this.sellUnitID = sellUnitID;
    }


    /**
     * Gets the sellUnitName value for this StoreInfoItem.
     * 
     * @return sellUnitName
     */
    public String getSellUnitName() {
        return sellUnitName;
    }


    /**
     * Sets the sellUnitName value for this StoreInfoItem.
     * 
     * @param sellUnitName
     */
    public void setSellUnitName(String sellUnitName) {
        this.sellUnitName = sellUnitName;
    }


    /**
     * Gets the sellUnitOpenDate value for this StoreInfoItem.
     * 
     * @return sellUnitOpenDate
     */
    public String getSellUnitOpenDate() {
        return sellUnitOpenDate;
    }


    /**
     * Sets the sellUnitOpenDate value for this StoreInfoItem.
     * 
     * @param sellUnitOpenDate
     */
    public void setSellUnitOpenDate(String sellUnitOpenDate) {
        this.sellUnitOpenDate = sellUnitOpenDate;
    }


    /**
     * Gets the sellUnitTypeCode value for this StoreInfoItem.
     * 
     * @return sellUnitTypeCode
     */
    public String getSellUnitTypeCode() {
        return sellUnitTypeCode;
    }


    /**
     * Sets the sellUnitTypeCode value for this StoreInfoItem.
     * 
     * @param sellUnitTypeCode
     */
    public void setSellUnitTypeCode(String sellUnitTypeCode) {
        this.sellUnitTypeCode = sellUnitTypeCode;
    }


    /**
     * Gets the signPrinterID value for this StoreInfoItem.
     * 
     * @return signPrinterID
     */
    public String getSignPrinterID() {
        return signPrinterID;
    }


    /**
     * Sets the signPrinterID value for this StoreInfoItem.
     * 
     * @param signPrinterID
     */
    public void setSignPrinterID(String signPrinterID) {
        this.signPrinterID = signPrinterID;
    }


    /**
     * Gets the srcSystem value for this StoreInfoItem.
     * 
     * @return srcSystem
     */
    public String getSrcSystem() {
        return srcSystem;
    }


    /**
     * Sets the srcSystem value for this StoreInfoItem.
     * 
     * @param srcSystem
     */
    public void setSrcSystem(String srcSystem) {
        this.srcSystem = srcSystem;
    }


    /**
     * Gets the storeGroupNames value for this StoreInfoItem.
     * 
     * @return storeGroupNames
     */
    public String[] getStoreGroupNames() {
        return storeGroupNames;
    }


    /**
     * Sets the storeGroupNames value for this StoreInfoItem.
     * 
     * @param storeGroupNames
     */
    public void setStoreGroupNames(String[] storeGroupNames) {
        this.storeGroupNames = storeGroupNames;
    }

    public String getStoreGroupNames(int i) {
        return this.storeGroupNames[i];
    }

    public void setStoreGroupNames(int i, String _value) {
        this.storeGroupNames[i] = _value;
    }


    /**
     * Gets the storeHours value for this StoreInfoItem.
     * 
     * @return storeHours
     */
    public com.tesco.priceintegrity.episysapi.StoreHoursItem[] getStoreHours() {
        return storeHours;
    }


    /**
     * Sets the storeHours value for this StoreInfoItem.
     * 
     * @param storeHours
     */
    public void setStoreHours(com.tesco.priceintegrity.episysapi.StoreHoursItem[] storeHours) {
        this.storeHours = storeHours;
    }

    public com.tesco.priceintegrity.episysapi.StoreHoursItem getStoreHours(int i) {
        return this.storeHours[i];
    }

    public void setStoreHours(int i, com.tesco.priceintegrity.episysapi.StoreHoursItem _value) {
        this.storeHours[i] = _value;
    }


    /**
     * Gets the storeHoursOverride value for this StoreInfoItem.
     * 
     * @return storeHoursOverride
     */
    public com.tesco.priceintegrity.episysapi.StoreHoursOverrideItem[] getStoreHoursOverride() {
        return storeHoursOverride;
    }


    /**
     * Sets the storeHoursOverride value for this StoreInfoItem.
     * 
     * @param storeHoursOverride
     */
    public void setStoreHoursOverride(com.tesco.priceintegrity.episysapi.StoreHoursOverrideItem[] storeHoursOverride) {
        this.storeHoursOverride = storeHoursOverride;
    }

    public com.tesco.priceintegrity.episysapi.StoreHoursOverrideItem getStoreHoursOverride(int i) {
        return this.storeHoursOverride[i];
    }

    public void setStoreHoursOverride(int i, com.tesco.priceintegrity.episysapi.StoreHoursOverrideItem _value) {
        this.storeHoursOverride[i] = _value;
    }


    /**
     * Gets the storeManagerUserID value for this StoreInfoItem.
     * 
     * @return storeManagerUserID
     */
    public Integer getStoreManagerUserID() {
        return storeManagerUserID;
    }


    /**
     * Sets the storeManagerUserID value for this StoreInfoItem.
     * 
     * @param storeManagerUserID
     */
    public void setStoreManagerUserID(Integer storeManagerUserID) {
        this.storeManagerUserID = storeManagerUserID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof StoreInfoItem)) return false;
        StoreInfoItem other = (StoreInfoItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addressLine1==null && other.getAddressLine1()==null) || 
             (this.addressLine1!=null &&
              this.addressLine1.equals(other.getAddressLine1()))) &&
            ((this.addressLine2==null && other.getAddressLine2()==null) || 
             (this.addressLine2!=null &&
              this.addressLine2.equals(other.getAddressLine2()))) &&
            ((this.cityName==null && other.getCityName()==null) || 
             (this.cityName!=null &&
              this.cityName.equals(other.getCityName()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.nonTradingDates==null && other.getNonTradingDates()==null) || 
             (this.nonTradingDates!=null &&
              java.util.Arrays.equals(this.nonTradingDates, other.getNonTradingDates()))) &&
            ((this.postCode==null && other.getPostCode()==null) || 
             (this.postCode!=null &&
              this.postCode.equals(other.getPostCode()))) &&
            ((this.regionCode==null && other.getRegionCode()==null) || 
             (this.regionCode!=null &&
              this.regionCode.equals(other.getRegionCode()))) &&
            ((this.reportPrinterID==null && other.getReportPrinterID()==null) || 
             (this.reportPrinterID!=null &&
              this.reportPrinterID.equals(other.getReportPrinterID()))) &&
            ((this.sellUnitCloseDate==null && other.getSellUnitCloseDate()==null) || 
             (this.sellUnitCloseDate!=null &&
              this.sellUnitCloseDate.equals(other.getSellUnitCloseDate()))) &&
            ((this.sellUnitID==null && other.getSellUnitID()==null) || 
             (this.sellUnitID!=null &&
              this.sellUnitID.equals(other.getSellUnitID()))) &&
            ((this.sellUnitName==null && other.getSellUnitName()==null) || 
             (this.sellUnitName!=null &&
              this.sellUnitName.equals(other.getSellUnitName()))) &&
            ((this.sellUnitOpenDate==null && other.getSellUnitOpenDate()==null) || 
             (this.sellUnitOpenDate!=null &&
              this.sellUnitOpenDate.equals(other.getSellUnitOpenDate()))) &&
            ((this.sellUnitTypeCode==null && other.getSellUnitTypeCode()==null) || 
             (this.sellUnitTypeCode!=null &&
              this.sellUnitTypeCode.equals(other.getSellUnitTypeCode()))) &&
            ((this.signPrinterID==null && other.getSignPrinterID()==null) || 
             (this.signPrinterID!=null &&
              this.signPrinterID.equals(other.getSignPrinterID()))) &&
            ((this.srcSystem==null && other.getSrcSystem()==null) || 
             (this.srcSystem!=null &&
              this.srcSystem.equals(other.getSrcSystem()))) &&
            ((this.storeGroupNames==null && other.getStoreGroupNames()==null) || 
             (this.storeGroupNames!=null &&
              java.util.Arrays.equals(this.storeGroupNames, other.getStoreGroupNames()))) &&
            ((this.storeHours==null && other.getStoreHours()==null) || 
             (this.storeHours!=null &&
              java.util.Arrays.equals(this.storeHours, other.getStoreHours()))) &&
            ((this.storeHoursOverride==null && other.getStoreHoursOverride()==null) || 
             (this.storeHoursOverride!=null &&
              java.util.Arrays.equals(this.storeHoursOverride, other.getStoreHoursOverride()))) &&
            ((this.storeManagerUserID==null && other.getStoreManagerUserID()==null) || 
             (this.storeManagerUserID!=null &&
              this.storeManagerUserID.equals(other.getStoreManagerUserID())));
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
        if (getAddressLine1() != null) {
            _hashCode += getAddressLine1().hashCode();
        }
        if (getAddressLine2() != null) {
            _hashCode += getAddressLine2().hashCode();
        }
        if (getCityName() != null) {
            _hashCode += getCityName().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getNonTradingDates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNonTradingDates());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getNonTradingDates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPostCode() != null) {
            _hashCode += getPostCode().hashCode();
        }
        if (getRegionCode() != null) {
            _hashCode += getRegionCode().hashCode();
        }
        if (getReportPrinterID() != null) {
            _hashCode += getReportPrinterID().hashCode();
        }
        if (getSellUnitCloseDate() != null) {
            _hashCode += getSellUnitCloseDate().hashCode();
        }
        if (getSellUnitID() != null) {
            _hashCode += getSellUnitID().hashCode();
        }
        if (getSellUnitName() != null) {
            _hashCode += getSellUnitName().hashCode();
        }
        if (getSellUnitOpenDate() != null) {
            _hashCode += getSellUnitOpenDate().hashCode();
        }
        if (getSellUnitTypeCode() != null) {
            _hashCode += getSellUnitTypeCode().hashCode();
        }
        if (getSignPrinterID() != null) {
            _hashCode += getSignPrinterID().hashCode();
        }
        if (getSrcSystem() != null) {
            _hashCode += getSrcSystem().hashCode();
        }
        if (getStoreGroupNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoreGroupNames());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getStoreGroupNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStoreHours() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoreHours());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getStoreHours(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStoreHoursOverride() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoreHoursOverride());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getStoreHoursOverride(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStoreManagerUserID() != null) {
            _hashCode += getStoreManagerUserID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoreInfoItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreInfoItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "addressLine1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "addressLine2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "cityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonTradingDates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "nonTradingDates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "postCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "regionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportPrinterID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "reportPrinterID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellUnitCloseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "sellUnitCloseDate"));
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
        elemField.setFieldName("sellUnitName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "sellUnitName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellUnitOpenDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "sellUnitOpenDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellUnitTypeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "sellUnitTypeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signPrinterID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "signPrinterID"));
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
        elemField.setFieldName("storeGroupNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "storeGroupNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "storeHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreHoursItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeHoursOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "storeHoursOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "StoreHoursOverrideItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeManagerUserID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "storeManagerUserID"));
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
