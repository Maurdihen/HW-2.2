public class Main {
    public static void main(String[] args) {
        // Создание студентов для факультета Гриффиндор
        Gryffindor harry = new Gryffindor("Harry Potter", 90, 50, 80, 85, 95);
        Gryffindor hermione = new Gryffindor("Hermione Granger", 95, 45, 90, 95, 80);
        Gryffindor ron = new Gryffindor("Ron Weasley", 70, 40, 75, 80, 70);

        // Сравнение студентов Гриффиндора
        System.out.println(harry.whoIsBetter(hermione));
        System.out.println(harry.whoIsBetter(ron));
        System.out.println(ron.battle(harry));
        System.out.println();

        // Создание студентов для факультета Пуффендуй
        Hufflepuff cedric = new Hufflepuff("Cedric Diggory", 85, 60, 90, 80, 85);
        Hufflepuff zacharias = new Hufflepuff("Zacharias Smith", 70, 55, 65, 75, 70);
        Hufflepuff justin = new Hufflepuff("Justin Finch-Fletchley", 65, 50, 60, 70, 65);

        // Сравнение студентов Пуффендуя
        System.out.println(cedric.whoIsBetter(zacharias));
        System.out.println(cedric.whoIsBetter(justin));
        System.out.println(cedric.battle(justin));
        System.out.println();

        // Создание студентов для факультета Когтевран
        Ravenclaw cho = new Ravenclaw("Cho Chang", 88, 70, 85, 90, 80, 85);
        Ravenclaw padma = new Ravenclaw("Padma Patil", 75, 65, 80, 85, 75, 80);
        Ravenclaw marcus = new Ravenclaw("Marcus Belby", 68, 60, 70, 75, 68, 70);

        // Сравнение студентов Когтеврана
        System.out.println(cho.whoIsBetter(padma));
        System.out.println(cho.whoIsBetter(marcus));
        System.out.println(marcus.battle(padma));
        System.out.println();

        // Создание студентов для факультета Слизерин
        Slytherin draco = new Slytherin("Draco Malfoy", 92, 65, 85, 90, 85, 80, 90);
        Slytherin graham = new Slytherin("Graham Montague", 75, 55, 70, 75, 70, 65, 75);
        Slytherin goyle = new Slytherin("Gregory Goyle", 60, 50, 65, 60, 55, 60, 65);

        // Сравнение студентов Слизерина
        System.out.println(draco.whoIsBetter(graham));
        System.out.println(draco.whoIsBetter(goyle));
        System.out.println(graham.battle(goyle));

    }
}
