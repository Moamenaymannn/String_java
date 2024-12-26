public class Stringiti{

public static void main(String[] args) {


String text = "ITI develops people and ITI hose of developers and ITI for people";

String [] str=text.split(" ");
 
 int size = str.length;
 int count = 0;

 for(int i=0 ; i<size ; i++){ 
          if( str[i].equals("ITI") )
          count++;
 } 
 
int countindex=0;
int index=0;
 
 while( (index = text.indexOf("ITI" , index)) != -1) { 
countindex++;
index+="ITI".length();
}


System.out.println("count is" + count);
System.out.println("count is" + countindex);


}
}
