package com.coderscampus.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {
    private Object[] items = new Object[10];
    private int size = 0;


    @Test
    void should_add_one_item_to_list() {
    CustomList <Integer> sut = new CustomArrayList<>();
    for (int i = 0; i<10;i++) {
        sut.add(i);
    }
        sut.remove(9);
        sut.remove(7);
        System.out.println(sut);
        sut.add(1000);
        sut.add(7,1001);
        sut.add(7,1002);
        sut.add(7,89);
        sut.remove(7);
        sut.add(2000);
        sut.add(3000);



        //Arrange
//        CustomList<String> peeps = new CustomArrayList<>();
//
////        Act
//        for (int i = 0; i<10;i++) {
//            peeps.add(String.valueOf(i));
//        }
//        peeps.add(0,"Invincible");
//        peeps.add(1,"Omni Man");
//        peeps.add(2,"The Red Blur");
//        peeps.add(3,"Goku");
//        peeps.add(4,"Captain America");
//        peeps.add(5,"Wolverine");
//        peeps.add(6,"Miles Morales");
//        peeps.add(7,"Black Panther");
//        peeps.add(8,"Iron Man");
//        peeps.add(9,"Superman");
//        assertEquals(20, peeps.getSize());
//
//        peeps.remove(3);
//
//
//
//        assertEquals("Invincible", peeps.get(0));
//        assertEquals("Omni Man", peeps.get(1));
//        assertEquals("The Red Blur", peeps.get(2));


    }
    @Test
    void T_Add_SameIndex() {

        //Arrange
        CustomArrayList<String> peeps = new CustomArrayList<>();

        peeps.add(0, "Omni Man");
        assertEquals(1, peeps.getSize());
        System.out.println("After adding Omni Man: " + peeps); // print the contents of the list
        boolean found = false;
        for (int i = 0; i < peeps.getSize(); i++) {
            if (peeps.get(i).equals("Omni Man")) {
                found = true;
                break;
            }
        }
        assertTrue(found);
        assertEquals("Omni Man", peeps.get(0));

        //Add another hero to the same index
        peeps.add(0, "Superman");
        assertEquals(2, peeps.getSize());
        System.out.println("After adding Superman: " + peeps); // print the contents of the list
        found = false;
        for (int i = 0; i < peeps.getSize(); i++) {
            if (peeps.get(i).equals("Superman")) {
                found = true;
                break;
            }
        }
        assertTrue(found);
        found = false;
        for (int i = 0; i < peeps.getSize(); i++) {
            if (peeps.get(i).equals("Omni Man")) {
                found = true;
                break;
            }
        }
        assertTrue(found);
        assertEquals("Superman", peeps.get(0));
        assertEquals("Omni Man", peeps.get(1));
    }



    @Test
    void whenAddingItemToInvalidIndex_thenIndexOutOfBoundsExceptionIsThrown() {
        //Arrange
        CustomArrayList<String> peeps = new CustomArrayList<>();

//        int index = 0;
//        int size = 0;
//        if (index <=0 || index>=size) {
//            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
//        }



        //Act
        //verify the size of the list
        assertEquals(0, peeps.getSize());

        peeps.add(0,"Invincible");
        peeps.add(1,"Omni Man");
        peeps.add(2,"The Red Blur");

        //Try to add an item at a negative index

        try {
            peeps.add(-5, "Captain America"); // Index 5 is out of bounds
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception
        }

        // add an item at index greater than list size
        try {
            peeps.add(7, "Black Panther"); // Index 7 is out of bounds
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception
        }

        //add an item at end of list

        peeps.add(3, "Goku");

        assertEquals(4,peeps.getSize());
        assertEquals("Invincible", peeps.get(0));
        assertEquals("Omni Man", peeps.get(1));
        assertEquals("The Red Blur", peeps.get(2));
        assertEquals("Goku", peeps.get(3));





    }


        @Test
        void should_getSize () {
        //Arrange
            CustomArrayList<String> peeps = new CustomArrayList<>();

        //Act
            peeps.add("Invincible");
            peeps.add("Omni Man");
            peeps.add("The Red Blur");
            peeps.add("Goku");
            peeps.add("Captain America");
            peeps.add("Wolverine");
            peeps.add("Miles Morales");
            peeps.add("Black Panther");
            peeps.add("Iron Man");
            peeps.add("Black Cat");
            peeps.add("Superman");

            //verify size after adding to arraylist
            assertEquals(11,peeps.getSize());

            //remove an item and check again
            peeps.remove(5);
            assertEquals(10,peeps.getSize());

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
            peeps.add("Goku");
            peeps.add("Captain America");
            peeps.add("Wolverine");
            peeps.add("Miles Morales");
            peeps.add("Black Panther");
            peeps.add("Iron Man");
            peeps.add("Black Cat");
            peeps.add("Superman");
            //verify size
            assertEquals(11, peeps.getSize());
            //Remove an element at index 2
            peeps.remove(1);

            //Verify removal
            assertEquals("Invincible",peeps.get(0));
            assertEquals("The Red Blur",peeps.get(1));
            assertEquals(10, peeps.getSize());

        // Try to remove an index that is out of bounds
        try {
            peeps.remove(15);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // Expected exception, do nothing
        }

    }

}
