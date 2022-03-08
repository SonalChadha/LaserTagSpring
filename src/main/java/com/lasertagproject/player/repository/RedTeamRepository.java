package com.lasertagproject.player.repository;

import com.lasertagproject.player.entity.RedPlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedTeamRepository extends JpaRepository<RedPlayerEntity, Long> {

}
