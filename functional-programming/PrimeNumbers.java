import java.util.stream.IntStream;

/**
 *
 * @author antonio
 */
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IntStream.range(1,8)
                .forEach(index -> System.out.println(index + " " + isPrime(index)));
           
    }
    
    private static boolean isPrime(int number) {
        
//        Old Style
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) return false;
//        }
//        return number > 1;
        
        return number > 1 &&
                IntStream.range(2, number)
                        .noneMatch(index -> number % index == 0);
    }
    
}
