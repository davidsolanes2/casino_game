package com.zitro.casino_v1.entity;

import org.hibernate.annotations.Formula;

import java.util.Collection;
import javax.persistence.*;

@Entity
@Table(name= "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "type")
    private String Type;

    @Column(name = "JSON_DATA")
    private String data;

    @Formula("JSON_DATA->>'$.prize'")
    private String prize;

    @Formula("JSON_DATA->>'$.bet_min'")
    private String Bet_min;

    @Formula("JSON_DATA->>'$.bet_max'")
    private String Bet_max;

    @Column(name = "probability")
    private String Probability;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public String getBet_min() {
        return Bet_min;
    }

    public void setBet_min(String Bet_min) {
        this.Bet_min = Bet_min;
    }

    public String getBet_max() {
        return Bet_max;
    }

    public void setBet_max(String Bet_max) {
        this.Bet_max = Bet_max;
    }

    public String getProbability() {
        return Probability;
    }

    public void setProbability(String probability) {
        Probability = probability;
    }
}
