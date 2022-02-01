package com.t1dmlgus.userservice.ui.dto;


import com.t1dmlgus.userservice.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class JoinRequestDto {

    @NotNull(message = "이메일을 적어주세요")
    @Size(min=2, message = "이메일은 2글자 이상입니다.")
    @Email
    private String email;

    @NotNull(message = "이름을 적어주세요")
    @Size(min = 2, message = "이름은 2글자 이상입니다.")
    private String name;

    @NotNull(message = "비밀번호를 적어주세요")
    @Size(min = 4, message = "패스워드는 4글자 이상입니다.")
    private String pwd;

    public User toEntity(){
        return new User(email, name, UUID.randomUUID().toString(),pwd);


    }
}
