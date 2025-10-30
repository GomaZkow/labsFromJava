public class Parrot
{
    public String name;
    protected int age;
    private String species;
    private boolean canTalk;

    public Parrot(String name, int age, String species, boolean canTalk) {
        this.name = name;
        this.age = age;
        this.species = species;
        this.canTalk = canTalk;
    }

    public Parrot() {
        this("Безымянный", 0, "Неизвестный", false);
    }

    public void speak() {
        if (canTalk) {
            System.out.println(name + " говорит: Привет!");
        } else {
            System.out.println(name + " не умеет говорить.");
        }
    }

    protected void celebrateBirthday() {
        age++;
        System.out.println(name + " теперь " + age + " лет.");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    
}
