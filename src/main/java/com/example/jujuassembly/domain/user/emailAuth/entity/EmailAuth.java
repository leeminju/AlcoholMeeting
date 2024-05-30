package com.example.jujuassembly.domain.user.emailAuth.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EmailAuth {

  String loginId;

  String nickname;

  String email;

  String password;

  Long firstPreferredCategoryId;

  Long secondPreferredCategoryId;

  String sentCode;

  public EmailAuth(String loginId, String nickname, String email, String password,
      Long firstPreferredCategoryId, Long secondPreferredCategoryId, String sentCode) {
    this.loginId = loginId;
    this.nickname = nickname;
    this.email = email;
    this.password = password;
    this.firstPreferredCategoryId = firstPreferredCategoryId;
    this.secondPreferredCategoryId = secondPreferredCategoryId;
    this.sentCode = sentCode;
  }
}
