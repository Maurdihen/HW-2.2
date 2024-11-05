public class Slytherin extends Hogwarts {
    private int score;
    public Slytherin(String name, int nobility, int honor, int bravery, int hardWork, int loyalty, int honesty,
                      int mind, int wisdom, int wit, int creative, int cunning, int determination, int ambition,
                      int resourcefulness, int thirstPower, int magicalPower, int transgression) {
        super(name, nobility, honor, bravery, hardWork, loyalty, honesty, mind, wisdom, wit, creative, cunning,
                determination, ambition, resourcefulness, thirstPower, magicalPower, transgression);
        score = getCunning() + getDetermination() + getAmbition() + getResourcefulness() + getThirstPower();
    }
    @Override
    public String toString() {
        return "Ученик Slytherin: " + super.toString();
    }

    public String whoIsBetter(Slytherin other) {
        if (score > other.score) {
            return this.getName() + " побеждает с счетом " + score;
        } else if (score < other.score) {
            return other.getName() + " побеждает с счетом " + other.score;
        } else {
            return "Ничья, счет " + score;
        }
    }
}