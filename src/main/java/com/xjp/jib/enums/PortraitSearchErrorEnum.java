package com.xjp.jib.enums;

import com.xjp.jib.exception.SearchException;

/**
 * @Author: xujunping_vendor
 * @Date: 2020/10/30 10:09
 */
public enum  PortraitSearchErrorEnum implements BaseEnumI{

    /**
     * 身份检索相关异常
     */
    PORTRAIT_QUERY_ERROR("010002002001", "人像查询出错"),
    PORTRAIT_SEARCH_ERROR("010002002002", "人像检索出错"),
    PORTRAIT_DETAIL_NOT_FOUND("010002002003", "找不到人像详情信息"),
    PORTRAIT_SEARCH_EXHAUSTED("010002002004", "检索资源耗尽"),
    PORTRAIT_MODULE_QUERY_ERROR("010002002005", "人像远程查询出错"),
    SEARCH_DETAIL_NOT_FOUND("010014002006", "找不到此人像的检索信息"),
    SEARCH_DETAIL_ERROR("010014002007", "获取人像详情出错");

    PortraitSearchErrorEnum(String code, String value){
        this.code = code;
        this.value = value;
    }

    String code;
    String value;


    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String getCode() {
        return code;
    }

    public SearchException toPortraitSearchException(){
        return new SearchException(getValue(),getCode(),null);
    }


    public SearchException toPortraitSearchException(String message){
        return new SearchException(message,getCode(),null);
    }
}
