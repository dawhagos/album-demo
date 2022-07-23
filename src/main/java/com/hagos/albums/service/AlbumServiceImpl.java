package com.hagos.albums.service;

import com.hagos.albums.model.Album;
import com.hagos.albums.repository.AlbumRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumServiceImpl implements AlbumService {

    private AlbumRepository albumRepository;

    public AlbumServiceImpl(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> findAlbums() {
        return albumRepository.findAll();
    }

    @Override
    public String createAlbum(Album album) {
        albumRepository.save(album);
        return "Album created successfully!";
    }
}
