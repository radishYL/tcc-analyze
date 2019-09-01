package com.tcc.psringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yu.alex
 * @date 2019/9/1 19:32
 * @des
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("placeorder")
    public String placeOrder(){
        return "success";
    }

}
