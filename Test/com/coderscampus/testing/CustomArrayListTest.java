package com.coderscampus.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CustomArrayListTest {

    @Test
    void should_add_one_item_to_list() {
        //Arrange
        CustomArrayList<String> peeps = new CustomArrayList<>();
        //Act
        peeps.add("Invincible");
        peeps.add("Omni Man");
        peeps.add("The Red Blur");
        assertEquals(3, peeps.getSize());
        assertEquals("Invincible", peeps.get(0));
        assertEquals("Omni Man", peeps.get(1));
        assertEquals("The Red Blur", peeps.get(2));

    }

    @Test
    void whenAddingItemToInvalidIndex_thenIndexOutOfBoundsExceptionIsThrown() {
        //Arrange
        CustomArrayList<String> peeps = new CustomArrayList<>();

        int index = 0;
        int size = 0;
        if (index >=0 && index<size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        //Act
        peeps.add("Invincible");
        peeps.add("Omni Man");
    //    peeps.add("The Red Blur");

        //Try to add an item at a negative index

        try {
            peeps.add(-1, "The Red Blur"); // Index 5 is out of bounds
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception
        }

        // add an item at index greater than list size
        try {
            peeps.add(5, "The Red Blur"); // Index 5 is out of bounds
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception
        }

        //add an item at end of list

        peeps.add(2, "The Red Blur");

        assertEquals(3,peeps.getSize());
        assertEquals("Invincible", peeps.get(0));
        assertEquals("Omni Man", peeps.get(1));
        assertEquals("The Red Blur", peeps.get(2));

        }


        @Test
        void should_getSize () {
        //Arrange
            CustomArrayList<String> peeps = new CustomArrayList<>();

        //Act
            peeps.add("Invincible");
            peeps.add("Omni Man");
            peeps.add("The Red Blur");

            //verify size after adding to arraylist
            assertEquals(3,peeps.getSize());

            //remove an item and check again
            peeps.remove(1);
            assertEquals(2,peeps.getSize());

        }

        @Test
        void should_T_Get() {
        //Arrange
            CustomArrayList<String> peeps = new CustomArrayList<>();

        //Act
            peeps.add("Invincible");
            peeps.add("Omni Man");
            peeps.add("The Red Blur");

        //Assert
            assertEquals("Invincible", peeps.get(0));
            assertEquals("Omni Man", peeps.get(1));
            assertEquals("The Red Blur", peeps.get(2));
            //Assertion failed error when returning something other than this expected order

        }
    @Test
        void should_Remove_T() {
            //Arrange
            CustomArrayList<String> peeps = new CustomArrayList<>();

            //Act
            peeps.add("Invincible");
            peeps.add("Omni Man");
            peeps.add("The Red Blur");

            //verify size
            assertEquals(3, peeps.getSize());
            //Remove an element at index 2
            peeps.remove(1);

            //Verify removal
            assertEquals("Invincible",peeps.get(0));
            assertEquals("The Red Blur",peeps.get(1));
            assertEquals(2, peeps.getSize());

        // Try to remove an index that is out of bounds
        try {
            peeps.remove(4);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception, do nothing
        }

    }

}
