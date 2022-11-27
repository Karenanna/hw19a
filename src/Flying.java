public class Flying extends Birds {
    public Flying(String name, int age, String livingPlease, String typeMove) {
        super(name, age, livingPlease, typeMove);
    }

    @Override
    public void fly() {
        System.out.println(getName() + "летает");
    }

    @Override
    public String toString() {
        return String.format("класс: %s. имя %s, возраст %d лет, ареал обитания: %s.", getName(), getAge(), getLivingPlease());
    }
}
