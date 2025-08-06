class Palindrome{
public static void main(String[]args){
String name="lEvel";
String rev="";
for(int i=0;i<name.length();i++){
    rev=name.charAt(i)+rev;
 }
    if(name.equalsIgnoreCase(rev)){
    System.out.println("palindrome");
     }
     else{
     System.out.println("not a palindrome");
     }
 }
}