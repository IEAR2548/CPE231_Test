package th.ac.kmutt.cpe.algorithm.paphangkorn.QuickSelect;

public class QuickSelect {
    public QuickSelect(){}

    private void swap(int[] number, int i, int j){
        int temp = number[j];
        number[j] = number[i];
        number[i] = temp;
    }

    private int pivotPos(int[] number, int pivot){
        for(int i = 0; i < number.length; i++){
            if(number[i] == pivot){
                return i;
            }
        }
        return -1;
    }

    private int quickselect(int[] number, int startPos, int endPos){
        int pivot = number[endPos];
        int i = startPos;
        
        for(int j = startPos; j < endPos; j++){
            if(number[j] <= pivot){
                swap(number, i, j);
                i++;
            }
        }
        swap(number, i, endPos);
        return i;
    }
        
    public int calculate(Data numberData){
        int[] number = numberData.getNumber();
        int n = numberData.getN();
        int k = numberData.getK()-1;
        
        int startPos = 0;
        int endPos = n - 1;
        
        while(startPos <= endPos){
            int pivot_position = quickselect(number, startPos, endPos);
            if(pivot_position == k){
                return number[pivot_position];
            }else if(pivot_position > k){
                // quickselect(number,startPos, pivot_position-1);
                endPos = pivot_position - 1;
                
            }else if(pivot_position < k){
                // quickselect(number, pivot_position+1, endPos);
                startPos = pivot_position+1;
                
            }
        }

        return -1;
    }
}
