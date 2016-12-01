
package juego;

public class Game {

    /**
     * @param args the command line arguments
     */
    
    public static String autor1;
    public static void main(String[] args) {
        
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        
    }
    public static void traerAutor(String autor){
        System.out.println(autor);
        autor1=autor;
        System.out.println("1111"+autor1);
    }
    
}
