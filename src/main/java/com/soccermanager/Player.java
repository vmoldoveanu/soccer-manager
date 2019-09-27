package com.soccermanager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer id;
    public String birthday;
    public String height;
    public Integer player_api_id;
    public Integer player_fifa_api_id;
    public Integer weight;
    public String player_name;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlayer_api_id() {
        return player_api_id;
    }

    public void setPlayer_api_id(Integer player_api_id) {
        this.player_api_id = player_api_id;
    }

    public Integer getPlayer_fifa_api_id() {
        return player_fifa_api_id;
    }

    public void setPlayer_fifa_api_id(Integer player_fifa_api_id) {
        this.player_fifa_api_id = player_fifa_api_id;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "birthday='" + birthday + '\'' +
                ", height='" + height + '\'' +
                ", id=" + id +
                ", player_api_id=" + player_api_id +
                ", player_fifa_api_id=" + player_fifa_api_id +
                ", weight=" + weight +
                ", player_name='" + player_name + '\'' +
                '}';
    }
}
