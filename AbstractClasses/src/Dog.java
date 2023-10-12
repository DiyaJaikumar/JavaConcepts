public class Dog extends Animal{
    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")){
            System.out.print(type+" walking ");
        }else{
            System.out.print(type+" running ");
        }

    }

    @Override
    public void makeNoise() {
        if(type=="Wolf"){
            System.out.print("Howl ");
        }else{
            System.out.print("Woof ");
        }

    }
}
