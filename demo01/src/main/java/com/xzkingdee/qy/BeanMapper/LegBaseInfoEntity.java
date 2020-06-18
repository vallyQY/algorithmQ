package com.xzkingdee.qy.BeanMapper;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Description: 法人基础信息
 *
 * @author libin
 * Created on 2019/6/17
 **/
@Data
public class LegBaseInfoEntity implements Serializable {

    public static final String FIELD_ZCZB_NAME = "zczb";
    public static final String FIELD_HYDM_NAME = "hydm";
    public static final String FIELD_CLRQ_NAME = "clrq";

    private String id;

    /**
     * 名称-t:string-c:text
     */
    private String compName;

    /**
     * 证件类型
     */
    private String idType;

    /**
     * 证件号码
     */
    private String idCode;


    /**
     * 社会信用码
     */
    private String idShxym;

    /**
     * 工商注册号
     */
    private String idGszc;

    /**
     * 组织机构代码
     */
    private String idZzjg;

    /**
     * 税务登记号
     */
    private String idSwdj;

    /**
     * 事业单位证书号
     */
    private String idSydw;

    /**
     * 社会组织登记号
     */
    private String idShzz;

    /**
     * 其他
     */
    private String idOther;

    /**
     * 自然人主体识别信息
     */
    private String personId;
    /**
     * 法定代表人
     */
    private String fddbr;

    /**
     * 法定代表人证件类型
     */
    private String fddbrzjlx;

    /**
     * 法定代表人证件号码
     */
    private String fddbrzjhm;

    /**
     * 国别（地区）
     */
    private String gb;

    /**
     * 单位性质及类别
     */
    private String dwxz;

    /**
     * 住所
     */
    private String zs;

    /**
     * 邮政编码
     */
    private String yzbm;

    private BigDecimal zczb;

    /**
     * 注册资本币种
     */
    private String zczbbz;

    /**
     * 行业代码
     */
    private String hydm;

    /**
     * 类型
     */
    private String lx;

    /**
     * 核算方式
     */
    private String hsfs;

    /**
     * 经营范围
     */
    private String jyfw;

    /**
     * 登记状态
     */
    private String djzt;

    /**
     * 主管单位、举办单位
     */
    private String zgdw;

    /**
     * 经费来源
     */
    private String jfly;

    /**
     * 活动地域
     */
    private String hddy;

    /**
     * 登记机关
     */
    private String djjg;

    /**
     * 成立日期
     */
    private LocalDate clrq;

    /**
     * 核准日期
     */
    private LocalDate hzrq;

    /**
     * 有效起始日期
     */
    private LocalDate yxqzrq;

    /**
     * 有效截止日期
     */
    private LocalDate yxjzrq;

    /**
     * 变更日期
     */
    private LocalDate bgrq;

    /**
     * 资源标识符
     */
    private String resourceKey;
    /**
     * 采集人
     */
    private String createBy;

    /**
     * 采集人名称
     */
    private String createName;

    /**
     * 采集时间
     */
    private LocalDateTime createDate;

    /**
     * 采集部门
     */
    private String createDept;

    /**
     * 采集部门名称
     */
    private String createDeptName;

    /**
     * 修改人
     */
    private String updateBy;

    /**
     * 修改人名称
     */
    private String updateName;

    /**
     * 修改时间
     */
    private LocalDateTime updateDate;

    /**
     * 信息状态-exp:无效/有效;0/1
     */
    private String flag;

    /**
     * 验证失败原因
     */
    private String checkErrMsg;

    /**
     * 批量导入ID
     */
    private String importId;

    /**
     * 批量验证标识-exp:验证不通过/验证通过/导入完毕;0/1/9
     */
    private String importCheckFlag;

    private Integer version;

    private Integer totalFieldNum;

    private Integer nonNullNum;
}
