package com.hm.bus.module;

import java.util.Date;

public class LnRiskFicoResult {
    private Long id;

    private Long appId;

    private String score;

    private String grade;

    private String policy;

    private String rulemessage;

    private Date createTime;

    private Long fstandby1;

    private String fstandby2;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy == null ? null : policy.trim();
    }

    public String getRulemessage() {
        return rulemessage;
    }

    public void setRulemessage(String rulemessage) {
        this.rulemessage = rulemessage == null ? null : rulemessage.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getFstandby1() {
        return fstandby1;
    }

    public void setFstandby1(Long fstandby1) {
        this.fstandby1 = fstandby1;
    }

    public String getFstandby2() {
        return fstandby2;
    }

    public void setFstandby2(String fstandby2) {
        this.fstandby2 = fstandby2 == null ? null : fstandby2.trim();
    }
}