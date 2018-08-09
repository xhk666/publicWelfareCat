package com.cat.server.service;

/**
 * @author : dado
 * @time : 2018/8/9 19:53
 */
public interface IUserService {
    /**
     * 注册
     *
     * @param name     用户名
     * @param passwrod 密码，前端md5后
     * @return 是否注册成功
     */
    boolean regist(String name, String passwrod);
}
