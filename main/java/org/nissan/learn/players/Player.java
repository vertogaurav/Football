package org.nissan.learn.players;

import org.nissan.learn.clubs.Clubs;

import javax.persistence.*;

@Entity
public class Player {
    @Id
    private  String pid;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "club_id")
    private Clubs club;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Clubs getClub() {
        return club;
    }

    public void setClub(Clubs club) {
        this.club = club;
    }
}
