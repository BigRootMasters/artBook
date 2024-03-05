package org.manager.client.mapper.dao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 
 * @TableName user_info
 */

@ToString(callSuper = true)
@Setter
@Getter
public class UserInfoDO extends BaseDO implements Serializable {

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户手机号
     */
    private String phoneNumber;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 用户号
     */
    private String userNo;

    private static final long serialVersionUID = 1L;
}