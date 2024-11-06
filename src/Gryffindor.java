public class Gryffindor extends Person {
    private int nobility;
    private int honor;
    private int courage;
    private int score;

    public Gryffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
        score = calculateHouseScore();
    }

    @Override
    public int calculateHouseScore() {
        return nobility + honor + courage;
    }

    @Override
    public String toString() {
        return "Ученик Gryffindor: " + super.toString() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                '}';
    }

    @Override
    public String whoIsBetter(Person other) {
        if (other instanceof Gryffindor) {
            Gryffindor otherGryffindor = (Gryffindor) other;
            if (score > otherGryffindor.score) {
                return this.getName() + " побеждает с счетом " + score;
            } else if (score < otherGryffindor.score) {
                return other.getName() + " побеждает с счетом " + otherGryffindor.score;
            } else {
                return "Ничья, счет " + score;
            }
        }
        return "Невозможно сравнить студентов разных факультетов";
    }
}