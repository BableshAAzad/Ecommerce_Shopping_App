package com.ecommerce.shopping.user.service;

import com.ecommerce.shopping.enums.UserRole;
import com.ecommerce.shopping.user.dto.UserRequest;
import com.ecommerce.shopping.user.dto.UserResponse;
import com.ecommerce.shopping.utility.ResponseStructure;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {
    ResponseEntity<ResponseStructure<UserResponse>> addUser(UserRequest userRequest, UserRole userRole);

    ResponseEntity<ResponseStructure<UserResponse>> updateUser(UserRequest userRequest, Long userId);

    ResponseEntity<ResponseStructure<UserResponse>> findUser(Long userId);

    ResponseEntity<ResponseStructure<List<UserResponse>>> findUsers();

}
