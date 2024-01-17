package com.example.jujuassembly.domain.chat.controller;

import com.example.jujuassembly.domain.chat.dto.ChatResponseDto;
import com.example.jujuassembly.domain.chat.service.ChatService;
import com.example.jujuassembly.domain.chat.dto.LatestChatResponseDto;
import com.example.jujuassembly.global.response.ApiResponse;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ChatController {

  private final ChatService chatService;

  /**
   * 유저의 최근 채팅 기록 조회
   *
   * @param userId 사용자 ID
   * @return 최근 채팅 기록과 함께 성공 응답 반환
   */
  @GetMapping("/messages/{userId}")
  public ResponseEntity<ApiResponse<List<LatestChatResponseDto>>> findAllLatestChats(
      @PathVariable Long userId) {
    List<LatestChatResponseDto> latestChatResponseDtoList = chatService.findAllLatestChats(userId);
    return ResponseEntity.status(HttpStatus.OK)
        .body(new ApiResponse("유저의 최근 메시지 기록 조회 성공", HttpStatus.OK.value(),
            latestChatResponseDtoList));
  }

  /**
   * 채팅방의 채팅 기록 조회
   *
   * @param roomId 채팅방 ID
   * @return 채팅방의 모든 채팅 기록과 함께 성공 응답 반환
   */
  @GetMapping("/messages")
  public ResponseEntity<ApiResponse<List<ChatResponseDto>>> findAllChats(
      @RequestParam("roomId") Long roomId) {
    List<ChatResponseDto> chatResponseDtoList = chatService.findAllChats(roomId);
    return ResponseEntity.status(HttpStatus.OK)
        .body(new ApiResponse("채팅방의 채팅 기록 조회 성공", HttpStatus.OK.value(), chatResponseDtoList));
  }
}