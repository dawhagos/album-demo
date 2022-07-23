package com.hagos.albums.controller;

import com.hagos.albums.model.Album;
import com.hagos.albums.service.AlbumService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "Albums")
@RequestMapping("albums")
public class AlbumController {

    private AlbumService albumService;

    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/all")
    public ResponseEntity<?> fetchAlbums() {
        return ResponseEntity.ok(albumService.findAlbums());
    }

    @PostMapping("/publish")
    public ResponseEntity<?> publishAlbum(@RequestBody Album album) {
        return ResponseEntity.ok(albumService.createAlbum(album));
    }
}
