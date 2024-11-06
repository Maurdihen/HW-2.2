public abstract class Person {
    private String name;
    private int magicalPower;
    private int transgression;
    private int score;

    public Person(String name, int magicalPower, int transgression) {
        this.name = name;
        this.magicalPower = magicalPower;
        this.transgression = transgression;
        this.score = magicalPower + transgression;
    }

    public abstract int calculateHouseScore();
    public abstract String whoIsBetter(Person other);

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagicalPower() {
        return magicalPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setMagicalPower(int magicalPower) {
        this.magicalPower = magicalPower;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", magicalPower=" + magicalPower +
                ", transgression=" + transgression +
                '}';
    }

    public String battle(Person other) {
        if (score < other.score) {
            return other.name + " обладает большей мощностью магии, чем " + name;
        }
        else if (score > other.score) {
            return name + " обладает большей мощностью магии, чем " + other.name;
        }
        else {
            return name + " обладает такой же мощностью магии, как и " + other.name;
        }
    }

}
