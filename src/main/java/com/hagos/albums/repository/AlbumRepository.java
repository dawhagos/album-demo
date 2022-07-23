package com.hagos.albums.repository;

import com.hagos.albums.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AlbumRepository extends JpaRepository<Album, Long> {
    List<Album> findAll();

    Optional<Album> findById(Long albumId);

    List<Album> findByUserId(Long userId);
}
