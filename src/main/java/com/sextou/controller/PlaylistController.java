package com.sextou.controller;

import com.sextou.model.Playlist;
import com.sextou.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {
    @Autowired
    private PlaylistService playlistService;
    
    @GetMapping
    public ResponseEntity<List<Playlist>> listarTodas() {
        return ResponseEntity.ok(playlistService.listarTodas());
    }
    
    @PostMapping
    public ResponseEntity<Playlist> criar(@RequestBody Playlist playlist) {
        return ResponseEntity.ok(playlistService.salvar(playlist));
    }
}