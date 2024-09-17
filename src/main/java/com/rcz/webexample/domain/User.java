package com.rcz.webexample.domain;


import com.baomidou.mybatisplus.annotation.TableField;

import com.rcz.webexample.domain.base.BasePO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 用户信息
 */
@EqualsAndHashCode(callSuper = true)
@Schema(description = "用户信息")
@Data
public class User extends BasePO {

    @Schema(description = "用户编号")
    @TableField("user_no")
    private String userNo;

    @Schema(description = "用户名")
    @TableField("username")
    private String username;

    @Schema(description = "昵称")
    @TableField("nickname")
    private String nickname;

    @Schema(description = "地址")
    @TableField("address")
    private String address;

    @Schema(description = "头像")
    @TableField("avatar")
    private String avatar;

    @Schema(description = "家庭编号")
    @TableField("family_no")
    private String familyNo;

    @Schema(description = "小区编号")
    @TableField("community_no")
    private String communityNo;

    @Schema(description = "职业")
    @TableField("occupation")
    private String occupation;

    @Schema(description = "政治面貌")
    @TableField("political_outlook")
    private String politicalOutlook;

    @Schema(description = "婚姻状况")
    @TableField("marital_status")
    private String maritalStatus;

    @Schema(description = "性别")
    @TableField("gender")
    private String gender;

    @Schema(description = "年龄")
    @TableField("age")
    private int age;

    @Schema(description = "手机号")
    @TableField("phone")
    private String phone;

    @Schema(description = "邮箱")
    @TableField("email")
    private String email;

    @Schema(description = "备注")
    @TableField("remark")
    private String remark;

}
