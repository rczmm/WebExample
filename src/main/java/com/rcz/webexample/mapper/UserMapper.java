package com.rcz.webexample.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rcz.webexample.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
