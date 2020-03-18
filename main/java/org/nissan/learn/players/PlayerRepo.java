package org.nissan.learn.players;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepo extends JpaRepository<Player,String> {

    List<Player> findAllByClubId(String clubId);
}
