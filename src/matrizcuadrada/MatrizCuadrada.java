
package matrizcuadrada;


public class MatrizCuadrada {


    public static void main(String[] args) {
      int[][] numeros = new int[4][4];
         // Ahora instanciamos un entero para
        // poder agregarle valores a la matriz.
        int n = 0;

        // Este ciclo anidado nos funciona
        // para agregarle valores a la matriz.
        for (int x = 0; x < numeros.length; x++) {
            for (int y = 0; y < numeros[x].length; y++) {
                n=n+2;
                numeros[x] [y] = n;
            }
        }

        // Este ciclo anidado nos permite pintar
        // la matriz en consola.
        for (int x = 0; x < numeros.length; x++) {
            for (int y = 0; y < numeros[x].length; y++) {
                System.out.print("[" + numeros[x][y] + "]");
                                
            }
            System.out.println("\n");
        }
    }
    
}
