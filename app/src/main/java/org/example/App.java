package org.example;

public class App {
    public static void main(String[] args) {
        DishStack stack = new DishStack();

        Dish one = new Dish("A dish with one fish pattern on it");
        Dish two = new Dish("A dish with two fish patterns on it");
        Dish red = new Dish("A dish with a red fish pattern on it");
        Dish blue = new Dish("A dish with a blue fish pattern on it");

        System.out.println("Initial size: " + stack.size());

        stack.push(one);
        stack.push(two);
        stack.push(red);
        stack.push(blue);

        System.out.println("Size after pushing: " + stack.size());
        System.out.println("Peeked dish: " + stack.peek().getDescription());
        System.out.println("Popped dish: " + stack.pop().getDescription());
        System.out.println("Another popped dish: " + stack.pop().getDescription());
        System.out.println("Final size: " + stack.size());
    }
}
