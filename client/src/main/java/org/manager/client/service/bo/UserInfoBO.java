package org.manager.client.service.bo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * desc 用户信息BO
 *
 * @author lk
 * @date 2024/3/4 01:48
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserInfoBO extends BaseBO {

    private static final long serialVersionUID = -103213080414552813L;

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
