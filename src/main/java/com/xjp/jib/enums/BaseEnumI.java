package com.xjp.jib.enums;

import com.xjp.jib.exception.BusinessException;

/**
 * @Author: xujunping_vendor
 * @Date: 2020/10/30 10:02
 */
public interface BaseEnumI {

    String getValue();

    String getCode();

    default BusinessException buildException(){ return new BusinessException(getValue(),getCode(),null); }

    default BusinessException businessException(Throwable e){ return new BusinessException(getValue(),getCode(),e); }

}
