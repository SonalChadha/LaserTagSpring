package com.dailycodebuffer.player.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;
}