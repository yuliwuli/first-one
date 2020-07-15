package com.example.demo.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2020/7/13.
 */

@RestController
public class apitest {
    final String result = "欢迎光临";

    @RequestMapping(value = "/test")
    public String test(){
        System.out.println(result);
        return result;
    }
}
