package com.lasertagproject.player.repository;

import com.lasertagproject.player.entity.GreenPlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreenTeamRepository extends JpaRepository<GreenPlayerEntity, Long> {

}
