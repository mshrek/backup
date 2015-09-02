import java.lang.reflect.Array;
import java.util.Arrays;

public class sumexists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-5,2,4,7,8,-1,0};
		int size=arr.length,search=6;
		Arrays.sort(arr);
		int begin=0,end=size-1,sum;
		if(arr[0]>search)
		{
			System.out.println("No such 2 elements exist");
			return;
		}
		else{
		while(begin<=end)
			{
			 if((arr[begin]+arr[end])==search)
				  {
				   System.out.println("Number 1="+arr[begin] + " Number 2="+arr[end]);
				   end--;
				  }
			 else if((arr[begin]+arr[end])<search)
				  begin++;
			 else
				 end--;
			 
			}
		}
	}

}
