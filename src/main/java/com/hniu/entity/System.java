package com.hniu.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Table(name = "tbl_system")
public class System {
    @Id
    @Column(name = "sys_id")
    private Integer sysId;

    /**
     * 系统名称
     */
    @Column(name = "sys_name")
    private String sysName;

    /**
     * 系统图标
     */
    @Column(name = "sys_img")
    private String sysImg;

    /**
     * 每页显示行数
     */
    @Column(name = "page_line")
    private Byte pageLine;

    @Column(name = "AppID")
    private String appid;

    /**
     * 系统设置id
     */
    @Column(name = "AppSecret")
    private String appsecret;

    /**
     * 条形码前缀
     */
    @Column(name = "bar_Name")
    private String barName;

    public System() {
    }

    public System(Integer sysId, String sysName, String sysImg, Byte pageLine, String appid, String appsecret, String barName) {
        this.sysId = sysId;
        this.sysName = sysName;
        this.sysImg = sysImg;
        this.pageLine = pageLine;
        this.appid = appid;
        this.appsecret = appsecret;
        this.barName = barName;
    }


    /**
     * @return sys_id
     */
    public Integer getSysId() {
        return sysId;
    }

    /**
     * @param sysId
     */
    public void setSysId(Integer sysId) {
        this.sysId = sysId;
    }

    /**
     * 获取系统名称
     *
     * @return sys_name - 系统名称
     */
    public String getSysName() {
        return sysName;
    }

    /**
     * 设置系统名称
     *
     * @param sysName 系统名称
     */
    public void setSysName(String sysName) {
        this.sysName = sysName;
    }

    /**
     * 获取系统图标
     *
     * @return sys_img - 系统图标
     */
    public String getSysImg() {
        return sysImg;
    }

    /**
     * 设置系统图标
     *
     * @param sysImg 系统图标
     */
    public void setSysImg(String sysImg) {
        this.sysImg = sysImg;
    }

    /**
     * 获取每页显示行数
     *
     * @return page_line - 每页显示行数
     */
    public Byte getPageLine() {
        return pageLine;
    }

    /**
     * 设置每页显示行数
     *
     * @param pageLine 每页显示行数
     */
    public void setPageLine(Byte pageLine) {
        this.pageLine = pageLine;
    }

    /**
     * @return AppID
     */
    public String getAppid() {
        return appid;
    }

    /**
     * @param appid
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 获取系统设置id
     *
     * @return AppSecret - 系统设置id
     */
    public String getAppsecret() {
        return appsecret;
    }

    /**
     * 设置系统设置id
     *
     * @param appsecret 系统设置id
     */
    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret;
    }

    /**
     * 获取条形码前缀
     *
     * @return bar_Name - 条形码前缀
     */
    public String getBarName() {
        return barName;
    }

    /**
     * 设置条形码前缀
     *
     * @param barName 条形码前缀
     */
    public void setBarName(String barName) {
        this.barName = barName;
    }
}