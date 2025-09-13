import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {

		int[] arr2 = {9,12,34,56,78,89,90,100};
		
		for (int i=0; i<arr2.length; i++)
		{
			if(arr2[i]%2==0)
			{
			System.out.println(arr2[i]);
			break;
			}
			else {
				System.out.println(arr2[i]+" not divisible by 2");
			}
		}
		
		ArrayList <String> a = new ArrayList<String>();
			a.add("Faizan");
			a.add("Khan");
			a.add("Salman");
			a.add("Kaif");
			System.out.println(a.get(3));
		
			for(int i=0; i<a.size(); i++) {
				System.out.println(i);
			}
			
			System.out.println("*******************");
			
			for(String val :a) {
				System.out.println(val);
			}
			
			System.out.println(a.contains("faizan"));
			String[] name = {"Faizan", "Khan", "Salman","Kaif"};
			List <String> nameArrayList= Arrays.asList(name);
			nameArrayList.contains("Faizan");
	}

}
