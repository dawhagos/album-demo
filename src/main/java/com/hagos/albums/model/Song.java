//package com.hagos.albums.model;
//
//import lombok.Data;
//import org.hibernate.annotations.GenericGenerator;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "songs")
//@Data
//public class Song {
//    @Id
//    @GeneratedValue(generator = "increment")
//    @GenericGenerator(name = "increment", strategy = "increment")
//    private int id;
//
//    @Column(name = "track_number")
//    private String trackNumber;
//
//    private String title;
//
//    @ManyToOne(cascade = {CascadeType.ALL})
//    @JoinColumn(name = "album_id")
//    private Album album;
//
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "user_id", nullable = false)
//    private User user;
//
//}