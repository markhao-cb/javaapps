public class Reverse{ 
public static final void main(String[] args){
 System.out.println(new Reverse().reverseString("abcdefg"));
}
String reverseString(String a){
String b = "";
for(int i=a.length()-1;i>=0;i--){
	b=b+a.charAt(i);
	}
return b;
}
}
