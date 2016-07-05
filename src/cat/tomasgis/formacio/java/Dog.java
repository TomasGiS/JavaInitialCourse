package cat.tomasgis.formacio.java;

import cat.tomasgis.formacio.java.interfaces.IHowl;

import java.time.LocalDate;
import java.time.Period;


/**
 * Created by TomasGiS on 4/7/16.
 */
public class Dog extends Animal implements IHowl{

    /*
     * The fields have private access by default,
     * but is a good practice to set the attribute private
     */

    private int plateNumber;
    private String skinColor;
    private float weight;

    //We must initialize the birthdate
    public Dog() {
        super();
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


    @Override
    public void howling() {
        System.out.println("Howl, Howl, Howl!!");
    }
}
