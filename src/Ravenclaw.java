public class Ravenclaw extends Person {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;
    private int score;

    public Ravenclaw(String name, int magicPower, int transgressionDistance, int intelligence, int wisdom, int wit,
                     int creativity) {
        super(name, magicPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
        score = calculateHouseScore();
    }

    @Override
    public int calculateHouseScore() {
        return intelligence + wisdom + wit + creativity;
    }

    @Override
    public String toString() {
        return "Ученик Hufflepuff: " + super.toString() +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity +
                '}';
    }

    @Override
    public String whoIsBetter(Person other) {
        if (other instanceof Ravenclaw) {
            Ravenclaw otherRavenclaw = (Ravenclaw) other;
            if (score > otherRavenclaw.score) {
                return this.getName() + " побеждает с счетом " + score;
            } else if (score < otherRavenclaw.score) {
                return other.getName() + " побеждает с счетом " + otherRavenclaw.score;
            } else {
                return "Ничья, счет " + score;
            }
        }
        return "Невозможно сравнить студентов разных факультетов";
    }
}