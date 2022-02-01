package com.t1dmlgus.userservice.application;

import com.t1dmlgus.userservice.domain.User;
import com.t1dmlgus.userservice.domain.UserRepository;
import com.t1dmlgus.userservice.ui.dto.JoinRequestDto;
import com.t1dmlgus.userservice.ui.dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public ResponseDto createUser(JoinRequestDto joinRequestDto) {

        User user = joinRequestDto.toEntity();

        User save = userRepository.save(user);

        return new ResponseDto("회원가입 되었습니다.", save.getUserId());
    }
}
