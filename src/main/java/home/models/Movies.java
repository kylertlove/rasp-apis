package home.models;

import java.util.Random;

/**
 * Movie POJO
 */
public class Movies {

    private final long id;
    private String name;
    private int year;

    public Movies(long id, String name){
        this.id = id;
        this.name = name;
        Random rand = new Random();
        this.year = 1970 + rand.nextInt(50);
    }

    public long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }
}