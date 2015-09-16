import java.util.Scanner;

public class RockPaperScissors
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println();System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("Let's play Rock Paper Scissors!");
    System.out.println(); System.out.println();
    System.out.println("To play:");
    System.out.println("Enter \"R\" for Rock, \"P\" for Paper, or \"S\" for Scissors.");
    System.out.println();
    int cscore = 0;
    int mscore = 0;
    System.out.println("Enter \"Q\" at any point to quit game.");
    System.out.println(); System.out.println(); System.out.println();
    char play = 'X';
    
    while (play!='Q')
    {
    System.out.println("                                        Score- Me: " + cscore + "  You: " + mscore);
    System.out.println();
    char turn = 'Y';
    while (turn=='Y')
    {
    System.out.print("Enter move: ");
     String s = input.nextLine();
     play = s.charAt(0);
    System.out.println();System.out.println();
    
    System.out.print("                    Your Move: ");
    
     if (play=='Q')
     {
     System.exit(0);
     }
     if (play=='R')
     {
     System.out.println("Rock");
     turn = 'N';
     }
     if (play=='P')
     {
     System.out.println("Paper");
     turn = 'N';
     }
    if (play=='S')
     {
     System.out.println("Scissors");
     turn = 'N';
     }
     if (play!='R' && play!='P' && play!='S')
     {
     System.out.println("Invalid move, try again.");
     }
    }
    System.out.println();
    char cmove = 'x';
    System.out.print("                    My Move: ");
    int x = (int)(Math.random()*10);
          char again = 'N';
          while (again == 'N')
          {
          switch (x)
          {
            case 0:
            case 1:
            case 2:
            case 3: System.out.println("Scissors"); cmove = 'S'; again = 'Y'; break;
            case 4:
            case 5:
            case 6:
            case 7: System.out.println("Paper"); cmove = 'P'; again = 'Y'; break;
            case 8:
            case 9:
            case 10: System.out.println("Rock"); cmove = 'R'; again = 'Y'; break;
            default: break;
          }
    }
    System.out.println();System.out.println();
    if (play=='S' && cmove=='R')
    {
    System.out.println("                    I Win!"); 
    cscore++;
    }
    
    if (play=='R' && cmove=='P')
    {
    System.out.println("                    I Win!"); 
    cscore++;
    }
    
    if (play=='P' && cmove=='S')
    {
    System.out.println("                    I Win!"); 
    cscore++;
    }
    
    if (play=='R' && cmove=='S')
    {
    System.out.println("                    You Win!"); 
    mscore++;
    }
    
    if (play=='P' && cmove=='R')
    {
    System.out.println("                    You Win!"); 
    mscore++;
    }
    
    if (play=='S' && cmove=='P')
    {
    System.out.println("                    You Win!"); 
    mscore++;
    }
    System.out.println(); System.out.println();System.out.println();
    }
  
  
  }
}