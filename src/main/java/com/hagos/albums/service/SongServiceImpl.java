package com.hagos.albums.service;

import com.hagos.albums.model.Song;
import com.hagos.albums.repository.SongRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongServiceImpl implements SongService{
    private SongRepository songRepository;

    public SongServiceImpl(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public String createSong(Song song) {
        songRepository.save(song);
        return "Song posted successfully!";
    }

    @Override
    public List<Song> findByAlbum(Long albumId) {
        return songRepository.findByAlbumId(albumId);
    }
}
