package com.soccermanager;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerRepository extends CrudRepository<Player, Long> {
    @Query("select t from Player t where t.player_name LIKE %?1%")
    List<Player> findByName(@Param("playerName") String playerName);

    Player findById(int id);
}
