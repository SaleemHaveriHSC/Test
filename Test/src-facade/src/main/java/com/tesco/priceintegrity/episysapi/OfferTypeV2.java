/**
 * OfferTypeV2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tesco.priceintegrity.episysapi;

public class OfferTypeV2  implements java.io.Serializable {
    private Integer mechanic;

    private String offerTypeVariant;

    private Float[] priceArray;

    private Integer priceType;

    private String[] productListA;

    private String[] productListB;

    private String[] productListC;

    private String[] productListD;

    private String[] productListE;

    private String[] productTypeListA;

    private String[] productTypeListB;

    private String[] productTypeListC;

    private String[] productTypeListD;

    private String[] productTypeListE;

    private Float[] savingAmount;

    private String savingText1;

    private String savingText2;

    private Integer savingType;

    private Float[] thresholdArray;

    private Integer thresholdTypes;

    private Float[] wasPriceList;

    private Float[] wasWasPriceList;

    public OfferTypeV2() {
    }

    public OfferTypeV2(
           Integer mechanic,
           String offerTypeVariant,
           Float[] priceArray,
           Integer priceType,
           String[] productListA,
           String[] productListB,
           String[] productListC,
           String[] productListD,
           String[] productListE,
           String[] productTypeListA,
           String[] productTypeListB,
           String[] productTypeListC,
           String[] productTypeListD,
           String[] productTypeListE,
           Float[] savingAmount,
           String savingText1,
           String savingText2,
           Integer savingType,
           Float[] thresholdArray,
           Integer thresholdTypes,
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
           this.productTypeListA = productTypeListA;
           this.productTypeListB = productTypeListB;
           this.productTypeListC = productTypeListC;
           this.productTypeListD = productTypeListD;
           this.productTypeListE = productTypeListE;
           this.savingAmount = savingAmount;
           this.savingText1 = savingText1;
           this.savingText2 = savingText2;
           this.savingType = savingType;
           this.thresholdArray = thresholdArray;
           this.thresholdTypes = thresholdTypes;
           this.wasPriceList = wasPriceList;
           this.wasWasPriceList = wasWasPriceList;
    }


    /**
     * Gets the mechanic value for this OfferTypeV2.
     * 
     * @return mechanic
     */
    public Integer getMechanic() {
        return mechanic;
    }


    /**
     * Sets the mechanic value for this OfferTypeV2.
     * 
     * @param mechanic
     */
    public void setMechanic(Integer mechanic) {
        this.mechanic = mechanic;
    }


    /**
     * Gets the offerTypeVariant value for this OfferTypeV2.
     * 
     * @return offerTypeVariant
     */
    public String getOfferTypeVariant() {
        return offerTypeVariant;
    }


    /**
     * Sets the offerTypeVariant value for this OfferTypeV2.
     * 
     * @param offerTypeVariant
     */
    public void setOfferTypeVariant(String offerTypeVariant) {
        this.offerTypeVariant = offerTypeVariant;
    }


    /**
     * Gets the priceArray value for this OfferTypeV2.
     * 
     * @return priceArray
     */
    public Float[] getPriceArray() {
        return priceArray;
    }


    /**
     * Sets the priceArray value for this OfferTypeV2.
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
     * Gets the priceType value for this OfferTypeV2.
     * 
     * @return priceType
     */
    public Integer getPriceType() {
        return priceType;
    }


    /**
     * Sets the priceType value for this OfferTypeV2.
     * 
     * @param priceType
     */
    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }


    /**
     * Gets the productListA value for this OfferTypeV2.
     * 
     * @return productListA
     */
    public String[] getProductListA() {
        return productListA;
    }


    /**
     * Sets the productListA value for this OfferTypeV2.
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
     * Gets the productListB value for this OfferTypeV2.
     * 
     * @return productListB
     */
    public String[] getProductListB() {
        return productListB;
    }


    /**
     * Sets the productListB value for this OfferTypeV2.
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
     * Gets the productListC value for this OfferTypeV2.
     * 
     * @return productListC
     */
    public String[] getProductListC() {
        return productListC;
    }


    /**
     * Sets the productListC value for this OfferTypeV2.
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
     * Gets the productListD value for this OfferTypeV2.
     * 
     * @return productListD
     */
    public String[] getProductListD() {
        return productListD;
    }


    /**
     * Sets the productListD value for this OfferTypeV2.
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
     * Gets the productListE value for this OfferTypeV2.
     * 
     * @return productListE
     */
    public String[] getProductListE() {
        return productListE;
    }


    /**
     * Sets the productListE value for this OfferTypeV2.
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
     * Gets the productTypeListA value for this OfferTypeV2.
     * 
     * @return productTypeListA
     */
    public String[] getProductTypeListA() {
        return productTypeListA;
    }


    /**
     * Sets the productTypeListA value for this OfferTypeV2.
     * 
     * @param productTypeListA
     */
    public void setProductTypeListA(String[] productTypeListA) {
        this.productTypeListA = productTypeListA;
    }

    public String getProductTypeListA(int i) {
        return this.productTypeListA[i];
    }

    public void setProductTypeListA(int i, String _value) {
        this.productTypeListA[i] = _value;
    }


    /**
     * Gets the productTypeListB value for this OfferTypeV2.
     * 
     * @return productTypeListB
     */
    public String[] getProductTypeListB() {
        return productTypeListB;
    }


    /**
     * Sets the productTypeListB value for this OfferTypeV2.
     * 
     * @param productTypeListB
     */
    public void setProductTypeListB(String[] productTypeListB) {
        this.productTypeListB = productTypeListB;
    }

    public String getProductTypeListB(int i) {
        return this.productTypeListB[i];
    }

    public void setProductTypeListB(int i, String _value) {
        this.productTypeListB[i] = _value;
    }


    /**
     * Gets the productTypeListC value for this OfferTypeV2.
     * 
     * @return productTypeListC
     */
    public String[] getProductTypeListC() {
        return productTypeListC;
    }


    /**
     * Sets the productTypeListC value for this OfferTypeV2.
     * 
     * @param productTypeListC
     */
    public void setProductTypeListC(String[] productTypeListC) {
        this.productTypeListC = productTypeListC;
    }

    public String getProductTypeListC(int i) {
        return this.productTypeListC[i];
    }

    public void setProductTypeListC(int i, String _value) {
        this.productTypeListC[i] = _value;
    }


    /**
     * Gets the productTypeListD value for this OfferTypeV2.
     * 
     * @return productTypeListD
     */
    public String[] getProductTypeListD() {
        return productTypeListD;
    }


    /**
     * Sets the productTypeListD value for this OfferTypeV2.
     * 
     * @param productTypeListD
     */
    public void setProductTypeListD(String[] productTypeListD) {
        this.productTypeListD = productTypeListD;
    }

    public String getProductTypeListD(int i) {
        return this.productTypeListD[i];
    }

    public void setProductTypeListD(int i, String _value) {
        this.productTypeListD[i] = _value;
    }


    /**
     * Gets the productTypeListE value for this OfferTypeV2.
     * 
     * @return productTypeListE
     */
    public String[] getProductTypeListE() {
        return productTypeListE;
    }


    /**
     * Sets the productTypeListE value for this OfferTypeV2.
     * 
     * @param productTypeListE
     */
    public void setProductTypeListE(String[] productTypeListE) {
        this.productTypeListE = productTypeListE;
    }

    public String getProductTypeListE(int i) {
        return this.productTypeListE[i];
    }

    public void setProductTypeListE(int i, String _value) {
        this.productTypeListE[i] = _value;
    }


    /**
     * Gets the savingAmount value for this OfferTypeV2.
     * 
     * @return savingAmount
     */
    public Float[] getSavingAmount() {
        return savingAmount;
    }


    /**
     * Sets the savingAmount value for this OfferTypeV2.
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
     * Gets the savingText1 value for this OfferTypeV2.
     * 
     * @return savingText1
     */
    public String getSavingText1() {
        return savingText1;
    }


    /**
     * Sets the savingText1 value for this OfferTypeV2.
     * 
     * @param savingText1
     */
    public void setSavingText1(String savingText1) {
        this.savingText1 = savingText1;
    }


    /**
     * Gets the savingText2 value for this OfferTypeV2.
     * 
     * @return savingText2
     */
    public String getSavingText2() {
        return savingText2;
    }


    /**
     * Sets the savingText2 value for this OfferTypeV2.
     * 
     * @param savingText2
     */
    public void setSavingText2(String savingText2) {
        this.savingText2 = savingText2;
    }


    /**
     * Gets the savingType value for this OfferTypeV2.
     * 
     * @return savingType
     */
    public Integer getSavingType() {
        return savingType;
    }


    /**
     * Sets the savingType value for this OfferTypeV2.
     * 
     * @param savingType
     */
    public void setSavingType(Integer savingType) {
        this.savingType = savingType;
    }


    /**
     * Gets the thresholdArray value for this OfferTypeV2.
     * 
     * @return thresholdArray
     */
    public Float[] getThresholdArray() {
        return thresholdArray;
    }


    /**
     * Sets the thresholdArray value for this OfferTypeV2.
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
     * Gets the thresholdTypes value for this OfferTypeV2.
     * 
     * @return thresholdTypes
     */
    public Integer getThresholdTypes() {
        return thresholdTypes;
    }


    /**
     * Sets the thresholdTypes value for this OfferTypeV2.
     * 
     * @param thresholdTypes
     */
    public void setThresholdTypes(Integer thresholdTypes) {
        this.thresholdTypes = thresholdTypes;
    }


    /**
     * Gets the wasPriceList value for this OfferTypeV2.
     * 
     * @return wasPriceList
     */
    public Float[] getWasPriceList() {
        return wasPriceList;
    }


    /**
     * Sets the wasPriceList value for this OfferTypeV2.
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
     * Gets the wasWasPriceList value for this OfferTypeV2.
     * 
     * @return wasWasPriceList
     */
    public Float[] getWasWasPriceList() {
        return wasWasPriceList;
    }


    /**
     * Sets the wasWasPriceList value for this OfferTypeV2.
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
        if (!(obj instanceof OfferTypeV2)) return false;
        OfferTypeV2 other = (OfferTypeV2) obj;
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
            ((this.productTypeListA==null && other.getProductTypeListA()==null) || 
             (this.productTypeListA!=null &&
              java.util.Arrays.equals(this.productTypeListA, other.getProductTypeListA()))) &&
            ((this.productTypeListB==null && other.getProductTypeListB()==null) || 
             (this.productTypeListB!=null &&
              java.util.Arrays.equals(this.productTypeListB, other.getProductTypeListB()))) &&
            ((this.productTypeListC==null && other.getProductTypeListC()==null) || 
             (this.productTypeListC!=null &&
              java.util.Arrays.equals(this.productTypeListC, other.getProductTypeListC()))) &&
            ((this.productTypeListD==null && other.getProductTypeListD()==null) || 
             (this.productTypeListD!=null &&
              java.util.Arrays.equals(this.productTypeListD, other.getProductTypeListD()))) &&
            ((this.productTypeListE==null && other.getProductTypeListE()==null) || 
             (this.productTypeListE!=null &&
              java.util.Arrays.equals(this.productTypeListE, other.getProductTypeListE()))) &&
            ((this.savingAmount==null && other.getSavingAmount()==null) || 
             (this.savingAmount!=null &&
              java.util.Arrays.equals(this.savingAmount, other.getSavingAmount()))) &&
            ((this.savingText1==null && other.getSavingText1()==null) || 
             (this.savingText1!=null &&
              this.savingText1.equals(other.getSavingText1()))) &&
            ((this.savingText2==null && other.getSavingText2()==null) || 
             (this.savingText2!=null &&
              this.savingText2.equals(other.getSavingText2()))) &&
            ((this.savingType==null && other.getSavingType()==null) || 
             (this.savingType!=null &&
              this.savingType.equals(other.getSavingType()))) &&
            ((this.thresholdArray==null && other.getThresholdArray()==null) || 
             (this.thresholdArray!=null &&
              java.util.Arrays.equals(this.thresholdArray, other.getThresholdArray()))) &&
            ((this.thresholdTypes==null && other.getThresholdTypes()==null) || 
             (this.thresholdTypes!=null &&
              this.thresholdTypes.equals(other.getThresholdTypes()))) &&
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
        if (getProductTypeListA() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductTypeListA());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProductTypeListA(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductTypeListB() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductTypeListB());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProductTypeListB(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductTypeListC() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductTypeListC());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProductTypeListC(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductTypeListD() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductTypeListD());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProductTypeListD(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductTypeListE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductTypeListE());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getProductTypeListE(), i);
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
        if (getSavingText1() != null) {
            _hashCode += getSavingText1().hashCode();
        }
        if (getSavingText2() != null) {
            _hashCode += getSavingText2().hashCode();
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
        new org.apache.axis.description.TypeDesc(OfferTypeV2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "OfferTypeV2"));
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
        elemField.setFieldName("productTypeListA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "productTypeListA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTypeListB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "productTypeListB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTypeListC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "productTypeListC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTypeListD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "productTypeListD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productTypeListE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "productTypeListE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("savingText1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "savingText1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("savingText2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://messages.episys.com/xsd", "savingText2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
