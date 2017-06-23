package com.es.controller;

import org.springframework.data.elasticsearch.annotations.Mapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: ZhOu
 * @Date: 2017/6/22
 */
@RestController
@RequestMapping("/es")
public class EsController {

    @GetMapping("create.do")
    public void addCity(){

    }
}
