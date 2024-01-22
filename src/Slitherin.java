public class Slitherin extends Hogwarts {

    private int cunning;
    private int resolve;
    private int ambition;
    private int powerlust;

    public Slitherin(String name,
                     int castPower,
                     int castRange,
                     int cunning,
                     int resolve,
                     int ambition,
                     int powerlust) {
        super(name, castPower, castRange);
        this.cunning = cunning;
        this.resolve = resolve;
        this.ambition = ambition;
        this.powerlust = powerlust;
    }

    public int getCunning() {
        return cunning;
    }
    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getResolve() {
        return resolve;
    }
    public void setResolve(int resolve) {
        this.resolve = resolve;
    }

    public int getAmbition() {
        return ambition;
    }
    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getPowerlust() {
        return powerlust;
    }
    public void setPowerlust(int powerlust) {
        this.powerlust = powerlust;
    }

    @Override
    public String toString(){

        return  super.toString() +              '\n' +
                "Хитрость: " + cunning +        '\n' +
                "Решительность: " + resolve +   '\n' +
                "Амбициозность: " + ambition +  '\n' +
                "Находчивость: " + powerlust;
    }

    public int affinitySum(Slitherin student) {
        return this.cunning + this.resolve + this.ambition + this.powerlust;
    }

    public void compareAffinityWith(Slitherin other) {
        if (affinitySum(this) > affinitySum(other)) {
            System.out.println(this.name + " лучше представляет достоинства Слизерина чем " + other.name);
        } else {
            System.out.println(other.name + " лучше представляет достоинства Слизерина чем " + this.name);
        }
    }
}