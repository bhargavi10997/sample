package com.example.demo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "genres")
public class GenreEntity implements Serializable {

    private static final long serialVersionUID = 2970999815981518236L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "genre")
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
