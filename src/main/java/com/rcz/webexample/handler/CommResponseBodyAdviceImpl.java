package com.rcz.webexample.handler;

import com.rcz.webexample.utils.VO.base.RespBase;
import lombok.NonNull;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@ControllerAdvice
public class CommResponseBodyAdviceImpl implements ResponseBodyAdvice<Object> {

    @Override
    public boolean supports(@NonNull MethodParameter returnType,
                            @NonNull Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body,
                                            @NonNull MethodParameter returnType,
                                            @NonNull MediaType selectedContentType,
                                            @NonNull Class<? extends HttpMessageConverter<?>> selectedConverterType,
                                            @NonNull ServerHttpRequest request,
                                            @NonNull ServerHttpResponse response) {
        // 获取当前请求的路径
        String path = request.getURI().getPath();
        // 检查请求路径是否是 Swagger 相关的路径
        boolean isSwaggerPath = path.startsWith("/swagger-ui") || path.startsWith("/v3/api-docs");
        // 如果是 Swagger 相关请求，则不进行拦截
        if (isSwaggerPath) {
            return body;
        }
        if (body == null){
            return RespBase.fail("响应失败！");
        }
        return RespBase.success(body);
    }
}
