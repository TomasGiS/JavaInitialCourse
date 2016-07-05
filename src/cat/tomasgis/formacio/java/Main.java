package cat.tomasgis.formacio.java;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        //Creates a new Dog instance and the new instance values are setup too
        Dog doggy = createDogInstance();

        System.out.println("\nThe data has a value assigned");
        showDogData(doggy);
        doggy.howling();

        HashDog hashDog = createHashDogInstance();
        //The method toString is overrided to show data as the class HashDog indicates
        System.out.println("\n"+hashDog.toString());


        Fish fish = createFishInstance();
        //The method toString is overrided to show data as the class Fish indicates
        System.out.println("\nFish: "+ fish.toString() );


        castTesting();

        collectionTesting(doggy);

    }

    /**
     * Create and set a Dog instance
     * @return a initilized instance of Dog class
     */
    private static Dog createDogInstance()
    {
        Dog doggy = new Dog();

        //Els atributs/fields són privats per defecte
        //no es poden modificar fora de la classe Dog

        //Obtenció dels atributs del gos
        //System.out.println("\nThe data has not been initialized");
        //showDogData(doggy);

        //Modificació dels atributs del gos
        doggy.setName("Doggy");
        doggy.setOwnerName("Tomas");
        doggy.setPlateNumber(123);
        doggy.setSkinColor("Green");
        doggy.setWeight(45.8f);

        return doggy;
    }

    /**
     * Create and set a HashDog instance
     * @return a initilized instance of HashDog class
     */
    private static HashDog createHashDogInstance()
    {
        HashMap<String,Object> parameters = new HashMap<>();
        parameters.put(HashDog.NAME,"Terminator");
        parameters.put(HashDog.OWNER,"Tomas");
        parameters.put(HashDog.PLATE,123);
        parameters.put(HashDog.SKIN_COLOR,"Verd");
        parameters.put(HashDog.WEIGHT,45.8f);
        //Age is set itself

        HashDog hashDog = new HashDog(parameters);

        return hashDog;
    }

    /**
     * Create and set a Fish instance
     * @return a initilized instance of Fish class
     */
    private static Fish createFishInstance()
    {
        //Fish testing
        Fish fish = new Fish();
        fish.setName("Nemo");
        fish.setAguaDulce(false);
        fish.setColoPrincipal("Magenta");
        fish.setColorSecundario("Rosa");

        return fish;
    }

    /**
     * The method shows how to store Animal or subtypes of Animal into a Collection structure
     * @param dog
     */
    private static void collectionTesting(Dog dog)
    {
        Cat cat = new Cat();
        cat.setName("Cat");
        Cat cat2 = new Cat();
        cat2.setName("Cat2");

        String animal = "animal string";
        ArrayList<Animal> van = new ArrayList<>();
        van.add(dog);
        van.add(cat);
        van.add(cat2);

        // The animal cannot be added to van arraylist structure because animal is not
        // an Animal instance or a subtype of Animal
        //van.add(animal);

        System.out.println("\nQuien va en la furgoneta?\n");
        for (int index=0; index<van.size();index++)
            System.out.println(van.get(index).getName());
    }

    /**
     * The function shows how an object can be cast to the superclass type.
     * A superclass instance can be cast to subtype class too if the instance is an instance of the subtype class
     */
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

    /**
     * Auxiliar function that allows to show Dog class parameter values
     * @param dog indicates the dog instance whose data will be shown
     */

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
