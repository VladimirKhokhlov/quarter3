package lesson1.BoxWithFruits;

import java.util.ArrayList;

public class BoxApp {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        ArrayList<Apple> apples = new ArrayList<Apple>();
        ArrayList<Orange> oranges = new ArrayList<Orange>();
        Box<Apple> appleBox = new Box<Apple>(apples);
        Box<Orange> orangeBox = new Box<Orange>(oranges);
        appleBox.addInBox(apple);
        appleBox.addInBox(apple);
        appleBox.addInBox(apple);
        System.out.println(appleBox.getWeight());
        orangeBox.addInBox(orange);
        orangeBox.addInBox(orange);
        orangeBox.addInBox(orange);
        System.out.println(orangeBox.getWeight());
    }
}
