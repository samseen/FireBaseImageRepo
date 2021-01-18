package com.example.imagestore;

public class Model {

    private String imageUrl;
    private String placeAddress;
    public Model() {

    }

    public Model(String imageUrl, String placeAddress) {
        this.imageUrl = imageUrl;
        this.placeAddress = placeAddress;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getPlaceAddress() { return placeAddress; }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setPlaceAddress(String placeAddress) { this.placeAddress = placeAddress; }
}
