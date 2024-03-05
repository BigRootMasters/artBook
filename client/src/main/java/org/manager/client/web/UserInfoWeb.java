package org.manager.client.web;

import lombok.extern.slf4j.Slf4j;
import org.manager.client.service.UserInfoService;
import org.manager.client.service.bo.UserInfoBO;
import org.manager.client.web.req.RegisterUserReq;
import org.manager.client.web.vo.RegisterUserRes;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * desc
 *
 * @author lk
 * @date 2024/2/27 12:04
 */
@RestController("/userInfo")
@Slf4j
public class UserInfoWeb {
    @Resource
    private UserInfoService userInfoService;

    @GetMapping("/register")
    public RegisterUserRes registerUser(RegisterUserReq req) {
        UserInfoBO userInfoBO = new UserInfoBO();
        System.out.println(req);
        BeanUtils.copyProperties(req, userInfoBO);
        UserInfoBO bo = userInfoService.registerUser(userInfoBO);
        RegisterUserRes res = new RegisterUserRes();
        BeanUtils.copyProperties(bo, res);
        return res;
    }

}
