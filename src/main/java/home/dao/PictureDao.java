package home.dao;

import home.models.Picture;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/*
    Picture DAO
 */
@Repository
public class PictureDao {

    private List<Picture> pictures = new ArrayList<>();

    public PictureDao() {
        pictures.add(new Picture(1,null, "location"));
    }


    public List<Picture> getAllPictures(){
        return pictures;
    }

    public Picture getPictureById(int id) {
        return pictures.stream().filter((pic) -> {
            return pic.getId() == id;
        }).findFirst().get();
    }
}
