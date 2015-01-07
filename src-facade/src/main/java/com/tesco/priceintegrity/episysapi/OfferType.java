/**
 * OfferType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class OfferType  implements java.io.Serializable {
    private Integer mechanic;

    private String offerTypeVariant;

    private Float[] priceArray;

    private Integer priceType;

    private String[] productListA;

    private String[] productListB;

    private String[] productListC;

    private String[] productListD;

    private String[] productListE;

    private Integer[] rewardListIndicator;

    private Float[] savingAmount;

    private Integer savingType;

    private Float[] thresholdArray;

    private Integer thresholdTypes;

    private Integer[] thresholdTypesArray;

    private Float[] thresholdValueListA;

    private Float[] thresholdValueListB;

    private Float[] thresholdValueListC;

    private Float[] thresholdValueListD;

    private Float[] thresholdValueListE;

    private Float[] wasPriceList;

    private Float[] wasWasPriceList;

    public OfferType() {
    }

    public OfferType(
           Integer mechanic,
           String offerTypeVariant,
           Float[] priceArray,
           Integer priceType,
           String[] productListA,
           String[] productListB,
           String[] productListC,
           String[] productListD,
           String[] productListE,
           Integer[] rewardListIndicator,
           Float[] savingAmount,
           Integer savingType,
           Float[] thresholdArray,
           Integer thresholdTypes,
           Integer[] thresholdTypesArray,
           Float[] thresholdValueListA,
           Float[] thresholdValueListB,
           Float[] thresholdValueListC,
           Float[] thresholdValueListD,
           Float[] thresholdValueListE,
           Float[] wasPriceList,
           Float[] wasWasPriceList) {
           this.mechanic = mechanic;
           this.offerTypeVariant = offerTypeVariant;
           this.priceArray = priceArray;
           this.priceType = priceType;
           this.productListA = productListA;
           this.productListB = productListB;
           this.productListC = productListC;
           this.productListD = productListD;
           this.productListE = productListE;
           this.rewardListIndicator = rewardListIndicator;
           this.savingAmount = savingAmount;
           this.savingType = savingType;
           this.thresholdArray = thresholdArray;
           this.thresholdTypes = thresholdTypes;
           this.thresholdTypesArray = thresholdTypesArray;
           this.thresholdValueListA = thresholdValueListA;
           this.thresholdValueListB = thresholdValueListB;
           this.thresholdValueListC = thresholdValueListC;
           this.thresholdValueListD = thresholdValueListD;
           this.thresholdValueListE = thresholdValueListE;
           this.wasPriceList = wasPriceList;
           this.wasWasPriceList = wasWasPriceList;
    }


    /**
     * Gets the mechanic value for this OfferType.
     * 
     * @return mechanic
     */
    public Integer getMechanic() {
        return mechanic;
    }


    /**
     * Sets the mechanic value for this OfferType.
     * 
     * @param mechanic
     */
    public void setMechanic(Integer mechanic) {
        this.mechanic = mechanic;
    }


    /**
     * Gets the offerTypeVariant value for this OfferType.
     * 
     * @return offerTypeVariant
     */
    public String getOfferTypeVariant() {
        return offerTypeVariant;
    }


    /**
     * Sets the offerTypeVariant value for this OfferType.
     * 
     * @param offerTypeVariant
     */
    public void setOfferTypeVariant(String offerTypeVariant) {
        this.offerTypeVariant = offerTypeVariant;
    }


    /**
     * Gets the priceArray value for this OfferType.
     * 
     * @return priceArray
     */
    public Float[] getPriceArray() {
        return priceArray;
    }


    /**
     * Sets the priceArray value for this OfferType.
     * 
     * @param priceArray
     */
    public void setPriceArray(Float[] priceArray) {
        this.priceArray = priceArray;
    }

    public Float getPriceArray(int i) {
        return this.priceArray[i];
    }

    public void setPriceArray(int i, Float _value) {
        this.priceArray[i] = _value;
    }


    /**
     * Gets the priceType value for this OfferType.
     * 
     * @return priceType
     */
    public Integer getPriceType() {
        return priceType;
    }


    /**
     * Sets the priceType value for this OfferType.
     * 
     * @param priceType
     */
    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }


    /**
     * Gets the productListA value for this OfferType.
     * 
     * @return productListA
     */
    public String[] getProductListA() {
        return productListA;
    }


    /**
     * Sets the productListA value for this OfferType.
     * 
     * @param productListA
     */
    public void setProductListA(String[] productListA) {
        this.productListA = productListA;
    }

    public String getProductListA(int i) {
        return this.productListA[i];
    }

    public void setProductListA(int i, String _value) {
        this.productListA[i] = _value;
    }


    /**
     * Gets the productListB value for this OfferType.
     * 
     * @return productListB
     */
    public String[] getProductListB() {
        return productListB;
    }


    /**
     * Sets the productListB value for this OfferType.
     * 
     * @param productListB
     */
    public void setProductListB(String[] productListB) {
        this.productListB = productListB;
    }

    public String getProductListB(int i) {
        return this.productListB[i];
    }

    public void setProductListB(int i, String _value) {
        this.productListB[i] = _value;
    }


    /**
     * Gets the productListC value for this OfferType.
     * 
     * @return productListC
     */
    public String[] getProductListC() {
        return productListC;
    }


    /**
     * Sets the productListC value for this OfferType.
     * 
     * @param productListC
     */
    public void setProductListC(String[] productListC) {
        this.productListC = productListC;
    }

    public String getProductListC(int i) {
        return this.productListC[i];
    }

    public void setProductListC(int i, String _value) {
        this.productListC[i] = _value;
    }


    /**
     * Gets the productListD value for this OfferType.
     * 
     * @return productListD
     */
    public String[] getProductListD() {
        return productListD;
    }


    /**
     * Sets the productListD value for this OfferType.
     * 
     * @param productListD
     */
    public void setProductListD(String[] productListD) {
        this.productListD = productListD;
    }

    public String getProductListD(int i) {
        return this.productListD[i];
    }

    public void setProductListD(int i, String _value) {
        this.productListD[i] = _value;
    }


    /**
     * Gets the productListE value for this OfferType.
     * 
     * @return productListE
     */
    public String[] getProductListE() {
        return productListE;
    }


    /**
     * Sets the productListE value for this OfferType.
     * 
     * @param productListE
     */
    public void setProductListE(String[] productListE) {
        this.productListE = productListE;
    }

    public String getProductListE(int i) {
        return this.productListE[i];
    }

    public void setProductListE(int i, String _value) {
        this.productListE[i] = _value;
    }


    /**
     * Gets the rewardListIndicator value for this OfferType.
     * 
     * @return rewardListIndicator
     */
    public Integer[] getRewardListIndicator() {
        return rewardListIndicator;
    }


    /**
     * Sets the rewardListIndicator value for this OfferType.
     * 
     * @param rewardListIndicator
     */
    public void setRewardListIndicator(Integer[] rewardListIndicator) {
        this.rewardListIndicator = rewardListIndicator;
    }

    public Integer getRewardListIndicator(int i) {
        return this.rewardListIndicator[i];
    }

    public void setRewardListIndicator(int i, Integer _value) {
        this.rewardListIndicator[i] = _value;
    }


    /**
     * Gets the savingAmount value for this OfferType.
     * 
     * @return savingAmount
     */
    public Float[] getSavingAmount() {
        return savingAmount;
    }


    /**
     * Sets the savingAmount value for this OfferType.
     * 
     * @param savingAmount
     */
    public void setSavingAmount(Float[] savingAmount) {
        this.savingAmount = savingAmount;
    }

    public Float getSavingAmount(int i) {
        return this.savingAmount[i];
    }

    public void setSavingAmount(int i, Float _value) {
        this.savingAmount[i] = _value;
    }


    /**
     * Gets the savingType value for this OfferType.
     * 
     * @return savingType
     */
    public Integer getSavingType() {
        return savingType;
    }


    /**
     * Sets the savingType value for this OfferType.
     * 
     * @param savingType
     */
    public void setSavingType(Integer savingType) {
        this.savingType = savingType;
    }


    /**
     * Gets the thresholdArray value for this OfferType.
     * 
     * @return thresholdArray
     */
    public Float[] getThresholdArray() {
        return thresholdArray;
    }


    /**
     * Sets the thresholdArray value for this OfferType.
     * 
     * @param thresholdArray
     */
    public void setThresholdArray(Float[] thresholdArray) {
        this.thresholdArray = thresholdArray;
    }

    public Float getThresholdArray(int i) {
        return this.thresholdArray[i];
    }

    public void setThresholdArray(int i, Float _value) {
        this.thresholdArray[i] = _value;
    }


    /**
     * Gets the thresholdTypes value for this OfferType.
     * 
     * @return thresholdTypes
     */
    public Integer getThresholdTypes() {
        return thresholdTypes;
    }


    /**
     * Sets the thresholdTypes value for this OfferType.
     * 
     * @param thresholdTypes
     */
    public void setThresholdTypes(Integer thresholdTypes) {
        this.thresholdTypes = thresholdTypes;
    }


    /**
     * Gets the thresholdTypesArray value for this OfferType.
     * 
     * @return thresholdTypesArray
     */
    public Integer[] getThresholdTypesArray() {
        return thresholdTypesArray;
    }


    /**
     * Sets the thresholdTypesArray value for this OfferType.
     * 
     * @param thresholdTypesArray
     */
    public void setThresholdTypesArray(Integer[] thresholdTypesArray) {
        this.thresholdTypesArray = thresholdTypesArray;
    }

    public Integer getThresholdTypesArray(int i) {
        return this.thresholdTypesArray[i];
    }

    public void setThresholdTypesArray(int i, Integer _value) {
        this.thresholdTypesArray[i] = _value;
    }


    /**
     * Gets the thresholdValueListA value for this OfferType.
     * 
     * @return thresholdValueListA
     */
    public Float[] getThresholdValueListA() {
        return thresholdValueListA;
    }


    /**
     * Sets the thresholdValueListA value for this OfferType.
     * 
     * @param thresholdValueListA
     */
    public void setThresholdValueListA(Float[] thresholdValueListA) {
        this.thresholdValueListA = thresholdValueListA;
    }

    public Float getThresholdValueListA(int i) {
        return this.thresholdValueListA[i];
    }

    public void setThresholdValueListA(int i, Float _value) {
        this.thresholdValueListA[i] = _value;
    }


    /**
     * Gets the thresholdValueListB value for this OfferType.
     * 
     * @return thresholdValueListB
     */
    public Float[] getThresholdValueListB() {
        return thresholdValueListB;
    }


    /**
     * Sets the thresholdValueListB value for this OfferType.
     * 
     * @param thresholdValueListB
     */
    public void setThresholdValueListB(Float[] thresholdValueListB) {
        this.thresholdValueListB = thresholdValueListB;
    }

    public Float getThresholdValueListB(int i) {
        return this.thresholdValueListB[i];
    }

    public void setThresholdValueListB(int i, Float _value) {
        this.thresholdValueListB[i] = _value;
    }


    /**
     * Gets the thresholdValueListC value for this OfferType.
     * 
     * @return thresholdValueListC
     */
    public Float[] getThresholdValueListC() {
        return thresholdValueListC;
    }


    /**
     * Sets the thresholdValueListC value for this OfferType.
     * 
     * @param thresholdValueListC
     */
    public void setThresholdValueListC(Float[] thresholdValueListC) {
        this.thresholdValueListC = thresholdValueListC;
    }

    public Float getThresholdValueListC(int i) {
        return this.thresholdValueListC[i];
    }

    public void setThresholdValueListC(int i, Float _value) {
        this.thresholdValueListC[i] = _value;
    }


    /**
     * Gets the thresholdValueListD value for this OfferType.
     * 
     * @return thresholdValueListD
     */
    public Float[] getThresholdValueListD() {
        return thresholdValueListD;
    }


    /**
     * Sets the thresholdValueListD value for this OfferType.
     * 
     * @param thresholdValueListD
     */
    public void setThresholdValueListD(Float[] thresholdValueListD) {
        this.thresholdValueListD = thresholdValueListD;
    }

    public Float getThresholdValueListD(int i) {
        return this.thresholdValueListD[i];
    }

    public void setThresholdValueListD(int i, Float _value) {
        this.thresholdValueListD[i] = _value;
    }


    /**
     * Gets the thresholdValueListE value for this OfferType.
     * 
     * @return thresholdValueListE
     */
    public Float[] getThresholdValueListE() {
        return thresholdValueListE;
    }


    /**
     * Sets the thresholdValueListE value for this OfferType.
     * 
     * @param thresholdValueListE
     */
    public void setThresholdValueListE(Float[] thresholdValueListE) {
        this.thresholdValueListE = thresholdValueListE;
    }

    public Float getThresholdValueListE(int i) {
        return this.thresholdValueListE[i];
    }

    public void setThresholdValueListE(int i, Float _value) {
        this.thresholdValueListE[i] = _value;
    }


    /**
     * Gets the wasPriceList value for this OfferType.
     * 
     * @return wasPriceList
     */
    public Float[] getWasPriceList() {
        return wasPriceList;
    }


    /**
     * Sets the wasPriceList value for this OfferType.
     * 
     * @param wasPriceList
     */
    public void setWasPriceList(Float[] wasPriceList) {
        this.wasPriceList = wasPriceList;
    }

    public Float getWasPriceList(int i) {
        return this.wasPriceList[i];
    }

    public void setWasPriceList(int i, Float _value) {
        this.wasPriceList[i] = _value;
    }


    /**
     * Gets the wasWasPriceList value for this OfferType.
     * 
     * @return wasWasPriceList
     */
    public Float[] getWasWasPriceList() {
        return wasWasPriceList;
    }


    /**
     * Sets the wasWasPriceList value for this OfferType.
     * 
     * @param wasWasPriceList
     */
    public void setWasWasPriceList(Float[] wasWasPriceList) {
        this.wasWasPriceList = wasWasPriceList;
    }

    public Float getWasWasPriceList(int i) {
        return this.wasWasPriceList[i];
    }

    public void setWasWasPriceList(int i, Float _value) {
        this.wasWasPriceList[i] = _value;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OfferType)) return false;
        OfferType other = (OfferType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mechanic==null && other.getMechanic()==null) || 
             (this.mechanic!=null &&
              this.mechanic.equals(other.getMechanic()))) &&
            ((this.offerTypeVariant==null && other.getOfferTypeVariant()==null) || 
             (this.offerTypeVariant!=null &&
              this.offerTypeVariant.equals(other.getOfferTypeVariant()))) &&
            ((this.priceArray==null && other.getPriceArray()==null) || 
             (this.priceArray!=null &&
              java.util.Arrays.equals(this.priceArray, other.getPriceArray()))) &&
            ((this.priceType==null && other.getPriceType()==null) || 
             (this.priceType!=null &&
              this.priceType.equals(other.getPriceType()))) &&
            ((this.productListA==null && other.getProductListA()==null) || 
             (this.productListA!=null &&
              java.util.Arrays.equals(this.productListA, other.getProductListA()))) &&
            ((this.productListB==null && other.getProductListB()==null) || 
             (this.productListB!=null &&
              java.util.Arrays.equals(this.productListB, other.getProductListB()))) &&
            ((this.productListC==null && other.getProductListC()==null) || 
             (this.productListC!=null &&
              java.util.Arrays.equals(this.productListC, other.getProductListC()))) &&
            ((this.productListD==null && other.getProductListD()==null) || 
             (this.productListD!=null &&
              java.util.Arrays.equals(this.productListD, other.getProductListD()))) &&
            ((this.productListE==null && other.getProductListE()==null) || 
             (this.productListE!=null &&
              java.util.Arrays.equals(this.productListE, other.getProductListE()))) &&
            ((this.rewardListIndicator==null && other.getRewardListIndicator()==null) || 
             (this.rewardListIndicator!=null &&
              java.util.Arrays.equals(this.rewardListIndicator, other.getRewardListIndicator()))) &&
            ((this.savingAmount==null && other.getSavingAmount()==null) || 
             (this.savingAmount!=null &&
              java.util.Arrays.equals(this.savingAmount, other.getSavingAmount()))) &&
            ((this.savingType==null && other.getSavingType()==null) || 
             (this.savingType!=null &&
              this.savingType.equals(other.getSavingType()))) &&
            ((this.thresholdArray==null && other.getThresholdArray()==null) || 
             (this.thresholdArray!=null &&
              java.util.Arrays.equals(this.thresholdArray, other.getThresholdArray()))) &&
            ((this.thresholdTypes==null && other.getThresholdTypes()==null) || 
             (this.thresholdTypes!=null &&
              this.thresholdTypes.equals(other.getThresholdTypes()))) &&
            ((this.thresholdTypesArray==null && other.getThresholdTypesArray()==null) || 
             (this.thresholdTypesArray!=null &&
              java.util.Arrays.equals(this.thresholdTypesArray, other.getThresholdTypesArray()))) &&
            ((this.thresholdValueListA==null && other.getThresholdValueListA()==null) || 
             (this.thresholdValueListA!=null &&
              java.util.Arrays.equals(this.thresholdValueListA, other.getThresholdValueListA()))) &&
            ((this.thresholdValueListB==null && other.getThresholdValueListB()==null) || 
             (this.thresholdValueListB!=null &&
              java.util.Arrays.equals(this.thresholdValueListB, other.getThresholdValueListB()))) &&
            ((this.thresholdValueListC==null && other.getThresholdValueListC()==null) || 
             (this.thresholdValueListC!=null &&
              java.util.Arrays.equals(this.thresholdValueListC, other.getThresholdValueListC()))) &&
            ((this.thresholdValueListD==null && other.getThresholdValueListD()==null) || 
             (this.thresholdValueListD!=null &&
              java.util.Arrays.equals(this.thresholdValueListD, other.getThresholdValueListD()))) &&
            ((this.thresholdValueListE==null && other.getThresholdValueListE()==null) || 
             (this.thresholdValueListE!=null &&
              java.util.Arrays.equals(this.thresholdValueListE, other.getThresholdValueListE()))) &&
            ((this.wasPriceList==null && other.getWasPriceList()==null) || 
             (this.wasPriceList!=null &&
              java.util.Arrays.equals(this.wasPriceList, other.getWasPriceList()))) &&
            ((this.wasWasPriceList==null && other.getWasWasPriceList()==null) || 
             (this.wasWasPriceList!=null &&
              java.util.Arrays.equals(this.wasWasPriceList, other.getWasWasPriceList())));
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
        if (getMechanic() != null) {
            _hashCode += getMechanic().hashCode();
        }
        if (getOfferTypeVariant() != null) {
            _hashCode += getOfferTypeVariant().hashCode();
        }
        if (getPriceArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriceArray());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPriceArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriceType() != null) {
            _hashCode += getPriceType().hashCode();
        }
        if (getProductListA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductListA());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProductListA(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductListB() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductListB());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProductListB(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductListC() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductListC());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProductListC(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductListD() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductListD());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProductListD(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductListE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductListE());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProductListE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRewardListIndicator() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRewardListIndicator());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRewardListIndicator(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSavingAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSavingAmount());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getSavingAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSavingType() != null) {
            _hashCode += getSavingType().hashCode();
        }
        if (getThresholdArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThresholdArray());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getThresholdArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThresholdTypes() != null) {
            _hashCode += getThresholdTypes().hashCode();
        }
        if (getThresholdTypesArray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThresholdTypesArray());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getThresholdTypesArray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThresholdValueListA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThresholdValueListA());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getThresholdValueListA(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThresholdValueListB() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThresholdValueListB());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getThresholdValueListB(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThresholdValueListC() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThresholdValueListC());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getThresholdValueListC(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThresholdValueListD() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThresholdValueListD());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getThresholdValueListD(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThresholdValueListE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThresholdValueListE());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getThresholdValueListE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWasPriceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWasPriceList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getWasPriceList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWasWasPriceList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWasWasPriceList());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getWasWasPriceList(), i);
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
        new org.apache.axis.description.TypeDesc(OfferType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "OfferType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mechanic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "mechanic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerTypeVariant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "offerTypeVariant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "priceArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "priceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productListA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "productListA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productListB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "productListB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productListC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "productListC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productListD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "productListD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productListE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "productListE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rewardListIndicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "rewardListIndicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("savingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "savingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("savingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "savingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "thresholdArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "thresholdTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdTypesArray");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "thresholdTypesArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdValueListA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "thresholdValueListA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdValueListB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "thresholdValueListB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdValueListC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "thresholdValueListC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdValueListD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "thresholdValueListD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdValueListE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "thresholdValueListE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wasPriceList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "wasPriceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wasWasPriceList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "wasWasPriceList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
