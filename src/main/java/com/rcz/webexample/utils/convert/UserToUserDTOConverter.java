package com.rcz.webexample.utils.convert;


import com.rcz.webexample.domain.User;
import com.rcz.webexample.utils.DTO.UserDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Spring Boot的转换服务
 */
@Component
public class UserToUserDTOConverter implements Converter<User, UserDTO> {
    @Override
    public UserDTO convert(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserNo(user.getUserNo());
        userDTO.setUsername(user.getUsername());
        userDTO.setNickname(user.getNickname());
        userDTO.setAddress(user.getAddress());
        userDTO.setAvatar(user.getAvatar());
        userDTO.setFamilyNo(user.getFamilyNo());
        userDTO.setCommunityNo(user.getCommunityNo());
        userDTO.setOccupation(user.getOccupation());
        userDTO.setPoliticalOutlook(user.getPoliticalOutlook());
        userDTO.setMaritalStatus(user.getMaritalStatus());
        userDTO.setGender(user.getGender());
        userDTO.setAge(user.getAge());
        userDTO.setPhone(user.getPhone());
        userDTO.setEmail(user.getEmail());
        userDTO.setRemark(user.getRemark());
        return userDTO;
    }

}
