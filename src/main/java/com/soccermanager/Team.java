package com.soccermanager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * Created by Vlad on 25-Sep-19.
 */
@Entity
public class Team {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String team_long_name;
    private Integer team_api_id;
    private String team_short_name;
    private String team_fifa_api_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam_long_name() {
        return team_long_name;
    }

    public void setTeam_long_name(String team_long_name) {
        this.team_long_name = team_long_name;
    }

    public Integer getTeam_api_id() {
        return team_api_id;
    }

    public void setTeam_api_id(Integer team_api_id) {
        this.team_api_id = team_api_id;
    }

    public String getTeam_short_name() {
        return team_short_name;
    }

    public void setTeam_short_name(String team_short_name) {
        this.team_short_name = team_short_name;
    }

    public String getTeam_fifa_api_id() {
        return team_fifa_api_id;
    }

    public void setTeam_fifa_api_id(String team_fifa_api_id) {
        this.team_fifa_api_id = team_fifa_api_id;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", team_long_name='" + team_long_name + '\'' +
                ", team_api_id=" + team_api_id +
                ", team_short_name='" + team_short_name + '\'' +
                ", team_fifa_api_id=" + team_fifa_api_id +
                '}';
    }
}
