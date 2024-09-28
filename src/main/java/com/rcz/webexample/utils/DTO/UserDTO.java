package com.rcz.webexample.utils.DTO;

import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.UUID;

@Data
@Schema(description = "用户信息")
public class UserDTO {

    @Hidden
    private String userNo;

    @Size(max = 20, message = "用户名长度不能超过20")
    @Schema(description = "用户名")
    private String username;

    @Size(max = 20, message = "昵称长度不能超过20")
    @Schema(description = "昵称")
    private String nickname;

    @Size(max = 50, message = "地址长度不能超过20")
    @Schema(description = "地址")
    private String address;

    @Size(max = 100, message = "文件名过长")
    @Schema(description = "头像")
    private String avatar;

    @Size(max = 20, message = "家庭编号有误")
    @Schema(description = "家庭编号")
    private String familyNo;

    @Size(max = 20, message = "小区编号有误")
    @Schema(description = "小区编号")
    private String communityNo;

    @Size(max = 20, message = "职业长度不能超过20")
    @Schema(description = "职业")
    private String occupation;

    @NotNull(message = "政治面貌不能为空")
    @Schema(description = "政治面貌")
    private String politicalOutlook;

    @NotNull(message = "婚姻状况不能为空")
    @Schema(description = "婚姻状况")
    private String maritalStatus;

    @NotNull(message = "性别不能为空")
    @Schema(description = "性别")
    private String gender;

    @NotNull(message = "年龄不能为空")
    @Schema(description = "年龄")
    private int age;

    @Size(max = 20, message = "手机号长度不能超过20")
    @Schema(description = "手机号")
    private String phone;

    @Size(max = 50, message = "邮箱长度不能超过50")
    @Email(message = "邮箱格式不正确")
    @Schema(description = "邮箱")
    private String email;

    @Size(max = 200, message = "备注长度不能超过200")
    @Schema(description = "备注")
    private String remark;

    public String getUserNo() {
        return "BH" + UUID.randomUUID().toString().substring(0, 4);
    }
}
