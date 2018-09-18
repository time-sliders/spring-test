package com.noob.test.service.impl;

import com.noob.test.model.User;
import com.noob.test.service.UserService;

/**
 * @author luyun
 * @since 2018.09.18 10:16
 */
public class UserServiceImpl implements UserService {

    public int addUser(User user) {
        System.out.println(user);
        return 0;
    }
}
