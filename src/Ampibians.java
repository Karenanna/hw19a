public class Ampibians extends Animals {
    public Ampibians(String name, int age, String livingPlease) {
        super(name, age, livingPlease);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ "кушает");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+"спит");
    }

    @Override
    public void go() {
        System.out.println(getName()+"идет");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+ "охотится");
    }

    @Override
    public String toString() {
        return String.format("класс: %s. имя %s, возраст %d лет, ареал обитания: %s.", getName(), getAge(), getLivingPlease());
    }
}

