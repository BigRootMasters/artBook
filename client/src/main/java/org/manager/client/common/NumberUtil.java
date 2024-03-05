package org.manager.client.common;

/**
 * desc 生成数字序列号的工具类
 *
 * @author lk
 * @date 2024/3/4 02:04
 */
public class NumberUtil {

    //固定用户号为9位
    private static final Long INIT_USER_NO = 100000000L;

    /**
     * 生成用户的唯一号
     */
    public static String createUserNo(Long userId) {
        return String.valueOf(INIT_USER_NO + userId);
    }
}
