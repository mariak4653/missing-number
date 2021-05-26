//////////////////
//
//Maria Kobilaski
//5/11/2021
//Algorithme chiffre array 
//
//////////////////
import java.util.Scanner;//import scanner
public class chiffreManquant {
    public static void main(String args[]) {
      int [] array = new int [10]; //array de 10 cases
      
      //pour calculer les somes
      int attendue=0;
      int actuel=0;
      
      Scanner cat = new Scanner (System.in);
      for(int i=0; i<array.length; i++){ //inserer les valeurs dans l'array
        System.out.print("nombre " + (i+1) +" = ");
        array[i]= cat.nextInt();
      }
      for(int j=0; j<array.length; j++){ //va calculer le somme actuel de 1 a 10
            actuel = actuel + array[j];
        }
      
      for(int j=0; j<=10; j++){ //va calculer le somme attendue de 1 a 10
            attendue = attendue + j;
      }
      
      if(attendue-actuel==0){//si il n'y a pas de zero
          System.out.println("Il n'y a pas de chiffre manquant");
      }
      else{//quand il y a un zero
          System.out.println("Les chiffre manquant est " +(attendue-actuel));//calculer le difference
      }
      
    }
}