package home.managers;

import home.dao.MovieDao;
import home.models.Movies;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/** Movie Manager */
@Service
public class MovieManager{

    @Autowired
    private MovieDao movieDao;

    /**  Return All Movies  */
    public List<Movies> getAllMovies(){
        return movieDao.getAllMovies();
    }

    public Movies getMovieById(int id) {
        return movieDao.getMovieById(id);
    }
}