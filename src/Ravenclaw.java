public class Ravenclaw extends Hogwarts {

    private int intellect;
    private int wisdom;
    private int esprit;
    private int creativity;

    public Ravenclaw(String name,
                     int castPower,
                     int castRange,
                     int intellect,
                     int wisdom,
                     int esprit,
                     int creativity) {
        super(name, castPower, castRange);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.esprit = esprit;
        this.creativity = creativity;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getEsprit() {
        return esprit;
    }

    public void setEsprit(int esprit) {
        this.esprit = esprit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {

        return super.toString() + '\n' +
                "Интеллект: " + intellect + '\n' +
                "Мудрость: " + wisdom + '\n' +
                "Остроумие: " + esprit + '\n' +
                "Творчество: " + creativity;
    }

    public int affinitySum(Ravenclaw student) {
        return this.intellect + this.wisdom + this.esprit + this.creativity;
    }

    public void compareAffinityWith(Ravenclaw other) {
        if (affinitySum(this) > affinitySum(other)) {
            System.out.println(this.name + " лучше представляет достоинства Когтеврана чем " + other.name);
        } else {
            System.out.println(other.name + " лучше представляет достоинства Когтеврана чем " + this.name);
        }
    }
}
