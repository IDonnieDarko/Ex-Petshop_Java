import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
  
      Scanner sc = new Scanner(System.in);
        
      System.out.println("Digite qual o animal:");
      String animal = sc.nextLine();
    
      System.out.println("Digite a especie do animal:");
      String especie = sc.nextLine();
        
      System.out.println("Digite a raca do animal");
      String raca = sc.nextLine();
        
      System.out.println("Digite a idade do animal:");
      int idade = sc.nextInt();
    
      System.out.println("\nTipo de animal:" +animal
                           +"\nEspecie:" +especie
                           +"\nRaca:" +raca
                           +"\nIdade:" +idade);
       
   }
}
        