package home.controllers;

import home.managers.MovieManager;
import home.models.Movies;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main Controller
 */
@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    MovieManager movieManager;

    @RequestMapping("/all-movies")
    public @ResponseBody List<Movies> getAllMoves(String name) {
        return movieManager.getAllMovies();
    }
}
