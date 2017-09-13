package com.hm.appinfo.model;

import java.util.Date;

import com.gep.core.util.StringUtil;
/**
 * 贷款工单客户基本信息
 * @author 洪秋霞
 * 2016年4月29日
 */
public class LnAppCustInfo {
    private Long id;

    private Long appId;

    /**
     * 客户姓名
     */
    private String customerName;

    /**
     * 客户性别
     */
    private String customerSex;

    /**
     * 社保号码
     */
    private String socialNumber;

    /**
     * 教育程度
     */
    private String degree;

    /**
     * 婚姻状况
     */
    private String marry;

    /**
     * 电子邮件
     */
    private String emaill;

    /**
     * 首次参加工作时间
     */
    private String firstWorktime;

    /**
     * 子女数目
     */
    private Integer childrenNumber;

    /**
     * 现住地址与户籍
     */
    private String addreRegist;

    /**
     * 住宅/宿舍电话
     */
    private String livephone;

    /**
     * 居住状况
     */
    private String liveCondition;

    /**
     * 户籍所在省
     */
    private String householdProv;

    /**
     * 户籍所在市
     */
    private String householdCity;

    /**
     * 户籍所在区县
     */
    private String householdTown;

    /**
     * 户籍街道
     */
    private String householdStr;

    /**
     * 地小区/栋
     */
    private String householdRidge;

    /**
     * 单元/房间号
     */
    private String householdHome;

    /**
     * 居住省
     */
    private String liveProv;

    /**
     * 居住城市
     */
    private String liveCity;

    /**
     * 居住县
     */
    private String liveTown;

    /**
     * 居住街道
     */
    private String liveStr;

    /**
     * 居住地小区/街道
     */
    private String liveRidge;

    /**
     * 居住地单元/房间
     */
    private String liveHome;

    /**
     * 月收入
     */
    private Integer monthlyIncome;

    /**
     * 其它收入
     */
    private Integer otherIncome;

    /**
     * 家庭月收入
     */
    private Integer familyIncome;

    /**
     * 月支出
     */
    private Integer monthlySpending;

    /**
     * 单位名称
     */
    private String unitname;

    /**
     * 行业类别
     */
    private String industry;

    /**
     * 单位性质
     */
    private String unittype;

    /**
     * 任职部门
     */
    private String department;

    /**
     * 职位级别
     */
    private String duty;

    /**
     * 入职日期
     */
    private Date entryDate;

    /**
     * 购买社保
     */
    private String isSocialSec;

    /**
     * 单位所在省
     */
    private String unitAddre;

    /**
     * 单位所在乡/镇/区
     */
    private String unitTown;

    /**
     * 单位街道
     */
    private String unitStr;

    /**
     * 单位小区/栋
     */
    private String unitRidge;

    /**
     * 单位单元/房间号
     */
    private String unitHome;

    /**
     * 创建人
     */
    private String createdby;

    /**
     * 创建时间
     */
    private Date createdon;

    /**
     * 修改人
     */
    private String modifiedby;

    /**
     * 修改时间
     */
    private Date modifiedon;

    private Integer version;

    /**
     * 照片地址
     */
    private String ossId;

    /**
     * NCIIC检查结果
     */
    private String nciicAuditResult;

    /**
     * 身份证有效期
     */
    private Date identityCardValidityPeriod;

    /**
     * 发证机关
     */
    private String issuingOrgan;

    /**
     * 住宿电话登记人
     */
    private String quartersPhoneRegistrant;

    /**
     * QQ
     */
    private String qqCode;

    /**
     * 微信
     */
    private String weixinCode;

    /**
     * 易信
     */
    private String yixin;

    /**
     * 配偶联系地址
     */
    private String mateAddress;

    /**
     * 配偶身份证号
     */
    private String mateIdCode;

    /**
     * 户籍邮编
     */
    private String householdPostcode;

    /**
     * 居住邮编
     */
    private String livePostcode;

    /**
     * 单位电话
     */
    private String unitPhone;

    /**
     * 单位电话分机
     */
    private String unitExtPhone;

    /**
     * 邮寄省
     */
    private String postProv;

    /**
     * 邮寄区县
     */
    private String postTown;

    /**
     * 邮寄城市
     */
    private String postCity;

    /**
     * 邮寄街道
     */
    private String postStr;

    /**
     * 邮寄小区/栋
     */
    private String postRidge;

    /**
     * 邮寄单元/房间号
     */
    private String postHome;

    /**
     * 单位城市
     */
    private String unitCity;

    private Integer workexperience;

    /**
     * 职业
     */
    private String career;
    
    /**
     * 配偶姓名
     */
    private String parterName;

    /**
     * 现单位工作时长/距毕业时长（月份）
     */
    private Integer unitWorktime;

    /**
     * 邮寄邮编
     */
    private String postCode;

    /**
     * 单位邮编
     */
    private String unitPostcode;

    /**
     * 配偶电话
     */
    private String mateMobel;

    /**
     * 配偶单位
     */
    private String mateUnit;

    /**
     * 邮寄地址状态
     */
    private String postState;

    /**
     * 户籍镇
     */
    private String householdZhen;

    /**
     * 居住镇
     */
    private String liveZhen;

    /**
     * 单位镇
     */
    private String unitZhen;

    /**
     * 邮箱标记
     */
    private String emailSign;

    /**
     * 职业类别
     */
    private String careerType;
    
    /**
     * 行业细分
     */
    private String industryType;
    
    /**预计毕业年份*/
    private String expectGraduateYear;
    
    /**
     * 职业Code-业务字段
     */
    private String careerCode;
    
    /**单位微信公众号*/
    private String unitnWeixin;
    
    /**配偶微信号*/
    private String parteWeixin;
    
    /**配偶QQ号*/
    private String parteQq;
    
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

    public String getCustomerName() {
        return StringUtil.isNotBlank(customerName) ? customerName : null;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerSex() {
        return StringUtil.isNotBlank(customerSex) ? customerSex : null;
    }

    public void setCustomerSex(String customerSex) {
        this.customerSex = customerSex == null ? null : customerSex.trim();
    }

    public String getSocialNumber() {
        return StringUtil.isNotBlank(socialNumber) ? socialNumber : null;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber == null ? null : socialNumber.trim();
    }

    public String getDegree() {
        return StringUtil.isNotBlank(degree) ? degree : null;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getMarry() {
        return StringUtil.isNotBlank(marry) ? marry : null;
    }

    public void setMarry(String marry) {
        this.marry = marry == null ? null : marry.trim();
    }

    public String getEmaill() {
        return StringUtil.isNotBlank(emaill) ? emaill : null;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill == null ? null : emaill.trim();
    }

    public String getFirstWorktime() {
        return StringUtil.isNotBlank(firstWorktime) ? firstWorktime : null;
    }

    public void setFirstWorktime(String firstWorktime) {
        this.firstWorktime = firstWorktime == null ? null : firstWorktime.trim();
    }

    public Integer getChildrenNumber() {
        return childrenNumber;
    }

    public void setChildrenNumber(Integer childrenNumber) {
        this.childrenNumber = childrenNumber;
    }

    public String getAddreRegist() {
        return StringUtil.isNotBlank(addreRegist) ? addreRegist : null;
    }

    public void setAddreRegist(String addreRegist) {
        this.addreRegist = addreRegist == null ? null : addreRegist.trim();
    }

    public String getLivephone() {
        return StringUtil.isNotBlank(livephone) ? livephone : null;
    }

    public void setLivephone(String livephone) {
        this.livephone = livephone == null ? null : livephone.trim();
    }

    public String getLiveCondition() {
        return StringUtil.isNotBlank(liveCondition) ? liveCondition : null;
    }

    public void setLiveCondition(String liveCondition) {
        this.liveCondition = liveCondition == null ? null : liveCondition.trim();
    }

    public String getHouseholdProv() {
        return StringUtil.isNotBlank(householdProv) ? householdProv : null;
    }

    public void setHouseholdProv(String householdProv) {
        this.householdProv = householdProv == null ? null : householdProv.trim();
    }

    public String getHouseholdCity() {
        return StringUtil.isNotBlank(householdCity) ? householdCity : null;
    }

    public void setHouseholdCity(String householdCity) {
        this.householdCity = householdCity == null ? null : householdCity.trim();
    }

    public String getHouseholdTown() {
        return StringUtil.isNotBlank(householdTown) ? householdTown : null;
    }

    public void setHouseholdTown(String householdTown) {
        this.householdTown = householdTown == null ? null : householdTown.trim();
    }

    public String getHouseholdStr() {
        return StringUtil.isNotBlank(householdStr) ? householdStr : null;
    }

    public void setHouseholdStr(String householdStr) {
        this.householdStr = householdStr == null ? null : householdStr.trim();
    }

    public String getHouseholdRidge() {
        return StringUtil.isNotBlank(householdRidge) ? householdRidge : null;
    }

    public void setHouseholdRidge(String householdRidge) {
        this.householdRidge = householdRidge == null ? null : householdRidge.trim();
    }

    public String getHouseholdHome() {
        return StringUtil.isNotBlank(householdHome) ? householdHome : null;
    }

    public void setHouseholdHome(String householdHome) {
        this.householdHome = householdHome == null ? null : householdHome.trim();
    }

    public String getLiveProv() {
        return StringUtil.isNotBlank(liveProv) ? liveProv : null;
    }

    public void setLiveProv(String liveProv) {
        this.liveProv = liveProv == null ? null : liveProv.trim();
    }

    public String getLiveCity() {
        return StringUtil.isNotBlank(liveCity) ? liveCity : null;
    }

    public void setLiveCity(String liveCity) {
        this.liveCity = liveCity == null ? null : liveCity.trim();
    }

    public String getLiveTown() {
        return StringUtil.isNotBlank(liveTown) ? liveTown : null;
    }

    public void setLiveTown(String liveTown) {
        this.liveTown = liveTown == null ? null : liveTown.trim();
    }

    public String getLiveStr() {
        return liveStr;
    }

    public void setLiveStr(String liveStr) {
        this.liveStr = liveStr == null ? null : liveStr.trim();
    }

    public String getLiveRidge() {
        return StringUtil.isNotBlank(liveRidge) ? liveRidge : null;
    }

    public void setLiveRidge(String liveRidge) {
        this.liveRidge = liveRidge == null ? null : liveRidge.trim();
    }

    public String getLiveHome() {
        return StringUtil.isNotBlank(liveHome) ? liveHome : null;
    }

    public void setLiveHome(String liveHome) {
        this.liveHome = liveHome == null ? null : liveHome.trim();
    }

    public Integer getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(Integer monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public Integer getOtherIncome() {
        return otherIncome;
    }

    public void setOtherIncome(Integer otherIncome) {
        this.otherIncome = otherIncome;
    }

    public Integer getFamilyIncome() {
        return familyIncome;
    }

    public void setFamilyIncome(Integer familyIncome) {
        this.familyIncome = familyIncome;
    }

    public Integer getMonthlySpending() {
        return monthlySpending;
    }

    public void setMonthlySpending(Integer monthlySpending) {
        this.monthlySpending = monthlySpending;
    }

    public String getUnitname() {
        return StringUtil.isNotBlank(unitname) ? unitname : null;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname == null ? null : unitname.trim();
    }

    public String getIndustry() {
        return StringUtil.isNotBlank(industry) ? industry : null;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getUnittype() {
        return StringUtil.isNotBlank(unittype) ? unittype : null;
    }

    public void setUnittype(String unittype) {
        this.unittype = unittype == null ? null : unittype.trim();
    }

    public String getDepartment() {
        return StringUtil.isNotBlank(department) ? department : null;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getDuty() {
        return StringUtil.isNotBlank(duty) ? duty : null;
    }

    public void setDuty(String duty) {
        this.duty = duty == null ? null : duty.trim();
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public String getIsSocialSec() {
        return StringUtil.isNotBlank(isSocialSec) ? isSocialSec : null;
    }

    public void setIsSocialSec(String isSocialSec) {
        this.isSocialSec = isSocialSec == null ? null : isSocialSec.trim();
    }

    public String getUnitAddre() {
        return StringUtil.isNotBlank(unitAddre) ? unitAddre : null;
    }

    public void setUnitAddre(String unitAddre) {
        this.unitAddre = unitAddre == null ? null : unitAddre.trim();
    }

    public String getUnitTown() {
        return StringUtil.isNotBlank(unitTown) ? unitTown : null;
    }

    public void setUnitTown(String unitTown) {
        this.unitTown = unitTown == null ? null : unitTown.trim();
    }

    public String getUnitStr() {
        return StringUtil.isNotBlank(unitStr) ? unitStr : null;
    }

    public void setUnitStr(String unitStr) {
        this.unitStr = unitStr == null ? null : unitStr.trim();
    }

    public String getUnitRidge() {
        return StringUtil.isNotBlank(unitRidge) ? unitRidge : null;
    }

    public void setUnitRidge(String unitRidge) {
        this.unitRidge = unitRidge == null ? null : unitRidge.trim();
    }

    public String getUnitHome() {
        return StringUtil.isNotBlank(unitHome) ? unitHome : null;
    }

    public void setUnitHome(String unitHome) {
        this.unitHome = unitHome == null ? null : unitHome.trim();
    }

    public String getCreatedby() {
        return StringUtil.isNotBlank(createdby) ? createdby : null;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public String getModifiedby() {
        return StringUtil.isNotBlank(modifiedby) ? modifiedby : null;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby == null ? null : modifiedby.trim();
    }

    public Date getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(Date modifiedon) {
        this.modifiedon = modifiedon;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getOssId() {
        return StringUtil.isNotBlank(ossId) ? ossId : null;
    }

    public void setOssId(String ossId) {
        this.ossId = ossId == null ? null : ossId.trim();
    }

    public String getNciicAuditResult() {
        return StringUtil.isNotBlank(nciicAuditResult) ? nciicAuditResult : null;
    }

    public void setNciicAuditResult(String nciicAuditResult) {
        this.nciicAuditResult = nciicAuditResult == null ? null : nciicAuditResult.trim();
    }

    public Date getIdentityCardValidityPeriod() {
        return identityCardValidityPeriod;
    }

    public void setIdentityCardValidityPeriod(Date identityCardValidityPeriod) {
        this.identityCardValidityPeriod = identityCardValidityPeriod;
    }

    public String getIssuingOrgan() {
        return StringUtil.isNotBlank(issuingOrgan) ? issuingOrgan : null;
    }

    public void setIssuingOrgan(String issuingOrgan) {
        this.issuingOrgan = issuingOrgan == null ? null : issuingOrgan.trim();
    }

    public String getQuartersPhoneRegistrant() {
        return StringUtil.isNotBlank(quartersPhoneRegistrant) ? quartersPhoneRegistrant : null;
    }

    public void setQuartersPhoneRegistrant(String quartersPhoneRegistrant) {
        this.quartersPhoneRegistrant = quartersPhoneRegistrant == null ? null : quartersPhoneRegistrant.trim();
    }

    public String getQqCode() {
        return StringUtil.isNotBlank(qqCode) ? qqCode : null;
    }

    public void setQqCode(String qqCode) {
        this.qqCode = qqCode == null ? null : qqCode.trim();
    }

    public String getWeixinCode() {
        return StringUtil.isNotBlank(weixinCode) ? weixinCode : null;
    }

    public void setWeixinCode(String weixinCode) {
        this.weixinCode = weixinCode == null ? null : weixinCode.trim();
    }

    public String getYixin() {
        return StringUtil.isNotBlank(yixin) ? yixin : null;
    }

    public void setYixin(String yixin) {
        this.yixin = yixin == null ? null : yixin.trim();
    }

    public String getMateAddress() {
        return StringUtil.isNotBlank(mateAddress) ? mateAddress : null;
    }

    public void setMateAddress(String mateAddress) {
        this.mateAddress = mateAddress == null ? null : mateAddress.trim();
    }

    public String getMateIdCode() {
        return StringUtil.isNotBlank(mateIdCode) ? mateIdCode : null;
    }

    public void setMateIdCode(String mateIdCode) {
        this.mateIdCode = mateIdCode == null ? null : mateIdCode.trim();
    }

    public String getHouseholdPostcode() {
        return StringUtil.isNotBlank(householdPostcode) ? householdPostcode : null;
    }

    public void setHouseholdPostcode(String householdPostcode) {
        this.householdPostcode = householdPostcode == null ? null : householdPostcode.trim();
    }

    public String getLivePostcode() {
        return StringUtil.isNotBlank(livePostcode) ? livePostcode : null;
    }

    public void setLivePostcode(String livePostcode) {
        this.livePostcode = livePostcode == null ? null : livePostcode.trim();
    }

    public String getUnitPhone() {
        return StringUtil.isNotBlank(unitPhone) ? unitPhone : null;
    }

    public void setUnitPhone(String unitPhone) {
        this.unitPhone = unitPhone == null ? null : unitPhone.trim();
    }

    public String getUnitExtPhone() {
        return StringUtil.isNotBlank(unitExtPhone) ? unitExtPhone : null;
    }

    public void setUnitExtPhone(String unitExtPhone) {
        this.unitExtPhone = unitExtPhone == null ? null : unitExtPhone.trim();
    }

    public String getPostProv() {
        return StringUtil.isNotBlank(postProv) ? postProv : null;
    }

    public void setPostProv(String postProv) {
        this.postProv = postProv == null ? null : postProv.trim();
    }

    public String getPostTown() {
        return StringUtil.isNotBlank(postTown) ? postTown : null;
    }

    public void setPostTown(String postTown) {
        this.postTown = postTown == null ? null : postTown.trim();
    }

    public String getPostCity() {
        return StringUtil.isNotBlank(postCity) ? postCity : null;
    }

    public void setPostCity(String postCity) {
        this.postCity = postCity == null ? null : postCity.trim();
    }

    public String getPostStr() {
        return StringUtil.isNotBlank(postStr) ? postStr : null;
    }

    public void setPostStr(String postStr) {
        this.postStr = postStr == null ? null : postStr.trim();
    }

    public String getPostRidge() {
        return StringUtil.isNotBlank(postRidge) ? postRidge : null;
    }

    public void setPostRidge(String postRidge) {
        this.postRidge = postRidge == null ? null : postRidge.trim();
    }

    public String getPostHome() {
        return StringUtil.isNotBlank(postHome) ? postHome : null;
    }

    public void setPostHome(String postHome) {
        this.postHome = postHome == null ? null : postHome.trim();
    }

    public String getUnitCity() {
        return StringUtil.isNotBlank(unitCity) ? unitCity : null;
    }

    public void setUnitCity(String unitCity) {
        this.unitCity = unitCity == null ? null : unitCity.trim();
    }

    public Integer getWorkexperience() {
        return workexperience;
    }

    public void setWorkexperience(Integer workexperience) {
        this.workexperience = workexperience;
    }

    public String getCareer() {
        return StringUtil.isNotBlank(career) ? career : null;
    }

    public void setCareer(String career) {
        this.career = career == null ? null : career.trim();
    }

	public String getParterName() {
       return StringUtil.isNotBlank(parterName) ? parterName : null;
    }

    public void setParterName(String parterName) {
       this.parterName = parterName == null ? null : parterName.trim();
    }

    public Integer getUnitWorktime() {
       return unitWorktime;
    }

    public void setUnitWorktime(Integer unitWorktime) {
        this.unitWorktime = unitWorktime;
    }

    public String getPostCode() {
        return StringUtil.isNotBlank(postCode) ? postCode : null;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getUnitPostcode() {
        return StringUtil.isNotBlank(unitPostcode) ? unitPostcode : null;
    }

    public void setUnitPostcode(String unitPostcode) {
        this.unitPostcode = unitPostcode == null ? null : unitPostcode.trim();
    }

    public String getMateMobel() {
        return StringUtil.isNotBlank(mateMobel) ? mateMobel : null;
    }

    public void setMateMobel(String mateMobel) {
        this.mateMobel = mateMobel == null ? null : mateMobel.trim();
    }

    public String getMateUnit() {
        return StringUtil.isNotBlank(mateUnit) ? mateUnit : null;
    }

    public void setMateUnit(String mateUnit) {
        this.mateUnit = mateUnit == null ? null : mateUnit.trim();
    }

    public String getPostState() {
        return StringUtil.isNotBlank(postState) ? postState : null;
    }

    public void setPostState(String postState) {
        this.postState = postState == null ? null : postState.trim();
    }

    public String getHouseholdZhen() {
        return StringUtil.isNotBlank(householdZhen) ? householdZhen : null;
    }

    public void setHouseholdZhen(String householdZhen) {
        this.householdZhen = householdZhen == null ? null : householdZhen.trim();
    }

    public String getLiveZhen() {
        return StringUtil.isNotBlank(liveZhen) ? liveZhen : null;
    }

    public void setLiveZhen(String liveZhen) {
        this.liveZhen = liveZhen == null ? null : liveZhen.trim();
    }

    public String getUnitZhen() {
        return StringUtil.isNotBlank(unitZhen) ? unitZhen : null;
    }

    public void setUnitZhen(String unitZhen) {
        this.unitZhen = unitZhen == null ? null : unitZhen.trim();
    }

    public String getEmailSign() {
        return StringUtil.isNotBlank(emailSign) ? emailSign : null;
    }

    public void setEmailSign(String emailSign) {
        this.emailSign = emailSign == null ? null : emailSign.trim();
    }

	public String getCareerType() {
		return StringUtil.isNotBlank(careerType) ? careerType : null;
	}

	public void setCareerType(String careerType) {
		this.careerType = careerType;
	}

	public String getIndustryType() {
		return StringUtil.isNotBlank(industryType) ? industryType : null;
	}

	public void setIndustryType(String industryType) {
		this.industryType = industryType;
	}

	public String getExpectGraduateYear() {
		return expectGraduateYear;
	}

	public void setExpectGraduateYear(String expectGraduateYear) {
		this.expectGraduateYear = expectGraduateYear;
	}
	
	public String getCareerCode() {
		return careerCode;
	}

	public void setCareerCode(String careerCode) {
		this.careerCode = careerCode;
	}

	public String getUnitnWeixin() {
		return unitnWeixin;
	}

	public void setUnitnWeixin(String unitnWeixin) {
		this.unitnWeixin = unitnWeixin;
	}

	public String getParteWeixin() {
		return parteWeixin;
	}

	public void setParteWeixin(String parteWeixin) {
		this.parteWeixin = parteWeixin;
	}

	public String getParteQq() {
		return parteQq;
	}

	public void setParteQq(String parteQq) {
		this.parteQq = parteQq;
	}
	
}