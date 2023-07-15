package com.serenitydojo.model;

public class Feeder {
    public String feeds(String animal, boolean isPremium) {
        if (animal.equals("Cat")) {
            /*     if (isPremium) {
                return "Salmon";
            } else {
                return "Tuna";
            }*/
            return (isPremium) ? "Salmon" : "Tuna";
        } else if (animal.equals("Dog")) {
            return "DogFood";
        }
        return "Cabbage";
    }
}
