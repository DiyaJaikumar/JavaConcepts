import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal("animal","big",100);//abstract class cannot be instantiated
        Dog dog = new Dog("Wolf","big",100);
        /*dog.makeNoise();
        doAnimalStuff(dog);*/

        ArrayList<Animal> animals= new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("german shepard","big",150));
        animals.add(new Fish("Goldfish","small",1));
        animals.add(new Fish("fish2","big",71));
        animals.add(new Dog("pug","small",20));

        for(Animal animal: animals){
            doAnimalStuff(animal);
            System.out.println();
        }

        }
    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }
}