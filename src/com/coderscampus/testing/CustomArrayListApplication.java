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

        peeps.remove(5); //shows the implemented removal method works

        System.out.println("The epic saga continues on the next exciting episode of .... featuring: ");
        System.out.println(peeps.getSize());
        System.out.println(peeps.get(3)); // randomly pick different numbers within the array to test
        System.out.println(peeps.get(5));
        // the code works because the array is sized at 10 and
        // should give an array out of bounds exception or index out of bounds without the override code created
    }

}
