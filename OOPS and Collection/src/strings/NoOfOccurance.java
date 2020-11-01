package strings;

public class NoOfOccurance {
public static void main(String[] args) {
	String str="Java is Beautiful";
	char c='i';
	int count=0;
	//System.out.println(str=str.trim().replaceAll(" ", ""));
	char[] ch=str.toCharArray();
	for(int i=0;i<=ch.length-1;i++)
	{
		if(ch[i]==c)
			count++;
			
	}
	System.out.println("No of occurance of i="+ count);
}
}
