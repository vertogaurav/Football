package org.nissan.learn.clubs;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.nissan.learn.players.Player;
import org.nissan.learn.players.PlayerMinOutputDto;

import java.util.List;

public class ClubOutputDTO {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("players")
    private List<PlayerMinOutputDto> players;

    public ClubOutputDTO() {
    }

    public ClubOutputDTO(String id, String name, List<PlayerMinOutputDto> players) {
        this.id = id;
        this.name = name;
        this.players = players;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PlayerMinOutputDto> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayerMinOutputDto> players) {
        this.players = players;
    }
}
