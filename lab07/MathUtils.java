public class MathUtils {
    
    public static double power(int base, int power){
        double result = 1;
        for(int i = 1; i <= Math.abs(power); ++i){
            result *= base;
        }
        
        return power < 0? 1 / result : result;
    }
}
