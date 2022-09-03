package number;
import java.util.*;
public class Exaamplee{

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
s.nextLine();
String str=s.nextLine();
String[] array=str.split(" ");
int arr[]=new int[n];
int sum=0;
for(int i=0;i<n;i++) {
arr[i]=Integer.valueOf(array[i]);
}
Arrays.sort(arr);
for(int i=0;i<n;i++) {
System.out.print(arr[i]+" ");
}

}

}

