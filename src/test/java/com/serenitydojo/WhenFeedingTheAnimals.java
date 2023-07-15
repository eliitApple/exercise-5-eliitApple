package com.serenitydojo;

import com.serenitydojo.model.Feeder;
import org.junit.Assert;
import org.junit.Test;


public class WhenFeedingTheAnimals {
    @Test
    public void shouldFeedCatsWithTuna() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Cat", false);

        Assert.assertEquals("Cabbage", food);
        System.out.println(food);
    }

    @Test
    public void shouldFeedHamstersWithCabbage() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Hamster", false);

        Assert.assertEquals("Cabbage", food);
    }

    @Test
    public void shouldFeedDogWithDogFood() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Dog", false);

        Assert.assertEquals("Cabbage", food);
    }

    @Test
    public void shouldFeedPremiumCatsPremiumFood() {
        Feeder feeder = new Feeder();

        String food = feeder.feeds("Cat", true);

        Assert.assertEquals("Salmon", food);
    }


}
