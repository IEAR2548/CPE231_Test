package th.ac.kmutt.cpe.algorithm.paphangkorn.Pancake;

public class Data {
    private int n;
    private int[] eachPancakesSize;

    public Data(int n, int[] eachPancakesSize){
        this.n = n;
        this.eachPancakesSize = eachPancakesSize;
    }

    public int getN(){
        return n;
    }

    public int[] getEachPancakeSize(){
        return eachPancakesSize;
    }
}
