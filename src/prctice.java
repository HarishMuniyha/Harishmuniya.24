import java.util.Arrays;

public class prctice {
	public static void main(String[] args) {
		String s = "111";
		String s1 = "222";
		// covert 2 string into number
		int n1 = Integer.parseInt(s);
		int n2 = Integer.parseInt(s1);
		// add two numbers
		int c = n1 + n2;
		System.out.println("THE ADDEN VALE IS " + c);

		String s3 = "welcome";
		//empty string buffer
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i <= s3.length() - 1; i++) {
			
			char c1 = s3.charAt(i);
			//check the index is even
			if (i % 2 == 0) {
				//change that paticular charcter into upper case
				char upperCase = Character.toUpperCase(c1);
				//append with that string
				sb.append(upperCase);

			} else {
				sb.append(c1);
			}

		}
		System.out.println("output -" + sb);
		
		int num=153;
		//converting that number into string
		String string = String.valueOf(num);
		int count=0;
		for (int i = 0; i < string.length(); i++) {
			char c2 = string.charAt(i);
			//converting that character into string
			String string2 = Character.toString(c2);
			//converting that string into integer
			int Single_number = Integer.parseInt(string2);
			//cube multiplication and store the value in arm
			int arm=Single_number*Single_number*Single_number;
			
			//add that arm values
			count=count+arm;
			}
		//check that addition of that arm values is equal to the given number
		if (count==num) {
			System.out.println("the given number is armstrong");
			
		}else {
			System.out.println("it is not a armstrong ");
		}
		
		int a[]= {2,1,5,3,8,6,5,9,2,6,4};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					c=a[i];
					a[i]=a[j];
					a[j]=c;
					
				}
				
				
			}
			
		}
String string_2 = Arrays.toString(a);
System.out.println(string_2);
		System.out.println("__________________________________________");
		
		 int number=1695;
		 System.out.println("given number is "+number);
		 String string_3 = String.valueOf(number);
		 for (int i = 0; i < string_3.length(); i++) {
			 char c_4 = string_3.charAt(i);
			 String s5 = String.valueOf(c_4);
			 int numb = Integer.parseInt(s5);
			 if (numb%2==0) {
				System.out.println("EVEN NUMBER "+numb);
			}
			 else {
				 System.out.println("ODD NUMBER "+numb);
			}
			 
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
