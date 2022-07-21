package com.hagos.albums.security;

import com.hagos.albums.model.Album;


import java.util.List;

public interface AlbumService {
    List<Album> findAlbums();

    String createAlbum(Album album);
}
