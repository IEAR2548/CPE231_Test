package th.ac.kmutt.cpe.algorithm.paphangkorn;

import java.util.Scanner;
import th.ac.kmutt.cpe.algorithm.paphangkorn.QuickSelect.Data;
import th.ac.kmutt.cpe.algorithm.paphangkorn.QuickSelect.QuickSelect;

public class QuickSelectMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] number = new int[n];
        for(int i = 0; i < n; i++){
            number[i] = sc.nextInt();
        }
        int k = sc.nextInt(); //จำนวนที่น้อยที่สุดลำดับที่k
        Data numbData = new Data(n, number, k);
        QuickSelect solve = new QuickSelect();
        int result = solve.calculate(numbData);
        System.out.println(result);


        sc.close();
    }
}
