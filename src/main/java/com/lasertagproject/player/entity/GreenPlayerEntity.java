package com.lasertagproject.player.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "green_team")
public class GreenPlayerEntity {
    @Id
    private long id;
    private String codeValue;
}