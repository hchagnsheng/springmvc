package com.nongke.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 系统常量
 * 
 * @author hcs
 *         2016-11-30
 */
public class Constants {

    public static final String SUCCESS = "success";

    public static final String MESSAGE = "mes";

    public static final String CHANGE_NUMBER = "changeNum";

    public static final String ERRORCODE = "retcode";

    /**
     * 默认密码
     */
    public static final String INIT_PASSWORD = "123456";

    /**
     * 管理员角色
     */
    public static final String SYS_ADMIN_CODE = "SYS_ADMIN";

    /**
     * 粮食银行管理员角色
     */
    public static final String BANK_MANAGER_CODE = "MASTER";
    /**
     * 报单中心角色代码
     */
    public static final String FORM_USERS_CODE = "FORM_USERS";
    /**
     * 普通用户角色
     */
    public static final String COMMON_USER_CODE = "COMMON_USER";

    /**
     * 有效
     */
    public static final String VALID_STATUS = "1";
    /**
     * 无效
     */
    public static final String INVALID_STATUS = "0";
    /**
     * 正常
     */
    public static final String SYSUSER_UNLOCK_STATUS = "1";
    /**
     * 锁定
     */
    public static final String SYSUSER_LOCK_STATUS = "0";
    /**
     * 无限期持有
     */
    public static final String INDEFINITE_HOLD_STATUS = "1";
    /**
     * 有限期持有
     */
    public static final String LIMIT_HOLD_STATUS = "2";
    /**
     * 系统 前台
     */
    public static final String SYSTEM_FOREGROUND = "1";
    /**
     * 系统 后台
     */
    public static final String SYSTEM_BACKSTAGE = "0";
    /**
     * sysuser.type普通用户
     */
    public static final String SYSUSER_TYPE_COMMON = "0";
    /**
     * sysuser.type企业用户
     */
    public static final String SYSUSER_TYPE_ENTERPRISE = "1";

    /**
     * sysuser.type管理员用户
     */
    public static final String SYSUSER_TYPE_MANAGE = "2";

    /**
     * sysuser.type粮食银行
     */
    public static final String SYSUSER_TYPE_FOODBANK = "3";

    /**
     * sysuser.type系统平台
     */
    public static final String SYSUSER_TYPE_PLATFORM = "4";

    /**
     * 审核状态.未审核
     */
    public static final String AUDIT_STATUS_NOT_AUDIT = "0";
    /**
     * 审核状态.审核通过
     */
    public static final String AUDIT_STATUS_AUDIT_PASSED = "1";
    /**
     * 审核状态.审核未通过
     */
    public static final String AUDIT_STATUS_AUDIT_NOT_PASS = "2";

    /**
     * 被删除
     */
    public static final String IS_DELETED = "1";
    /**
     * 没有被删除
     */
    public static final String NOT_DELETED = "0";

    /**
     * 商品缩略图上传路径
     * hcs
     * 2016-12-12
     */
    //public final static String UPLOAD = "D:/apache-tomcat-8.0.38/webapps/upload/";
    public final static String UPLOAD = "/usr/local/tomcat9001/webapps/nfs/upload/";

    /**
     * 商品分类初始化一级分类pid
     */
    public final static Integer GOODSTYPE_INIT_PID = 0;

    /**
     * 商品分类初始化等级
     */
    public final static String GOODSTYPE_INIT_RANK = "1";

    /**
     * 商品分类等级 2
     */
    public final static int GOODSTYPE_TWO_RANK = 2;

    /**
     * 商品分类等级 4
     */
    public final static int GOODSTYPE_FOUR_RANK = 4;
    /**
     * 商品分类初始化编码
     */
    public final static String GOODSTYPE_INIT_CODE = "2016";

    /**
     * 商品分类不是叶子节点
     */
    public final static String GOODSTYPE_ISLEAF_NO = "0";
    /**
     * 商品分类是叶子节点
     */
    public final static String GOODSTYPE_ISLEAF_YES = "1";

    /**
     * 置顶
     */
    public static final String STICK_TOP = "1";
    /**
     * 未置顶0
     */
    public static final String STICK_TOP_NOT = "0";
    /**
     * 是
     */
    public static final String YES_VALUE = "1";
    /**
     * 否
     */
    public static final String NO_VALUE = "0";

    /**
     * 用户充值
     */
    public static final String POINTFLOW_IN = "0";
    /**
     * 企业获得推广积分
     */
    public static final String POINTFLOW_ENTER_EXTEND = "1";
    /**
     * 平台返奖给客户
     */
    public static final String POINTFLOW_REWARD_OUT = "2";
    /**
     * 用户转账
     */
    public static final String POINTFLOW_BETWEEN_USER = "3";
    /**
     * 平台结算至企业
     */
    public static final String POINTFLOW_SETTLEMENT_OUT = "4";
    /**
     * 推广积分发送
     */
    public static final String POINTFLOW_EXTENDED = "5";
    /**
     * 用户支付 支付积分至平台
     */
    public static final String POINTFLOW_PAYMENT = "6";

    /**
     * 企业以提现为目的 转让积分给平台
     */
    public static final String POINTFLOW_WITHDRAW = "7";

    /**
     * 企业以提现为目的 转让积分给平台 但是审核未通过返回给企业
     */
    public static final String POINTFLOW_WITHDRAW_RETURN = "17";
    /**
     * 平台销毁积分
     */
    //public static final String POINTFLOW_DESTROYT = "8";
    /**
     * 易物交易师o2o结算
     */
    //public static final String POINTFLOW_MASTER = "9";
    /**
     * 报单中心借平台给用户充值
     */
    public static final String POINTFLOW_FORMCENTER = "10";
    /**
     * 信用积分充值
     */
    public static final String POINTFLOW_CREDIT_IN = "12";

    /**
     * 通过POS机充值
     */
    public static final String POS_POINTFLOW_RECHARGE = "13";
    /**
     * pos 地面店消费
     */
    public static final String POS_POINTFLOW_O2OTRADE = "14";
    /**
     * 用户通过POS机转账
     */
    public static final String POINTFLOW_BETWEEN_USER_POS = "15";

    /**
     * 绑定会员卡赠送积分
     */
    public static final String POS_COMPLIMENT_SCORE = "16";
    
    /**
     * 财务给普通用户充值
     */
    public static final String CAIWU_CHARGE_SCORE = "18";
    /**
     * 财务给普通用户扣除积分
     */
    public static final String CAIWU_DEBUT_SCORE = "19";

    /**
     * 单个用户未支付订单数量上限
     */
    public final static int ORDERS_SUM_LIMIT = 10;

    /**
     * 订单状态
     * 未支付0
     */
    public static final String ORDER_NOT_PAY = "0";
    /**
     * 订单状态
     * 未发货1
     */
    public static final String ORDER_NOT_SENDGOODS = "1";
    /**
     * 订单状态
     * 未收货2
     */
    public static final String ORDER_NOT_GETGOODS = "2";
    /**
     * 订单状态
     * 订单已取消3
     */
    public static final String ORDER_CANCEL = "3";
    /**
     * 订单状态
     * 订单已完成 但未评价4
     */
    public static final String ORDER_SUCCESS_NOT_JUDGE = "4";
    /**
     * 订单状态
     * 订单已完成且评价5
     */
    public static final String ORDER_JUDGE_SUCCESS = "5";
    /**
     * 订单状态
     * 地面店订单标识6
     */
    public static final String ORDER_O2O = "6";
    /**
     * 订单状态
     * 交易师支付现金给地面店7
     */
    public static final String ORDER_PAY_MONEY = "7";
    /**
     * 订单状态
     * o2o支付中
     */
    public static final String ORDER_PAY_MONEY_ING = "8";
    /**
     * 订单状态
     * o2o已结算
     */
    public static final String ORDER_PAY_MONEY_ED = "9";

    /**
     * 已经返奖状态
     */
    public static final String ALREADY_REWARD_STATUS = "1";
    /**
     * 未返奖状态
     */
    public static final String NOT_YET_REWARD_STATUS = "2";

    /**
     * 初始桶大小常量编码
     */
    public static final String REWARD_BASE_SCORE_CODE = "REWARD_BASE_SCORE";
    /**
     * 增长比例大小常量编码
     */
    public static final String GROWTH_RATIO_CODE = "GROWTH_RATIO";
    /**
     * 返奖桶数量code
     */
    public static final String NUMBER_BUCKET = "NUMBER_BUCKET";

    /**
     * 商品返奖额度比例
     */
    public static final String CONSTANTS_FJEDBL = "FJEDBL";
    /**
     * 商品返奖积分比例
     */
    public static final String CONSTANTS_FJJFBL = "FJJFBL";
    /**
     * 平台主体返奖抽成比例
     */
    public static final String CONSTANTS_PTZTFJCCBL = "PTZTFJCCBL";
    /**
     * 平台主体推广抽成比例
     */
    public static final String CONSTANTS_PTZTTGCCBL = "PTZTTGCCBL";
    /**
     * 平台主体结算抽成比例
     */
    public static final String CONSTANTS_PTZTJSCCBL = "PTZTJSCCBL";
    /**
     * O2O结算比例
     */
    public static final String CONSTANTS_O2O_JYS_JSBL = "O2O_JYS_JSBL";
    /**
     * O2O推广比例
     */
    public static final String CONSTANTS_O2O_TGBL = "O2O_TGBL";
    /**
     * O2O推广额度增长比例
     */
    public static final String CONSTANTS_O2O_TGEDZZBL = "O2O_TGEDZZBL";

    /**
     * 商品的审核通过状态 hcs
     */
    public static final String GOODS_STATUS_YES = "1";
    /**
     * 商品的审核平台待审状态 hcs
     */
    public static final String GOODS_STATUS_PINGTAI = "2";
    /**
     * 商品的审核上级企业待审状态 hcs
     */
    public static final String GOODS_STATUS_PARENTENTERPRISE = "3";
    /**
     * 商品的审核未通过状态 hcs
     */
    public static final String GOODS_STATUS_NO = "4";
    /**
     * 商品的上架状态 hcs
     */
    public static final String GOODS_ISONLINE_YES = "1";
    /**
     * 商品的下架状态 hcs
     */
    public static final String GOODS_ISONLINE_NO = "0";
    /**
     * 商品的默认优先级别 hcs
     */
    public static final String GOODS_PRIORITY_INIT = "0";
    /**
     * 提现已处理 hcs
     */
    public static final String WITHDRAW_STATUS_YES = "1";
    /**
     * 提现未处理 hcs
     */
    public static final String WITHDRAW_STATUS_NO = "0";

    /**
     * 正在支付的用户Set
     */
    public final static String REDIS_PAYING_ORDERFORM_NUM_SET_NAME = "orderFromNumSet";

    /**
     * 产品分类 粮食code
     */
    public final static String GOODS_TYPE_FOOD_CODE = "2040";
    /**
     * 产品分类 百货code
     */
    public final static String GOODS_TYPE_GENERAL_MERCHANDISE_CODE = "2116";
    /**
     * 产品分类 服装code
     */
    public final static String GOODS_TYPE_CLOTHING_CODE = "2168";
    /**
     * 产品分类 五金code
     */
    public final static String GOODS_TYPE_HARDWARE_CODE = "2020";
    /**
     * 产品分类 家具code
     */
    public final static String GOODS_TYPE_FURNITURE_CODE = "2024";
    /**
     * 产品分类 文体code
     */
    public final static String GOODS_TYPE_SPORTS_CODE = "2028";
    /**
     * 产品分类 健康code
     */
    public final static String GOODS_TYPE_HEALTH_CODE = "2032";

    /**
     * 首页七层展示的分类信息
     */
    public final static List<String> INDEX_GOODS_TYPE_LIST = new ArrayList<String>(Arrays.asList(GOODS_TYPE_FOOD_CODE,
            GOODS_TYPE_GENERAL_MERCHANDISE_CODE, GOODS_TYPE_CLOTHING_CODE, GOODS_TYPE_HARDWARE_CODE,
            GOODS_TYPE_FURNITURE_CODE, GOODS_TYPE_SPORTS_CODE, GOODS_TYPE_HEALTH_CODE));

    /**
     * 属性是否在页面显示 显示
     */
    public static final Integer ATTRIBUTE_DISPLAY = 1;
    /**
     * 属性是否在页面显示 不显示
     */
    public static final Integer ATTRIBUTE_NODISPLAY = 0;

    /**
     * 默认收货地址:1
     */
    public final static String DELIVERY_ADDRESS_IS_DEFAULT = "1";
    /**
     * 非默认收货地址:0
     */
    public final static String DELIVERY_ADDRESS_NOT_DEFAULT = "0";

    /**
     * 上级反奖权重code
     */
    public static final String FACOMMONUSER_WEIGHT_CODE = "FACOMMONUSER_WEIGHT";
    /**
     * 上上级反奖权重code
     */
    public static final String GRANDPACOMMONUSER_WEIGHT_CODE = "GRANDPACOMMONUSER_WEIGHT";
    /**
     * 上上上级反奖权重code
     */
    public static final String GREATGRANDPACOMMONUSER_WEIGHT_CODE = "GREATGRANDPACOMMONUSER_WEIGHT";

    /**
     * 接口用户名
     */
    public static final String WS_NAME = "admin";
    /**
     * 接口密码
     */
    public static final String WS_PASSWORD = "admin";

    /**
     * 服务器IPList
     */
    public static final List<String> IP_LIST = new ArrayList<String>(
            Arrays.asList("10.25.197.58", "10.25.112.12", "10.30.47.1", "127.0.0.1", "59.110.147.138"));

    /**
     * 自定义商品分类 一般商品
     */
    public static final Integer GOODS_DIFINEDTYPE_GENERAL = 1;
    /**
     * 自定义商品分类 粮油
     */
    public static final Integer GOODS_DIFINEDTYPE_GRAIN = 2;
    /**
     * 自定义商品分类 肉类
     */
    public static final Integer GOODS_DIFINEDTYPE_MEAT = 3;
    /**
     * 自定义商品分类 海鲜
     */
    public static final Integer GOODS_DIFINEDTYPE_SEAFOOD = 4;
    /**
     * 自定义商品分类 套餐
     */
    public static final Integer GOODS_DIFINEDTYPE_SUIT = 5;
    /**
     * 自定义商品分类 其他
     */
    public static final Integer GOODS_DIFINEDTYPE_OTHER = 6;

    /**
     * 交易积分量趋势图统计周期
     */
    public static final String CONSTANT_STATISTICAL_PERIOD = "TTVGSCI";
    /**
     * 出入池默认统计周期间隔
     */
    public static final Integer STATISTICAL_PERIOD_INIT_DAY = 30;

    /**
     * 企业提现类型
     */
    public static final String WITHDRAW_TYPE_ENTERPRISE = "1";
    /**
     * 地面店提现类型
     */
    public static final String WITHDRAW_TYPE_O2O = "3";

    /**
     * 企业提现状态 审批中
     */
    public final static String WITHDRAW_TJ = "0";
    /**
     * 企业提现状态 通过
     */
    public final static String WITHDRAW_TG = "1";
    /**
     * 企业提现状态 未通过
     */
    public final static String WITHDRAW_WTG = "2";
    /**
     * 结算状态
     */
    public static final String SETTLE_STATUS_YES = "1";
    /**
     * 结算状态
     */
    public static final String SETTLE_STATUS_NO = "0";

    /**
     * 默认现金单位
     */
    public final static String DEFAULT_MONEY_UNIT = "CNY";
    /**
     * 正在支付的用户Set
     */
    public final static String REDIS_PAYING_SET_NAME = "payingSet";

    /**
     * 正在提现的用户Set
     */
    public final static String REDIS_WITHDRAWALING_SET_NAME = "withdrawalingSet";

    /**
     * 密钥
     */
    public static final String DES_KEY = "znshop!@#$%";
    /**
     * 后台登陆用户的redis sessionlist 名称
     */
    public static final String BACK_LOGIN_SESSION = "backLoginSession";

    /**
     * 后台登陆用户的redis sessionINfo 名称
     */
    public static final String BACK_LOGIN_SESSION_USER_INFO = "backLoginSessionInfo";

    /**
     * 返奖类型:一般积分(一般订单)
     */
    public static final Integer REWARD_TYPE_COMMON = 1;

    /**
     * 返奖类型:信用积分（信用订单）
     */
    public static final Integer REWARD_TYPE_CREDIT = 2;

    /**
     * 信用企业角色
     */
    public static final String ROLE_CREDIT_ENTERPRISE = "CREDIT_ENTERPRISE";

    /**
     * 异议期常量code
     */
    public static final String EINSPRUCH_CODE = "ZLYYQ";

    /**
     * 平台收入类型 抽成
     */
    public static final String INCOME_TYPE_PERCENTAGE = "1";
    /**
     * 平台收入类型 推广
     */
    public static final String INCOME_TYPE_EXTEND = "2";
    /**
     * 默认1级站推荐码
     */
    public static final String DEFAULT_CODE = "A01";

    /**
     * 上级企业返奖权重code
     */
    public static final String QYTGJFBL = "QYTGJFBL";
    /**
     * 信用积分充值比例code
     */
    public static final String CREDIT_SCORE_RECHARGE_RATE = "CREDIT_SCORE_RECHARGE_RATE";

    /**
     * 信用单元比率
     */
    public static final String CREDIT_UNIT_RATE = "CREDIT_UNIT_RATE";

    /**
     * 信用套餐商品ID code
     * 不能直接使用，需加上套餐code
     * 如CREDIT_SUIT_GOODS_IDS1
     */
    public static final String CREDIT_SUIT_GOODS_IDS = "CREDIT_SUIT_GOODS_IDS";

    /**
     * 信用合同
     * 初始创建1
     */
    public static final String CONTRACT_STATE_INIT = "1";
    /**
     * 信用合同
     * 等待确认2
     */
    public static final String CONTRACT_STATE_WAIT_CONFIRM = "2";
    /**
     * 信用合同
     * 已确认3
     */
    public static final String CONTRACT_STATE_CONFIRMED = "3";
    /**
     * 信用合同
     * 作废4
     */
    public static final String CONTRACT_STATE_INVALID = "4";
    /**
     * 提交工单时，附件的上传地址
     */
    public static final String ATTACHMENT_PATH = "/usr/local/tomcat9001/webapps/nfs/attachment/";
    /**
     * 工单开始状态
     */
    public static final String WORKORDER_STATUS_START = "0";
    /**
     * 工单中间状态
     */
    public static final String WORKORDER_STATUS_MID = "1";
    /**
     * 工单结束状态
     */
    public static final String WORKORDER_STATUS_END = "2";
    /**
     * 普通用户默认推广额度
     */
    public static final Long EXTEND_LIMIT_DEFAULT = 400000L;

    /**
     * 用户返奖抽成比例
     */
    public static final String REWARD_CUT_RATE_CODE = "REWARD_CUT_RATE";
    /**
     * 信用积分消费用户返奖抽成比例
     */
    public static final String CREDIT_REWARD_CUT_RATE_CODE = "CREDIT_REWARD_CUT_RATE";

    /**
     * 平台收入类型 普通积分 返奖
     */
    public static final String INCOME_TYPE_REWARD = "3";

    /**
     * 平台收入类型 积分 信用返奖
     */
    public static final String INCOME_TYPE_CREDIT_REWARD = "4";

    /**
     * 前台报单中心用户统一展示电话号
     */
    public static final String FORM_USER_PHONE = "010-57155838";
    /**
     * app aes 加密 key值
     */
    public static final String AES_KEY = "long_)*@^ANDroid";

    /**
     * pos机未绑定
     */
    public static final String POS_MACHINE_STATE_UNBIND = "0";
    /**
     * pos机已绑定
     */
    public static final String POS_MACHINE_STATE_BINDED = "1";

    /**
     * 会员卡激活状态 正常
     */
    public static final String MENBERCARD_STATUS_YES = "0";
    /**
     * 会员卡激活状态 锁定
     */
    public static final String MENBERCARD_STATUS_NO = "1";

    /**
     * 会员卡激活状态 绑定
     */
    public static final String MENBERCARD_BINDSTATUS_YES = "1";

    /**
     * 会员卡激活状态 未绑定
     */
    public static final String MENBERCARD_BINDSTATUS_NO = "0";

    /**
     * 错误码 :成功
     */
    public static final String ERRORCODE000000 = "000000";

    /**
     * 错误码 :用户不存在
     */
    public static final String ERRORCODE000001 = "000001";

    /**
     * 错误码 :信用卡绑定失败
     */
    public static final String ERRORCODE000002 = "000002";

    /**
     * 错误码 :支付失败
     */
    public static final String ERRORCODE000003 = "000003";

    /**
     * 错误码 :充值失败
     */
    public static final String ERRORCODE000004 = "000004";

    /**
     * 错误码 :转让失败
     */
    public static final String ERRORCODE000005 = "000005";

    /**
     * 错误码 :查询失败
     */
    public static final String ERRORCODE000006 = "000006";

    /**
     * 错误码 :支付卡未激活
     */
    public static final String ERRORCODE000007 = "000007";

    /**
     * 错误码 :Token已失效
     */
    public static final String ERRORCODE000008 = "000008";

    /**
     * 错误码 :登记失败
     */
    public static final String ERRORCODE000009 = "000009";

    /**
     * 错误码 :信用卡绑定手机验证码错误
     */
    public static final String ERRORCODE000010 = "000010";

    /**
     * 错误码 :参数错误
     */
    public static final String ERRORCODE000011 = "000011";
    /**
     * 错误码 :操作过于频繁，请稍后再试
     */
    public static final String ERRORCODE000012 = "000012";

    /**
     * 错误码 :已绑定信用卡
     */
    public static final String ERRORCODE000013 = "000013";
    /**
     * 错误码 :用户会员卡绑定信息不正确
     */
    public static final String ERRORCODE000014 = "000014";
    /**
     * 错误码 :充值积分异常
     */
    public static final String ERRORCODE000015 = "000015";
    /**
     * 错误码 :缺少POS机唯一码
     */
    public static final String ERRORCODE000016 = "000016";

    /**
     * 错误码 :POS状态异常
     */
    public static final String ERRORCODE000017 = "000017";

    /**
     * 错误码 :POS已经注册
     */
    public static final String ERRORCODE000018 = "000018";
    /**
     * 错误码 :该用户不可绑定或用户不存在
     */
    public static final String ERRORCODE000019 = "000019";
    /**
     * 错误码：token不存在
     */
    public static final String ERRORCODE000021 = "000021";
    /**
     * 错误码：验证码错误
     */
    public static final String ERRORCODE000022 = "000022";
    /**
     * 错误码：会员卡不存在
     */
    public static final String ERRORCODE000023 = "000023";
    /**
     * 错误码：积分不足
     */
    public static final String ERRORCODE000024 = "000024";
    /**
     * 错误码：用户被锁定
     */
    public static final String ERRORCODE000025 = "000025";
    /**
     * 错误码：接收方不存在
     */
    public static final String ERRORCODE000026 = "000026";
    /**
     * 错误码：系统错误
     */
    public static final String ERRORCODE000027 = "000027";
    /**
     * 错误码：登录信息不正确
     */
    public static final String ERRORCODE000028 = "000028";
    /**
     * 错误码：POS机未注册
     */
    public static final String ERRORCODE000029 = "000029";
    /**
     * 绑定信用卡生成TOKEN失效时间
     */
    public static final Integer TOKEN_FAILURE_TIME = 15;

    /**
     * 绑定信用卡默认充值
     */

    public static final Long BINDING_SCORE = 100L;
    /**
     * app接口参数类型 积分转账 0
     */
    public static final String APP_PARAMS_TYPE_POINTS_TRANSFER = "0";
    /**
     * app接口参数类型 积分充值 1
     */
    public static final String APP_PARAMS_TYPE_POSITS_RECHARGE = "1";
    /**
     * app接口参数类型 注册 2
     */
    public static final String APP_PARAMS_TYPE_REGIST = "2";
    /**
     * app接口参数类型 O2O消费 3
     */
    public static final String APP_PARAMS_TYPE_O2O_CONSUME = "3";
    /**
     * app接口参数类型 普通订单消费 4
     */
    public static final String APP_PARAMS_TYPE_ONLINE_CONSUME = "4";
    /**
     * 财务给用户充值积分
     */
    public static final Integer CAIWU_OPERATEUSER_TYPE_CHARGE=1;
    /**
     * 财务扣除用户积分
     */
    public static final Integer CAIWU_OPERATEUSER_TYPE_DEBUT=2;
    /**
     * 财务专员的用户角色
     */
    public static final String CAIWU_ROLE_CODE = "FINANCE_MANAGER";
    /**
     * 禁用的手机号归属地--常量代码
     */
    public static final String BANNED_PHONE_NUMBER_PROVS_AND_CITYS="BANNED_PHONE_NUMBER_PROVS_AND_CITYS";
    /**
     * 手机号归属地查询接口AppCode--常量代码
     */
	public static final String Phone_Number_Attribution_Place_API_CODE = "Phone_Number_Attribution_Place_API_CODE";
	/**
	 * 禁用手机号归属地查询接口标记
	 */
	public static final String FORBIDDEN_BANNED_PHONE_NUMBER_PROVS_AND_CITYS="forbidden";
}
