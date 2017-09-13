package com.hm.sys.constants;

/**
 * 系统模块-常量类
 * @ClassName: SysConstants
 * @Description: TODO
 * @author LGP
 * @date 2016-4-13 下午7:57:35
 * @Copyright (c) 2016, 9fchaoneng.com All Rights Reserved.
 */
public class SysConstants
{

	/**
	 * JJ CODE for LN APP status
	 */
//	public final static String JJ_CODE_APP_STATUS_L1 = "L1";//工单状态-审核中
//
//	public final static String JJ_CODE_APP_STATUS_L6 = "L6";//工单状态-拒绝
//
//	public final static String JJ_CODE_APP_STATUS_C1 = "C1";// 工单查询列表-审核状态-待审核
//
//	public final static String JJ_CODE_APP_STATUS_C2 = "C2";//工单查询列表-审核状态-审核退回
//
//	public final static String JJ_CODE_APP_STATUS_C3 = "C3";//工单查询列表-审核状态-审核通过
	
	/**
	 * JJCODE 客户信息
	 */
	public final static String JJ_CODE_EDUCATIONLEVEL = "educationLevel";//教育程度
	public final static String JJ_CODE_MARITALSTATUS = "maritalStatus";//婚姻状态
	public final static String JJ_CODE_ADDREREGIST = "addreRegist";//注册地址
	public final static String JJ_CODE_HOUSINGSITUATION = "housingSituation";//住房情况
	public final static String JJ_CODE_INDUSTRYCATEGORY = "industryCategory";//行业类别
	public final static String JJ_CODE_UNITPROPERTY = "unitProperty";//单位性质
	public final static String JJ_CODE_BUYINSURANCE = "buyInsurance";//社保 情况
	public final static String JJ_CODE_POSITIONLEVEL = "positionLevel";//职位信息
	public final static String JJ_CODE_OCCUPATION = "occupation";//职业信息
	public final static String JJ_CODE_POSTADDRESS = "postAddress";//邮寄地址
	
	//联系人关系
	public final static String JJ_CODE_RELATIVES_SELF = "12";//本人
	public final static String JJ_CODE_RELATIVES_OTHER = "11";//其他
	public final static String JJ_CODE_RELATIVES_STUD = "10";//同学
	public final static String JJ_CODE_RELATIVES_FRIEND = "09";//朋友
	public final static String JJ_CODE_RELATIVES_COMPAN = "08";//同事
	public final static String JJ_CODE_RELATIVES_FAMILY = "07";//亲属
	public final static String JJ_CODE_RELATIVES_CHILD = "05";//儿女
	public final static String JJ_CODE_RELATIVES_FATHER = "01";//父亲
	public final static String JJ_CODE_RELATIVES_BROTHER = "03";//兄弟
	public final static String JJ_CODE_RELATIVES_MONTHER = "02";//母亲
	public final static String JJ_CODE_RELATIVES_SISTER = "04";//姐妹
	
	//联系方式类别
	public final static String JJ_CODE_CATEGORY_OTHER = "09";//其他
	public final static String JJ_CODE_CATEGORY_BANKTEL = "04";//银行开户手机
	public final static String JJ_CODE_CATEGORY_EMAIL = "08";//邮箱
	public final static String JJ_CODE_CATEGORY_WEIXIN = "07";//微信
	public final static String JJ_CODE_CATEGORY_QQ = "06";//QQ
	public final static String JJ_CODE_CATEGORY_MOBILE = "01";//手机号码
	public final static String JJ_CODE_CATEGORY_LIVEPHONE = "03";//住宅/宿舍电话
	public final static String JJ_CODE_CATEGORY_UNIT = "02";//单位电话  
	public final static String JJ_CODE_CATEGORY_PARTE_MOBILE = "05";//配偶联系电话
	
	
	public static class JjGroupCode
	{

		/**
		 * 工单状态
		 */
		public static final String APPSTATUSVIEW_NEW = "appstatusview_new";
		/**
		 * 撤消原因
		 */
		public static final String APP_REVOCATION = "app_revocation";
		
		/**家庭联系人*/
		public static final String CONTACT_RELATIVES = "contactRelatives";
		
		/**非家庭联系人*/
		public static final String CONTACT_NONRELATIVES = "contactNonRelatives";
		
		/**住房状况*/
		public static final String HOUSING_SITUATION = "housingSituation";
		
		/**职业*/
		public static final String OCCUPATION = "occupation";
		
		/**职位级别*/
		public static final String POSITION_LEVEL = "positionLevel";
		
		/**教育程度*/
		public static final String EDUCATION_LEVEL = "educationLevel";
		
		/**行业类别*/
		public static final String INDUSTRY_CATEGORY = "industryCategory";
		
		/**门店类型*/
		public static final String STORE_TYPE = "storeType";
		
		/** 单位性质 */
		public static final String UNIT_PROPERTY = "unitProperty";
		
		/** 还款类型 */
		public static final String REPAYMENT_TYPE = "repaymentType";
		
		/**是否购买保险 */
		public final static String BUYINSURANCE = "buyInsurance";
		
		/** 婚姻状态 */
		public final static String MARITAL_STATUS = "maritalStatus";
		
		/** 邮寄地址 */
		public final static String POST_ADDRESS = "postAddress";
		
		/** 通用是否判断 */
		public final static String YN_TYPE = "yntype";
		
		/** 联系人类别 */
		public final static String CONTACT_CATEGORY = "contactCategory";
		
		/** 现住地址与户籍 */
		public final static String ADDRE_REGIST = "addreRegist";
		
		/** 用户评价*/
		public final static String CUSTOMER_EVALUATE = "customerEvaluate";
		
		/** 贷款用途*/
		public static final String LOAN_USE_TYPE = "loan_use_type";
		/** 贷款类型*/
		public static final String LOAN_TYPE = "loan_type";
		
		/** 门店性质*/
		public final static String STORE_CHARACTER = "storeCharacter";
	}

	
	
	/**
	 * LN APP status table for DB Status
	 */
//	public final static String LN_APP_STATUS_B25 = "B25";// 工单状态表-确认交易
//	public final static String LN_APP_STATUS_C12 = "C12";
//	public final static String LN_APP_STATUS_B26 = "B26";// 工单状态表-保理已放款 - 待推送BUS

	/**
	 * LN APP state 
	 */
	public final static String LN_APP_STATE_30 = "30";// 工单状态-待上传资料
	public final static String LN_APP_STATE_11 = "11";// 工单状态-待审核
	public final static String LN_APP_STATE_31 = "31";// 工单状态-待确认交易
	public final static String LN_APP_STATE_32 = "32";// 工单状态-BUS确认
	public final static String LN_APP_STATE_35 = "35";// 工单状态-待保理放款
	public final static String LN_APP_STATE_36 = "36";// 工单状态-待BUS放款
	public final static String LN_APP_STATE_50 = "50";// 工单状态-保理放款成功
	public final static String LN_APP_STATE_01 = "01";// 工单状态-未提交
	public final static String LN_APP_STATE_70 = "70";// 工单状态-撤销
	public final static String LN_APP_STATE_13 = "13";// 工单状态-二次评分
    
	public final static String LN_APP_STATE_80 = "80";// 工单状态-拒绝
	public final static String LN_APP_STATE_81 = "81";// 工单状态-结束
	public final static String LN_APP_STATE_90 = "90";// 工单状态-数据异常
	
	public final static String LN_APP_STATE_20 = "20";// 工单状态-待上传资料
	
	public final static String LN_APP_STATE_18 = "18";// 待额度审批


	/**
	 * 附件渠道
	 */
	//工单管理
	public static final String ATTACH_CHANNEL_APP="app";
	//代扣变更
	public static final String ATTACH_CHANNEL_CHANGE="change";
	
	// 身份证校验中，属于已完成的工单的状态
	public static final String APP_COMPLETE_STATE = "50,70,80,81,90";
	
	public static final String COMMODITY_TYPE_OTHER = "其他";
	
	public static final String APP_CASH = "CASH";//现金贷
	public static final String APP_POS = "POS";//POS贷
	public static final String APP_AGR = "AGR";//农机贷
	
	public static final String BUS_PRODUCT_ID_ARRAY="270";
	
//	public static final String CARDIDCODE = "1000001";//
	
	
	public static final String ERROR_CODE = "9999";//系统异常
	public static final String BUS_NULL = "9998";//BUS返回结果为空
	public static final String PARMAER_NULL = "9994";//参数为空
	// 1000001=身份证正反面,1000002=银行卡+POS回单,1000005=社保卡
	public static final String ID_CARD = "1000001";
	public static final String BANK_CARD = "1000002";
	public static final String SALE_CUSTOM_CODE = "1000003";
	public static final String SOCIAL_CARD = "1000005";
	
	/**
	 * SC接口成功返回值
	 */
	public static final String SC_RESP_CODE_SUCCESS = "0000";
	/**
	 * SC工单查询接口对象
	 */
	public static final String SC_APPVO_NAME="lnAppVo";
	
	/**
	 * 资料类型:DBL:反保理模式(现金贷永远都是反保理),BL:保理模式
	 */
	public final static String CAPITAL_TYPE_DBL = "DBL";
	
	/**
	 * 资料类型:BL:保理模式
	 */
	public final static String CAPITAL_TYPE_BL = "BL";
	
	/**
	 * 风控配置文件
	 */
	public final static String FILE_NAME_FK = "fk";
	
	
	public final static String CHANNEL_CODE_KEY = "_channel_code";
	
	public final static String SWITCH_OPEN = "Y";
	
	/**
	 * 
	 *<p>
	 * 上传附件类型
	 *</p>
	 * @author songning
	 * @datetime 2016年5月4日 下午12:24:38
	 *
	 */
	public static class AttachType
	{
		/**
		 * 必填附件
		 */
		public static final String REQUIRED = "required";
		/**
		 * 可选附件
		 */
		public static final String OPTIONAL = "optional";
		/**
		 * 多选一附件
		 */
		public static final String MULTISELECT = "multiselect";
	}
	
	public static final String PROID = "cn4c86b26eb1b10a857db453125b1b10";
    public static final String FUNCODE = "PFC001";
    
    public static final String CARDIDCODE = "1000001";//
	public static final String SALECUSTOMCODE = "1000003";
	
	public static final String RE_SEND_WK_REDIS = "RE_SEND_WK_FLAG";
	public static final String RE_SEND_WK_RESULT = "RE_SEND_WK_RESULT";
	public static final String RE_SEND_WK_N = "N";
	public static final String RE_SEND_WK_Y = "Y";
	
	//富友开户结果 fuYouResult 1:成功，2:失败,3:异常
	public static final String FUIOU_RESULT_SUCCESS="1";
	
	public static final String FUIOU_RESULT_FAIL="2";
	
	public static final String FUIOU_RESULT_ERROR="3";
	
	//待中资料上传类型
	public static final String MID_LOAN = "Mid_Loan";
	
	public static final String COMMON = "普通";
	
	/** 工单不需要贷中资料上传 **/
	public static final String IS_UPLOAD_ATTACH_NU = "NU";
	
	/** 工单不需要贷中资料上传标志 **/
	public static final String TRADE_NO_CODE_31_NO = "B16";
	
	/** 工单需要贷中资料上传标志 **/
	public static final String TRADE_NO_CODE_31_YES = "B21";
	
	/** 系统评分结束 - 自动通过 **/
	public static final String TRADE_NO_CODE_A18 = "A18";
	
	/** 二次评分 - 自动通过 **/
	public static final String TRADE_NO_CODE_A38 = "A38";
	
	/** 专家审核 - 手动通过 **/
	public static final String TRADE_NO_CODE_A42 = "A42";
	
	//Add by wuyihao 20170605 额度系统需求 START
	/** 额度申请 - 成功  18-20 **/
	public static final String TRADE_NO_CODE_A46 = "A46";
	
	/** 系统评分结束 - 自动通过  11-18 **/
	public static final String TRADE_NO_CODE_A20 = "A20";
	
	/** 二次评分 - 自动通过 13-18 **/
	public static final String TRADE_NO_CODE_A36 = "A36";
	
	/** 专家审核 - 手动通过  14-18 **/
	public static final String TRADE_NO_CODE_A43 = "A43";
	
	//Add by wuyihao 20170605 额度系统需求 END
	
	/** SC 渠道号 **/
	public static final String SC_CHANNEL_CODE = "sc.channel.code";
	
	/** 参数信息 **/
	public static final String PARAMETER_NAME = "parameter";
	public static final String PARAMETER_STORE_CHARACTER = "store.character.";
	public static final String PARAMETER_OCCUPATION = "occupation.";
	public static final String PARAMETER_STORE_TYPE = "store.type.";
	public static final String PARAMETER_CONTACT_RELATIVES = "contact.relatives.";
	public static final String PARAMETER_EDUCATION_LEVEL = "education.level.";
	public static final String PARAMETER_HOUSING_SITUATION = "housing.situation.";
	public static final String PARAMETER_INDUSTRY_CATEGORY = "industry.category.";
	public static final String PARAMETER_UNIT_PROPERTY = "unit.property.";
	public static final String PARAMETER_POSITION_LEVEL = "position.level.";
	public static final String PARAMETER_GOOD_CATEGORY = "good.category.";
	public static final String PARAMETER_REPAYMENT_TYPE = "repayment.type.";
	public static final String PARAMETER_CONTRACT_TYPE = "contract.type.";
	
	/** 重发风控 Redis 标识**/
	public static final String RE_SEND_FK_REDIS = "RE_SEND_FK_FLAG";
	public static final String RE_SEND_FK_REDIS_FLAG_Y = "Y";
	
	/** 人工撤销  **/
	public static final String TRADE_NO_CODE_P01 = "P01";
	public static final int MANUAL_REVOCATION_TYPE = -2;  // 撤销工单类型：人工撤销
	public static final String MANUAL_REVOCATION_DESC = "人工撤销";
	
	
	
	/** 调用外联HYPER系统编码  **/
	public static final String HYPER_SYSTEM_CODE = "HM";
	
	public static final String HYPER_SYSTEM_NAME = "超级管理系统";
	/**  HYPER调用外联系统成功编码  **/
	public static final String HYPER_CALL_OUTLINK_SUCCESS = "200";
	/**  HYPER调用北京系统成功编码   **/
	public static final String HYPER_CALL_BJ_SUCCESS = "0000";
	
	/**  HYPER调用北京系统放款确认  放款成功编码   **/
	public static final String HYPER_CALL_BJ_MAKE_LOAN_SUCCESS = "F0243";
	
	/**  HYPER系统是否直连调用北京接口   之   直连北京   **/
	public static final String HYPER_DIRECT_CALL_BJ_SERVICE = "Y";
	
	/**  HYPER系统是否直连调用北京接口   之   键名称   **/
	public static final String BUS_DIRECT_BJ_LINK_SWITCH_KEY = "com.hm.bus.direct.link.switch";
}
