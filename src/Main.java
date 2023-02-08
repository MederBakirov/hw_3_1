public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.3, 4.6, 2.1, 7.9, 9.5, -23.3, 32.14, -7.65, 8.2, -1.5, 5.7, 8.5, -9.0, 6.3, 4.2};
        double count = 0;
        int amount = 0;
        boolean proverka = false;
        for (double i: numbers) {
            if( i<0){
                proverka = true;
            } else if (i > 0 && proverka) {
                count = count + i;
                amount ++;
                System.out.println(i);
            }

        }
        System.out.println("Среднее число: " + count / amount);


    }
}