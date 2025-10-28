package th.ac.kmutt.cpe.algorithm.paphangkorn;

import th.ac.kmutt.cpe.algorithm.paphangkorn.Android.Data;
import th.ac.kmutt.cpe.algorithm.paphangkorn.Android.NextPermute;
import java.util.*;

public class AndroidMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //point in pattern
        int m = sc.nextInt(); //number of patterns

        for(int i = 0; i < m; i++){
            String pattern = sc.next();
            Data patternData = new Data(pattern, n);
            NextPermute solve = new NextPermute();
            int result = solve.calculate(patternData);
            System.out.println(result+1);
        }
        sc.close();;
    }
}
