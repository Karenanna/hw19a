import java.util.Objects;
public abstract class Animals {
    private final String name;
    private int age;
    private String livingPlease;

    public Animals(String name, int age, String livingPlease) {
        this.name =name;
        this.age = age;
        this.livingPlease = livingPlease;
    }
    public abstract void eat ();

    public abstract void sleep();

    public abstract void go();

    public void hunt() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLivingPlease() {
        return livingPlease;
    }

    public void setLivingPlease(String livingPlease) {
        this.livingPlease = livingPlease;
    }
    @Override
    public boolean equals (Objects o){
        if(this ==o) return true;
        if(o == null || getClass() !=o.getClass())  return false;
        Animals animals = (Animals) o;
        return age == animals.age && name.equals(animals.name) && livingPlease.equals(animals.livingPlease);
    }
    @Override
    public int hushCode(){
        return Objects.hash(name, age, livingPlease);
    }
}
