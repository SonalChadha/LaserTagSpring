package com.lasertagproject.player.services;

import com.lasertagproject.player.model.Player;

import java.util.List;

public interface RedTeamService {
    Player createRedPlayer(Player redPlayer);

    List<Player> getAllRedPlayers();

    boolean deleteRedPlayer(Long id);

    Player getRedPlayerById(Long id);

    Player updateRedPlayer(Long id, Player redPlayer);
}