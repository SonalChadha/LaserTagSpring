package com.lasertagproject.player.controller;

import com.lasertagproject.player.model.Player;
import com.lasertagproject.player.services.RedTeamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/")
public class RedTeamController {

    private final RedTeamService redTeamService;

    public RedTeamController(RedTeamService redTeamService) {
        this.redTeamService = redTeamService;
    }

    @PostMapping("/redTeam")
    public Player createRedPlayer(@RequestBody Player redPlayer) {
        return redTeamService.createRedPlayer(redPlayer);
    }

    @GetMapping("/redTeam")
    public List<Player> getAllRedPlayers() {
        return redTeamService.getAllRedPlayers();
    }

    @DeleteMapping("/redTeam/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteRedPlayer(@PathVariable Long id) {
        boolean deleted = false;
        deleted = redTeamService.deleteRedPlayer(id);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/redTeam/{id}")
    public ResponseEntity<Player> getRedPlayerById(@PathVariable Long id) {
        Player redPlayer = null;
        redPlayer = redTeamService.getRedPlayerById(id);
        return ResponseEntity.ok(redPlayer);
    }

    @PutMapping("/redTeam/{id}")
    public ResponseEntity<Player> updateRedPlayer(@PathVariable Long id,
                                                 @RequestBody Player redPlayer) {
        redPlayer = redTeamService.updateRedPlayer(id, redPlayer);
        return ResponseEntity.ok(redPlayer);
    }

}