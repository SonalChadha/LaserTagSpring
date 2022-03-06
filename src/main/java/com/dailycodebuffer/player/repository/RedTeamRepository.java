package com.dailycodebuffer.player.repository;

import com.dailycodebuffer.player.entity.RedPlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedTeamRepository extends JpaRepository<RedPlayerEntity, Long> {

}
