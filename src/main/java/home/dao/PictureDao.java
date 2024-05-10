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
        pictures.add(new Picture(1,null, "/home/pictures"));
        pictures.add(new Picture(2,null, "/home/pictures"));
        pictures.add(new Picture(3,null, "/home/pictures"));
        pictures.add(new Picture(4,null, "/home/pictures"));
        pictures.add(new Picture(5,null, "/home/pictures"));
    }


    public List<Picture> getAllPictures(){
        return pictures;
    }

    public Picture getPictureById(int id) {
        return pictures.stream().filter(p->p.getId()==id).findFirst().get();
    }
}
