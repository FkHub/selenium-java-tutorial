
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Faizan Salman Khan";
		String[] splittedString = s.split("Salman");		
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		//System.out.println(splittedString[2]);
		System.out.println(splittedString[1].trim());
		
		for(int i =s.length()-1; i>=0;i--) {
			
			System.out.println(s.charAt(i));
		}
	
	}
	
	

}
