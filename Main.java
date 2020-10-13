import java.util.Scanner;//imported new scanner for interaction

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Hi, whats your name?");
      String name = scan.nextLine(); // Scans next line for answer.

    System.out.print("Hello " + name + "!");
      
    System.out.println(" How old are you " + name + "?");
      int age = scan.nextInt();
      if (age < 15 && age != 0 ){ // new if/else statement if there are different ages.
        
    System.out.println("Wow, you are young! " + "Are you ready for this?");
      
      }else if (age >= 15 || age != 0){// if age is greater than 15 or not 0, it will print whats below
    System.out.println("Your young days are not over yet! " + "Are you ready for this?");
      }
       String answer1 = scan.next();
    System.out.println("Ok, now I am going to ask some  questions. " + "What is your favorite food?");//More questions for the code and more answers 
       String answer2 = scan.next();
    System.out.println("I could eat " + answer2 + " all day!" );
    System.out.println("Now, for some math, what is half of 3?");
       double answer3 = scan.nextDouble();//Will scan for a double answer
       if(answer3 == 1.5){
         System.out.println("Nice job!");//If answer is correct will print nice job.
       }else if (answer3 != 1.5){
         System.out.println("Nice try, but not quite.");//If answer is wrong, will print nice try.
       }
    System.out.println("Now, this might be a little tricky");
    System.out.println("How many times does the number 7 appear?"); //Stataments to stimulate the audience
    for(int a = 1; a <= 100; a++){ //for loop to 100, audience must count how many 7's.
      System.out.print(a);
    }  
  }
}