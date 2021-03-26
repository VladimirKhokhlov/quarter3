package lesson1.BoxWithFruits;

import java.util.ArrayList;

public class Box<T extends Fruits> {

    private final ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {
        this.fruits = new ArrayList<T>();
    }

    public float getWeight() {
        return this.fruits.size() * this.fruits.get(0).getWeight();
    }

    public void addInBox(T fruit) {
        fruits.add(fruit);
    }

}
