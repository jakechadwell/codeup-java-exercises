import java.util.Arrays;

public class ArraysExercises {

        public static Person[] addPerson(Person people[], Person newPerson){
            Person[] newArray = Arrays.copyOf(people, (people.length+1));
            newArray[people.length] = newPerson;
            return newArray;
        }

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            String numbersToString = Arrays.toString(numbers);
            System.out.println(numbersToString);

            Person[] people = new Person[3];
            people[0] = new Person("Jake");
            people[1] = new Person("Adam");
            people[2] = new Person("Josh");
            for (Person person : people) {
                System.out.println(person.getName());
            }
            Person kelvon = new Person("Kelvon");
            System.out.println("kelvon = " + kelvon.getName());addPerson(people, kelvon);
            
        }

}
