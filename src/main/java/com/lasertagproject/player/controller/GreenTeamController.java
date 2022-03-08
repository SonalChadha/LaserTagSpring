package com.lasertagproject.player.controller;

import com.lasertagproject.player.model.Player;
import com.lasertagproject.player.services.GreenTeamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/")
public class GreenTeamController {

    private final GreenTeamService greenTeamService;

    public GreenTeamController(GreenTeamService greenTeamService) {
        this.greenTeamService = greenTeamService;
    }

    @PostMapping("/greenTeam")
    public Player createGreenPlayer(@RequestBody Player greenPlayer) {
        return greenTeamService.createGreenPlayer(greenPlayer);
    }

    @GetMapping("/greenTeam")
    public List<Player> getAllGreenPlayers() {
        return greenTeamService.getAllGreenPlayers();
    }

    @DeleteMapping("/greenTeam/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteGreenPlayer(@PathVariable Long id) {
        boolean deleted = false;
        deleted = greenTeamService.deleteGreenPlayer(id);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/greenTeam/{id}")
    public ResponseEntity<Player> getGreenPlayerById(@PathVariable Long id) {
        Player greenPlayer = null;
        greenPlayer = greenTeamService.getGreenPlayerById(id);
        return ResponseEntity.ok(greenPlayer);
    }

    @PutMapping("/greenTeam/{id}")
    public ResponseEntity<Player> updateGreenPlayer(@PathVariable Long id,
                                                  @RequestBody Player greenPlayer) {
        greenPlayer = greenTeamService.updateGreenPlayer(id, greenPlayer);
        return ResponseEntity.ok(greenPlayer);
    }

}