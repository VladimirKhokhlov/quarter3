package lesson1.BoxWithFruits;

public class BoxApp {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> appleBox = new Box<Apple>();
        Box<Orange> orangeBox = new Box<Orange>();

        appleBox.addInBox(apple);
        appleBox.addInBox(apple);
        System.out.println(appleBox.getWeight());

        orangeBox.addInBox(orange);
        orangeBox.addInBox(orange);
        orangeBox.addInBox(orange);
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox.compare(orangeBox));
    }
}
