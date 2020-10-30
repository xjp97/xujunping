package com.xjp.jib.domain;

import com.xjp.jib.enums.CommonCodeEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: xujunping_vendor
 * @Date: 2020/10/30 10:21
 */
@Data
@ToString
public class BaseResult<T> implements Serializable {

    /**
     * 返回异常码
     */
    @ApiModelProperty(value = "异常码")
    private String errorCode="0";
    /**
     * 返回异常消息
     */
    @ApiModelProperty(value = "返回消息")
    private String errorMsg;
    /**
     * 返回具体的业务数据
     */
    @ApiModelProperty(value = "业务数据")
    private T data;

    /**
     * 返回具体的业务数据
     */
    @ApiModelProperty(hidden = true,value = "返回堆栈异常信息,正常情况下为空，只发生在业务没有定义异常码的情况")
    private String detail;

    public boolean isSuccess(){
        return errorCode.equals(CommonCodeEnum.SUCCESS.getCode());
    }
}
