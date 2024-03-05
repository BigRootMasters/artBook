package org.manager.client.service;

import lombok.extern.slf4j.Slf4j;
import org.manager.client.common.NumberUtil;
import org.manager.client.mapper.UserInfoMapper;
import org.manager.client.mapper.dao.UserInfoDO;
import org.manager.client.service.bo.UserInfoBO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * desc
 *
 * @author lk
 * @date 2024/3/4 01:42
 */
@Slf4j
@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoMapper userinfoMapper;

    /**
     * 注册用户
     */
    @Override
    public UserInfoBO registerUser(UserInfoBO userInfoBO) {
        UserInfoDO userInfoDO = new UserInfoDO();

        BeanUtils.copyProperties(userInfoBO, userInfoDO);

        userInfoDO.setCreatedBy(userInfoBO.getUsername());
        userInfoDO.setModifiedBy(userInfoBO.getUsername());
        userInfoDO.setGmtCreate(new Date());
        userInfoDO.setGmtModified(new Date());

        System.out.println("init" + userInfoDO);

        int insert = userinfoMapper.insertSelective(userInfoDO);
        System.out.println(insert);

        UserInfoDO res = userinfoMapper.selectByPrimaryKey((long) insert);
        System.out.println(res);
        log.debug("--------------{}", res);
        int id = userinfoMapper.updateUserNo(NumberUtil.createUserNo(res.getId()), res.getId());
        log.debug("userNo结果为{}", id);
        userInfoBO.setUserNo(NumberUtil.createUserNo(res.getId()));
        return userInfoBO;
    }

}
