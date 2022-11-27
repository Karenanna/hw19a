import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Herbivores gazelle = new Herbivores("Газель", 4, "саванна", 20, "листья");
        Herbivores giraffe = new Herbivores("Жираф", 3,"джунгли", 10, "листья");
        Herbivores horse = new Herbivores("Лошадь", 5, "конющня", 40,"комбикорм" );

        Predators hyena = new Predators("Гиена", 10, "степь", 20, "падаль");
        Predators bear = new Predators("Медведь", 15, "лес", 15, "мясо и мед");
        Predators tiger = new Predators("Тигр", 19, "джунгли", 35, "мясо");

        Ampibians snake = new Ampibians("Уж пресноводный", 2, "в воде");
        Ampibians frog = new Ampibians("Лягушка", 4, "Болота");

        Flightless birdDodo = new Flightless("Птица Додо", 7, "зоопарк", "ходит");
        Flightless pinguin = new Flightless("Пингвин", 16, "северный полюс", "прижки в воду");
        Flightless peacock = new Flightless("Павлин", 6, "зоопарк", "открывает перья");

        Flying seagull = new Flying("Чайка", 8, " побережье", "летать");
        Flying albatross = new Flying("Альбатрос", 4, "океаны", "летать");
        Flying falcon = new Flying("Сокол", 1, "на небе", "ЛЕТАТЬ" );

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println(bear );
        System.out.println(tiger);
        System.out.println(snake);
        System.out.println(frog);
        System.out.println(birdDodo);
        System.out.println(pinguin);
        System.out.println(peacock);
        System.out.println(seagull);
        System.out.println(albatross);
        System.out.println(falcon);
    }
}