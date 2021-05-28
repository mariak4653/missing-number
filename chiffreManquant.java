//////////////////
//
//Maria Kobilaski
//5/11/2021
//Algorithm missing number 
//
//////////////////
import java.util.Scanner;//import scanner
public class chiffreManquant {
    public static void main(String args[]) {
      int [] array = new int [10]; //array of 10
      
      //to calculate the sums
      int attendue=0;
      int actuel=0;
      
      Scanner cat = new Scanner (System.in);
      for(int i=0; i<array.length; i++){ //insert values into array
        System.out.print("nombre " + (i+1) +" = ");
        array[i]= cat.nextInt();
      }
      for(int j=0; j<array.length; j++){ //calculate the actual sum of numbers in array
            actuel = actuel + array[j];
        }
      
      for(int j=0; j<=10; j++){ //calculate the expected sum of numbers from 1-10
            attendue = attendue + j;
      }
      
      if(attendue-actuel==0){//if there isn't a zero
          System.out.println("Il n'y a pas de chiffre manquant");
      }
      else{//when there is a zero
          System.out.println("Les chiffre manquant est " +(attendue-actuel));//calculate the difference to find and print the missing number
      }
      
    }
}
