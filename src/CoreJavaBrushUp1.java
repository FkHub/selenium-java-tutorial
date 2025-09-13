
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int[] arr2 = {9,12,34,56,78,89,90,100};
	 //System.out.println(arr[0]);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		for (int i=0; i<arr2.length; i++)
			{
				System.out.println(arr2[i]);
			}
		String[] name = {"Faizan", "Khan", "Salman","Kaif"};
		
		for (int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
		for (String s: name)
		{
			System.out.println(s);
		}
		
	}

}
