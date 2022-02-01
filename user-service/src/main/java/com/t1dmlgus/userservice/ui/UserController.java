package com.t1dmlgus.userservice.ui;

import com.t1dmlgus.userservice.application.UserService;
import com.t1dmlgus.userservice.ui.dto.JoinRequestDto;
import com.t1dmlgus.userservice.ui.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @Value("${greeting.message}")
    private String message;

    @RequestMapping("/health_check")
    public String status(){

        return "It's Working in User-Service";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        //return env.getProperty("greeting.message");
        return message;
    }


    @PostMapping("users")
    public ResponseEntity<?> joinUser(@RequestBody JoinRequestDto joinRequestDto){


        ResponseDto<?> ResponseDto = userService.createUser(joinRequestDto);

        return new ResponseEntity<>(ResponseDto, HttpStatus.CREATED);
    }


}
