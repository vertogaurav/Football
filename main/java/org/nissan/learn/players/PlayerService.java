package org.nissan.learn.players;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepo playerRepo;

    public List<Player> getAllPlayers(String clubId) {
        return playerRepo.findAllByClubId(clubId);
    }
}
