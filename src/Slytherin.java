public class Slytherin extends Person {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;
    private int score;

    public Slytherin(String name, int magicPower, int transgressionDistance, int cunning, int determination, int ambition,
                     int resourcefulness, int thirstForPower) {
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
        score = calculateHouseScore();
    }

    @Override
    public int calculateHouseScore() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    @Override
    public String toString() {
        return "Ученик Slytherin: " + super.toString() +
                ", cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                '}';
    }

    @Override
    public String whoIsBetter(Person other) {
        if (other instanceof Slytherin) {
            Slytherin otherSlytherin = (Slytherin) other;
            if (score > otherSlytherin.score) {
                return this.getName() + " побеждает с счетом " + score;
            } else if (score < otherSlytherin.score) {
                return other.getName() + " побеждает с счетом " + otherSlytherin.score;
            } else {
                return "Ничья, счет " + score;
            }
        }
        return "Невозможно сравнить студентов разных факультетов";
    }
}