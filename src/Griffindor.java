public class Griffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name,
                      int castPower,
                      int castRange,
                      int nobility,
                      int honor,
                      int bravery) {
        super(name, castPower, castRange);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {

        return super.toString() + '\n' +
                "Благородство: " + nobility + '\n' +
                "Честь: " + honor + '\n' +
                "Храбрость: " + bravery;
    }

    public int affinitySum(Griffindor student) {
        return this.nobility + this.honor + this.bravery;
    }

    public void compareAffinityWith(Griffindor other) {
        if (affinitySum(this) > affinitySum(other)) {
            System.out.println(this.name + " лучше представляет достоинства Гиффиндора чем " + other.name);
        } else {
            System.out.println(other.name + " лучше представляет достоинства Гиффиндора чем " + this.name);
        }
    }
}