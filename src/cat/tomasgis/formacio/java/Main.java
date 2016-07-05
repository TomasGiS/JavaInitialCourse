package cat.tomasgis.formacio.java;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {


        Dog doggy = new Dog();

        //Els atributs/fields són privats per defecte
        //no es poden modificar fora de la classe Dog

        //Obtenció dels atributs del gos
        System.out.println("\nThe data has not been initialized");
        showDogData(doggy);

        //Modificació dels atributs del gos
        doggy.setName("Doggy");
        doggy.setOwnerName("Tomas");
        doggy.setPlateNumber(123);
        doggy.setSkinColor("Green");
        doggy.setWeight(45.8f);

        //Obtenció dels atributs del gos
        System.out.println("\nThe data has a value assigned");
        showDogData(doggy);

        doggy.howling();

        HashMap<String,Object> parameters = new HashMap<>();
        parameters.put(HashDog.NAME,"Terminator");
        parameters.put(HashDog.OWNER,"Tomas");
        parameters.put(HashDog.PLATE,123);
        parameters.put(HashDog.SKIN_COLOR,"Verd");
        parameters.put(HashDog.WEIGHT,45.8f);
        //Age is set itself

        HashDog hashDog = new HashDog(parameters);
        System.out.println("\n"+hashDog.toString());

        //Fish testing
        Fish fish = new Fish();
        fish.setName("Nemo");
        fish.setAguaDulce(false);
        fish.setColoPrincipal("Magenta");
        fish.setColorSecundario("Rosa");

        System.out.println("\nFish: "+ fish.toString() );


        castTesting();


        Cat cat = new Cat();
        cat.setName("Cat");
        Cat cat2 = new Cat();
        cat2.setName("Cat2");

        String animal = "animal string";
        ArrayList<Animal> furgoneta = new ArrayList<>();
        furgoneta.add(doggy);
        furgoneta.add(cat);
        furgoneta.add(cat2);
        //furgoneta.add(animal);

        System.out.println("\nQuien va en la furgoneta?\n");
        for (int index=0; index<furgoneta.size();index++)
            System.out.println(furgoneta.get(index).getName());



    }

    private static void castTesting() {
        Fish nemo2 = new Fish();
        nemo2.setName("Nemo 2");
        nemo2.setAguaDulce(false);
        nemo2.setColoPrincipal("Magenta");
        nemo2.setColorSecundario("Rosa");

        System.out.println("Color principal: " + nemo2.getColoPrincipal());

        Animal animal1 = nemo2;
        //Cast error
        //Cat cat2 = (Cat)animal1;

        System.out.println("Color principal animal: " +((Fish)animal1).getColoPrincipal());

        System.out.println("Name: " + animal1.getName());
    }

    public static void showDogData(Dog dog)
    {
        System.out.println("Nom: " + dog.getName());
        System.out.println("Owner: " + dog.getOwnerName());
        System.out.println("Plate: " + dog.getPlateNumber());
        System.out.println("Skin color: " + dog.getSkinColor());
        System.out.println("Weight: " + dog.getWeight());
        System.out.println("Edat: "+ dog.getAge());
    }
}
