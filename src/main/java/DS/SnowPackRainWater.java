package DS;

public class SnowPackRainWater {
    public static void main(String[] args) {
        int[] arr={0,1,3,0,1,2,0,4,2,0,3,0};
        snowPack(arr);
    }
    //0,1,3,0,1,2,0,4,2,0,3,0
    //0,1,3,3,3,3,3,4,4,4,4,4
    //4,4,4,4,4,4,4,4,3,3,3,0
    public  static void snowPack(int[] arr)
    {
        int len=arr.length;
        int[] left=new int[len];
        int[] right=new int[len];
        left[0]=arr[0];
        for (int i = 1; i < len; i++) {
            left[i]=Math.max(left[i-1],arr[i]);
        }
        right[len-1]=arr[len-1];
        for (int i = len-2; i >=0 ; i--) {
            right[i]=Math.max(right[i+1],arr[i]);
        }
        SnowPackRainWater sn=new SnowPackRainWater();
        sn.printArray(left);
        System.out.println("----------");
        sn.printArray(right);
        int ans=0;
        for (int i = 0; i < len; i++) {
            ans+=(Math.min(left[i],right[i])-arr[i]);
        }
        System.out.println();
        System.out.println(ans);
    }

    public void printArray(int[] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }

}
