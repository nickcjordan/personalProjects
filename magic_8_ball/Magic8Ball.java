import java.util.Scanner;

  public class Magic8Ball
  {
    public static void main(String[] args)
    {
    
    
      Scanner input = new Scanner(System.in);
      
      System.out.println(); System.out.println(); System.out.println();
      System.out.println("Did you know I can see the future?");
      System.out.println("Ask me any yes or no question and I will tell you what the future holds");
      System.out.println();
      System.out.println();
      char doit = 'Y';
      String s = "";
     while (doit == 'Y')
     {
      do
      {
      System.out.print("What is your question?  : ");
      s = input.nextLine();
      if (s.length()<7)
       {
       System.out.println("That is not a question. Try again.");
       }
      }
      while (s.length()<7);
      
        int x = (int)(Math.random()*10);
        System.out.println();
        System.out.println();
          char again = 'N';
          while (again == 'N')
          {
          switch (x)
          {
            case 0: System.out.println("Are you serious? No..."); again = 'Y'; break;
            case 1: System.out.println("Ehh most likely yeah."); again = 'Y'; break;
            case 2: System.out.println("Let's be real, probably not."); again = 'Y'; break;
            case 3: System.out.println("I'd say so."); again = 'Y'; break;
            case 4: System.out.println("HAHA! No."); again = 'Y'; break;
            case 5: System.out.println("Yes, of course...?"); again = 'Y'; break;
            case 6: System.out.println("I don't think so."); again = 'Y'; break;
            case 7: System.out.println("You already know the answer is yes."); again = 'Y'; break;
            case 8: System.out.println("Absolutely."); again = 'Y'; break;
            case 9: System.out.println("That's a negative."); again = 'Y'; break;
            case 10: System.out.println("I'd bet on it."); again = 'Y'; break;
            default: break;
          }
          }
    System.out.println();
    System.out.println();
    System.out.print("Do you have another question? (Enter Y/N): ");
    String question = "N";
    question = input.nextLine();
    if (question.charAt(0)!='Y')
     {
     System.exit(0);
     }
     else
     {
     doit = 'Y';
     }
    }
    }
  
  }