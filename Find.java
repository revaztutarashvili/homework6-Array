public class Find {
    public static void findIndex(int[] arrayNumbs, int number) {
        for (int i = 0; i < arrayNumbs.length; i++) {
            if (arrayNumbs[i] == number) {
                System.out.println("\nგილოცავთ, რიცხვი " + number + " ვიპოვნეთ ინდექსზე " + i);
                return;
            }
        }
        System.out.println("\nსამწუხაროდ, მასივში არ მოგვეპოვება " + number);
    }
}