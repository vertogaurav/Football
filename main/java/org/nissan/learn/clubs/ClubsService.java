package org.nissan.learn.clubs;

import org.nissan.learn.players.Player;
import org.nissan.learn.players.PlayerMinOutputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

@Service
public class ClubsService {

    @Autowired
    private ClubsRepo clubsRepo;

    public List<Clubs> getAllClubs() {
        List<Clubs> clubs = new ArrayList<>();
        clubs = clubsRepo.findAll();
        return clubs;
    }

    public ClubOutputDTO getClub(String id) {
        ClubOutputDTO clubOutputDTO = new ClubOutputDTO();
        Clubs club = clubsRepo.getOne(id);
        clubOutputDTO.setId(club.getId());
        clubOutputDTO.setName(club.getName());
        List<PlayerMinOutputDto> players = new ArrayList<>();
        for (Player player : club.getPlayers()) {
            PlayerMinOutputDto playerMinOutputDto = new PlayerMinOutputDto();
            playerMinOutputDto.setId(player.getPid());
            playerMinOutputDto.setName(player.getName());
            players.add(playerMinOutputDto);
        }
        clubOutputDTO.setPlayers(players);
        return clubOutputDTO;
    }

    public void addClub(Clubs club) {
        clubsRepo.save(club);
    }

    public void updateClub(String id, Clubs club) {
        clubsRepo.save(club);

    }

    public void deleteClub(String id) {
        clubsRepo.deleteById(id);
    }

}