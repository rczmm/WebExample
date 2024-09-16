package com.rcz.webexample.utils.convert;

import com.rcz.webexample.domain.User;
import com.rcz.webexample.utils.DTO.UserDTO;
import com.rcz.webexample.utils.VO.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserConvert {

    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    User convert(UserDTO userDTO);

    List<UserVO> convert(List<User> user);
}
