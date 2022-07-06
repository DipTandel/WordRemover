//Remove a string from a sentence
//ICS4U1, Dip Tandel
//Oct 20, 2021

import java.util.Scanner;
public class WordRemover {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    
    //input sentence and string
    System.out.println("Enter a sentence: ");
    String sentence = in.nextLine();
    System.out.println("Enter a string: ");
    String string = in.nextLine();
    
    String newsentence = sentence.replaceAll(string,"");
    System.out.println(newsentence);
    
  }
}