package com.hagos.albums.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "songs")
@Data
public class Song {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private int id;

    @Column(name = "track_number")
    private String trackNumber;

    private String title;
    private String music;
    private String lyrics;

/*    @Column(name = "album_id", insertable = false, updatable = false)
    private int albumId;*/

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH,
            CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name = "album_id")
    private Album album;

}