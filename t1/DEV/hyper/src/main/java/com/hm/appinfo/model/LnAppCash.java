package com.hm.appinfo.model;

public class LnAppCash {
    private Long appId;

    private String useType;

    private Long srcAppId;

    private String srcAppDiffer;

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType == null ? null : useType.trim();
    }

    public Long getSrcAppId() {
        return srcAppId;
    }

    public void setSrcAppId(Long srcAppId) {
        this.srcAppId = srcAppId;
    }

    public String getSrcAppDiffer() {
        return srcAppDiffer;
    }

    public void setSrcAppDiffer(String srcAppDiffer) {
        this.srcAppDiffer = srcAppDiffer == null ? null : srcAppDiffer.trim();
    }
}