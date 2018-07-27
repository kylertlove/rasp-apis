package home.controllers;

import home.managers.MovieManager;
import home.models.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.Callable;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieManager movieManager;

    @GetMapping("/getAllMovies")
    public Callable<List<Movies>> getAllMovies() {
        return () -> movieManager.getAllMovies();
    }
}
