import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Hi, whats your name?");
      String name = scan.nextLine();

      System.out.print("Hello " + name + "!");
      
      System.out.println(" How old are you " + name + "?");
      int age = scan.nextInt();
      if (age < 15 && age != 0 ){
        
        System.out.println("Wow, you are young!");
      
          }else if (age >= 15 || age != 0){
            System.out.println("Your young days are not over yet!");
          }else if (age == 0){
        System.out.println("How are you talking to me?!");
          } String mane = scan.nextLine();
          System.out.println("Now I am going to ask some questions. " + "What is your favorite food?"); 
  }
}