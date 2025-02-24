//this programs gets strings and checks if they contain palindromes

package h12;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;


public class H12 {

    
    public static void main(String[] args) {
        File inFile = new File("palin.txt");
        Scanner fileInput = null;
        
        try{
            fileInput = new Scanner(inFile);
        }
        catch (FileNotFoundException e){
            System.out.println(e);
        }//end catch
        int count = 0;
        while(fileInput.hasNext()){
            String s = fileInput.nextLine();
            String lower = removeWS(s.toLowerCase());
            if(palindrome(lower)==0 || palindrome(lower)==2){
                count++;
                System.out.println(count + " : " + s);
            }
        }//end loop
        
    }
    public static String removeWS(String a)
 { 
  if(a.isEmpty()){
     return "";
  }
  if(Character.isWhitespace(a.charAt(0)) || !Character.isLetterOrDigit(a.charAt(0))){
     return removeWS(a.substring(1));
  }
  else{
     return a.charAt(0) + removeWS(a.substring(1));
  }
}
    public static int palindrome(String x){
        if(x.length()<=1){
            return 2;
        }
        if(x.charAt(0)==x.charAt(x.length()-1)){
            return palindrome(x.substring(1,x.length()-1));
        }
        else{
            return 1;
        }
    }
}
