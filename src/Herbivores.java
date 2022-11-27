public class Herbivores extends Mammals{
    public Herbivores(String name, int age, String livingPlease, int speed, String typeOfFood) {
        super(name, age, livingPlease, speed, typeOfFood);
    }

    public void grazing() {
        System.out.println(getName()+ "пасется");
    }
    @Override
    public String toString{
        return String.format("класс: %s. имя %s, возраст %d лет, ареал обитания: %s.",
                getName(), getAge(), getLivingPlease(),getSpeed(), getTypeOfFood());
    }
}



