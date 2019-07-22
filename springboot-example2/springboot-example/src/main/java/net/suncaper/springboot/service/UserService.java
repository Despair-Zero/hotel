package net.suncaper.springboot.service;

import net.suncaper.springboot.domain.User;
import net.suncaper.springboot.domain.UserExample;
import net.suncaper.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> listUser() {
        return userMapper.selectByExample(new UserExample());
    }
}
