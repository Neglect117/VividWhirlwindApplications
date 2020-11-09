import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
      Scanner inp  = new Scanner(System.in); 
      System.out.println("Please enter your name: ");
      String str = inp.nextLine();
      boolean test = str.endsWith(".");
      if (test == true)
        System.out.println("The sentence ends in a period");
      else{
        System.out.println("The sentence does not end in a period");
      }
      
}
} 
 

