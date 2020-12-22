import java.util.*;
public class StringCalculator
{
public static int Add(String numbers)
{
char c;
int i,sum=0;

int l=numbers.length();
String[] s=new String[l];
if (numbers=="")
{
return(0);
}

else 
{
if(numbers.substring(0,2)=="//")
{
s=numbers.split("numbers.charAt(2)");
}
else
{
s=numbers.split(",");
}

int l1 = s.length;
for(i=1; i<l1; i++)
{
sum=sum+Integer.parseInt(s[i]);
}
return(sum);
}
}
public static void main(String args[]) throws Exception
{
Scanner in=new Scanner(System.in);
System.out.println("enter string");
String numbers=in.next();
System.out.println(Add(numbers));
}
}
