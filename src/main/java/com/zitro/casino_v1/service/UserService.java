package com.zitro.casino_v1.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.zitro.casino_v1.entity.User;
import com.zitro.casino_v1.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}


