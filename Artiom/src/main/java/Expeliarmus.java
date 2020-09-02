import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Expeliarmus {
    public enum lesson {
        WINTER, SPRING, AUTOMN, SUMMER

    };

    public static void main(String[] args) {
        List animals = new ArrayList();
        List domesticAnimals = new ArrayList();
        Collections.addAll(animals, "cat", "dog", "sheep");
        Collections.sort(animals);
//        for (Object animal : animals) {
//            System.out.println(animal);
//        }
        Collections.binarySearch(animals, "dog");
        domesticAnimals.add("cat");
        domesticAnimals.add("pig");
        domesticAnimals.add("pikachu");

        System.out.println(Collections.binarySearch(animals, "dog"));
        Collections.copy(domesticAnimals, animals);
        for (Object domesticAnimal : domesticAnimals) {
            System.out.println(domesticAnimal);
        }
    lesson actualSeason = lesson.WINTER;
    }

}

