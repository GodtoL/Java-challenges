public class NumeroPrimo {
    public static void main(String[] args){
        for (int i = 2; i < 100; i++){
            int divCount = 0;

            for (int d = 1; d <= i; d++){
                if (i % d == 0){
                    divCount++;
                }
            }
            if (divCount == 2){
                System.out.println(i);
            }
        }
    }
}
