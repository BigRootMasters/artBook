package org.manager.client.web.vo;

import lombok.Data;

/**
 * desc
 *
 * @author lk
 * @date 2024/3/4 01:39
 */
@Data
public class RegisterUserRes {

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
}
