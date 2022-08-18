package pckg.lab3;

//Task#4: Print a diamond shape of asterisk

public class lab3task4 { 
public static void main(String[] args){
 
int n=3;//which line is the midde
char c = '*';
 
for(int i=1;i<=n;i++)//for increasing stars uptill the middle
{
for(int j=1;j<=n-i;j++)//for printing space
 
{
System.out.print(" ");
}
 
for(int j=1;j<=i*2-1;j++)//for printing the star
 
{
System.out.print(c);
}
System.out.println();//new line after every row
 
} 
for(int i=n-1;i>0;i--)//for decreasing stars uptill end
{
for(int j=1;j<=n-i;j++)//for printing space
 
{
System.out.print(" ");
}
for(int j=1;j<=i*2-1;j++)//for printing  stars
 
{
System.out.print(c);
}
System.out.println();//new line after every row
}
 
}
}
