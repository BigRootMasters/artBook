package org.manager.client.ClientWebTest;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.manager.client.mapper.UserInfoMapper;
import org.manager.client.mapper.dao.UserInfoDO;
import org.manager.client.web.UserInfoWeb;
import org.manager.client.web.req.RegisterUserReq;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * desc
 *
 * @author lk
 * @date 2024/3/3 23:30
 */
@SpringBootTest
@Slf4j
public class WebTest {
    @Resource
    UserInfoWeb userInfoWeb;
    @Resource
    UserInfoMapper userInfoMapper;

    @Test
    void registerUserTest(){
        RegisterUserReq req = new RegisterUserReq();
        req.setUsername("li");
        req.setPassword("mima");
        req.setPhoneNumber("1234");
        req.setEmail("qq123");
        userInfoWeb.registerUser(req);
    }

    @Test
    void listQueryUserInfoTest(){
        UserInfoDO userInfoDO = userInfoMapper.selectByPrimaryKey(1L);
    }

    @Test
    void queryAllUserInfoTest(){
        List<UserInfoDO> userInfoDOS = userInfoMapper.queryAll();
        System.out.println(userInfoDOS);
    }
}
