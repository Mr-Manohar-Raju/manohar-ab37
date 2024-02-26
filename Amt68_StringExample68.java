package Batch37Assignments;
/*
 * "M1=""Software"";
M2=""Testing"";
Output should print as:SoftwareTesting in a vertical way like below
S
o
f
t
w
a
r
e
T
e
s
t
i
n
g"
 */
public class Amt68_StringExample68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String m1="Software";
		String m2="Testing";
		String m3 = m1+m2;
		System.out.println(m3);
		for(int i=0; i<=m3.length()-1; i++)
		{
			System.out.println(m3.charAt(i));
		}
		

	}

}
