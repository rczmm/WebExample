package com.rcz.webexample.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rcz.webexample.domain.User;
import com.rcz.webexample.mapper.UserMapper;
import com.rcz.webexample.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
