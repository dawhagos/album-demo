package com.hagos.albums.model;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
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

    private int year;

    @Min(1)
    @Max(10)
    private double rating;

//    @OneToMany(mappedBy = "album", fetch = FetchType.LAZY,
//            cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH})
//    private List<Song> songs;

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "user_name", referencedColumnName = "username", nullable = false)
//    private User user;

}