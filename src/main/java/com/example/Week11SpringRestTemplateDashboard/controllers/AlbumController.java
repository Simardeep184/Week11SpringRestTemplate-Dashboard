package com.example.Week11SpringRestTemplateDashboard.controllers;

import com.example.Week11SpringRestTemplateDashboard.models.Album;
import com.example.Week11SpringRestTemplateDashboard.services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dashboard")
public class AlbumController {

    private final AlbumService albumService;

    @Autowired
    public AlbumController(AlbumService albumService){
        this.albumService = albumService;
    }

// save album data coming from the album microservice to the dashboard db
    @PostMapping("/saveAlbum")
    public void saveAlbum(@RequestBody List<Album> albums){
        albumService.saveAlbum(albums);
    }
}
