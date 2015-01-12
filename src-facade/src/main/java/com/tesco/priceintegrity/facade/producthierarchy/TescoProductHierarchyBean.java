package com.tesco.priceintegrity.facade.producthierarchy;

/**
 * Created by XY89 on 1/6/2015.
 */
public class TescoProductHierarchyBean {
    String tpnc;
    String tpnb;
    String cls;
    String subcls;
    String dept;
    String ean;
    int count=0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getTpnc() {
        return tpnc;
    }

    public void setTpnc(String tpnc) {
        this.tpnc = tpnc;
    }

    public String getTpnb() {
        return tpnb;
    }

    public void setTpnb(String tpnb) {
        this.tpnb = tpnb;
    }

    public String getCls() {
        return cls;
    }

    public void setCls(String cls) {
        this.cls = cls;
    }

    public String getSubcls() {
        return subcls;
    }

    public void setSubcls(String subcls) {
        this.subcls = subcls;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }
}
