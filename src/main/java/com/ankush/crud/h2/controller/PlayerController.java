package com.ankush.crud.h2.controller;

import com.ankush.crud.h2.handler.PlayerHandler;
import com.ankush.crud.h2.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/players")
public class PlayerController {

    @Autowired
    private PlayerHandler playerHandler;

    @PostMapping
    public void addNewPlayer(@RequestBody Player player) {
        playerHandler.addNewPlayer(player);
    }

    @GetMapping(path = "/{id}")
    public Player getPlayerById(@PathVariable Integer id) {
        return playerHandler.getPlayerInfo(id);
    }

    @GetMapping
    public List<Player> getAllPlayers() {
        return playerHandler.getPlayers();
    }
}
