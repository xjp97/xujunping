package com.xjp.jib.controller;

import com.xjp.jib.enums.PortraitSearchErrorEnum;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xujunping_vendor
 * @Date: 2020/10/14 9:28
 */
@RestController
@RequestMapping("/jib")
public class JibController {


    @GetMapping
    public String TextJib(){

        try{
            return "你好我吃芒果";
        }catch (Exception e){
            throw PortraitSearchErrorEnum.PORTRAIT_DETAIL_NOT_FOUND.toPortraitSearchException();
        }

    }

}
