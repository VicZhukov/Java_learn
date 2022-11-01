//Module 4; exercise 17;

package module_4;

public class ATM {
    public int countBanknotes(int sum){
        int[] array = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int count = 0;
        int i = 0;
        while(i <= array.length-1) {
            while (sum >= array[i]) {
                sum = sum - array[i];
                count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        ATM money = new ATM();

        System.out.println(money.countBanknotes(500));
    }
}
