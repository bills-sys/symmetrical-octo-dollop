package com.github.billssys.dollop.application;

import com.github.billssys.dollop.model.entities.Animal;

public class App {

    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.hashCode());
    }

}
