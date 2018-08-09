package com.cat.server.controller;

import com.cat.server.service.IUserService;
import com.cat.server.utils.ResJosnUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author : dado
 * @time : 2018/8/9 19:51
 */
@RestController
@RequestMapping(value = "/user")
public class UserCtrl {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserCtrl.class);
    private final IUserService userService;

    @Autowired
    public UserCtrl(IUserService userService) {
        this.userService = userService;
    }

    /**
     * demo 接口
     */
    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    @ResponseBody
    public String regist(@RequestParam("name") String name,
                         @RequestParam("password") String password) {
        boolean registRes = userService.regist(name, password);
        return registRes ? ResJosnUtils.success() : ResJosnUtils.fail();
    }

}


