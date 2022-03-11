package com.lasertagproject.player.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "red_team")
public class RedPlayerEntity {
    @Id
    private long id;
    private String codeValue;
}