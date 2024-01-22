public class Hufflepuff extends Hogwarts {

    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name,
                      int castPower,
                      int castRange,
                      int diligence,
                      int loyalty,
                      int honesty) {
        super(name, castPower, castRange);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {

        return super.toString() + '\n' +
                "Трудолюбие: " + diligence + '\n' +
                "Верность: " + loyalty + '\n' +
                "Честность: " + honesty;
    }

    public int affinitySum(Hufflepuff student) {
        return this.diligence + this.loyalty + this.honesty;
    }

    public void compareAffinityWith(Hufflepuff other) {
        if (affinitySum(this) > affinitySum(other)) {
            System.out.println(this.name + " лучше представляет достоинства Пуффендуя чем " + other.name);
        } else {
            System.out.println(other.name + " лучше представляет достоинства Пуффендуя чем " + this.name);
        }
    }
}
