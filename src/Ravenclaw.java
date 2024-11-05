public class Ravenclaw extends Hogwarts{
    private int score;
    public Ravenclaw(String name, int nobility, int honor, int bravery, int hardWork, int loyalty, int honesty,
                      int mind, int wisdom, int wit, int creative, int cunning, int determination, int ambition,
                      int resourcefulness, int thirstPower, int magicalPower, int transgression) {
        super(name, nobility, honor, bravery, hardWork, loyalty, honesty, mind, wisdom, wit, creative, cunning,
                determination, ambition, resourcefulness, thirstPower, magicalPower, transgression);
        score = getMind() + getWisdom() + getWit() + getCreative();

    }
    @Override
    public String toString() {
        return "Ученик Ravenclaw: " + super.toString();
    }

    public String whoIsBetter(Ravenclaw other) {
        if (score > other.score) {
            return getName() + " побеждает с счетом " + score;
        } else if (score < other.score) {
            return other.getName() + " побеждает с счетом " + other.score;
        } else {
            return "Ничья, счет " + score;
        }
    }

    public int getScoreByFaculty() {
        return score;
    }
}
