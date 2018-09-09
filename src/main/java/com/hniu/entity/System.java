package com.hniu.entity;

public class System {
    private Integer sysId;

    private String sysName;

    private String sysImg;

    private Byte pageLine;

    private String appid;

    private String appsecret;

    private String barName;

    public Integer getSysId() {
        return sysId;
    }

    public void setSysId(Integer sysId) {
        this.sysId = sysId;
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    public String getSysImg() {
        return sysImg;
    }

    public void setSysImg(String sysImg) {
        this.sysImg = sysImg;
    }

    public Byte getPageLine() {
        return pageLine;
    }

    public void setPageLine(Byte pageLine) {
        this.pageLine = pageLine;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }

    public String getBarName() {
        return barName;
    }

    public void setBarName(String barName) {
        this.barName = barName;
    }
}