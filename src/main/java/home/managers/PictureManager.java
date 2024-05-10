package home.managers;

import home.dao.PictureDao;
import home.models.Picture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureManager {

    @Autowired
    PictureDao pictureDao;

    public List<Picture> getAllPictures() {
        return this.pictureDao.getAllPictures();
    }

    public Picture getPictureById(int id) {
        return pictureDao.getPictureById(id);
    }
}