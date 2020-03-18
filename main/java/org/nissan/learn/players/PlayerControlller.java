package org.nissan.learn.players;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerControlller {
    @Autowired
    private PlayerService playerService;

    @GetMapping( value = "clubs/{clubId}/players")
    public List<Player> getplayers(@PathVariable String clubId){
        return playerService.getAllPlayers(clubId);
    }


}
