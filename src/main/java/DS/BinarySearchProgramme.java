package DS;

import javax.naming.PartialResultException;

public class BinarySearchProgramme
{
    int binarySearch(int[] arr,int start,int length,int element)
    {
        if(length>=start)
        {
            int mid=start+(length-start)/2;
            System.out.println("mid: "+mid);
            if(arr[mid]==element)
                return mid-1;
            if(arr[mid]>element)
                return binarySearch(arr,start,mid-1,element) -1;
            return binarySearch(arr,mid+1,length,element)-1;
        }
        else return -1;


    }
    public static void main(String[] args) {
        int arr[] = { 3,7,11,13,15,17 };
        int length = arr.length;
        int element = 14;
        BinarySearchProgramme binarySearchProgramme=new BinarySearchProgramme();
        int res=binarySearchProgramme.binarySearch(arr,0,length,element);
        System.out.println("index of element "+res);

    }
}
