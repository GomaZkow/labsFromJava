public class ParrotTest {
    public static void main(String[] args) {
        Parrot p1 = new Parrot("Кеша", 3, "Ара", true);
        Parrot p2 = new Parrot();

        p1.speak();
        p2.speak();

        p1.celebrateBirthday();
        System.out.println("Вид попугая: " + p1.getSpecies());

        p2.setSpecies("Неразлучник");
        System.out.println("Вид второго попугая: " + p2.getSpecies());
    }
}
