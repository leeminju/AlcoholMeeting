package com.example.jujuassembly.domain.user.emailAuth.dto;

import com.example.jujuassembly.domain.user.emailAuth.entity.EmailAuth;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EmailAuthDto {

  private String loginId;
  private String nickname;
  private String email;
  private String password;
  private Long firstPreferredCategoryId;
  private Long secondPreferredCategoryId;

  public EmailAuthDto(EmailAuth emailAuth) {
    this.loginId = emailAuth.getLoginId();
    this.nickname = emailAuth.getNickname();
    this.email = emailAuth.getEmail();
    this.password = emailAuth.getPassword();
    this.firstPreferredCategoryId = emailAuth.getFirstPreferredCategoryId();
    this.secondPreferredCategoryId = emailAuth.getSecondPreferredCategoryId();
  }
}
