package org.example;

public class DishStack {
    private Dish[] stack;
    private int top;
    private int capacity;

    public DishStack() {
        capacity = 19; 
        stack = new Dish[capacity];
        top = -1;
    }

    public void push(Dish dish) {
        if (top == capacity - 1) {
            System.out.println("Stack is full. Cannot push.");
            return;
        }
        stack[++top] = dish;
    }

    public Dish pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        return stack[top--];
    }

    public Dish peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return null;
        }
        return stack[top];
    }
    public int size() {
        return top + 1;
    }
    public void clear() {
        top = -1;
    }
}
