import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Hi, could you print your name?");
      String name = scan.nextLine();

      System.out.print("Hello " + name + "!");
      
      System.out.println(" How old are you " + name + "?");
      int age = scan.nextInt();
      if (age <= 15){
        
        System.out.println("Wow, you are young!");
      
          }else if (age >= 15){
            System.out.println("You are getting old!");
      }

     
  }
}