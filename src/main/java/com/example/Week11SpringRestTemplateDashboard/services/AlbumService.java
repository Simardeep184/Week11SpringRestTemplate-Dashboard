package com.example.Week11SpringRestTemplateDashboard.services;

import com.example.Week11SpringRestTemplateDashboard.models.Album;
import com.example.Week11SpringRestTemplateDashboard.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AlbumService {

    private final AlbumRepository albumRepository;


    @Autowired
    public AlbumService(AlbumRepository albumRepository){
        this.albumRepository = albumRepository;
    }

    public void saveAlbum(@RequestBody List<Album> albums) {
        this.albumRepository.saveAll(albums);
    }
}
