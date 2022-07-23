package com.hagos.albums.service;

import com.hagos.albums.model.Song;

import java.util.List;

public interface SongService {
    String createSong(Song song);

    List<Song> findByAlbum(Long albumId);
}
