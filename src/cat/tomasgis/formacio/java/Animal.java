package cat.tomasgis.formacio.java;

import java.time.LocalDate;
import java.time.Period;

/**
 * Created by TomasGiS on 5/7/16.
 */
public class Animal {

    /*
         * The fields have private access by default,
         * but is a good practice to set the attribute private
         */
    private String name;
    private String ownerName;
    protected LocalDate birthDay;

    public Animal() {
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

    public int getAge()
    {

        LocalDate today = LocalDate.now();
        Period p = Period.between(this.birthDay, today);
        return p.getYears();
    }
}
