package com.dailycodebuffer.player.services;

import com.dailycodebuffer.player.entity.GreenPlayerEntity;
import com.dailycodebuffer.player.model.Player;
import com.dailycodebuffer.player.repository.GreenTeamRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GreenTeamServiceImpl implements GreenTeamService {

    private GreenTeamRepository greenTeamRepository;

    public GreenTeamServiceImpl(GreenTeamRepository greenTeamRepository) {
        this.greenTeamRepository = greenTeamRepository;
    }

    @Override
    public Player createGreenPlayer(Player greenPlayer) {
        GreenPlayerEntity greenPlayerEntity = new GreenPlayerEntity();

        BeanUtils.copyProperties(greenPlayer, greenPlayerEntity);
        greenTeamRepository.save(greenPlayerEntity);
        return greenPlayer;
    }

    @Override
    public List<Player> getAllGreenPlayers() {
        List<GreenPlayerEntity> greenPlayerEntities
                = greenTeamRepository.findAll();

        List<Player> greenPlayers = greenPlayerEntities
                .stream()
                .map(rp -> new Player(
                        rp.getId(),
                        rp.getFirstName(),
                        rp.getLastName(),
                        rp.getEmailId()))
                .collect(Collectors.toList());
        return greenPlayers;
    }

    @Override
    public boolean deleteGreenPlayer(Long id) {
        GreenPlayerEntity greenPlayerEntity = greenTeamRepository.findById(id).get();
        greenTeamRepository.delete(greenPlayerEntity);
        return true;
    }

    @Override
    public Player getGreenPlayerById(Long id) {
        GreenPlayerEntity greenPlayerEntity
                = greenTeamRepository.findById(id).get();
        Player greenPlayer = new Player();
        BeanUtils.copyProperties(greenPlayerEntity, greenPlayer);
        return greenPlayer;
    }

    @Override
    public Player updateGreenPlayer(Long id, Player greenPlayer) {
        GreenPlayerEntity greenPlayerEntity
                = greenTeamRepository.findById(id).get();
        greenPlayerEntity.setEmailId(greenPlayer.getEmailId());
        greenPlayerEntity.setFirstName(greenPlayer.getFirstName());
        greenPlayerEntity.setLastName(greenPlayer.getLastName());

        greenTeamRepository.save(greenPlayerEntity);
        return greenPlayer;
    }
}