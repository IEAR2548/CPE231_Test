package th.ac.kmutt.cpe.algorithm.paphangkorn.QuickSelect;

public class Data {
    private int n;
    private int[] number;
    private int k;

    public Data(int n, int[] number, int k){
        this.n = n;
        this.number = number;
        this.k = k;
    }

    public int getN(){
        return n;
    }
    public int[] getNumber(){
        return number;
    }
    public int getK(){
        return k;
    }
}
