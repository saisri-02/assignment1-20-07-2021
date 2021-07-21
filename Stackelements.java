import java.util.*;
public class Stackelements
{
static Stack<Integer> s=new Stack<Integer>();
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter array size : ");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
insert(a,n);
display();
}
public static void insert(int a[],int n)
{
for(int i=0;i<n;i++)
s.push(a[i]);
}
public static void display()
{
System.out.println(s);
}
}

output:

Enter array size : 
4
12 25 39 47 
[12, 25, 39, 47]
