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


    public List<Picture> getAllPictures(){
        return new ArrayList<Picture>() {
            {
                new Picture(1, null, "location");
            }
        };
    }
}
