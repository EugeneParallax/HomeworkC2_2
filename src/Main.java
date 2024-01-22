public class Main {
    public static void main(String[] args) {

        Griffindor[] griffindors = {
                new Griffindor("Гарри Поттер",            67, 66, 69, 96, 82),
                new Griffindor("Гермиона Грейнджер",      59, 72, 66, 92, 98),
                new Griffindor("Рон Уизли",               57, 44, 56, 87, 59)
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария Смит",            67, 72, 87, 36, 46),
                new Hufflepuff("Седрик Диггори",          62, 75, 79, 84, 58),
                new Hufflepuff("Джастин Финч-Флетчли",    46, 53, 65, 84, 49)
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Джоу Чанг",                78, 71, 87, 45, 58, 55),
                new Ravenclaw("Падма Патил",              63, 43, 77, 72, 61, 77),
                new Ravenclaw("Маркус Белби",             81, 54, 68, 65, 58, 63)
        };
        Slitherin[] slitherins = {
                new Slitherin("Драко Малфой",             66, 29, 87, 85, 39,55),
                new Slitherin("Грэхэм Монтегю",           63, 36, 65, 81, 86,64),
                new Slitherin("Грегори Гойл",            57, 34, 39, 74, 79,58)
        };
// Method for a printout of the student info:
        System.out.println(griffindors[1].toString());

// Method for comparing two students by magic power and range:
        griffindors[1].compareStatsWith(ravenclaws[0]);

// Method for comparing two students of a given faculty by its specific affinities:
        griffindors[0].compareAffinityWith(griffindors[1]);
    }
}