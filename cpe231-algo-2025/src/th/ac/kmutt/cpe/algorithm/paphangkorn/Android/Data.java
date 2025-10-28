package th.ac.kmutt.cpe.algorithm.paphangkorn.Android;

public class Data {
    private String pattern;
    private int n;

    public Data(String pattern, int n){
        this.pattern = pattern;
        this.n = n;
    }

    //getter
    public String getPattern(){
        return pattern;
    }

    public int getN(){
        return n;
    }
}
