// package th.ac.kmutt.cpe.algorithm.paphangkorn.Android;

// import java.util.*;

// public class NextPermute {
//     private static final String p1 = "ABCEDGHIF";
//     private static final String p2 = "ABCEDGHI";
//     private static final String p3 = "ABCEDGH";
//     private static final String p4 = "ABCEDG";
//     private static final String p5 = "ABCED";
//     private static final String p6 = "ABCE";
//     private static final String p7 = "ABC";

//     public NextPermute(){

//     }

//     public int calculate(Data patternData){
//         int n = patternData.getN();
//         int count = 0;
//         String pattern = patternData.getPattern();
//         while(!(pattern.equals(p1) || pattern.equals(p2) || pattern.equals(p3) || pattern.equals(p4) || pattern.equals(p5) || pattern.equals(p6) || pattern.equals(p7))){
//             count++;
//             for(int i = n-2; i >= 0; i--){
//                 if(pattern.equals(p1) || pattern.equals(p2) || pattern.equals(p3) || pattern.equals(p4) || pattern.equals(p5) || pattern.equals(p6) || pattern.equals(p7)){
//                     return count;
//                 }
//                 char[] chars = pattern.toCharArray();
//                 if(chars[i] < chars[i+1]){
//                     int j;
//                     for(j = n-1; j > i; j--){
//                         if(chars[i] < chars[j]){
//                             break;
//                         }
//                     }
//                     //swap
//                     char temp1 = chars[i];
//                     chars[i] = chars[j];
//                     chars[j] = temp1;
//                     //reverse
//                     int right = n-1;
//                     int left = i+1;
//                     while(left < right){
//                         char temp2 = chars[left];
//                         chars[left] = chars[right];
//                         chars[right] = temp2;
//                         left++;
//                         right--;
//                     }
//                     pattern = new String(chars);
//                     break;      
//                 }
//             }
//         }
        
//         return 0;
//     }


// }

package th.ac.kmutt.cpe.algorithm.paphangkorn.Android;

public class NextPermute {
    public NextPermute() {}

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    private void reverse(char[] chars, int left){
        int right = chars.length-1;
        while (left < right) {
            swap(chars, left, right);
            left++;
            right--;
        }
    }

    public int calculate(Data patternData) {
        String pattern = patternData.getPattern();
        int count = 0;
        int n = patternData.getN(); 
        
        String initial = "";
        switch(n) {
        case 9:
            initial = "ABCDEFGHI";
            break;
        case 8:
            initial = "ABCDEFGH";
            break;
        case 7:
            initial = "ABCDEFG";
            break;
        case 6:
            initial = "ABCDEF";
            break;
        case 5:
            initial = "ABCDE";
            break;
        case 4:
            initial = "ABCDH";
            break;
        case 3:
            initial = "ABC";
            break;
        }

        if(initial.equals(pattern)){
            return count;
        }

        char[] chars = initial.toCharArray();
        while(true){
            boolean found = false;

            for(int i = n-2; i >= 0; i--){
                if(chars[i] < chars[i+1]){
                    for(int j = n-1; j > i; j--){
                        if(chars[i] < chars[j]){
                            swap(chars, i, j);
                            break;
                        }
                    }
                    reverse(chars, i+1);
                    count++;
                    String newPattern = new String(chars);
                    if (newPattern.equals(pattern)) {
                        return count;
                    }       
                    found = true;
                    break;
                }
            }
            if (!found) {
                return count;
            }
        }
    }

}


