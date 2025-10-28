package th.ac.kmutt.cpe.algorithm.paphangkorn.Pancake;

public class PancakeSort {
    public PancakeSort(){
    }
    
    private void swap(int[] pancake,int start, int end){
        int temp = pancake[start];
        pancake[start] = pancake[end];
        pancake[end] = temp;
    }

    private void reverse(int[] pancake, int n){
        int start = 0;
        int end = n-1;
        while (start < end) {
            swap(pancake, start, end);
            start++;
            end--;
        }
    }

    private int findMaxSizePancake(int[] pancake, int end){
        int max = Integer.MIN_VALUE;
        int positionMax = 0;
        for(int i = 0; i < end; i++){
            if(pancake[i] >= max){
                max = pancake[i];
                positionMax = i;
            }
        }
        return positionMax;
    }
    
    private boolean checkPancakeSort(int[] pancake){
        boolean isSorted = false;
        for(int i = 0; i < pancake.length-1; i++){
            if(pancake[i] < pancake[i+1]){
                isSorted = true;
            }else{
                return false;
            }
        }
        return isSorted;
    }

    //จบลูปตอน for loop check
    public int[] calculate(Data pancakeData){
        int n = pancakeData.getN();
        int[] pancake = pancakeData.getEachPancakeSize();
        
        while (n>1) {
            if(checkPancakeSort(pancake)){
                return pancake;
            }
            int posMax = findMaxSizePancake(pancake, n);
            if(posMax == n - 1){
                n--;
            }
            else if(posMax == 0){
                reverse(pancake, n); //พลิก0ถึงn
                n--;
            }else {
                reverse(pancake, posMax); //พลิก0ถึงposMax
                reverse(pancake, n); //พลิก0ถึงn
                n--;
            }
        }
        return pancake;
    }
}
