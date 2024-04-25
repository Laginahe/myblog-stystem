package com.daofeng.system.mapper;

import com.daofeng.system.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * @BelongProject myblog-stystem
 * @BelongPackage com.daofeng.system.mapper
 * @Date 2024/4/23 14:02
 * @Author 瑾。
 * @Version 1.0
 * @Description
 */
@Mapper
public interface UserMapper {
    /**
     * 根据id查询用户名字
     */
    @Select("select userName from user where id = #{loginUserId}")
    String getUserNameById(Integer loginUserId);

    /**
     * 查询用户头像
     */
    @Select("select user_avatar from user where id = #{loginUserId}")
    String getUserAvatarById(Integer loginUserId);

    /**
     * 根据登录名查找用户
     * @param loginName
     * @return
     */
    UserEntity getUserByName(String loginName);

    /**
     * 查找用户
     */
    @Select("select * from user where id = #{loginUserId}")
    UserEntity getUserById(Integer loginUserId);

    /**
     * 修改密码
     */
    @Update("update user set password = #{newPassword} where id = #{loginUserId}")
    int updatePassword(Integer loginUserId, String oldPassword, String newPassword);
    /**
     * 修改用户名（登录名） 和 用户昵称
     */
    @Update("update user set login_name = #{newLoginName}, userName=#{newNickName} where id = #{loginUserId}")
    int updateUserName(Integer loginUserId, String LoginName, String NickName);
}