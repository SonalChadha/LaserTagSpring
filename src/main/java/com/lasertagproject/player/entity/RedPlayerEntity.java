package com.lasertagproject.player.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "red_team")
public class RedPlayerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}