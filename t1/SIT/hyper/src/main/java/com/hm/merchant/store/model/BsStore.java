package com.hm.merchant.store.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @ClassName: BsStore
 * @Description: 门店
 * @author Administrator
 * @date 2016年4月27日 上午10:57:51
 */
public class BsStore
{
	private Long id;

	private String storeCode;

	private String storeName;

	private Long merchantId;

	private String branchName;

	private String orgcode;

	private String storeProv;

	private String storeCity;

	private String storeTown;
	

	private String storeProvName;

	private String storeCityName;

	private String storeTownName;

	private String storeStr;

	private String storeRidge;

	private String storeHome;

	private String zipcode;

	private String majorContactName;

	private String majorContactPhone;

	private String majorContactMail;

	private String majorContactPosition;

	private String majorContactQq;

	private String majorContactWeixin;

	private String financeName;

	private String financePhone;

	private String financeMail;

	private String businessStartTime;

	private String businessEndTime;

	private String mainBrand;

	private Long managerId;

	private Date storeManagerBindingTime;

	private Long closedby;

	private Date closedon;

	private Long activedby;

	private Date activedon;

	private String createdby;

	private Date createdon;

	private String modifiedby;

	private Date modifiedon;

	private String activeStatus;

	private String storeStatus;

	private String operModeCode;

	private String merchantTypeCode;

	private String accountName;

	private String bankName;

	private String accountSubBank;

	private String accountCity;

	private String bankAccount;

	private String fuMobile;

	private String fuPassword;

	private BigDecimal feeProportion;

	private String calculateMethod;

	private Integer version;

	private Date passRateTime;

	private Double passRate;

	private Integer jspnValue;

	private String storeRegisterNo;

	private String storeDesc;
	
	private Integer faceCheck;//人脸识别
	
	private String storeCharacter;//门店性质

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getStoreCode()
	{
		return storeCode;
	}

	public void setStoreCode(String storeCode)
	{
		this.storeCode = storeCode == null ? null : storeCode.trim();
	}

	public String getStoreName()
	{
		return storeName;
	}

	public void setStoreName(String storeName)
	{
		this.storeName = storeName == null ? null : storeName.trim();
	}

	public Long getMerchantId()
	{
		return merchantId;
	}

	public void setMerchantId(Long merchantId)
	{
		this.merchantId = merchantId;
	}

	public String getBranchName()
	{
		return branchName;
	}

	public void setBranchName(String branchName)
	{
		this.branchName = branchName == null ? null : branchName.trim();
	}

	public String getOrgcode()
	{
		return orgcode;
	}

	public void setOrgcode(String orgcode)
	{
		this.orgcode = orgcode == null ? null : orgcode.trim();
	}

	public String getStoreProv()
	{
		return storeProv;
	}

	public void setStoreProv(String storeProv)
	{
		this.storeProv = storeProv == null ? null : storeProv.trim();
	}

	public String getStoreCity()
	{
		return storeCity;
	}

	public void setStoreCity(String storeCity)
	{
		this.storeCity = storeCity == null ? null : storeCity.trim();
	}

	public String getStoreTown()
	{
		return storeTown;
	}

	public void setStoreTown(String storeTown)
	{
		this.storeTown = storeTown == null ? null : storeTown.trim();
	}

	public String getStoreStr()
	{
		return storeStr;
	}

	public void setStoreStr(String storeStr)
	{
		this.storeStr = storeStr == null ? null : storeStr.trim();
	}

	public String getStoreRidge()
	{
		return storeRidge;
	}

	public void setStoreRidge(String storeRidge)
	{
		this.storeRidge = storeRidge == null ? null : storeRidge.trim();
	}

	public String getStoreHome()
	{
		return storeHome;
	}

	public void setStoreHome(String storeHome)
	{
		this.storeHome = storeHome == null ? null : storeHome.trim();
	}

	public String getZipcode()
	{
		return zipcode;
	}

	public void setZipcode(String zipcode)
	{
		this.zipcode = zipcode == null ? null : zipcode.trim();
	}

	public String getMajorContactName()
	{
		return majorContactName;
	}

	public void setMajorContactName(String majorContactName)
	{
		this.majorContactName = majorContactName == null ? null : majorContactName.trim();
	}

	public String getMajorContactPhone()
	{
		return majorContactPhone;
	}

	public void setMajorContactPhone(String majorContactPhone)
	{
		this.majorContactPhone = majorContactPhone == null ? null : majorContactPhone.trim();
	}

	public String getMajorContactMail()
	{
		return majorContactMail;
	}

	public void setMajorContactMail(String majorContactMail)
	{
		this.majorContactMail = majorContactMail == null ? null : majorContactMail.trim();
	}

	public String getMajorContactPosition()
	{
		return majorContactPosition;
	}

	public void setMajorContactPosition(String majorContactPosition)
	{
		this.majorContactPosition = majorContactPosition == null ? null : majorContactPosition.trim();
	}

	public String getMajorContactQq()
	{
		return majorContactQq;
	}

	public void setMajorContactQq(String majorContactQq)
	{
		this.majorContactQq = majorContactQq == null ? null : majorContactQq.trim();
	}

	public String getMajorContactWeixin()
	{
		return majorContactWeixin;
	}

	public void setMajorContactWeixin(String majorContactWeixin)
	{
		this.majorContactWeixin = majorContactWeixin == null ? null : majorContactWeixin.trim();
	}

	public String getFinanceName()
	{
		return financeName;
	}

	public void setFinanceName(String financeName)
	{
		this.financeName = financeName == null ? null : financeName.trim();
	}

	public String getFinancePhone()
	{
		return financePhone;
	}

	public void setFinancePhone(String financePhone)
	{
		this.financePhone = financePhone == null ? null : financePhone.trim();
	}

	public String getFinanceMail()
	{
		return financeMail;
	}

	public void setFinanceMail(String financeMail)
	{
		this.financeMail = financeMail == null ? null : financeMail.trim();
	}

	public String getBusinessStartTime()
	{
		return businessStartTime;
	}

	public void setBusinessStartTime(String businessStartTime)
	{
		this.businessStartTime = businessStartTime == null ? null : businessStartTime.trim();
	}

	public String getBusinessEndTime()
	{
		return businessEndTime;
	}

	public void setBusinessEndTime(String businessEndTime)
	{
		this.businessEndTime = businessEndTime == null ? null : businessEndTime.trim();
	}

	public String getMainBrand()
	{
		return mainBrand;
	}

	public void setMainBrand(String mainBrand)
	{
		this.mainBrand = mainBrand == null ? null : mainBrand.trim();
	}

	public Long getManagerId()
	{
		return managerId;
	}

	public void setManagerId(Long managerId)
	{
		this.managerId = managerId;
	}

	public Date getStoreManagerBindingTime()
	{
		return storeManagerBindingTime;
	}

	public void setStoreManagerBindingTime(Date storeManagerBindingTime)
	{
		this.storeManagerBindingTime = storeManagerBindingTime;
	}

	public Long getClosedby()
	{
		return closedby;
	}

	public void setClosedby(Long closedby)
	{
		this.closedby = closedby;
	}

	public Date getClosedon()
	{
		return closedon;
	}

	public void setClosedon(Date closedon)
	{
		this.closedon = closedon;
	}

	public Long getActivedby()
	{
		return activedby;
	}

	public void setActivedby(Long activedby)
	{
		this.activedby = activedby;
	}

	public Date getActivedon()
	{
		return activedon;
	}

	public void setActivedon(Date activedon)
	{
		this.activedon = activedon;
	}

	public String getCreatedby()
	{
		return createdby;
	}

	public void setCreatedby(String createdby)
	{
		this.createdby = createdby == null ? null : createdby.trim();
	}

	public Date getCreatedon()
	{
		return createdon;
	}

	public void setCreatedon(Date createdon)
	{
		this.createdon = createdon;
	}

	public String getModifiedby()
	{
		return modifiedby;
	}

	public void setModifiedby(String modifiedby)
	{
		this.modifiedby = modifiedby == null ? null : modifiedby.trim();
	}

	public Date getModifiedon()
	{
		return modifiedon;
	}

	public void setModifiedon(Date modifiedon)
	{
		this.modifiedon = modifiedon;
	}

	public String getActiveStatus()
	{
		return activeStatus;
	}

	public void setActiveStatus(String activeStatus)
	{
		this.activeStatus = activeStatus == null ? null : activeStatus.trim();
	}

	public String getStoreStatus()
	{
		return storeStatus;
	}

	public void setStoreStatus(String storeStatus)
	{
		this.storeStatus = storeStatus == null ? null : storeStatus.trim();
	}

	public String getOperModeCode()
	{
		return operModeCode;
	}

	public void setOperModeCode(String operModeCode)
	{
		this.operModeCode = operModeCode == null ? null : operModeCode.trim();
	}

	public String getMerchantTypeCode()
	{
		return merchantTypeCode;
	}

	public void setMerchantTypeCode(String merchantTypeCode)
	{
		this.merchantTypeCode = merchantTypeCode == null ? null : merchantTypeCode.trim();
	}

	public String getAccountName()
	{
		return accountName;
	}

	public void setAccountName(String accountName)
	{
		this.accountName = accountName == null ? null : accountName.trim();
	}

	public String getBankName()
	{
		return bankName;
	}

	public void setBankName(String bankName)
	{
		this.bankName = bankName == null ? null : bankName.trim();
	}

	public String getAccountSubBank()
	{
		return accountSubBank;
	}

	public void setAccountSubBank(String accountSubBank)
	{
		this.accountSubBank = accountSubBank == null ? null : accountSubBank.trim();
	}

	public String getAccountCity()
	{
		return accountCity;
	}

	public void setAccountCity(String accountCity)
	{
		this.accountCity = accountCity == null ? null : accountCity.trim();
	}

	public String getBankAccount()
	{
		return bankAccount;
	}

	public void setBankAccount(String bankAccount)
	{
		this.bankAccount = bankAccount == null ? null : bankAccount.trim();
	}

	public String getFuMobile()
	{
		return fuMobile;
	}

	public void setFuMobile(String fuMobile)
	{
		this.fuMobile = fuMobile == null ? null : fuMobile.trim();
	}

	public String getFuPassword()
	{
		return fuPassword;
	}

	public void setFuPassword(String fuPassword)
	{
		this.fuPassword = fuPassword == null ? null : fuPassword.trim();
	}

	public BigDecimal getFeeProportion()
	{
		return feeProportion;
	}

	public void setFeeProportion(BigDecimal feeProportion)
	{
		this.feeProportion = feeProportion;
	}

	public String getCalculateMethod()
	{
		return calculateMethod;
	}

	public void setCalculateMethod(String calculateMethod)
	{
		this.calculateMethod = calculateMethod == null ? null : calculateMethod.trim();
	}

	public Integer getVersion()
	{
		return version;
	}

	public void setVersion(Integer version)
	{
		this.version = version;
	}

	public Date getPassRateTime()
	{
		return passRateTime;
	}

	public void setPassRateTime(Date passRateTime)
	{
		this.passRateTime = passRateTime;
	}

	public Double getPassRate()
	{
		return passRate;
	}

	public void setPassRate(Double passRate)
	{
		this.passRate = passRate;
	}

	public Integer getJspnValue()
	{
		return jspnValue;
	}

	public void setJspnValue(Integer jspnValue)
	{
		this.jspnValue = jspnValue;
	}

	public String getStoreRegisterNo()
	{
		return storeRegisterNo;
	}

	public void setStoreRegisterNo(String storeRegisterNo)
	{
		this.storeRegisterNo = storeRegisterNo == null ? null : storeRegisterNo.trim();
	}

	public String getStoreDesc()
	{
		return storeDesc;
	}

	public void setStoreDesc(String storeDesc)
	{
		this.storeDesc = storeDesc == null ? null : storeDesc.trim();
	}

	public Integer getFaceCheck() {
		return faceCheck;
	}

	public void setFaceCheck(Integer faceCheck) {
		this.faceCheck = faceCheck;
	}

	public String getStoreProvName()
	{
		return storeProvName;
	}

	public void setStoreProvName(String storeProvName)
	{
		this.storeProvName = storeProvName;
	}

	public String getStoreCityName()
	{
		return storeCityName;
	}

	public void setStoreCityName(String storeCityName)
	{
		this.storeCityName = storeCityName;
	}

	public String getStoreTownName()
	{
		return storeTownName;
	}

	public void setStoreTownName(String storeTownName)
	{
		this.storeTownName = storeTownName;
	}

	public String getStoreCharacter() {
		return storeCharacter;
	}

	public void setStoreCharacter(String storeCharacter) {
		this.storeCharacter = storeCharacter;
	}
}