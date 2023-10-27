package string;

public class Test {
	public static void main(String[] args) {
			String s1=new String("xyz");
			String s2=new String("xyz");
			System.out.println(s1==s2);//compare object 
			System.out.println(s1.equals(s2));// compares value
			
			String s3="Pankaj";
			String s4="Pankaj";
			
	//		System.out.println(s3==s4);
			
	//		String s5=new String("ABC");
	//		String s6="ABC";
	//		String s7="ABC";
	//		String s8=new String("ABC");
			
			//System.out.println(s5==s8);
			//System.out.println(s5==s6);
		//	System.out.println(s6==s7);
			
		//	System.out.println(s6.toLowerCase());
		//	System.out.println(s3.toUpperCase());
		//	System.out.println(s3.startsWith("P"));
		//	System.out.println(s3.endsWith("j"));
		//	System.out.println(s3.length());
			
	}

}
