package com.serenitydojo;

public class Hampster extends Pet {
    private String favoriteGame;

    public Hampster(String name, int age) {
        super(name, age);
    }

    @Override
    public String play() {
        return "plays with wheel";
    }


}
