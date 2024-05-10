package home.controllers;

import home.managers.MovieManager;
import home.models.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieManager movieManager;

    @GetMapping()
    public List<Movies> getAllMovies() {
        return movieManager.getAllMovies();
    }

    @GetMapping("/{id}")
    public Movies getMovieById(@PathVariable("id") int id) {
        return movieManager.getMovieById(id);
    }
}
