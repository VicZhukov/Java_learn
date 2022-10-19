package Module_5;

class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNum();
        FirTest firTest = new FirTest();

        //Should be 10
        System.out.println(firTest.test(firNum, 10));
        System.out.println(new FirNumSum().calc(3));
        System.out.println(new FirNumFactorial().calc(4));
        System.out.println(new FirNumFactorial().calc(0));
        System.out.println(new FirNumMultiplyOdd().calc(4));
        System.out.println(new FirNumMultiplyOdd().calc(5));
        System.out.println(new FirNumFizzBuzz().calc(20));
        System.out.println(new FirNumBasis().calc(9));
    }
}
class FirNum{
    public int calc(int n){
        return n;
    }
}
class FirNumSum extends FirNum{
    @Override
    public int calc(int n){
        int a = 0;
        for (int i = 1; i <= n; i++) {
            a += i;
        }
        return a;
    }
}
class FirNumFactorial extends FirNum{
    @Override
    public int calc(int n){
        int a = 1;
        if(n == 0){
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            a = a * i;
        }
        return a;
    }
}
class FirNumMultiplyOdd extends FirNum{
    @Override
    public int calc(int n) {
        int a = 1;
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0){
                a *= i;
            }
        }
        return a;
    }
}
class FirNumFizzBuzz extends FirNum{
    @Override
    public int calc(int n) {
        int a = 0;
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)) {
                a += i;
            }
        }
        return a;
    }
}
class FirNumBasis extends FirNum{
    @Override
    public int calc(int n) {
        int a = 0;
        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0){
                a += i;
            }
        }
        return a / 2;
    }
}
