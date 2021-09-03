package DS.Bit;

public class XorBit {
    public static void main(String[] args) {
        int [] arr={5,3,1,4,1,5,4,2};
        int res=0;
        for (int i = 0; i < arr.length; i++) {
            res=res^arr[i];
        }
        System.out.println(res);
    }

}
