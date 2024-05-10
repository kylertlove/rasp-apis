package home.controllers;

import home.managers.PictureManager;
import home.models.Picture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/picture")
public class PictureController {

    @Autowired
    private PictureManager pictureManager;

    @GetMapping()
    public List<Picture> getAllPictures(){
        return this.pictureManager.getAllPictures();
    }

    @GetMapping("/{id}")
    public Picture getPicById(@PathVariable("id") int id) {
        return this.pictureManager.getPictureById(id);
    }
}
