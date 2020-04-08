import java.util.*;

public class Ordenacao1 {
   public static void bolha1(int vet[]) {
      for (int i = 1; i <= vet.length - 1; i++)
         for (int j = 0; j < vet.length - 1; j++)
            if (vet[j] > vet[j + 1]) {
               int aux = vet[j];
               vet[j] = vet[j + 1];
               vet[j + 1] = aux;
            }
   }

   public static void bolha2(int vet[]) {
      for (int i = 1; i <= vet.length - 1; i++)
         for (int j = 0; j < vet.length - i; j++)
            if (vet[j] > vet[j + 1]) {
               int aux = vet[j];
               vet[j] = vet[j + 1];
               vet[j + 1] = aux;
            }
      System.out.println("DEBUG: " + Arrays.toString(vet));
   }

   public static void bolha3(int vet[]) {
      int aux;
      boolean troca;
      int j = vet.length - 1;

      do {
         troca = false;
         for (int i = 0; i < j; i++)
            if (vet[i] > vet[i + 1]) {
               aux = vet[i];
               vet[i] = vet[i + 1];
               vet[i + 1] = aux;
               troca = true;
            }
         j--;
      } while (troca);
   }

   public static void bolha2Decrescente(int vet[]) {
      for (int i = 1; i < vet.length; i++) {
         for (int j = 0; j < i; j++) {
            if (vet[i] > vet[j]) {
               int aux = vet[i];
               vet[i] = vet[j];
               vet[j] = aux;
            }
         }
      }
      System.out.println("DEBUG: " + Arrays.toString(vet));
   }

   public static Boolean ordenado(int vet[]) {
      for (int i = 1; i < vet.length; i++) {
         if (vet[i - 1] > vet[i]) {
            return false;
         }
      }
      return true;
   }

 /*  public static void main(String args[]) {
     int vet[] = { 10, 58, 96, 63, 23, 14, 75, 85, 27 };
      System.out.println("Antes: " + Arrays.toString(vet));
      bolha2Decrescente(vet);
      boolean resp = ordenado(vet);
      System.out.println("Depois: " + Arrays.toString(vet));
      if (resp == false)
         System.out.println("O vetor esta em ordem decrescente");
      else
         System.out.println("O vetor esta em ordem crescente");
   }*/
   
   public static void main(String args[])
   {
   
      String saida1="\nMetodo da Bolha\n";
              
      for(int tam=500; tam <= 4000; tam=tam+500)
      {
         int vet1[] = new int [tam];            
         
          //Preenchendo o vetor com elementos aleatorios de 0 a 999
         for(int i=0; i<tam; i++)
            vet1[i] = (int) (Math.random() * 100);
             
         long tempoAntes = System.currentTimeMillis();
         bolha2(vet1);
         long tempoDepois = System.currentTimeMillis();
         saida1+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois-tempoAntes) + " ms\n";  
      }  

      System.out.println(saida1);
   }

}