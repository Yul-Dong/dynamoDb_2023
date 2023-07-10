package com.ll.dynamodb_2023.domain.chat.repository;

import com.ll.dynamodb_2023.domain.chat.entity.ChatMessage;
import org.springframework.stereotype.Repository;

@Repository
public class ChatMessageRepository {
    public ChatMessage save(ChatMessage chatMessage) {
        return chatMessage;
    }
}