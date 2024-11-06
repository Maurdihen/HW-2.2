public class Hufflepuff extends Person {
    private int hardworking;
    private int loyalty;
    private int honesty;
    private int score;

    public Hufflepuff(String name, int magicPower, int transgressionDistance, int hardworking, int loyalty, int honesty) {
        super(name, magicPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyalty = loyalty;
        this.honesty = honesty;
        score = calculateHouseScore();
    }

    @Override
    public int calculateHouseScore() {
        return hardworking + loyalty + honesty;
    }

    @Override
    public String toString() {
        return "Ученик Hufflepuff: " + super.toString() +
                ", hardworking=" + hardworking +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }

    @Override
    public String whoIsBetter(Person other) {
        if (other instanceof Hufflepuff) {
            Hufflepuff otherHufflepuff = (Hufflepuff) other;
            if (score > otherHufflepuff.score) {
                return this.getName() + " побеждает с счетом " + score;
            } else if (score < otherHufflepuff.score) {
                return other.getName() + " побеждает с счетом " + otherHufflepuff.score;
            } else {
                return "Ничья, счет " + score;
            }
        }
        return "Невозможно сравнить студентов разных факультетов";
    }
}