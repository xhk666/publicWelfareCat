package com.cat.server.service.imp;

import com.cat.server.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author : wangjia
 * @time : 2018/8/9 18:53
 */
@Service
public class IUserServiceImpl implements IUserService {
    @Override
    public boolean regist(String name, String pw) {
        return true;
    }
}
