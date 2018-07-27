package home.controllers;

import home.managers.PictureManager;
import home.models.Picture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.Callable;

@RestController
@RequestMapping("/picture")
public class PictureController {

    @Autowired
    private PictureManager pictureManager;

    @GetMapping("/getAllPictures")
    public Callable<List<Picture>> getAllPictures(){
        return () -> this.pictureManager.getAllPictures();
    }

}
