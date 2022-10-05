import java.util.Scanner;

public class MinhaClasse {
    public static void main(String[] args) {
       
        int[] vetor = {1,2,3,4,5,6};

        int count = 0;
        while(count <( vetor.length) ) {
          count++; 

        }
        System.out.print("vetor: ");
        for (int i = (vetor.length - 1); i >= 0; i --) {
            System.out.print(vetor[i] + " ");
        }
     }
 }