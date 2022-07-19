package com.hagos.albums.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "albums")
@Data
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String artist;
    private String title;


    private String genre;
    private String label;


    @Column(name = "year")
    private int year;

    private String info;

    @Column(name = "user_id")
    private int userId;

    @OneToMany(mappedBy = "album", fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH})
    private List<Song> songs;
}