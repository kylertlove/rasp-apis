package home.dao;

import home.models.Movies;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * Movie DAO
 */
@Repository
public class MovieDao{

    private int counter = 0;
    private List<Movies> movies = new ArrayList<>();

    public MovieDao() {
        movies.add(new Movies(this.counter++, "Jaws"));
        movies.add(new Movies(this.counter++, "Jaws II"));
        movies.add(new Movies(this.counter++, "Caddyshack"));
        movies.add(new Movies(this.counter++, "Batman"));
        movies.add(new Movies(this.counter++, "Finding Nemo"));
        movies.add(new Movies(this.counter++, "21"));
        movies.add(new Movies(this.counter++, "Monsters"));
        movies.add(new Movies(this.counter++, "Cars"));
    }

    //fake data since my media server is broken and I cant test
    public List<Movies> getAllMovies(){
        return movies;
    }

    public Movies getMovieById(int id) {
        return movies.stream().filter((movie) -> {
            return movie.getId() == id;
        }).findFirst().get();
    }
}