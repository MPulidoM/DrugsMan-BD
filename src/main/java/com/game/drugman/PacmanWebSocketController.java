package com.game.drugman;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class PacmanWebSocketController {

    @MessageMapping("/move")
    @SendTo("/topic/pacman")
    public String handleMove(String move) {
        System.out.println(move);
        return move;
    }
}