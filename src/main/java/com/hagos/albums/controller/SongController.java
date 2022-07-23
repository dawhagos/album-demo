package com.hagos.albums.controller;

import com.hagos.albums.model.Song;
import com.hagos.albums.service.SongService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "Songs")
@RequestMapping("songs")
public class SongController {
    private SongService songService;

    public SongController(SongService songService) {
        this.songService = songService;
    }

    @PostMapping("/publish")
    public ResponseEntity<?> publishSong(@RequestBody Song song) {
        return ResponseEntity.ok(songService.createSong(song));
    }

    @GetMapping("/album/{albumId}")
    public ResponseEntity<?> fetchSongsByAlbumId(@PathVariable Long albumId) {
        return ResponseEntity.ok(songService.findByAlbum(albumId));
    }

}
