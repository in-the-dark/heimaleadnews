package com.heima.common.exception;

import com.heima.model.common.enums.AppHttpCodeEnum;

/**
 * 继承运行时异常
 */
public class CustomException extends RuntimeException {

    private AppHttpCodeEnum appHttpCodeEnum;

    /**
     * 构造函数
     * @param appHttpCodeEnum
     */
    public CustomException(AppHttpCodeEnum appHttpCodeEnum){
        this.appHttpCodeEnum = appHttpCodeEnum;
    }

    public AppHttpCodeEnum getAppHttpCodeEnum() {
        return appHttpCodeEnum;
    }
}
