package com.dailycodebuffer.player.repository;

import com.dailycodebuffer.player.entity.GreenPlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreenTeamRepository extends JpaRepository<GreenPlayerEntity, Long> {

}
