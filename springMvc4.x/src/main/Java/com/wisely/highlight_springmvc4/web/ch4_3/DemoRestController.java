package com.wisely.highlight_springmvc4.web.ch4_3;

import com.wisely.highlight_springmvc4.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qilin.liu on 2018/4/14.
 * @RestController演示
 */
@RestController //1
@RequestMapping("/rest")
public class DemoRestController {

    @RequestMapping(value = "/getjson", produces = {"application/json;charset=UTF-8"}) //2
    public Object getJson(DemoObj obj){
        return new DemoObj(obj.getId()+1, obj.getName()+"yy"); //3
    }

    @RequestMapping(value = "getxml", produces = {"application/xml;charset=UTF-8"}) //4
    public Object getXml(DemoObj obj){
        return new DemoObj(obj.getId()+1, obj.getName()+"yy"); //5
    }
}

/*
    ①使用@RestController,声明是控制器，并且返回数据时不需要@ResponseBody.
    ②返回数据的媒体类型为json
    ③直接返回对象，对象会自动转换成json。
    ④返回数据的媒体类型为xml
    ⑤直接返回对象，对象会自动转换成xml。
 */