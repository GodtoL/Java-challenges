//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100 ; i++){
            if ((i % 5 == 0) && (i % 3 == 0)) {
                System.out.println("FizzBuzz");
            }else if (i % 3 == 0){
                System.out.println("Fizz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }}
        }
    }
