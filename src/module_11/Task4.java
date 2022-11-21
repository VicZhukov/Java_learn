package module_11;

public class Task4 {
    private long a, c, m;

    public Task4(long a, long m) {
        this.a = a;
        this.m = m;
    }
    public Task4 c(long c){
        this.c = c;
        return this;
    }
    public long next(){
        long x = 1;
        return x = (x * a + c) % m;
    }
}
