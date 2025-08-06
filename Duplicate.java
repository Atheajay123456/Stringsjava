class Duplicate{
public void duplicate(String name){
   String res="";
   for(int i=0;i<name.length();i++){
     boolean vis=false;
     char c=name.charAt(i);
     for(int j=0;j<i;j++){
      if(c==name.charAt(j)){
         vis=true;
       }
     }
    if(vis==true){
       continue;
      }
     else{
       res=res+c;
      }
     }
     System.out.println(res);
  }
public static void main(String[]args){
  Duplicate d=new Duplicate();
   d.duplicate("jagadeesh");
  }
}
