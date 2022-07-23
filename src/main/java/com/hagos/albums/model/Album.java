package com.hagos.albums.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "albums")
@Data
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String artist;

    private String title;

    private String genre;

    private int year;

    @Transient
    private double rating;

//    @OneToMany(mappedBy = "album", fetch = FetchType.LAZY,
//            cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.REFRESH})
//    private List<Song> songs;

    @JsonBackReference(value = "albumsToUser")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @JsonManagedReference(value = "songsToAlbum")
    @OneToMany(mappedBy = "album", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Song> songs;

    @PostLoad
    public void calculateRating() {
        double total = 0;
        for (Song song : songs) {
            total += song.getRating();
        }
        rating = total/songs.size();
    }


}