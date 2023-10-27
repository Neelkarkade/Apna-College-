package string;

public class Test2 {
	public static void main(String[] args) {
		String s1=new String("xyz");
		String s2=new String("xyz");
		System.out.println(s1==s2);//compare object 
		System.out.println(s1.equals(s2));// compares value
		
		String s3="Pankaj";
		String s4="Pankaj";
		
		System.out.println(s3==s4);
}
}
