class vowelsConsonants{
public static void main(String[]args){
String input="ElEPHANT";
String letter=input.toLowerCase();
int vowels=0;
int consonants=0;
for(int i=0;i<letter.length();i++){
   char c=letter.charAt(i);
   if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
    vowels++;
    }
   else{
    consonants++;
    }
   }
  System.out.println(vowels);
  System.out.println(consonants);
 }
}