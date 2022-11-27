public class Birds extends Animals {
    private final String typeMove;

    public Birds(String name, int age, String livingPlease, String typeMove) {
        super(name, age, livingPlease);
        this.typeMove = typeMove;
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
        System.out.println(getName() + "идет");
    }

    @Override
    public void hunt() {
        System.out.println(getName() + "охотится");
    }

    public String getTypeMove() {
        return typeMove;
    }
}

