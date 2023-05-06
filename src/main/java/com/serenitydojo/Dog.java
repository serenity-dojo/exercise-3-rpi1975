package com.serenitydojo;

public class Dog {

    private String name;
    private String favoriteToy;
    private int age;

    public Dog(String name, String favoriteToy, int age) {
        this.setName(name);
        this.setFavoriteToy(favoriteToy);
        this.setAge(age);
    }

    private void setName(String name) {
        this.name = name;
    }
    private void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }
    private void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getFavoriteToy() {
        return favoriteToy;
    }
    public int getAge() {
        return age;
    }
}
