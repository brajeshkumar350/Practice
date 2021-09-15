package DS.array;

import java.util.Arrays;

//result:- 1,8,3,6,5
//skip:2pow(n) and print
public class ArrayIndex {
    public static void main(String[] args) {
        int arr[] = {1,3,8,1,7,3,4,2,3,7,6,4,2,2,9,0,4,7,8,5,2};
    int previousindex=0;
        for(int i=0;i<arr.length;i++)
        {
            if(previousindex<arr.length)
            System.out.println(arr[previousindex]);


            int index=(int)Math.pow(2,i);
            previousindex=previousindex+(index+1);


        }
    }
}
