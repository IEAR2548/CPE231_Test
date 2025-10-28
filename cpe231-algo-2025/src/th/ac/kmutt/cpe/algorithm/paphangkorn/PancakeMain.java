package th.ac.kmutt.cpe.algorithm.paphangkorn;
import th.ac.kmutt.cpe.algorithm.paphangkorn.Pancake.PancakeSort;
import th.ac.kmutt.cpe.algorithm.paphangkorn.Pancake.Data;

import java.util.Scanner;

public class PancakeMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //amount of pancakes
        int[] k = new int[n];
        
        for(int i = 0; i < n; i++){
            k[i] = sc.nextInt(); //size of each pancake
        }
        Data pancakeData = new Data(n, k);

        //want ascending sort
        PancakeSort solve = new PancakeSort();
        int []result = new int[n];
        result = solve.calculate(pancakeData);
        for(int i = 0; i < n; i++){
            System.out.print(result[i] + " ");
        }



        sc.close();
    }
}
