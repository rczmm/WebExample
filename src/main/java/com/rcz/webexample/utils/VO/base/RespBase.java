package com.rcz.webexample.utils.VO.base;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RespBase<T> {

    private Integer code;
    private String msg;
    private T data;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date time;

    public static <T> RespBase<T> success(T data) {
        RespBase<T> respBase = new RespBase<>();
        respBase.setCode(200);
        respBase.setMsg("响应成功");
        respBase.setData(data);
        respBase.setTime(new Date());
        return respBase;
    }

    public static <T> RespBase<T> fail(String msg) {
        RespBase<T> respBase = new RespBase<>();
        respBase.setCode(500);
        respBase.setMsg(msg);
        respBase.setTime(new Date());
        return respBase;
    }

}
