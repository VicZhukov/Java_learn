//Module 4; exercise 15-16;

package Module_4;

public class TrurlBank {
    public int sumQuads(int n){
        int sum = 0;
        int buff;
        int count = 1;
        while(count <= n){
            buff = count * count;
            sum += buff;
            count++;
        }
        return sum;
    }

    public int countSumOfDigits(int number){
        int sum = 0;
        while(number != 0){
            sum += (number % 10);
            number/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        //System.out.println(bank.sumQuads(4));
        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(547));
    }
}
