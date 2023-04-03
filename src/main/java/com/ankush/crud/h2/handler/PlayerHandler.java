package com.ankush.crud.h2.handler;

import com.ankush.crud.h2.dao.PlayerDAO;
import com.ankush.crud.h2.model.Player;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerHandler {
    @Autowired
    private PlayerDAO playerDAO;

    public void addNewPlayer(@NonNull Player player) {
        playerDAO.save(player);
    }

    public Player getPlayerInfo(int playerId) {
        Optional<Player> playerInfo = playerDAO.findById(playerId);
        return playerInfo.orElse(null);
    }

    public List<Player> getPlayers(){
        return playerDAO.findAll();
    }
}
