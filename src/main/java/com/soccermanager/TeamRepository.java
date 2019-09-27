package com.soccermanager;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import org.springframework.data.repository.query.Param;
/**
 * Created by Vlad on 26-Sep-19.
 */
public interface TeamRepository extends CrudRepository<Team, Long> {
    @Query("select t from Team t where t.team_long_name LIKE %?1%")
    List<Team> findByName(@Param("teamName") String teamName);

    Team findById(int id);
};
