package com.kvart;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;

import javax.persistence.*;

@Entity
@Table(name = "image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Expose
    private int id;

    @Column(columnDefinition="StringImage")
    private String imageBase64;

    @Expose
    private String nameImage;

    public Image() {
    }

    public Image(String imageBase64, String nameImage) {
        this.imageBase64 = imageBase64;
        this.nameImage = nameImage;
    }

    public int getId() {
        return id;
    }

    public String getImageBase64() {
        return imageBase64;
    }

    public String getNameImage() {
        return nameImage;
    }

    @Override
    public String toString() {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
        return gson.toJson(this);
    }
}
