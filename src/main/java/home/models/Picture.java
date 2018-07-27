package home.models;

import java.awt.*;

/*
    Picture POJO
 */
public class Picture {

    private int id;
    private Image img;
    private String imgLocation;

    public Picture(int id, Image img, String imgLocation) {
        this.id = id;
        this.img = img;
        this.imgLocation = imgLocation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public String getImgLocation() {
        return imgLocation;
    }

    public void setImgLocation(String imgLocation) {
        this.imgLocation = imgLocation;
    }
}
