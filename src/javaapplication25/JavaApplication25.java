package javaapplication25;
import java.util.Random;
import java.util.Scanner;

public class JavaApplication25 {
  static  int onecount(int number)
{
    int k,  onenumber=0;
    for(k=1;k<=10;k++)
        if( ((number>>k) & 1) ==1)
            onenumber++;
    return onenumber;
}

static int compared_to(int number, int guess){
    int a= number & guess;
    return a;
}
    public static void main(String[] args) {
    int i, rnumber,guess, newnumber, onenumber;
    int flag=0;
    int remaining=11;
    Random rand=new Random();
    System.out.println("Creating random number");
    rnumber=16+(int)(Math.random()* 2031);
    Scanner input=new Scanner(System.in);
    do{
        remaining-=1;
        System.out.println("\nRemaining Right:"+remaining+" Enter your estimate:");
        guess=input.nextInt();
            if(guess==rnumber)
             flag=1;

        newnumber=compared_to(guess, rnumber);
        onenumber=onecount(newnumber);
        System.out.println(onenumber);
        if(onenumber%2==0)
            System.out.println("Have double counting 1\n");
        else
            System.out.println("Have single count 1 \n");

    }while( remaining!=0&&flag!=1 );

    if(flag==1){
                System.out.println("\nCONGRATULATIONS,YOU WİN");

    }
    else{
                System.out.println("\nSORRY, YOU DID NOT KNOW: "+ rnumber);

    }

 }
}



 

 
    

