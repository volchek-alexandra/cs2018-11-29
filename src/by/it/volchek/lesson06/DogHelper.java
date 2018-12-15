package by.it.volchek.lesson06;

public class DogHelper {
    private String name;
    private int age;

    static void printAllNames(Dog[] dogs) {
        for (Dog dog: dogs) {
            System.out.print(dog.getName()+" ");
        }
        System.out.println();

    }
    static double  averageAge(Dog[] dogs) {
        double sum=0;
        for (Dog dog : dogs) {
            sum = sum+dog.getAge();

        }
     return sum/dogs.length;

    }

}


