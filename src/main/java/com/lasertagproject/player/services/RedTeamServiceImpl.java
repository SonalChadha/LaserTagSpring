package com.lasertagproject.player.services;

import com.lasertagproject.player.entity.RedPlayerEntity;
import com.lasertagproject.player.model.Player;
import com.lasertagproject.player.repository.RedTeamRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RedTeamServiceImpl implements RedTeamService {

    private RedTeamRepository redTeamRepository;

    public RedTeamServiceImpl(RedTeamRepository redTeamRepository) {
        this.redTeamRepository = redTeamRepository;
    }

    @Override
    public Player createRedPlayer(Player redPlayer) {
        RedPlayerEntity redPlayerEntity = new RedPlayerEntity();

        BeanUtils.copyProperties(redPlayer, redPlayerEntity);
        redTeamRepository.save(redPlayerEntity);
        return redPlayer;
    }

    @Override
    public List<Player> getAllRedPlayers() {
        List<RedPlayerEntity> redPlayerEntities
                = redTeamRepository.findAll();

        List<Player> redPlayers = redPlayerEntities
                .stream()
                .map(rp -> new Player(
                        rp.getId(),
                        rp.getFirstName(),
                        rp.getLastName(),
                        rp.getEmailId()))
                .collect(Collectors.toList());
        return redPlayers;
    }

    @Override
    public boolean deleteRedPlayer(Long id) {
        RedPlayerEntity redPlayerEntity = redTeamRepository.findById(id).get();
        redTeamRepository.delete(redPlayerEntity);
        return true;
    }

    @Override
    public Player getRedPlayerById(Long id) {
        RedPlayerEntity redPlayerEntity
                = redTeamRepository.findById(id).get();
        Player redPlayer = new Player();
        BeanUtils.copyProperties(redPlayerEntity, redPlayer);
        return redPlayer;
    }

    @Override
    public Player updateRedPlayer(Long id, Player redPlayer) {
        RedPlayerEntity redPlayerEntity
                = redTeamRepository.findById(id).get();
        redPlayerEntity.setEmailId(redPlayer.getEmailId());
        redPlayerEntity.setFirstName(redPlayer.getFirstName());
        redPlayerEntity.setLastName(redPlayer.getLastName());

        redTeamRepository.save(redPlayerEntity);
        return redPlayer;
    }
}