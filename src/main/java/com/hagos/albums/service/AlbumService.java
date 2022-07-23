package com.hagos.albums.service;

import com.hagos.albums.model.Album;


import java.util.List;
import java.util.Optional;

public interface AlbumService {
    List<Album> findAlbums();

    Optional<Album> findById(Long albumId);

    String createAlbum(Album album);

    List<Album> findByUserId(Long userId);
}
