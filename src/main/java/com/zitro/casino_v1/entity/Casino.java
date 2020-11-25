package com.zitro.casino_v1.entity;

import java.util.Collection;
import javax.persistence.*;

@Entity
@Table(name = "casino")
public class Casino {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name_casino")
    private String Name;

    public Casino() {}

    public Casino(Long id, String name) {
        this.id = id;
        Name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
