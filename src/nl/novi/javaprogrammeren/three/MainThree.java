package nl.novi.javaprogrammeren.three;

import nl.novi.javaprogrammeren.three.sub.Doctor;

public class MainThree {

    public static void main(String[] args) {

        Doctor hans = new Doctor("1", "Hans");

        System.out.println(hans.getSofiNumber());
   }
}
