package com.sextou.service;

import com.sextou.model.Playlist;
import com.sextou.repository.PlaylistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PlaylistService {
    @Autowired
    private PlaylistRepository playlistRepository;
    
    public List<Playlist> listarTodas() {
        return playlistRepository.findAll();
    }
    
    public Playlist salvar(Playlist playlist) {
        return playlistRepository.save(playlist);
    }
}