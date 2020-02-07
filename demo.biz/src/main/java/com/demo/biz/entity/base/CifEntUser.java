package com.demo.biz.entity.base;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class CifEntUser implements Serializable {
    /**
     * 用户编号
     */
    private String euserId;

    /**
     * 描述
     */
    private String description;

    /**
     * 状态：0:正常 1：冻结  2：删除
     */
    private String userState;

    /**
     * 中文姓名
     */
    private String userName;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 密码盐
     */
    private String salt;

    /**
     * 密码（MD5）
     */
    private String password;

    /**
     * 手机号
     */
    private String mobileNo;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 证件号
     */
    private String idNo;

    /**
     * 证件类型：01-中国居民身份证，02-护照，03-港、澳居民往来内地通行证，04-台湾居民来往大陆通行证
     */
    private String idType;

    /**
     * 渠道编码
     */
    private String terminalCode;

    /**
     * 门户推送的UserId，为了兼容历史数据
     */
    private String portalId;

    /**
     * 创建人ID
     */
    private String creatorId;

    /**
     * 创建时间(yyyy-MM-dd HH:mm:ss)
     */
    private Date createTime;

    /**
     * 修改人ID
     */
    private String editorId;

    /**
     * 修改时间(yyyy-MM-dd HH:mm:ss)
     */
    private Date editTime;

    /**
     * 性别
     */
    private String sex;

    /**
     * 职位
     */
    private String position;

    /**
     * 备注
     */
    private String remark;

    /**
     * 登录令牌，永久登录使用，预留字段
     */
    private String token;

    private static final long serialVersionUID = 1L;
}