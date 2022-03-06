package com.dailycodebuffer.player.services;

import com.dailycodebuffer.player.model.Player;

import java.util.List;

public interface GreenTeamService {
    Player createGreenPlayer(Player greenPlayer);

    List<Player> getAllGreenPlayers();

    boolean deleteGreenPlayer(Long id);

    Player getGreenPlayerById(Long id);

    Player updateGreenPlayer(Long id, Player greenPlayer);
}