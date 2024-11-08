package com.rcz.webexample.utils.convert;

import com.rcz.webexample.domain.User;
import com.rcz.webexample.utils.DTO.UserDTO;
import org.modelmapper.ModelMapper;

/**
 * modelmapper 转换器
 */
public class UserModelMapperConvert {

    private final ModelMapper modelMapper = new ModelMapper();

    public UserDTO convert(User user) {
        return modelMapper.map(user, UserDTO.class);
    }

}
