import java.util.*;

public class Ordenacao2 {

    public static void insercaoDebug(String vet[]) {
        for (int i = 1; i < vet.length; i++) {
            String aux = vet[i];
            int j = i - 1;
            while (j >= 0 && vet[j].compareTo(aux) > 0) {
                vet[j + 1] = vet[j];
                j--;
            }
            vet[j + 1] = aux;
            System.out.println("STRING DEBUG: " + Arrays.toString(vet));
        }
    }

    public static void insercao(int vet[]) {
        for (int i = 1; i < vet.length; i++) {
            int aux = vet[i];
            int j = i - 1;
            while (j >= 0 && vet[j] > aux) {
                vet[j + 1] = vet[j];
                j--;
            }
            vet[j + 1] = aux;
        }
    }

    public static void insercaoDecrescente(int vet[]) {
        for (int i = 1; i < vet.length; i++) {
            int aux = vet[i];
            int j = i - 1;
            for (j = i - 1; j >= 0 && vet[j] < aux; --j) {
                vet[j + 1] = vet[j];
                vet[j] = aux;

            }
            vet[j + 1] = aux;
            System.out.println("DECRESCENTE DEBUG: " + Arrays.toString(vet));

        }
    }

    public static void main(String[] args) {
//        String vet1[] = { "Daniel", "Marcos", "Ana", "Bia" };
//        System.out.println("Inserção String => Antes: " + Arrays.toString(vet1));
//        insercaoDebug(vet1);
//        System.out.println("Inserção String => Depois: " + Arrays.toString(vet1));
//
//        int vet2[] = { 10, 58, 96, 63, 23, 14, 75, 85, 27, 55, 9 };
//        System.out.println("Inserção => Antes: " + Arrays.toString(vet2));
//        insercao(vet2);
//        System.out.println("Inserção => Depois: " + Arrays.toString(vet2));
//
//        int vet3[] = { 10, 58, 96, 63, 23, 14, 75, 85, 27, 55, 9 };
//        System.out.println("Inserção decrescente => Antes: " + Arrays.toString(vet3));
//        insercaoDecrescente(vet3);
//        System.out.println("Inserção decrescente => Depois: " + Arrays.toString(vet3));
        

        String saida1="\nMetodo da Inserção\n";
              
        for(int tam=500; tam <= 4000; tam += 500)
        {
           int vet4[] = new int [tam];            
           
            //Preenchendo o vetor com elementos aleatorios de 0 a 999
           for(int i=0; i<tam; i++)
              vet4[i] = (int) (Math.random() * 100);
               

           long tempoAntes = System.currentTimeMillis();
           insercao(vet4);
           long tempoDepois = System.currentTimeMillis();
           saida1+= "Tamanho = " + tam + "  => Tempo = " + (tempoDepois-tempoAntes) + " ms\n";  

        }  
  
        System.out.println(saida1);
    }

}