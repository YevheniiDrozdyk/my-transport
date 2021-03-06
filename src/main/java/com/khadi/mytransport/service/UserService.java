package com.khadi.mytransport.service;

import com.khadi.mytransport.dto.UserDto;
import com.khadi.mytransport.model.User;

public interface UserService {

    boolean login(String phoneNumber, String password);

    User register(UserDto user);

    boolean isExist(String phoneNumber);

    User get(long id);

    User get(String phoneNumber);

}
