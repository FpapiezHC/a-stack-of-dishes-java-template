package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testPushAndSize() {
        DishStack stack = new DishStack();
        assertEquals(0, stack.size());
        stack.push(new Dish("Plate A"));
        assertEquals(1, stack.size());
    }

    @Test
    void testPeek() {
        Dish d = new Dish("Peek Dish");
        DishStack stack = new DishStack();
        stack.push(d);
        assertEquals("Peek Dish", stack.peek().getDescription());
    }

    @Test
    void testPop() {
        Dish d = new Dish("Pop Dish");
        DishStack stack = new DishStack();
        stack.push(d);
        Dish popped = stack.pop();
        assertEquals("Pop Dish", popped.getDescription());
        assertEquals(0, stack.size());
    }
}
