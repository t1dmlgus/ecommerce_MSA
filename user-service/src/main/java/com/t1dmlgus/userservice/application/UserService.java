package com.t1dmlgus.userservice.application;

import com.t1dmlgus.userservice.ui.dto.JoinRequestDto;
import com.t1dmlgus.userservice.ui.dto.ResponseDto;

public interface UserService {

    // 회원등록
    ResponseDto createUser(JoinRequestDto joinRequestDto);

}
