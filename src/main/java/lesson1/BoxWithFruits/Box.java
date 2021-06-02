package lesson1.BoxWithFruits;

import java.util.ArrayList;

public class Box<T extends Fruits> {

    private final ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<T>();
    }

    public float getWeight() {
        return this.fruits.size() * this.fruits.get(0).getWeight();
    }

    public void addInBox(T fruit) {
        fruits.add(fruit);
    }

    public boolean compare(Box<?> anotherFruitBox) {
        return Math.abs(this.getWeight() - anotherFruitBox.getWeight()) < 0.00001;
    }

    public void pourOver(Box <T> anotherBox) {
        if (anotherBox == this) {
            return;
        }
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
