import java.util.Random;
import java.util.Scanner;

class numbergame{
public static void main(String args[])
{
Random num=new Random();
int randnum=num.nextInt(100)+1;
System.out.println("Random number is "+ randnum);
int score=0;
Scanner input=new Scanner(System.in);
while(true){ 
System.out.println("Enter your Guess");
int guess=input.nextInt();
score++;
System.out.println(" Your score is: " +score);
 if(guess==randnum)
{
 System.out.println("your guess is correct");
  break;
} else if(guess>randnum)
{
 System.out.println("guess is too high");
}  else
{
System.out.println("guess is too low");
}
}
}
}