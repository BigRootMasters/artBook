package org.manager.client.mapper;

import org.apache.ibatis.annotations.Param;
import org.manager.client.mapper.dao.UserInfoDO;

import java.util.List;

/**
 * @author kuan
 * @description 针对表【user_info】的数据库操作Mapper
 * @createDate 2024-03-04 01:34:35
 * @Entity org.manager.client.galaxy.dao.UserInfoDO
 */
public interface UserInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserInfoDO record);

    int insertSelective(UserInfoDO record);

    UserInfoDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfoDO record);

    int updateByPrimaryKey(UserInfoDO record);

    int updateUserNo(@Param("userNo") String userNo,@Param("id") Long id);

    List<UserInfoDO> queryAll();
}
