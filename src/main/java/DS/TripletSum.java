package DS;


import java.util.HashSet;

public class TripletSum {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7};

        int sum=9;



		//output-1,2,6   2,3,4
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<arr.length-2;i++)
		{
			int cur_sum=sum -arr[i];
			for (int j = i+1; j < arr.length; j++) {


				int ss=cur_sum-arr[j];

				if(set.contains(ss) )
				{
					System.out.println(arr[i]+","+arr[j]+","+ss);
				}
				else
				{
					set.add(arr[j]);//6,4,2
				}
			}

			}



    }

}
