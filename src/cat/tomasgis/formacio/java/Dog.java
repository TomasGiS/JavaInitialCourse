package cat.tomasgis.formacio.java;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;

/**
 * Created by TomasGiS on 4/7/16.
 */
public class Dog {

    /*
     * The fields have private access by default,
     * but is a good practice to set the attribute private
     */
    private String name;
    private String ownerName;
    private int plateNumber;
    private String skinColor;
    private float weight;
    protected LocalDate birthDay;

    //We must initialize the birthdate
    public Dog() {
        //this.birthDay = Calendar.getInstance().getTime().getTime();

        this.birthDay = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(int plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge()
    {

        LocalDate today = LocalDate.now();
        Period p = Period.between(this.birthDay, today);
        return p.getYears();
    }


}
