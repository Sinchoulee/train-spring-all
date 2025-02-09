package com.superchakra.train.controller;


import com.superchakra.train.reponse.Result;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface HelloControllerApi {

    @GetMapping("/hello")
    @Operation(method = "GET",summary = "通用模块的测试方法")
    Result hello();
}
