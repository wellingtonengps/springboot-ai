package com.spring.spring_ai.controllers;

import org.springframework.ai.openai.OpenAiChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/assistant")
public class AssistantController {
    private OpenAiChatClient chatClient;

    public AssistantController(OpenAiChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @GetMapping("/chat")
    public String chat(@RequestParam(value = "message") String message) {
        return chatClient.call(message);
    }
}
