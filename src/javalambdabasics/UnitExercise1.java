package javalambdabasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExercise1 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Isuru", "Sankhajith", 10),
                new Person("Iu", "Shajith", 30),
                new Person("uru", "nkhajith", 50),
                new Person("suru", "nkhajith", 60),
                new Person("u", "ankhajith", 70)
        );

        // Sort by last name
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getLastName().compareTo(p2.getLastName());
            }
        });

        // Print sorted list
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

