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

    private int counter;

    //fake data since my db is still broken
    public List<Movies> getAllMovies(){
        List<Movies> movieList = new ArrayList<Movies>();
        movieList.add(new Movies(this.counter++, "Jaws"));
        movieList.add(new Movies(this.counter++, "Jaws II"));
        movieList.add(new Movies(this.counter++, "Caddyshack"));
        movieList.add(new Movies(this.counter++, "Batman"));
        movieList.add(new Movies(this.counter++, "Finding Nemo"));
        movieList.add(new Movies(this.counter++, "21"));
        movieList.add(new Movies(this.counter++, "Monsters"));
        movieList.add(new Movies(this.counter++, "Cars"));
        return movieList;
    }
}