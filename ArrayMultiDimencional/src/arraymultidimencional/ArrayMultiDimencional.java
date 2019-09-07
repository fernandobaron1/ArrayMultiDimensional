
package arraymultidimencional;

import java.util.Random;


public class ArrayMultiDimencional {

    
    public static void main(String[] args) {

        int [][] matriz = new int [3][5];
        
        Random aleatorio = new Random();
        
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                matriz [linha] [coluna] = aleatorio.nextInt(100);
    }
    
}
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.print("["+linha+"]["+coluna+"] => "+matriz [linha][coluna]+"\t");
            }
            System.out.println("");
    }
    }  
}
