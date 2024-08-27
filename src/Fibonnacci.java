public class Fibonnacci {
    public static void main(String[] args){
        long[] numbers = new long[51];
        numbers[0] = 0;
        numbers[1] = 1;

        for (int i = 2; i <= 50; i++){
            numbers[i] = numbers[i-1] + numbers[i-2];
        }

        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
