package homework.task22;


public class task22 {



    private static int factorial ( int n){
            int result = 1;
            if (n == 1 || n == 0) {
                return result;
            }
            result = n * factorial(n - 1);
            return result;
        }


    public static void main(String[] args) {
        System.out.println(factorial(6) + " ");
    }



}
