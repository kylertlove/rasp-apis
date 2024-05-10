package home.controllers;

import java.util.List;
import java.util.concurrent.Callable;
import home.models.Picture;
import home.managers.PictureManager;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/async")
public class AsyncController {

    @Autowired
    private PictureManager pictureManager;
    
    @GetMapping("/picture")
    public Callable<List<Picture>> getAllPictures() {
        return () -> {
            System.out.println("Long Poll API Call");
            Thread.sleep(5000);
            return pictureManager.getAllPictures();
        };
    }
}
