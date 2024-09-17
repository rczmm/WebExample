package com.rcz.webexample.controller;

import com.rcz.webexample.domain.User;
import com.rcz.webexample.service.UserService;
import com.rcz.webexample.utils.DTO.UserDTO;
import com.rcz.webexample.utils.VO.ID;
import com.rcz.webexample.utils.convert.UserConvert;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "用户管理", description = "用户管理")
@RestController
@CrossOrigin
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    private final UserConvert userConvert;

    @Autowired
    public UserController(UserService userService, UserConvert userConvert) {
        this.userService = userService;
        this.userConvert = userConvert;
    }

    @Operation(description = "获取用户列表",summary = "获取用户列表")
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public List<User> list() {
        return userService.list();
    }

    @Operation(description = "新增用户",summary = "新增用户")
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public boolean add(@RequestBody @Validated UserDTO user) {
        User data = userConvert.convert(user);
        return userService.save(data);
    }

    @Operation(description = "删除用户", summary = "删除用户")
    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public boolean delete(@RequestBody ID id) {
        return userService.removeById(id.getId());
    }

}
