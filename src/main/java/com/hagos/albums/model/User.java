package com.hagos.albums.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false, unique = true, length = 45)
    private String username;
    @Column(nullable = false, length = 64)
    private String password;
//    private boolean enabled;

//    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_id")
//    private List<Album> albums;

}