package com.rcz.webexample.domain.base;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class BasePO {

    @Schema(name = "用户id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @Schema(name = "创建时间")
    @TableField("create_time")
    private String createTime;

    @Schema(name = "更新时间")
    @TableField("update_time")
    private String updateTime;

    @Schema(name = "是否删除")
    @TableField("is_delete")
    @TableLogic
    private int isDelete;
}
