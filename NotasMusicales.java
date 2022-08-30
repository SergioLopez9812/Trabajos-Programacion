
package notasmusicales;

import java.util.Scanner;


public class NotasMusicales {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                 int nota;

                 System.out.print(" 1. Do");
                 System.out.print("  2. Re");
                 System.out.print("  3. Mi");
                 System.out.print("  4. Fa");
                 System.out.print("  5. Sol");
                 System.out.print("  6. La");
                 System.out.print("  7. Si\n");
                 System.out.println("Digita un numero del 1 al 7:\n ");
                 nota = scanner.nextInt();
                // Realizamos comparaciones y mostramos el resultado
                   switch (nota) {
                   case 1:
                     System.out.println("La nota musical seleccionada es Do");
                      break;
                   case 2:
                     System.out.println("La nota musical seleccionada es Re");
                      break;
                   case 3 : 
                    System.out.println("La nota musical seleccionada es Mi");
                      break;
                   case 4:  
                    System.out.println("La nota musical seleccionada es Fa");
                      break;
                  case 5:  
                   System.out.println("La nota musical seleccionada es Sol");
                      break;
                  case 6:  
                   System.out.println("La nota musical seleccionada es La");
                      break;
                  case 7:  
                   System.out.println("La nota musical seleccionada es Si");
                      break;
                  default:  
                      System.out.println("ERROR: número incorrecto.");
                break;     
              }
        
        
    }
    
}
