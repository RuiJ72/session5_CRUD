package com.openbootcamp.session4;

public class Main {

    public static void main(String[] args) {

        CarCRUD carCRUD = new CarCRUDImpl();
        carCRUD.save();
        carCRUD.findAll();
        carCRUD.delete();
    }
}
