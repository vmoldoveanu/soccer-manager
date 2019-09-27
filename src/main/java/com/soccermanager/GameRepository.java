package com.soccermanager;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface GameRepository extends CrudRepository<Game, Long> {
    @Query("select m from Game m where CONCAT(m.home_team_api_id, '') IN :home_team_api_id")
    List<Game> findByHomeId(String home_team_api_id);

    @Query("select m from Game m where CONCAT(m.away_team_api_id, '') IN :away_team_api_id")
    List<Game> findByAwayId(String away_team_api_id);

    Game findById(int id);
}


