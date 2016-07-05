package cat.tomasgis.formacio.java;

/**
 * This class represents a Fish
 * Created by TomasGiS on 5/7/16.
 */

public class Fish extends Animal{

    String coloPrincipal;
    String colorSecundario;
    boolean aguaDulce;

    public Fish() {
        super();
    }

    public String getColoPrincipal() {
        return coloPrincipal;
    }

    public void setColoPrincipal(String coloPrincipal) {
        this.coloPrincipal = coloPrincipal;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public boolean isAguaDulce() {
        return aguaDulce;
    }

    public void setAguaDulce(boolean aguaDulce) {
        this.aguaDulce = aguaDulce;
    }



    @Override
    public String toString() {

        String value = "Name: "+ this.getName()+
                        "\nAge: "+this.getAge();
        return value;
    }
}
