package com.soccermanager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {

     @Id
     @GeneratedValue(strategy= GenerationType.AUTO)
     public Integer id;
     public String home_player_Y3;
     public String home_player_Y2;
     public String home_player_Y1;
     public String home_player_Y7;
     public String home_player_Y6;
     public String away_player_8;
     public String away_player_9;
     public String away_player_6;
     public String away_player_7;
     public String away_player_4;
     public String away_player_5;
     public String away_player_2;
     public String away_player_3;
     public String away_player_1;
     public String corner;
     public String home_player_X10;
     public String home_player_X11;
     public String IWD;
     public String home_player_Y5;
     public String IWA;
     public String home_player_Y4;
     public String IWH;
     public String LBA;
     public String BWA;
     public String BWD;
     public String LBD;
     public String away_player_X9;
     public String away_player_X8;
     public String BWH;
     public String away_player_X6;
     public String away_player_X5;
     public String away_player_X4;
     public String away_player_X3;
     public String away_player_X2;
     public String away_player_X1;
     public String home_player_Y8;
     public String away_player_Y10;
     public String away_player_Y11;
     public int home_team_api_id;
     public String GBD;
     public String GBA;
     public String GBH;
     public Integer home_team_goal;
     public String home_player_Y11;
     public Integer match_api_id;
     public Integer country_id;
     public String away_player_X11;
     public String away_player_X10;
     public String away_player_10;
     public String away_player_11;
     public String card;
     public int stage;
     public String PSH;
     public String PSA;
     public String PSD;
     public String home_player_9;
     public String home_player_8;
     public String home_player_3;
     public String home_player_2;
     public String home_player_1;
     public String home_player_Y10;
     public String home_player_7;
     public String home_player_6;
     public String home_player_5;
     public String home_player_4;
     public String WHD;
     public String home_player_X5;
     public String WHA;
     public String WHH;
     public String BSH;
     public String BSD;
     public String home_player_11;
     public String home_player_10;
     public String BSA;
     public String possession;
     public String season;
     public String away_player_X7;
     public String SJH;
     public String LBH;
     public String SJA;
     public Integer away_team_goal;
     public String SJD;
     public String shotoff;
     public String shoton;
     public String away_player_Y1;
     public String away_player_Y2;
     public String away_player_Y3;
     public String away_player_Y4;
     public String away_player_Y5;
     public String away_player_Y6;
     public String away_player_Y7;
     public String away_player_Y8;
     public String away_player_Y9;
     public Integer away_team_api_id;
     public String goal;
     public String cross;
     public String home_player_Y9;
     public String home_player_X4;
     public String VCA;
     public String home_player_X6;
     public String home_player_X7;
     public String VCD;
     public String home_player_X1;
     public String home_player_X2;
     public String home_player_X3;
     public String VCH;
     public String home_player_X8;
     public String home_player_X9;
     public String date;
     public String B365H;
     public Integer league_id;
     public String B365D;
     public String B365A;
     public String foulcommit;

    public String getHome_player_Y3() {
        return home_player_Y3;
    }

    public void setHome_player_Y3(String home_player_Y3) {
        this.home_player_Y3 = home_player_Y3;
    }

    public String getHome_player_Y2() {
        return home_player_Y2;
    }

    public void setHome_player_Y2(String home_player_Y2) {
        this.home_player_Y2 = home_player_Y2;
    }

    public String getHome_player_Y1() {
        return home_player_Y1;
    }

    public void setHome_player_Y1(String home_player_Y1) {
        this.home_player_Y1 = home_player_Y1;
    }

    public String getHome_player_Y7() {
        return home_player_Y7;
    }

    public void setHome_player_Y7(String home_player_Y7) {
        this.home_player_Y7 = home_player_Y7;
    }

    public String getHome_player_Y6() {
        return home_player_Y6;
    }

    public void setHome_player_Y6(String home_player_Y6) {
        this.home_player_Y6 = home_player_Y6;
    }

    public String getAway_player_8() {
        return away_player_8;
    }

    public void setAway_player_8(String away_player_8) {
        this.away_player_8 = away_player_8;
    }

    public String getAway_player_9() {
        return away_player_9;
    }

    public void setAway_player_9(String away_player_9) {
        this.away_player_9 = away_player_9;
    }

    public String getAway_player_6() {
        return away_player_6;
    }

    public void setAway_player_6(String away_player_6) {
        this.away_player_6 = away_player_6;
    }

    public String getAway_player_7() {
        return away_player_7;
    }

    public void setAway_player_7(String away_player_7) {
        this.away_player_7 = away_player_7;
    }

    public String getAway_player_4() {
        return away_player_4;
    }

    public void setAway_player_4(String away_player_4) {
        this.away_player_4 = away_player_4;
    }

    public String getAway_player_5() {
        return away_player_5;
    }

    public void setAway_player_5(String away_player_5) {
        this.away_player_5 = away_player_5;
    }

    public String getAway_player_2() {
        return away_player_2;
    }

    public void setAway_player_2(String away_player_2) {
        this.away_player_2 = away_player_2;
    }

    public String getAway_player_3() {
        return away_player_3;
    }

    public void setAway_player_3(String away_player_3) {
        this.away_player_3 = away_player_3;
    }

    public String getAway_player_1() {
        return away_player_1;
    }

    public void setAway_player_1(String away_player_1) {
        this.away_player_1 = away_player_1;
    }

    public String getCorner() {
        return corner;
    }

    public void setCorner(String corner) {
        this.corner = corner;
    }

    public String getHome_player_X10() {
        return home_player_X10;
    }

    public void setHome_player_X10(String home_player_X10) {
        this.home_player_X10 = home_player_X10;
    }

    public String getHome_player_X11() {
        return home_player_X11;
    }

    public void setHome_player_X11(String home_player_X11) {
        this.home_player_X11 = home_player_X11;
    }

    public String getIWD() {
        return IWD;
    }

    public void setIWD(String IWD) {
        this.IWD = IWD;
    }

    public String getHome_player_Y5() {
        return home_player_Y5;
    }

    public void setHome_player_Y5(String home_player_Y5) {
        this.home_player_Y5 = home_player_Y5;
    }

    public String getIWA() {
        return IWA;
    }

    public void setIWA(String IWA) {
        this.IWA = IWA;
    }

    public String getHome_player_Y4() {
        return home_player_Y4;
    }

    public void setHome_player_Y4(String home_player_Y4) {
        this.home_player_Y4 = home_player_Y4;
    }

    public String getIWH() {
        return IWH;
    }

    public void setIWH(String IWH) {
        this.IWH = IWH;
    }

    public String getLBA() {
        return LBA;
    }

    public void setLBA(String LBA) {
        this.LBA = LBA;
    }

    public String getBWA() {
        return BWA;
    }

    public void setBWA(String BWA) {
        this.BWA = BWA;
    }

    public String getBWD() {
        return BWD;
    }

    public void setBWD(String BWD) {
        this.BWD = BWD;
    }

    public String getLBD() {
        return LBD;
    }

    public void setLBD(String LBD) {
        this.LBD = LBD;
    }

    public String getAway_player_X9() {
        return away_player_X9;
    }

    public void setAway_player_X9(String away_player_X9) {
        this.away_player_X9 = away_player_X9;
    }

    public String getAway_player_X8() {
        return away_player_X8;
    }

    public void setAway_player_X8(String away_player_X8) {
        this.away_player_X8 = away_player_X8;
    }

    public String getBWH() {
        return BWH;
    }

    public void setBWH(String BWH) {
        this.BWH = BWH;
    }

    public String getAway_player_X6() {
        return away_player_X6;
    }

    public void setAway_player_X6(String away_player_X6) {
        this.away_player_X6 = away_player_X6;
    }

    public String getAway_player_X5() {
        return away_player_X5;
    }

    public void setAway_player_X5(String away_player_X5) {
        this.away_player_X5 = away_player_X5;
    }

    public String getAway_player_X4() {
        return away_player_X4;
    }

    public void setAway_player_X4(String away_player_X4) {
        this.away_player_X4 = away_player_X4;
    }

    public String getAway_player_X3() {
        return away_player_X3;
    }

    public void setAway_player_X3(String away_player_X3) {
        this.away_player_X3 = away_player_X3;
    }

    public String getAway_player_X2() {
        return away_player_X2;
    }

    public void setAway_player_X2(String away_player_X2) {
        this.away_player_X2 = away_player_X2;
    }

    public String getAway_player_X1() {
        return away_player_X1;
    }

    public void setAway_player_X1(String away_player_X1) {
        this.away_player_X1 = away_player_X1;
    }

    public String getHome_player_Y8() {
        return home_player_Y8;
    }

    public void setHome_player_Y8(String home_player_Y8) {
        this.home_player_Y8 = home_player_Y8;
    }

    public String getAway_player_Y10() {
        return away_player_Y10;
    }

    public void setAway_player_Y10(String away_player_Y10) {
        this.away_player_Y10 = away_player_Y10;
    }

    public String getAway_player_Y11() {
        return away_player_Y11;
    }

    public void setAway_player_Y11(String away_player_Y11) {
        this.away_player_Y11 = away_player_Y11;
    }

    public Integer getHome_team_api_id() {
        return home_team_api_id;
    }

    public void setHome_team_api_id(Integer home_team_api_id) {
        this.home_team_api_id = home_team_api_id;
    }

    public String getGBD() {
        return GBD;
    }

    public void setGBD(String GBD) {
        this.GBD = GBD;
    }

    public String getGBA() {
        return GBA;
    }

    public void setGBA(String GBA) {
        this.GBA = GBA;
    }

    public String getGBH() {
        return GBH;
    }

    public void setGBH(String GBH) {
        this.GBH = GBH;
    }

    public Integer getHome_team_goal() {
        return home_team_goal;
    }

    public void setHome_team_goal(Integer home_team_goal) {
        this.home_team_goal = home_team_goal;
    }

    public String getHome_player_Y11() {
        return home_player_Y11;
    }

    public void setHome_player_Y11(String home_player_Y11) {
        this.home_player_Y11 = home_player_Y11;
    }

    public Integer getMatch_api_id() {
        return match_api_id;
    }

    public void setMatch_api_id(Integer match_api_id) {
        this.match_api_id = match_api_id;
    }

    public Integer getCountry_id() {
        return country_id;
    }

    public void setCountry_id(Integer country_id) {
        this.country_id = country_id;
    }

    public String getAway_player_X11() {
        return away_player_X11;
    }

    public void setAway_player_X11(String away_player_X11) {
        this.away_player_X11 = away_player_X11;
    }

    public String getAway_player_X10() {
        return away_player_X10;
    }

    public void setAway_player_X10(String away_player_X10) {
        this.away_player_X10 = away_player_X10;
    }

    public String getAway_player_10() {
        return away_player_10;
    }

    public void setAway_player_10(String away_player_10) {
        this.away_player_10 = away_player_10;
    }

    public String getAway_player_11() {
        return away_player_11;
    }

    public void setAway_player_11(String away_player_11) {
        this.away_player_11 = away_player_11;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    public String getPSH() {
        return PSH;
    }

    public void setPSH(String PSH) {
        this.PSH = PSH;
    }

    public String getPSA() {
        return PSA;
    }

    public void setPSA(String PSA) {
        this.PSA = PSA;
    }

    public String getPSD() {
        return PSD;
    }

    public void setPSD(String PSD) {
        this.PSD = PSD;
    }

    public String getHome_player_9() {
        return home_player_9;
    }

    public void setHome_player_9(String home_player_9) {
        this.home_player_9 = home_player_9;
    }

    public String getHome_player_8() {
        return home_player_8;
    }

    public void setHome_player_8(String home_player_8) {
        this.home_player_8 = home_player_8;
    }

    public String getHome_player_3() {
        return home_player_3;
    }

    public void setHome_player_3(String home_player_3) {
        this.home_player_3 = home_player_3;
    }

    public String getHome_player_2() {
        return home_player_2;
    }

    public void setHome_player_2(String home_player_2) {
        this.home_player_2 = home_player_2;
    }

    public String getHome_player_1() {
        return home_player_1;
    }

    public void setHome_player_1(String home_player_1) {
        this.home_player_1 = home_player_1;
    }

    public String getHome_player_Y10() {
        return home_player_Y10;
    }

    public void setHome_player_Y10(String home_player_Y10) {
        this.home_player_Y10 = home_player_Y10;
    }

    public String getHome_player_7() {
        return home_player_7;
    }

    public void setHome_player_7(String home_player_7) {
        this.home_player_7 = home_player_7;
    }

    public String getHome_player_6() {
        return home_player_6;
    }

    public void setHome_player_6(String home_player_6) {
        this.home_player_6 = home_player_6;
    }

    public String getHome_player_5() {
        return home_player_5;
    }

    public void setHome_player_5(String home_player_5) {
        this.home_player_5 = home_player_5;
    }

    public String getHome_player_4() {
        return home_player_4;
    }

    public void setHome_player_4(String home_player_4) {
        this.home_player_4 = home_player_4;
    }

    public String getWHD() {
        return WHD;
    }

    public void setWHD(String WHD) {
        this.WHD = WHD;
    }

    public String getHome_player_X5() {
        return home_player_X5;
    }

    public void setHome_player_X5(String home_player_X5) {
        this.home_player_X5 = home_player_X5;
    }

    public String getWHA() {
        return WHA;
    }

    public void setWHA(String WHA) {
        this.WHA = WHA;
    }

    public String getWHH() {
        return WHH;
    }

    public void setWHH(String WHH) {
        this.WHH = WHH;
    }

    public String getBSH() {
        return BSH;
    }

    public void setBSH(String BSH) {
        this.BSH = BSH;
    }

    public String getBSD() {
        return BSD;
    }

    public void setBSD(String BSD) {
        this.BSD = BSD;
    }

    public String getHome_player_11() {
        return home_player_11;
    }

    public void setHome_player_11(String home_player_11) {
        this.home_player_11 = home_player_11;
    }

    public String getHome_player_10() {
        return home_player_10;
    }

    public void setHome_player_10(String home_player_10) {
        this.home_player_10 = home_player_10;
    }

    public String getBSA() {
        return BSA;
    }

    public void setBSA(String BSA) {
        this.BSA = BSA;
    }

    public String getPossession() {
        return possession;
    }

    public void setPossession(String possession) {
        this.possession = possession;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getAway_player_X7() {
        return away_player_X7;
    }

    public void setAway_player_X7(String away_player_X7) {
        this.away_player_X7 = away_player_X7;
    }

    public String getSJH() {
        return SJH;
    }

    public void setSJH(String SJH) {
        this.SJH = SJH;
    }

    public String getLBH() {
        return LBH;
    }

    public void setLBH(String LBH) {
        this.LBH = LBH;
    }

    public String getSJA() {
        return SJA;
    }

    public void setSJA(String SJA) {
        this.SJA = SJA;
    }

    public Integer getAway_team_goal() {
        return away_team_goal;
    }

    public void setAway_team_goal(Integer away_team_goal) {
        this.away_team_goal = away_team_goal;
    }

    public String getSJD() {
        return SJD;
    }

    public void setSJD(String SJD) {
        this.SJD = SJD;
    }

    public String getShotoff() {
        return shotoff;
    }

    public void setShotoff(String shotoff) {
        this.shotoff = shotoff;
    }

    public String getShoton() {
        return shoton;
    }

    public void setShoton(String shoton) {
        this.shoton = shoton;
    }

    public String getAway_player_Y1() {
        return away_player_Y1;
    }

    public void setAway_player_Y1(String away_player_Y1) {
        this.away_player_Y1 = away_player_Y1;
    }

    public String getAway_player_Y2() {
        return away_player_Y2;
    }

    public void setAway_player_Y2(String away_player_Y2) {
        this.away_player_Y2 = away_player_Y2;
    }

    public String getAway_player_Y3() {
        return away_player_Y3;
    }

    public void setAway_player_Y3(String away_player_Y3) {
        this.away_player_Y3 = away_player_Y3;
    }

    public String getAway_player_Y4() {
        return away_player_Y4;
    }

    public void setAway_player_Y4(String away_player_Y4) {
        this.away_player_Y4 = away_player_Y4;
    }

    public String getAway_player_Y5() {
        return away_player_Y5;
    }

    public void setAway_player_Y5(String away_player_Y5) {
        this.away_player_Y5 = away_player_Y5;
    }

    public String getAway_player_Y6() {
        return away_player_Y6;
    }

    public void setAway_player_Y6(String away_player_Y6) {
        this.away_player_Y6 = away_player_Y6;
    }

    public String getAway_player_Y7() {
        return away_player_Y7;
    }

    public void setAway_player_Y7(String away_player_Y7) {
        this.away_player_Y7 = away_player_Y7;
    }

    public String getAway_player_Y8() {
        return away_player_Y8;
    }

    public void setAway_player_Y8(String away_player_Y8) {
        this.away_player_Y8 = away_player_Y8;
    }

    public String getAway_player_Y9() {
        return away_player_Y9;
    }

    public void setAway_player_Y9(String away_player_Y9) {
        this.away_player_Y9 = away_player_Y9;
    }

    public Integer getAway_team_api_id() {
        return away_team_api_id;
    }

    public void setAway_team_api_id(Integer away_team_api_id) {
        this.away_team_api_id = away_team_api_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getCross() {
        return cross;
    }

    public void setCross(String cross) {
        this.cross = cross;
    }

    public String getHome_player_Y9() {
        return home_player_Y9;
    }

    public void setHome_player_Y9(String home_player_Y9) {
        this.home_player_Y9 = home_player_Y9;
    }

    public String getHome_player_X4() {
        return home_player_X4;
    }

    public void setHome_player_X4(String home_player_X4) {
        this.home_player_X4 = home_player_X4;
    }

    public String getVCA() {
        return VCA;
    }

    public void setVCA(String VCA) {
        this.VCA = VCA;
    }

    public String getHome_player_X6() {
        return home_player_X6;
    }

    public void setHome_player_X6(String home_player_X6) {
        this.home_player_X6 = home_player_X6;
    }

    public String getHome_player_X7() {
        return home_player_X7;
    }

    public void setHome_player_X7(String home_player_X7) {
        this.home_player_X7 = home_player_X7;
    }

    public String getVCD() {
        return VCD;
    }

    public void setVCD(String VCD) {
        this.VCD = VCD;
    }

    public String getHome_player_X1() {
        return home_player_X1;
    }

    public void setHome_player_X1(String home_player_X1) {
        this.home_player_X1 = home_player_X1;
    }

    public String getHome_player_X2() {
        return home_player_X2;
    }

    public void setHome_player_X2(String home_player_X2) {
        this.home_player_X2 = home_player_X2;
    }

    public String getHome_player_X3() {
        return home_player_X3;
    }

    public void setHome_player_X3(String home_player_X3) {
        this.home_player_X3 = home_player_X3;
    }

    public String getVCH() {
        return VCH;
    }

    public void setVCH(String VCH) {
        this.VCH = VCH;
    }

    public String getHome_player_X8() {
        return home_player_X8;
    }

    public void setHome_player_X8(String home_player_X8) {
        this.home_player_X8 = home_player_X8;
    }

    public String getHome_player_X9() {
        return home_player_X9;
    }

    public void setHome_player_X9(String home_player_X9) {
        this.home_player_X9 = home_player_X9;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getB365H() {
        return B365H;
    }

    public void setB365H(String b365H) {
        B365H = b365H;
    }

    public Integer getLeague_id() {
        return league_id;
    }

    public void setLeague_id(Integer league_id) {
        this.league_id = league_id;
    }

    public String getB365D() {
        return B365D;
    }

    public void setB365D(String b365D) {
        B365D = b365D;
    }

    public String getB365A() {
        return B365A;
    }

    public void setB365A(String b365A) {
        B365A = b365A;
    }

    public String getFoulcommit() {
        return foulcommit;
    }

    public void setFoulcommit(String foulcommit) {
        this.foulcommit = foulcommit;
    }

    @Override
    public String toString() {
        return "Match{" +
                "home_player_Y3='" + home_player_Y3 + '\'' +
                ", home_player_Y2='" + home_player_Y2 + '\'' +
                ", home_player_Y1='" + home_player_Y1 + '\'' +
                ", home_player_Y7='" + home_player_Y7 + '\'' +
                ", home_player_Y6='" + home_player_Y6 + '\'' +
                ", away_player_8='" + away_player_8 + '\'' +
                ", away_player_9='" + away_player_9 + '\'' +
                ", away_player_6='" + away_player_6 + '\'' +
                ", away_player_7='" + away_player_7 + '\'' +
                ", away_player_4='" + away_player_4 + '\'' +
                ", away_player_5='" + away_player_5 + '\'' +
                ", away_player_2='" + away_player_2 + '\'' +
                ", away_player_3='" + away_player_3 + '\'' +
                ", away_player_1='" + away_player_1 + '\'' +
                ", corner='" + corner + '\'' +
                ", home_player_X10='" + home_player_X10 + '\'' +
                ", home_player_X11='" + home_player_X11 + '\'' +
                ", IWD='" + IWD + '\'' +
                ", home_player_Y5='" + home_player_Y5 + '\'' +
                ", IWA='" + IWA + '\'' +
                ", home_player_Y4='" + home_player_Y4 + '\'' +
                ", IWH='" + IWH + '\'' +
                ", LBA='" + LBA + '\'' +
                ", BWA='" + BWA + '\'' +
                ", BWD='" + BWD + '\'' +
                ", LBD='" + LBD + '\'' +
                ", away_player_X9='" + away_player_X9 + '\'' +
                ", away_player_X8='" + away_player_X8 + '\'' +
                ", BWH='" + BWH + '\'' +
                ", away_player_X6='" + away_player_X6 + '\'' +
                ", away_player_X5='" + away_player_X5 + '\'' +
                ", away_player_X4='" + away_player_X4 + '\'' +
                ", away_player_X3='" + away_player_X3 + '\'' +
                ", away_player_X2='" + away_player_X2 + '\'' +
                ", away_player_X1='" + away_player_X1 + '\'' +
                ", home_player_Y8='" + home_player_Y8 + '\'' +
                ", away_player_Y10='" + away_player_Y10 + '\'' +
                ", away_player_Y11='" + away_player_Y11 + '\'' +
                ", home_team_api_id=" + home_team_api_id +
                ", GBD='" + GBD + '\'' +
                ", GBA='" + GBA + '\'' +
                ", GBH='" + GBH + '\'' +
                ", home_team_goal=" + home_team_goal +
                ", home_player_Y11='" + home_player_Y11 + '\'' +
                ", match_api_id=" + match_api_id +
                ", country_id=" + country_id +
                ", away_player_X11='" + away_player_X11 + '\'' +
                ", away_player_X10='" + away_player_X10 + '\'' +
                ", away_player_10='" + away_player_10 + '\'' +
                ", away_player_11='" + away_player_11 + '\'' +
                ", card='" + card + '\'' +
                ", stage=" + stage +
                ", PSH='" + PSH + '\'' +
                ", PSA='" + PSA + '\'' +
                ", PSD='" + PSD + '\'' +
                ", home_player_9='" + home_player_9 + '\'' +
                ", home_player_8='" + home_player_8 + '\'' +
                ", home_player_3='" + home_player_3 + '\'' +
                ", home_player_2='" + home_player_2 + '\'' +
                ", home_player_1='" + home_player_1 + '\'' +
                ", home_player_Y10='" + home_player_Y10 + '\'' +
                ", home_player_7='" + home_player_7 + '\'' +
                ", home_player_6='" + home_player_6 + '\'' +
                ", home_player_5='" + home_player_5 + '\'' +
                ", home_player_4='" + home_player_4 + '\'' +
                ", WHD='" + WHD + '\'' +
                ", home_player_X5='" + home_player_X5 + '\'' +
                ", WHA='" + WHA + '\'' +
                ", WHH='" + WHH + '\'' +
                ", BSH='" + BSH + '\'' +
                ", BSD='" + BSD + '\'' +
                ", home_player_11='" + home_player_11 + '\'' +
                ", home_player_10='" + home_player_10 + '\'' +
                ", BSA='" + BSA + '\'' +
                ", possession='" + possession + '\'' +
                ", season='" + season + '\'' +
                ", away_player_X7='" + away_player_X7 + '\'' +
                ", SJH='" + SJH + '\'' +
                ", LBH='" + LBH + '\'' +
                ", SJA='" + SJA + '\'' +
                ", away_team_goal=" + away_team_goal +
                ", SJD='" + SJD + '\'' +
                ", shotoff='" + shotoff + '\'' +
                ", shoton='" + shoton + '\'' +
                ", away_player_Y1='" + away_player_Y1 + '\'' +
                ", away_player_Y2='" + away_player_Y2 + '\'' +
                ", away_player_Y3='" + away_player_Y3 + '\'' +
                ", away_player_Y4='" + away_player_Y4 + '\'' +
                ", away_player_Y5='" + away_player_Y5 + '\'' +
                ", away_player_Y6='" + away_player_Y6 + '\'' +
                ", away_player_Y7='" + away_player_Y7 + '\'' +
                ", away_player_Y8='" + away_player_Y8 + '\'' +
                ", away_player_Y9='" + away_player_Y9 + '\'' +
                ", away_team_api_id=" + away_team_api_id +
                ", id='" + id + '\'' +
                ", goal='" + goal + '\'' +
                ", cross='" + cross + '\'' +
                ", home_player_Y9='" + home_player_Y9 + '\'' +
                ", home_player_X4='" + home_player_X4 + '\'' +
                ", VCA='" + VCA + '\'' +
                ", home_player_X6='" + home_player_X6 + '\'' +
                ", home_player_X7='" + home_player_X7 + '\'' +
                ", VCD='" + VCD + '\'' +
                ", home_player_X1='" + home_player_X1 + '\'' +
                ", home_player_X2='" + home_player_X2 + '\'' +
                ", home_player_X3='" + home_player_X3 + '\'' +
                ", VCH='" + VCH + '\'' +
                ", home_player_X8='" + home_player_X8 + '\'' +
                ", home_player_X9='" + home_player_X9 + '\'' +
                ", date='" + date + '\'' +
                ", B365H='" + B365H + '\'' +
                ", league_id=" + league_id +
                ", B365D='" + B365D + '\'' +
                ", B365A='" + B365A + '\'' +
                ", foulcommit='" + foulcommit + '\'' +
                '}';
    }
}
