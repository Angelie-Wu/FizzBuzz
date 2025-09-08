package lab1;

public class Multiples {
    public static void main(String[] args) {

        int multiples = multiples(1000, 3, 5);
        int count = multiples;
        System.out.println(count);
    }

    static int multiples(int n, int a, int b) {
        int counter = 0;
        for (int i = 1; i < n; i++){
            if(i % a == 0 || i % b == 0){
                counter++;
            }
        }
        return counter;
    }
}
