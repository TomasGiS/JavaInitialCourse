package cat.tomasgis.formacio.java;

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
        System.out.println(hashDog.toString());

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
