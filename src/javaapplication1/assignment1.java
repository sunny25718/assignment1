package javaapplication1;
import java.util.*;
import java.lang.*;


public class assignment1 {
static ArrayList<String> ar=new ArrayList<String>();
public static void main(String[] args){
int T;

assignment1 a=new assignment1();
Scanner sc=new Scanner(System.in);

do{
T=sc.nextInt();
}while(0>=T || T>100);
int[] result=new int[T];
for(int i=0;i<T;i++){

String textstring=new String();
String pattern=new String();
textstring=sc.next();
pattern=sc.next();
ArrayList<String> arr=new ArrayList<String>();
        arr=getPermutn(textstring, "");
        result[i]=a.check(arr,pattern);

}
for(int p=0;p<T;p++)
{
if(result[p]==1)
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}
public int check(ArrayList<String> text,String pattern){
int result=0;
for(int i = 0; i < text.size(); i++) {  
String s=text.get(i);
result= pattern.indexOf(s) !=-1? 1: 0;
System.out.println(result);
if(result==1){
break;
}


}  

return result;
}
static ArrayList getPermutn(String str, String ans)
{

   
    if (str.length() == 0) {
    ar.add(ans);
       
        return ar;
    }

    for (int i = 0; i < str.length(); i++) {
   char ch = str.charAt(i);

       
        String ros = str.substring(0, i) +  
                     str.substring(i + 1);

       
        getPermutn(ros, ans + ch);
    }
return ar;
}
}