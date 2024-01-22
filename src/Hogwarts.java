public abstract class Hogwarts {
    String name;
    int castPower;
    int castRange;

    public Hogwarts(String name, int castPower, int castRange) {
        this.name = name;
        this.castPower = castPower;
        this.castRange = castRange;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCastPower() {
        return castPower;
    }

    public void setCastPower(int castPower) {
        this.castPower = castPower;
    }

    public int getCastRange() {
        return castRange;
    }

    public void setCastRange(int castRange) {
        this.castRange = castRange;
    }

    public int statsTotal() {
        return castPower + castRange;
    }

    @Override
    public String toString() {

        return "Ученик: " + name + '\n' +
                "Потенциал: " + castPower + '\n' +
                "Дальность: " + castRange;
    }

    public void compareStatsWith(Hogwarts other) {
        if (this.getCastPower() > other.getCastPower()) {
            System.out.println(this.name + " владеет большей силой магии чем " + other.name);
        } else if (this.getCastPower() < other.getCastPower()) {
            System.out.println(other.name + " владеет большей силой магии чем " + this.name);
        } else {
            System.out.println(this.name + " и " + other.name + " равны в силе магии ");
        }

        if (this.getCastRange() > other.getCastRange()) {
            System.out.println(this.name + " владеет большей дальностью трансгрессии чем " + other.name);
        } else if (this.getCastRange() < other.getCastRange()) {
            System.out.println(other.name + " владеет большей дальностью трансгрессии чем " + this.name);
        } else {
            System.out.println(this.name + " и " + other.name + " равны в дальности трансгрессии");
        }
    }
}

