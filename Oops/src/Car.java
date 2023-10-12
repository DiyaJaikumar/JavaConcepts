// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Car {
    private String make="tesla";
    private String model="model x";
    private String color="gray";
    private int doors=2;
    private boolean convertible=true;
    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }
    public void setMake(String make){
        if (make == null) make="unknown";
        String lowercaseMake= make.toLowerCase();
        switch (lowercaseMake)  {
            case "holden", "porsche","tesla"-> this.make= make;
            default -> {
                this.make="unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(doors + " -doors "+ color+ " "+
                make+" "+model+ " "+
                (convertible ? "Convertible" : " "));
    }


}