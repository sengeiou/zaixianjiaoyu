package com.project.zaixianjiaoyu.model;

/**
 * Created by Administrator on 2018/4/10.
 */

public class Gengxin {


    /**
     * appid : aa123456
     * appname : 测试热更新
     * isshowwap : 1
     * wapurl : https://down.updateapp-down.com/369caizy.apk
     * status : 1
     * desc : 成功返回数据
     */

    private String appid;
    private String appname;
    private String isshowwap;
    private String wapurl;
    private int status;
    private String desc;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getIsshowwap() {
        return isshowwap;
    }

    public void setIsshowwap(String isshowwap) {
        this.isshowwap = isshowwap;
    }

    public String getWapurl() {
        return wapurl;
    }

    public void setWapurl(String wapurl) {
        this.wapurl = wapurl;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
