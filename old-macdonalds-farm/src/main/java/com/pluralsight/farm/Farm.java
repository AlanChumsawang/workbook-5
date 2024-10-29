package com.pluralsight.farm;

import java.util.ArrayList;

public class Farm {

    private ArrayList<Animal> animals = new ArrayList<>();

    // The way the song works:
    // Each time we add a new animal
    // Sing part 1 with the new animal
    // Sing part 2 with the new animal
    // sing part 2 for each of the preexisting animals
    // Finally, sing part 3

    String verse = """
            (Verse)
            Old MacDonald had a farm, E-I-E-I-O!
            And on his farm he had a %s, E-I-E-I-O!
            """;

    String refrain = """
            (Refrain)
            With a %s-%s here and a %s-%s there,
            Here a %s, there a %s,
            Everywhere a %s-%s,
            """;
    String coda = """
            (Coda)
            Old MacDonald had a farm, E-I-E-I-O!
            \n
            """;

    public void printOneVerse(String name, String sound){
        System.out.printf(verse, name, sound);
    }

    public void printRefrain(String name, String sound){
        System.out.printf(refrain, sound, sound, sound, sound, sound, sound, sound, sound);
    }
    public void printCoda(){
        System.out.print(coda);
    }
    public void printWholeSong(){
        if(animals.size() > 0){
            Animal lastAnimal = animals.get(animals.size() - 1);
            printOneVerse(lastAnimal.getName(), lastAnimal.getSound());
            printRefrain(lastAnimal.getName(), lastAnimal.getSound());
            for(int i = 0; i < animals.size() - 1; i++){
                Animal animal = animals.get(i);
                printRefrain(animal.getName(), animal.getSound());
            }
            printCoda();
        }
    }

    public void addAnimal(Animal a) throws BadAnimalException {
        if(a == null) throw new BadAnimalException("Bad animal!!!");

        animals.add(a);
    }



}
