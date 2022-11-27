public class Predators extends Mammals {
    public Predators(String name, int age, String livingPlease, int speed, String typeOfFood) {
        super(name, age, livingPlease, speed, typeOfFood);
    }
    public void hunt() {
        System.out.println(getName()+ "охота");
    }
    @Override
    public String toString{
        return String.format("класс: %s. имя %s, возраст %d лет, ареал обитания: %s.",
                getName(), getAge(), getLivingPlease(),getSpeed(), getTypeOfFood());
}
