import java.util.Scanner;

public class TicTacToe
{
  public static void main(String[] args) 
  {
    Scanner input= new Scanner(System.in);

    char again = '0';
    char answer = 'a';
    
    String a1 = "   ";
    String a2 = "   ";
    String a3 = "   ";
    String b1 = "   ";
    String b2 = "   ";
    String b3 = "   ";
    String c1 = "   ";
    String c2 = "   ";
    String c3 = "   ";
    
    System.out.println(); System.out.println(); System.out.println();
    System.out.println("Hello there, nice of you to challenge me. Let's play Tic Tac Toe.");
    System.out.println();
    System.out.println();
    System.out.println("Instructions:");
    System.out.println();
    System.out.println("You will be X's and I will be O's.");
    System.out.println("The columns are 1, 2, 3, and the rows are a, b, c.");
    System.out.println();
    System.out.println("The game board looks like this: ");
    System.out.println("a1 | a2 | a3");
    System.out.println("____________");
    System.out.println("b1 | b2 | b3");
    System.out.println("____________");
    System.out.println("c1 | c2 | c3");
    System.out.println();
    System.out.println();
    System.out.println("To make a move, enter where you want to play: (in the form ex.\"a1\").");
    System.out.println();
    
   int win = 0;
   
   System.out.println("Levels of difficulty: ");
   System.out.println("For Beginner, enter \"1\"");
   System.out.println("For Experienced, enter \"2\"");
   System.out.println("For Master, enter \"3\"");
   System.out.print("Enter difficulty level: ");
 
   char level = input.nextLine().charAt(0);
  System.out.println();
   
   
   if (level =='1')
   {
   System.out.println("You chose Beginner, let's play!"); 
   while(win == 0)
   {
    a1 = "   ";
    a2 = "   ";
    a3 = "   ";
    b1 = "   ";
    b2 = "   ";
    b3 = "   ";
    c1 = "   ";
    c2 = "   ";
    c3 = "   ";
    answer = 'a';
    
    System.out.println();
    System.out.println(a1 + "|" + a2 + "|" + a3);
    System.out.println("____________");
    System.out.println(b1 + "|" + b2 + "|" + b3);
    System.out.println("____________");
    System.out.println(c1 + "|" + c2 + "|" + c3);
    System.out.println();
   
    while (answer!='Y')
    {
     
     int hcount = 0;
     while(hcount==0)
     {
     hcount = 0;
    System.out.print("Make your move: ");
     String move = input.nextLine();
       switch (move)
       {
       case "a1": if (a1== "   "){ a1 = " X "; hcount = 1;} break;
       case "a2": if (a2== "   "){ a2 = " X "; hcount = 1;} break;
       case "a3": if (a3== "   "){ a3 = " X "; hcount = 1;} break;
       case "b1": if (b1== "   "){ b1 = " X "; hcount = 1;} break;
       case "b2": if (b2== "   "){ b2 = " X "; hcount = 1;} break;
       case "b3": if (b3== "   "){ b3 = " X "; hcount = 1;} break;
       case "c1": if (c1== "   "){ c1 = " X "; hcount = 1;} break;
       case "c2": if (c2== "   "){ c2 = " X "; hcount = 1;} break;
       case "c3": if (c3== "   "){ c3 = " X "; hcount = 1;} break;
       default: System.out.println("Invalid, try again."); hcount = 0; break;
       }
    System.out.println();
    System.out.println("Your move: ");
    System.out.println(a1 + "|" + a2 + "|" + a3);
    System.out.println("____________");
    System.out.println(b1 + "|" + b2 + "|" + b3);
    System.out.println("____________");
    System.out.println(c1 + "|" + c2 + "|" + c3);
    System.out.println();
     }
     
    
       
    if ((a1==" X ") && (a2==" X ") && (a3==" X "))
    {
    System.out.println("You Win!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    again = '1';
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((b1==" X ") && (b2==" X ") && (b3==" X "))
    {
    System.out.println("You Win!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    again = '1';
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((c1==" X ") && (c2==" X ") && (c3==" X "))
    {
    System.out.println("You Win!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    again = '1';
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((a1==" X ") && (b1==" X ") && (c1==" X "))
    {
    System.out.println("You Win!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    again = '1';
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((a2==" X ") && (b2==" X ") && (c2==" X "))
    {
    System.out.println("You Win!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    again = '1';
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((a1==" X ") && (b2==" X ") && (c3==" X "))
    {
    System.out.println("You Win!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    again = '1';
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((a3==" X ") && (b2==" X ") && (c1==" X "))
    {
    System.out.println("You Win!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    again = '1';
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if (again=='0') 
    {
    if((a1!="   ") && (a2!="   ") && (a3!="   ") && (b1!="   ") && (b2!="   ") && (b3!="   ") && (c1!="   ") && (c2!="   ") && (c3!="   "))
    {
    System.out.println("It's a draw!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    }
     
     int x = 0;
     int count = 0;
    
    boolean space = false;
    
     while((space==false)&&(answer=='a'))
     {
     x = (int)Math.round((Math.random())*10);
     space = false;
       switch (x)
       {
        case 1: if(a1== "   ") {a1 = " O "; space = true;} break;
        case 2: if(a2== "   ") {a2 = " O "; space = true;} break;
        case 3: if(a3== "   ") {a3 = " O "; space = true;} break;
        case 4: if(b1== "   ") {b1 = " O "; space = true;} break;
        case 5: if(b2== "   ") {b2 = " O "; space = true;} break;
        case 6: if(b3== "   ") {b3 = " O "; space = true;} break;
        case 7: if(c1== "   ") {c1 = " O "; space = true;} break;
        case 8: if(c2== "   ") {c2 = " O "; space = true;} break;
        case 9: if(c3== "   ") {c3 = " O "; space = true;} break;
        default: space = false; break;
       }
       if (space==true)
       {
    System.out.println("My move: ");
    System.out.println();
    System.out.println(a1 + "|" + a2 + "|" + a3);
    System.out.println("____________");
    System.out.println(b1 + "|" + b2 + "|" + b3);
    System.out.println("____________");
    System.out.println(c1 + "|" + c2 + "|" + c3);
    System.out.println();
    }
     }
  
    if ((a1==" O ") && (a2==" O ") && (a3==" O "))
    {
    System.out.println("You Lose!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((b1==" O ") && (b2==" O ") && (b3==" O "))
    {
    System.out.println("You Lose!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((c1==" O ") && (c2==" O ") && (c3==" O "))
    {
    System.out.println("You Lose!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((a1==" O ") && (b1==" O ") && (c1==" O "))
    {
    System.out.println("You Lose!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((a2==" O ") && (b2==" O ") && (c2==" O "))
    {
    System.out.println("You Lose!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((a1==" O ") && (b2==" O ") && (c3==" O "))
    {
    System.out.println("You Lose!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((a3==" O ") && (b2==" O ") && (c1==" O "))
    {
    System.out.println("You Lose!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    if (answer=='N')
    {
    System.exit(0);
    }
   }
  }
  }
  }
    
       
   if (level =='2')
   {
   System.out.println("You chose Experienced, let's play!");
   while(win == 0)
   {
    a1 = "   ";
    a2 = "   ";
    a3 = "   ";
    b1 = "   ";
    b2 = "   ";
    b3 = "   ";
    c1 = "   ";
    c2 = "   ";
    c3 = "   ";
    answer = 'a';
    
    System.out.println();
    System.out.println(a1 + "|" + a2 + "|" + a3);
    System.out.println("____________");
    System.out.println(b1 + "|" + b2 + "|" + b3);
    System.out.println("____________");
    System.out.println(c1 + "|" + c2 + "|" + c3);
    System.out.println();
   
    while (answer!='Y')
    {
     
     int hcount = 0;
     while(hcount==0)
     {
     hcount = 0;
    System.out.print("Make your move: ");
     String move = input.nextLine();
       switch (move)
       {
       case "a1": if (a1== "   "){ a1 = " X "; hcount = 1;} break;
       case "a2": if (a2== "   "){ a2 = " X "; hcount = 1;} break;
       case "a3": if (a3== "   "){ a3 = " X "; hcount = 1;} break;
       case "b1": if (b1== "   "){ b1 = " X "; hcount = 1;} break;
       case "b2": if (b2== "   "){ b2 = " X "; hcount = 1;} break;
       case "b3": if (b3== "   "){ b3 = " X "; hcount = 1;} break;
       case "c1": if (c1== "   "){ c1 = " X "; hcount = 1;} break;
       case "c2": if (c2== "   "){ c2 = " X "; hcount = 1;} break;
       case "c3": if (c3== "   "){ c3 = " X "; hcount = 1;} break;
       default: System.out.println("Invalid, try again."); hcount = 0; break;
       }
    System.out.println();
    System.out.println("Your move: ");
    System.out.println(a1 + "|" + a2 + "|" + a3);
    System.out.println("____________");
    System.out.println(b1 + "|" + b2 + "|" + b3);
    System.out.println("____________");
    System.out.println(c1 + "|" + c2 + "|" + c3);
    System.out.println();
     }
       
       
       
    if ((a1==" X ") && (a2==" X ") && (a3==" X "))
    {
    System.out.println("You Win!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    again = '1';
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((b1==" X ") && (b2==" X ") && (b3==" X "))
    {
    System.out.println("You Win!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    again = '1';
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((c1==" X ") && (c2==" X ") && (c3==" X "))
    {
    System.out.println("You Win!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    again = '1';
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((a1==" X ") && (b1==" X ") && (c1==" X "))
    {
    System.out.println("You Win!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    again = '1';
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((a2==" X ") && (b2==" X ") && (c2==" X "))
    {
    System.out.println("You Win!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    again = '1';
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((a1==" X ") && (b2==" X ") && (c3==" X "))
    {
    System.out.println("You Win!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    again = '1';
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((a3==" X ") && (b2==" X ") && (c1==" X "))
    {
    System.out.println("You Win!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    again = '1';
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if (again=='0') 
    {
    if((a1!="   ") && (a2!="   ") && (a3!="   ") && (b1!="   ") && (b2!="   ") && (b3!="   ") && (c1!="   ") && (c2!="   ") && (c3!="   "))
    {
    System.out.println("It's a draw!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    }
     
     int x = 0;
     int count = 0;
    
    boolean space = false;
    
   while((space==false)&&(answer=='a'))
   {
    
   char dub = 'a';
    while (dub=='a')
    {
    
     if((dub=='a') && (a1==" O ") && (a2==" O ") && (a3=="   "))
    {
    a3 = " O ";
    space=true; dub='b';
    }
    if((dub=='a') && (a1==" O ") && (a2=="   ") && (a3==" O "))
    {
    a2 = " O ";
    space=true; dub='b';
    }
    if((dub=='a') && (a1=="   ") && (a2==" O ") && (a3==" O "))
    {
    a1 = " O ";
    space=true; dub='b';
    }
    
    if((dub=='a') && (b1==" O ") && (b2==" O ") && (b3=="   "))
    {
    b3 = " O ";
    space=true; dub='b';
    }
    if((dub=='a') && (b1==" O ") && (b2=="   ") && (b3==" O "))
    {
    b2 = " O ";
    space=true; dub='b';
    }
    if((dub=='a') && (b1=="   ") && (b2==" O ") && (b3==" O "))
    {
    b1 = " O ";
    space=true; dub='b';
    }
    
    if((dub=='a') && (c1==" O ") && (c2==" O ") && (c3=="   "))
    {
    c3 = " O ";
    space=true; dub='b';
    }
    if((dub=='a') && (c1==" O ") && (c2=="   ") && (c3==" O "))
    {
    c2 = " O ";
    space=true; dub='b';
    }
    if((dub=='a') && (c1=="   ") && (c2==" O ") && (c3==" O "))
    {
    c1 = " O ";
    space=true; dub='b';
    }
    
     if((dub=='a') && (a1==" O ") && (b1==" O ") && (c1=="   "))
    {
    c1 = " O ";
    space=true; dub='b';
    }
    if((dub=='a') && (a1==" O ") && (b1=="   ") && (c1==" O "))
    {
    b1 = " O ";
    space=true; dub='b';
    }
    if((dub=='a') && (a1=="   ") && (b1==" O ") && (c1==" O "))
    {
    a1 = " O ";
    space=true; dub='b';
    }
    
    if((dub=='a') && (a2==" O ") && (b2==" O ") && (c2=="   "))
    {
    c2 = " O ";
    space=true; dub='b';
    }
    if((dub=='a') && (a2==" O ") && (b2=="   ") && (c2==" O "))
    {
    b2 = " O ";
    space=true; dub='b';
    }
    if((dub=='a') && (a2=="   ") && (b2==" O ") && (c2==" O "))
    {
    a1 = " O ";
    space=true; dub='b';
    }
    
    if((dub=='a') && (a3==" O ") && (b3==" O ") && (c3=="   "))
    {
    c3 = " O ";
    space=true; dub='b';
    }
    if((dub=='a') && (a3==" O ") && (b3=="   ") && (c3==" O "))
    {
    b3 = " O ";
    space=true; dub='b';
    }
    if((dub=='a') && (a3=="   ") && (b3==" O ") && (c3==" O "))
    {
    a3 = " O ";
    space=true; dub='b';
    }
    
    if((dub=='a') && (a1==" O ") && (b2==" O ") && (c3=="   "))
    {
    c3 = " O ";
    space=true; dub='b';
    }
    if((dub=='a') && (a1==" O ") && (b2=="   ") && (c3==" O "))
    {
    b2 = " O ";
    space=true; dub='b';
    }
    if((dub=='a') && (a1=="   ") && (b2==" O ") && (c3==" O "))
    {
    a1 = " O ";
    space=true; dub='b';
    }
    
    if((dub=='a') && (a3==" O ") && (b2==" O ") && (c1=="   "))
    {
    c1 = " O ";
    space=true; dub='b';
    }
    if((dub=='a') && (a3==" O ") && (b2=="   ") && (c1==" O "))
    {
    b2 = " O ";
    space=true; dub='b';
    }
    if((dub=='a') && (a3=="   ") && (b2==" O ") && (c1==" O "))
    {
    a3 = " O ";
    space=true; dub='b';
    }
    else
    {
    dub = 'b';
    }
    }
    
    if (space==true)
       {
    System.out.println("My move: ");
    System.out.println();
    System.out.println(a1 + "|" + a2 + "|" + a3);
    System.out.println("____________");
    System.out.println(b1 + "|" + b2 + "|" + b3);
    System.out.println("____________");
    System.out.println(c1 + "|" + c2 + "|" + c3);
    System.out.println();
      }
    
     else
     {
     x = (int)Math.round((Math.random())*10);
     space = false;
       switch (x)
       {
        case 1: if(a1== "   ") {a1 = " O "; space = true;} break;
        case 2: if(a2== "   ") {a2 = " O "; space = true;} break;
        case 3: if(a3== "   ") {a3 = " O "; space = true;} break;
        case 4: if(b1== "   ") {b1 = " O "; space = true;} break;
        case 5: if(b2== "   ") {b2 = " O "; space = true;} break;
        case 6: if(b3== "   ") {b3 = " O "; space = true;} break;
        case 7: if(c1== "   ") {c1 = " O "; space = true;} break;
        case 8: if(c2== "   ") {c2 = " O "; space = true;} break;
        case 9: if(c3== "   ") {c3 = " O "; space = true;} break;
        default: space = false; break;
       }
       if (space==true)
       {
    System.out.println("My move: ");
    System.out.println();
    System.out.println(a1 + "|" + a2 + "|" + a3);
    System.out.println("____________");
    System.out.println(b1 + "|" + b2 + "|" + b3);
    System.out.println("____________");
    System.out.println(c1 + "|" + c2 + "|" + c3);
    System.out.println();
      }
     }
   }
     
    
    if ((a1==" O ") && (a2==" O ") && (a3==" O "))
    {
    System.out.println("You Lose!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((b1==" O ") && (b2==" O ") && (b3==" O "))
    {
    System.out.println("You Lose!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((c1==" O ") && (c2==" O ") && (c3==" O "))
    {
    System.out.println("You Lose!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((a1==" O ") && (b1==" O ") && (c1==" O "))
    {
    System.out.println("You Lose!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((a2==" O ") && (b2==" O ") && (c2==" O "))
    {
    System.out.println("You Lose!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((a1==" O ") && (b2==" O ") && (c3==" O "))
    {
    System.out.println("You Lose!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    if (answer=='N')
    {
    System.exit(0);
    }
    }
    
    if ((a3==" O ") && (b2==" O ") && (c1==" O "))
    {
    System.out.println("You Lose!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    if (answer=='N')
    {
    System.exit(0);
    }
   }
  }
  }
  }
  
  
   if (level =='3')
   {
   System.out.println("You chose Master, good luck!");
   while(win == 0)
   {
    a1 = "   ";
    a2 = "   ";
    a3 = "   ";
    b1 = "   ";
    b2 = "   ";
    b3 = "   ";
    c1 = "   ";
    c2 = "   ";
    c3 = "   ";
    answer = 'a';
    
    System.out.println();
    System.out.println(a1 + "|" + a2 + "|" + a3);
    System.out.println("____________");
    System.out.println(b1 + "|" + b2 + "|" + b3);
    System.out.println("____________");
    System.out.println(c1 + "|" + c2 + "|" + c3);
    System.out.println();
   
    while (answer!='Y')
    {
     
     int hcount = 0;
     while(hcount==0)
     {
     hcount = 0;
    System.out.print("Make your move: ");
     String move = input.nextLine();
       switch (move)
       {
       case "a1": if (a1== "   "){ a1 = " X "; hcount = 1;} break;
       case "a2": if (a2== "   "){ a2 = " X "; hcount = 1;} break;
       case "a3": if (a3== "   "){ a3 = " X "; hcount = 1;} break;
       case "b1": if (b1== "   "){ b1 = " X "; hcount = 1;} break;
       case "b2": if (b2== "   "){ b2 = " X "; hcount = 1;} break;
       case "b3": if (b3== "   "){ b3 = " X "; hcount = 1;} break;
       case "c1": if (c1== "   "){ c1 = " X "; hcount = 1;} break;
       case "c2": if (c2== "   "){ c2 = " X "; hcount = 1;} break;
       case "c3": if (c3== "   "){ c3 = " X "; hcount = 1;} break;
       default: System.out.println("Invalid, try again."); hcount = 0; break;
       }
    System.out.println();
    System.out.println("Your move: ");
    System.out.println(a1 + "|" + a2 + "|" + a3);
    System.out.println("____________");
    System.out.println(b1 + "|" + b2 + "|" + b3);
    System.out.println("____________");
    System.out.println(c1 + "|" + c2 + "|" + c3);
    System.out.println();
     }
       
       
    if (  ((a1==" X ") && (a2==" X ") && (a3==" X ")) ||
          ((b1==" X ") && (b2==" X ") && (b3==" X ")) ||
          ((c1==" X ") && (c2==" X ") && (c3==" X ")) ||
          ((a1==" X ") && (b1==" X ") && (c1==" X ")) ||
          ((a2==" X ") && (b2==" X ") && (c2==" X ")) ||
          ((a1==" X ") && (b2==" X ") && (c3==" X ")) ||
          ((a3==" X ") && (b2==" X ") && (c1==" X ")) ) {
    System.out.println("You Win!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    again = '1';
    if (answer=='N'){  System.exit(0);}
    }
    
  if (again=='0') {
    if((a1!="   ") && (a2!="   ") && (a3!="   ") && (b1!="   ") && (b2!="   ") && (b3!="   ") && (c1!="   ") && (c2!="   ") && (c3!="   ")){
    System.out.println("It's a draw!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    if (answer=='N') System.exit(0);
    }
  }
     
     int x = 0;
     int count = 0;
     boolean space = false;
    
   while((space==false)&&(answer=='a'))
   {
    char dub = 'a';
    while (dub=='a'){
      if((dub=='a') && (a1==" X ") && (a2==" X ") && (a3=="   ")){
        a3 = " O "; space=true; dub='b';}
      if((dub=='a') && (a1==" X ") && (a2=="   ") && (a3==" X ")){
        a2 = " O "; space=true;  dub='b'; }
      if((dub=='a') && (a1=="   ") && (a2==" X ") && (a3==" X ")){
        a1 = " O "; space=true;  dub='b';}
      if((dub=='a') && (b1==" X ") && (b2==" X ") && (b3=="   ")){
        b3 = " O "; space=true;  dub='b'; }
      if((dub=='a') && (b1==" X ") && (b2=="   ") && (b3==" X ")){
        b2 = " O "; space=true;  dub='b';}
      if((dub=='a') && (b1=="   ") && (b2==" X ") && (b3==" X ")){
        b1 = " O "; space=true;  dub='b';}
    
      if((dub=='a') && (c1==" X ") && (c2==" X ") && (c3=="   ")){
        c3 = " O "; space=true;  dub='b';}
      if((dub=='a') && (c1==" X ") && (c2=="   ") && (c3==" X ")){
        c2 = " O "; space=true;  dub='b';}
      if((dub=='a') && (c1=="   ") && (c2==" X ") && (c3==" X ")){
        c1 = " O "; space=true;  dub='b';}
    
       if((dub=='a') && (a1==" X ") && (b1==" X ") && (c1=="   ")){
        c1 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a1==" X ") && (b1=="   ") && (c1==" X ")){
        b1 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a1=="   ") && (b1==" X ") && (c1==" X ")){
        a1 = " O "; space=true;  dub='b';}
    
      if((dub=='a') && (a2==" X ") && (b2==" X ") && (c2=="   ")){
        c2 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a2==" X ") && (b2=="   ") && (c2==" X ")){
        b2 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a2=="   ") && (b2==" X ") && (c2==" X ")){
        a1 = " O "; space=true;  dub='b';}
    
      if((dub=='a') && (a3==" X ") && (b3==" X ") && (c3=="   ")){
        c3 = " O "; space=true;  dub='b'; }
      if((dub=='a') && (a3==" X ") && (b3=="   ") && (c3==" X ")){
        b3 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a3=="   ") && (b3==" X ") && (c3==" X ")){
        a3 = " O "; space=true;  dub='b';}
    
      if((dub=='a') && (a1==" X ") && (b2==" X ") && (c3=="   ")){
        c3 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a1==" X ") && (b2=="   ") && (c3==" X ")){
        b2 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a1=="   ") && (b2==" X ") && (c3==" X ")){
        a1 = " O "; space=true;  dub='b';}
    
      if((dub=='a') && (a3==" X ") && (b2==" X ") && (c1=="   ")){
        c1 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a3==" X ") && (b2=="   ") && (c1==" X ")){
        b2 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a3=="   ") && (b2==" X ") && (c1==" X ")){
        a3 = " O "; space=true;  dub='b';}
    
       if((dub=='a') && (a1==" O ") && (a2==" O ") && (a3=="   ")){
        a3 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a1==" O ") && (a2=="   ") && (a3==" O ")){
        a2 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a1=="   ") && (a2==" O ") && (a3==" O ")){
        a1 = " O "; space=true;  dub='b';}
    
      if((dub=='a') && (b1==" O ") && (b2==" O ") && (b3=="   ")){
        b3 = " O "; space=true;  dub='b';}
      if((dub=='a') && (b1==" O ") && (b2=="   ") && (b3==" O ")){
        b2 = " O "; space=true;  dub='b';}
      if((dub=='a') && (b1=="   ") && (b2==" O ") && (b3==" O ")){
        b1 = " O "; space=true;  dub='b';}
    
      if((dub=='a') && (c1==" O ") && (c2==" O ") && (c3=="   ")){
        c3 = " O "; space=true;  dub='b';}
      if((dub=='a') && (c1==" O ") && (c2=="   ") && (c3==" O ")){
        c2 = " O "; space=true;  dub='b';}
      if((dub=='a') && (c1=="   ") && (c2==" O ") && (c3==" O ")){
        c1 = " O "; space=true;  dub='b';}
    
       if((dub=='a') && (a1==" O ") && (b1==" O ") && (c1=="   ")){
        c1 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a1==" O ") && (b1=="   ") && (c1==" O ")){
        b1 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a1=="   ") && (b1==" O ") && (c1==" O ")){
        a1 = " O "; space=true;  dub='b';}
    
      if((dub=='a') && (a2==" O ") && (b2==" O ") && (c2=="   ")){
        c2 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a2==" O ") && (b2=="   ") && (c2==" O ")){
        b2 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a2=="   ") && (b2==" O ") && (c2==" O ")){
        a1 = " O "; space=true;  dub='b';}
    
      if((dub=='a') && (a3==" O ") && (b3==" O ") && (c3=="   ")){
        c3 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a3==" O ") && (b3=="   ") && (c3==" O ")){
        b3 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a3=="   ") && (b3==" O ") && (c3==" O ")){
        a3 = " O "; space=true;  dub='b';}
    
      if((dub=='a') && (a1==" O ") && (b2==" O ") && (c3=="   ")){
        c3 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a1==" O ") && (b2=="   ") && (c3==" O ")){
        b2 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a1=="   ") && (b2==" O ") && (c3==" O ")){
        a1 = " O "; space=true;  dub='b';}
    
      if((dub=='a') && (a3==" O ") && (b2==" O ") && (c1=="   ")){
        c1 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a3==" O ") && (b2=="   ") && (c1==" O ")){
        b2 = " O "; space=true;  dub='b';}
      if((dub=='a') && (a3=="   ") && (b2==" O ") && (c1==" O ")){
        a3 = " O "; space=true;  dub='b';}
    else{
    dub = 'b';}
    }
    
    if (space==true)
       {
    System.out.println("My move: ");
    System.out.println();
    System.out.println(a1 + "|" + a2 + "|" + a3);
    System.out.println("____________");
    System.out.println(b1 + "|" + b2 + "|" + b3);
    System.out.println("____________");
    System.out.println(c1 + "|" + c2 + "|" + c3);
    System.out.println();
      }
    
     else
     {
     x = (int)Math.round((Math.random())*10);
     space = false;
       switch (x)
       {
        case 1: if(a1== "   ") {a1 = " O "; space = true;} break;
        case 2: if(a2== "   ") {a2 = " O "; space = true;} break;
        case 3: if(a3== "   ") {a3 = " O "; space = true;} break;
        case 4: if(b1== "   ") {b1 = " O "; space = true;} break;
        case 5: if(b2== "   ") {b2 = " O "; space = true;} break;
        case 6: if(b3== "   ") {b3 = " O "; space = true;} break;
        case 7: if(c1== "   ") {c1 = " O "; space = true;} break;
        case 8: if(c2== "   ") {c2 = " O "; space = true;} break;
        case 9: if(c3== "   ") {c3 = " O "; space = true;} break;
        default: space = false; break;
       }
       if (space==true)
       {
    System.out.println("My move: ");
    System.out.println();
    System.out.println(a1 + "|" + a2 + "|" + a3);
    System.out.println("____________");
    System.out.println(b1 + "|" + b2 + "|" + b3);
    System.out.println("____________");
    System.out.println(c1 + "|" + c2 + "|" + c3);
    System.out.println();
      }
     }
   }
     
  if    (((a1==" O ") && (a2==" O ") && (a3==" O ")) ||
        ((b1==" O ") && (b2==" O ") && (b3==" O ")) ||
        ((c1==" O ") && (c2==" O ") && (c3==" O ")) ||
        ((a1==" O ") && (b1==" O ") && (c1==" O ")) ||
        ((a2==" O ") && (b2==" O ") && (c2==" O ")) ||
        ((a1==" O ") && (b2==" O ") && (c3==" O ")) ||
        ((a3==" O ") && (b2==" O ") && (c1==" O "))) {
    System.out.println("You Lose!!");
    System.out.println();
    System.out.print("Play again? Enter (Y/N): ");
    answer = input.nextLine().charAt(0);
    if (answer=='N') System.exit(0);
  }
    
   }
  }
  }
  }  
  }  
