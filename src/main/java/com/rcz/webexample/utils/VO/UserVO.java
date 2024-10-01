package com.rcz.webexample.utils.VO;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "用户VO")
public class UserVO {

    @Schema(description = "用户id")
    private String userNo;

    @Schema(description = "用户名")
    private String username;

    @Schema(description = "昵称")
    private String nickname;

    @Schema(description = "地址")
    private String address;

    @Schema(description = "头像")
    private String avatar;

    @Schema(description = "家庭编号")
    private String familyNo;

    @Schema(description = "小区编号")
    private String communityNo;

    @Schema(description = "职业")
    private String occupation;

    @Schema(description = "政治面貌")
    private String politicalOutlook;

    @Schema(description = "婚姻状况")
    private String maritalStatus;

    @Schema(description = "性别")
    private String gender;

    @Schema(description = "年龄")
    private int age;

    @Schema(description = "手机号")
    private String phone;

    @Schema(description = "邮箱")
    private String email;

    @Schema(description = "备注")
    private String remark;

    @Schema(description = "创建时间")
    private String createTime;

    @Schema(description = "更新时间")
    private String updateTime;

}
