package cat.tomasgis.formacio.java;

import cat.tomasgis.formacio.java.interfaces.IHowl;
import cat.tomasgis.formacio.java.interfaces.IMiaow;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by TomasGiS on 4/7/16.
 */
public class Cat extends Animal implements IMiaow {

    private int plateNumber;
    private String skinColor;
    private float weight;


    //We must initialize the birthdate
    public Cat() {
        super(); // Animal();
        //this.birthDay = Calendar.getInstance().getTime().getTime();

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


    @Override
    public void miaowing(int times) {
        for (int i=0;i<times;i++)
            System.out.println("Miaow!!");
    }
}
