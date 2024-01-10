package com.example.jujuassembly.domain.userManagement.service;

import com.example.jujuassembly.domain.user.dto.UserResponseDto;
import com.example.jujuassembly.domain.user.entity.User;
import com.example.jujuassembly.domain.user.repository.UserRepository;
import com.example.jujuassembly.domain.userManagement.dto.userRoleRequestDto;
import com.example.jujuassembly.global.exception.ApiException;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserManageService {

  private final UserRepository userRepository;


  //전체 유저 조회
  public List<UserResponseDto> viewAllUsers() {

    List<User> allUserList = userRepository.findAll();
    List<UserResponseDto> allUserResponseDto = new ArrayList<>();

    allUserList.forEach(user -> {
      var userDto = new UserResponseDto(user);
      allUserResponseDto.add(userDto);
    });
    return allUserResponseDto;
  }

  //유저 권한 수정
  public UserResponseDto modifyUserRole(Long userId, userRoleRequestDto userRoleRequestDto) {
    User user = userRepository.findById(userId)
        .orElseThrow(()->new ApiException("존재하지 않는 사용자입니다.", HttpStatus.BAD_REQUEST));
    user.changeRole(userRoleRequestDto.getUserRole());
    userRepository.save(user);
    return new UserResponseDto(user);
  }
}