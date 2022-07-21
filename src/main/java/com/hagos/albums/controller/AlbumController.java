package com.hagos.albums.controller;

import com.hagos.albums.model.Album;
import com.hagos.albums.security.AlbumService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "Albums")
@RequestMapping("album")
public class AlbumController {

    private AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/fetchAlbums")
    public ResponseEntity<?> fetchAlbums() {
        return ResponseEntity.ok(albumService.findAlbums());
    }

    @PostMapping("/publishAlbum")
    public ResponseEntity<?> publishAlbum(@RequestBody Album album) {
        return ResponseEntity.ok(albumService.createAlbum(album));
    }
}
