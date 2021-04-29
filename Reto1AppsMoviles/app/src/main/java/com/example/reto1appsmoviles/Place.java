package com.example.reto1appsmoviles;

public class Place {

    private String pathImage;
    private String direccion;
    private String namePlace;
    private String ranking;

    public Place(String pathImage,String direccion,String namePlace,String ranking) {
        this.pathImage = pathImage;
        this.direccion=direccion;
        this.namePlace=namePlace;
        this.ranking=ranking;
    }

    public Place() {

    }

    public String getPathImage() {
        return pathImage;
    }

    public void setPathImage(String pathImage) {
        this.pathImage = pathImage;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNamePlace() {
        return namePlace;
    }

    public void setNamePlace(String namePlace) {
        this.namePlace = namePlace;
    }

    public String getRanking() {
        return ranking;
    }

    public void setRanking(String ranking) {
        this.ranking = ranking;
    }
}
