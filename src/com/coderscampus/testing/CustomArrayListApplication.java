package com.coderscampus.testing;

public class CustomArrayListApplication {

    public static void main(String[] args) {
        CustomArrayList<String> peeps = new CustomArrayList<>();
        peeps.add("Deadpool");
        peeps.add("The Red Ranger");
        peeps.add("Spiderman");
        peeps.add("Goku");
        peeps.add("Captain America");
        peeps.add("Wolverine");
        peeps.add("Miles Morales");
        peeps.add("Black Panther");
        peeps.add("Iron Man");
        peeps.add("Black Cat");
        peeps.add("Superman");


        peeps.remove(7); //shows the implemented removal method works
        peeps.add(5,"Goku");
        peeps.add(5,"Gohan");


        System.out.println("The epic saga continues on the next exciting episode of Hero Manga Z featuring: " + peeps.get(3) + " and " + peeps.get(5));
        System.out.println("Number of available heroes: " + peeps.getSize());
    //    System.out.println(peeps.get(3) + peeps.get(5)); // pick different numbers within the array to test
        // In the original assignment it should give an array out of bounds exception or index out of bounds without the override code created
        // the code works because the array is sized at 10 (down from 11) and number 4/6 moved to 3/5 when downsizing
    }

}
