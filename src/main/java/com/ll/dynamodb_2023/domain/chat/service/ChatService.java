package com.ll.dynamodb_2023.domain.chat.service;

import com.ll.dynamodb_2023.domain.chat.entity.ChatMessage;
import com.ll.dynamodb_2023.domain.chat.repository.ChatMessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatService {
    private final ChatMessageRepository chatMessageRepository;

    public ChatMessage write(long chatRoomId, String message) {
        return chatMessageRepository.save(
                ChatMessage
                        .builder()
                        .chatRoomId(chatRoomId)
                        .message(message)
                        .build()
        );
    }

    public List<ChatMessage> findChatMessagesByChatRoomId(long chatRoomId) {
        return chatMessageRepository.findByChatRoomId(chatRoomId);
    }
}