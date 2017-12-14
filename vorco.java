import java.util.scanner;
class vorco
{
public static void main(String args[])
{
 char x1[]={'a','e','i','o','u','A','E','I','O','U'};
 char y1;
Scanner in=new scanner(system.in);
y1=in.nextLine();
char find()
{
for(int z:x1)
{
  if(y1==z)
System.out.println("vowel");
  else
System.out.println("consonant");
 }
}
vorco w=new vorco();
w.find();
}
}
