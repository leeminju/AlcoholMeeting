package com.example.jujuassembly.domain.user.emailAuth.repository;

import com.example.jujuassembly.domain.user.emailAuth.entity.EmailAuth;
import java.util.concurrent.TimeUnit;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class EmailAuthRepository {

  private final RedisTemplate<String, EmailAuth> redisTemplate;

  public void saveEmailAuth(String key, EmailAuth emailAuth) {
    redisTemplate.opsForValue().set(key, emailAuth);
    redisTemplate.expire(key, 5 * 60, TimeUnit.SECONDS);
  }

  public Boolean isEmailAuthPresent(String key) {
    return redisTemplate.hasKey(key);
  }

  public EmailAuth getEmailAuth(String key) {
    return redisTemplate.opsForValue().get(key);
  }

  public void deleteEmailAuth(String key) {
    redisTemplate.delete(key);
  }
}