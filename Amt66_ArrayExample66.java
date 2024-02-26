package Batch37Assignments;

/*Create an array of length 4 of int data type and 
 * find out average of those numbers and remainder of those
*/
public class Amt66_ArrayExample66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= new int[4];
		num[0]=30;
		num[1]=12;
		num[2]=56;
		num[3]=100;
		//old ways to solve this problem
		//double average=(num[0]+num[1]+num[2]+num[3]/4);
		//System.out.println(average);
		//using for loop
		int sum=0;
		for(int i=0; i<num.length; i++ )
		{
			sum=sum+num[i];
		}
		System.out.println("sum value: "+sum);
		double average=sum/num.length;
		System.out.println("average value: "+average);
		double reminder = sum%num.length;
		System.out.println("reminder: "+reminder);

	}



}
