package com.shuting.flowEdaProgram.security.user.controller.loginAndOut;

import com.shuting.flowEdaProgram.commons.http.Result;

import com.shuting.flowEdaProgram.security.user.entity.LoginUser;
import com.shuting.flowEdaProgram.security.user.service.LoginAndOut.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired private LoginService loginService;

    @CrossOrigin
    @PostMapping("/login")
    public Result<String> login(@RequestBody LoginUser loginUser) {
        return loginService.login(loginUser);
    }
}
