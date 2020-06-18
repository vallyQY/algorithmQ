package com.xzkingdee.qy.BeanMapper;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Description: 法人基信息
 *
 * @author libin created on 2019/9/27
 */
@EqualsAndHashCode()
@JsonInclude(value = JsonInclude.Include.NON_EMPTY)
@Data
public class LegBaseInfoDto{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    /**
     * 名称-t:string-c:text
     */
    private String compName;


    /**
     * 法定代表人
     */
    private String fddbr;

    /**
     * 自然人主体识别信息
     */
    private String personId;
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

    /**
     * 注册资本
     */
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

    private Integer totalFieldNum;

    private Integer nonNullNum;

}
