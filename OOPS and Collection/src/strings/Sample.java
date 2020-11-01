package strings;

public class Sample {
	public static void main(String[] args) {
		String str="JavaDeveloper";
		System.out.println(str.length());
		for(int i=0;i<str.length();i++)
			System.out.print(str.charAt(i));
		System.out.println();
		for(int j=str.length()-1;j>=0;j--)
			System.out.print(str.charAt(j));
		System.out.println();
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf("e", 6));
		System.out.println(str.indexOf("z"));
		System.out.println(str.lastIndexOf("e"));
		System.out.println(str.lastIndexOf("e", 10));
		System.out.println(str.contains("Java"));
		System.out.println(str.isEmpty());
		String str1="";
		System.out.println(str1.isEmpty());
		String str2=" ";
		System.out.println(str2.isEmpty());
		//String str3=null;
		//System.out.println(str3.isEmpty());
		System.out.println(str.substring(5));
		System.out.println(str.substring(5, 11));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.concat("java"));
		String str4="Mava";
		System.out.println(str.concat(str2));
		System.out.println(str.concat(str4));
		char[] ch=str.toCharArray();
		for(int k=0;k<ch.length;k++)
		System.out.print(ch[k]);
		System.out.println();
		for(int l=ch.length-1;l>=0;l--)
			System.out.print(ch[l]);
		System.out.println();
		String rev="";
		for(int m=ch.length-1;m>=0;m--)
			rev=rev+ch[m];
			System.out.println(rev);
			String reverse="";
	   for(int n=str.length()-1;n>=0;n--)
		   reverse=reverse+str.charAt(n);
	   System.out.println(reverse);
	   System.out.println("String Buffer and builder----------");
		String n="JAVA";
			n="Mava";
		System.out.println(n);
		String buff="Java";
		//StringBuffer buff=new StringBuffer("Java");
		StringBuffer buff1=new StringBuffer(buff);
		StringBuilder buff2=new StringBuilder(buff);
		buff1.append("developer");
		buff2.append("developer");
		System.out.println(buff1);
		System.out.println(buff2);
		buff1.insert(2, "w");
		System.out.println(buff1);
		buff1.deleteCharAt(2);
		System.out.println(buff1);
		buff1.delete(0, 3);
		System.out.println(buff1);
		buff1.reverse();
		System.out.println(buff1);
		 
			
	}

}