package com.demo.biz.entity.base;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

@Data
public class UsUserInfo implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 头像
     */
    private String headImage;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 性别（0保密，1男，2女）
     */
    private Integer sex;

    /**
     * 地区
     */
    private Integer region;

    /**
     * 个性签名
     */
    private String signature;

    /**
     * 用户类型（1普通用户，2达人用户)
     */
    private Byte type;

    /**
     * 用户种类
     */
    private String kindCode;

    /**
     * r热度
     */
    private Integer hot;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}