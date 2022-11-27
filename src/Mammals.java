public class Mammals extends Animals {
    private final int speed;
    private final String typeOfFood;

    public Mammals(String name, int age, String livingPlease, int speed, String typeOfFood) {
        super(name, age, livingPlease);
        this.speed = speed;
        this.typeOfFood = typeOfFood;
    }


    public int getSpeed() {
        return speed;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }
    @Override
    public void eat() {
        System.out.println(getName() + "кушает");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + "спит");
    }

    @Override
    public void go() {
        System.out.println(getName() + "двигается");
    }

    @Override
    public void walk() {
        System.out.println(getName() + "ходит");
}
