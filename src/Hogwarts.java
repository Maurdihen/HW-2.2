import java.util.Objects;

public class Hogwarts {
    private String name;
    private int nobility;
    private int honor;
    private int bravery;
    private int hardWork;
    private int loyalty;
    private int honesty;
    private int mind;
    private int wisdom;
    private int wit;
    private int creative;
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstPower;
    private int magicalPower;
    private int transgression;
    private int score;

    public Hogwarts(String name, int nobility, int honor, int bravery, int hardWork, int loyalty, int honesty,
                    int mind, int wisdom, int wit, int creative, int cunning, int determination, int ambition,
                    int resourcefulness, int thirstPower, int magicalPower, int transgression) {
        this.name = name;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creative = creative;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstPower = thirstPower;
        this.magicalPower = magicalPower;
        this.transgression = transgression;
        this.score = magicalPower + transgression;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public int getHardWork() {
        return hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreative() {
        return creative;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstPower() {
        return thirstPower;
    }

    public int getMagicalPower() {
        return magicalPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setThirstPower(int thirstPower) {
        this.thirstPower = thirstPower;
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
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                ", hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                ", mind=" + mind +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creative=" + creative +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstPower=" + thirstPower +
                ", magicalPower=" + magicalPower +
                ", transgression=" + transgression +
                '}';
    }

    public String battle(Hogwarts other) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return nobility == hogwarts.nobility && honor == hogwarts.honor && bravery == hogwarts.bravery && hardWork == hogwarts.hardWork && loyalty == hogwarts.loyalty && honesty == hogwarts.honesty && mind == hogwarts.mind && wisdom == hogwarts.wisdom && wit == hogwarts.wit && creative == hogwarts.creative && cunning == hogwarts.cunning && determination == hogwarts.determination && ambition == hogwarts.ambition && resourcefulness == hogwarts.resourcefulness && thirstPower == hogwarts.thirstPower && magicalPower == hogwarts.magicalPower && transgression == hogwarts.transgression && Objects.equals(name, hogwarts.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nobility, honor, bravery, hardWork, loyalty, honesty, mind, wisdom, wit, creative, cunning, determination, ambition, resourcefulness, thirstPower, magicalPower, transgression);
    }

}
