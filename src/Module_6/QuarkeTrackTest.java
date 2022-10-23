package Module_6;

import java.util.Objects;

public class QuarkeTrackTest {
    public static void main(String[] args) {
        int[] track1Data = {1, 3, 5};
        int[] track2Data = {3, 5, 4};
        int[] track3Data = {1, 5, 3};

        QuarkeTrack track1 = new QuarkeTrack(track1Data);
        QuarkeTrack track2 = new QuarkeTrack(track2Data);
        QuarkeTrack track3 = new QuarkeTrack(track3Data);

        //false
        System.out.println(track1.equals(track2));

        //true
        System.out.println(track1.equals(track3));

        //Can be true or false
        System.out.println(track1.hashCode() == track2.hashCode());

        //true
        System.out.println(track1.hashCode() == track3.hashCode());

    }
}
class QuarkeTrack{
    int[] test;
    public QuarkeTrack(int[] lines){
        this.test = lines;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        QuarkeTrack anotherLines = (QuarkeTrack) o;
        int data1 = 0;
        int data2 = 0;
        for (int i = 0; i < test.length; i++) {
            data1 = data1 + test[i];
        }
        for (int i = 0; i < anotherLines.test.length; i++) {
            data2 = data2 + anotherLines.test[i];
        }
        return data1 == data2;
    }
    @Override
    public int hashCode() {
        int sum1 = 0;
        for (int i = 0; i < test.length; i++) {
            sum1+=test[i];
        }
        return sum1 * Objects.hash();
    }
}
