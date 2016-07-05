package cat.tomasgis.formacio.java;

import java.util.HashMap;

/**
 * Created by TomasGiS on 5/7/16.
 * Exemple without generics and Reflection
 */
public class HashDog extends Dog{

    public static final String NAME="NAME";
    public static final String OWNER ="OWNER";
    public static final String PLATE = "PLATE";
    public static final String SKIN_COLOR = "SKIN_COLOR";
    public static final String WEIGHT = "WEIGHT";
    public static final String AGRESIVE="AGRESIVE";
    private static final String BIRTHDATE = "BIRTHDATE";

    private HashMap<String, Object> fields = null;


    /**
     *
     * @param parameter HashDog attributes. The parameters' keys must be part of constant HashDog attributes
     */
    public HashDog(HashMap<String,Object> parameter) {
        //super() calls Dog constructor
        super();

        if (parameter == null){
            this.fields = new HashMap<>();
        }
        else {
            this.fields = parameter;
        }
        //this.fields.put(HashDog.BIRTHDATE,this.birthDay);
    }


    public String get(String key)
    {
        if (key.equalsIgnoreCase(HashDog.BIRTHDATE))
        {
            return String.valueOf(this.getAge());
        }
        else if (    key.equalsIgnoreCase(HashDog.NAME) ||
                key.equalsIgnoreCase(HashDog.OWNER) ||
                key.equalsIgnoreCase(HashDog.PLATE) ||
                key.equalsIgnoreCase(HashDog.SKIN_COLOR) ||
                key.equalsIgnoreCase(HashDog.WEIGHT) ||
                key.equalsIgnoreCase(HashDog.AGRESIVE) ||
                key.equalsIgnoreCase(HashDog.BIRTHDATE)
                )
        {
            return ((String) this.fields.get(key));
        }
        else return "KEY_IS_NOT_SUPPORTED";

    }


    //Methods access as Dog class
    @Override
    public String getName() {
        return ((String) this.fields.get(HashDog.NAME));
    }

    @Override
    public void setName(String name) {
        this.fields.put(HashDog.NAME,name);
    }

    @Override
    public String getOwnerName() {
        return ((String) this.fields.get(HashDog.OWNER));
    }

    @Override
    public void setOwnerName(String ownerName) {
        this.fields.put(HashDog.OWNER,ownerName);
    }

    @Override
    public int getPlateNumber() {
        return ((Integer) this.fields.get(HashDog.PLATE));
    }

    @Override
    public void setPlateNumber(int plateNumber) {
        this.fields.put(HashDog.PLATE,plateNumber);
    }

    @Override
    public String getSkinColor() {
        return (String) this.fields.get(HashDog.SKIN_COLOR);
    }

    @Override
    public void setSkinColor(String skinColor) {
        this.fields.put(HashDog.SKIN_COLOR, skinColor);
    }

    @Override
    public float getWeight() {
        return (Float)this.fields.get(HashDog.WEIGHT);
    }

    @Override
    public void setWeight(float weight) {
        this.fields.put(HashDog.WEIGHT,weight);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String toString() {

        String value;
        value = String.format("name: %s\nowner name: %s\nplate number: %s\nskin color: %s\nweight: %s\nAge: %s",
                            this.getName(),
                            this.getOwnerName(),
                            this.getPlateNumber(),
                            this.getSkinColor(),
                            this.getWeight(),
                            this.getAge());

        return super.toString();
    }
}
