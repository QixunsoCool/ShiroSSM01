package com.zking.service;

import com.zking.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Transactional
public interface IUserService {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 根据用户的账号获取个人信息
     * @param username
     * @return
     */
    public User selectByUserName(String username);


    public Set<String> getRoleByUserName(String username);


    public Set<String> getPermissionByUserName(String username);


    public List<User> list();


}