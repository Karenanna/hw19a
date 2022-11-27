public class Flightless extends Birds {
    public Flightless(String name, int age, String livingPlease, String typeMove) {
        super(name, age, livingPlease, typeMove);
    }

    @Override
    public void walk() {
        System.out.println(getName() + "гулять");
        @Override
        public String toString () {
            return String.format("класс: %s. имя %s, возраст %d лет, ареал обитания: %s.", getName(), getAge(), getLivingPlease());
        }
    }
}
