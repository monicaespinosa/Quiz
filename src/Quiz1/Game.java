package Quiz1;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Game extends JPanel{
    private String titulo;
    private String descripcion;
    private String autor;
    private int numero;
    private int tiempo;
    private int ancho;
    private int alto;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getTiempo() {
        return tiempo;
    }
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    public int getAncho() {
        return ancho;
    }
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public int getAlto() {
        return alto;
    }
    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    Enemigos enemigos = new Enemigos(null, null, null, alto);
    private void move(){
        enemigos.move();
    }
        
    
    public void paint (Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
	g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        enemigos.paint(g2d);
    }
    
    public static void main(String[] args) throws InterruptedException {
        String titulo1= JOptionPane.showInputDialog(null, "Ingrese el TUTULO DEL JUEGO");
        String descripcion1 = JOptionPane.showInputDialog(null, "Ingrese una DESCRIPCION DEL TABLERO");
        String autor1 = JOptionPane.showInputDialog(null, "Ingrese el NOMBRE DEL AUTOR");
        int numero1=-1;
        int tiempo1 =-1;
        int ancho1=-1;
        int alto1=-1;
        int enemigos1=-1;
        int obstaculos1=-1;
        int objetivos1=-1;
        do {
            try{
                numero1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el NUMERO DE TABLERO"));
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Ingrese un valor correcto");
            }
        } while (numero1<0);
        do {
            try{
                tiempo1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el TIEMPO DE JUEGO (entre 1 y 5 minutos)"));
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Ingrese un valor correcto");
            }
        } while (tiempo1<1||tiempo1>5);
        do {
            try{
                ancho1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ANCHO DEL TABLERO (entre 5 y 20)"));
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Ingrese un valor correcto");
            }
        } while (ancho1<5||ancho1>20);
        do {
            try{
                alto1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ALTO DEL TABLERO (entre 5 y 20)"));
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Ingrese un valor correcto");
            }
        } while (alto1<5||alto1>20);
        do {
            try{
                enemigos1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de ENEMIGOS (entre 1 y "+((ancho1*alto1/2)-1)+")."));
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Ingrese un valor correcto");
            }
        } while (enemigos1<1||enemigos1>(ancho1*alto1/2)-1);
        do {
            try{
                obstaculos1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de OBSTACULOS (entre 1 y "+((ancho1*alto1/2)-1)+")."));
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Ingrese un valor correcto");
            }
        } while (obstaculos1<1||obstaculos1>(ancho1*alto1/2)-1);
        do {
            try{
                objetivos1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de OBJETIVOS (entre 1 y "+((ancho1*alto1)-1-obstaculos1)+")."));
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Ingrese un valor correcto");
            }
        } while (objetivos1<1||objetivos1>(ancho1*alto1)-1-obstaculos1);
        System.out.println("titulo: "+titulo1);
        System.out.println("descripcion: "+descripcion1);
        System.out.println("autor: "+autor1);
        System.out.println("numero: "+numero1);
        System.out.println("tiempo: "+tiempo1);
        System.out.println("ancho: "+ancho1);
        System.out.println("alto: "+alto1);
        System.out.println("enemigos: "+enemigos1);
        System.out.println("obstaculos: "+obstaculos1);
        System.out.println("objetivos: "+objetivos1);
        
        int tablero [][]= new int [ancho1][alto1];
        boolean posEnemigos [][] = new boolean [ancho1][alto1];
        for (int i = 0; i < ancho1; i++) {
            for (int j = 0; j < alto1; j++) {
                tablero[i][j]=0;
                posEnemigos[i][j]=false;
            }
        }
        tablero[0][0]=1;
        Random rnd = new Random();
        int cont2=0;
        int cont3=0;
        int contE=0;
        do {
            int i=(int)(rnd.nextDouble()*(ancho1));
            int j=(int)(rnd.nextDouble()*(alto1));
            if (tablero[i][j]==0) {
                tablero[i][j]=2;
                cont2++;
            }
        } while (cont2<obstaculos1);
        do {
            int i=(int)(rnd.nextDouble()*(ancho1));
            int j=(int)(rnd.nextDouble()*(alto1));
            if (tablero[i][j]==0) {
                tablero[i][j]=3;
                cont3++;
            }
        } while (cont3<objetivos1);
        
        do {
            int i=(int)(rnd.nextDouble()*(ancho1));
            int j=(int)(rnd.nextDouble()*(alto1));
            if (!posEnemigos[i][j]) {
                posEnemigos[i][j]=true;
                contE++;
            }
        } while (contE<enemigos1);
        
        
        System.out.println("Asi se vera el tablero inicial");
        for (int i = 0; i < ancho1; i++) {
            for (int j = 0; j < alto1; j++) {
                if (tablero[i][j]==0) {
                    System.out.print("  ");
                }
                if (tablero[i][j]==1) {
                    System.out.print("H ");
                }
                if (tablero[i][j]==2) {
                    System.out.print("X ");
                }
                if (tablero [i][j]==3) {
                    System.out.print("O ");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Esta Sera la Posicion inicial de los enemigos");
        for (int i = 0; i < ancho1; i++) {
            for (int j = 0; j < alto1; j++) {
                if (posEnemigos[i][j]) {
                    System.out.print("x ");
                }else{
                    System.out.print("o ");
                }
            }
            System.out.println("");
        }
        
        int xEnemigos[] = new int [enemigos1];
        int yEnemigos[] = new int [enemigos1];
        int cont=0;
        for (int i = 0; i < ancho1; i++) {
            for (int j = 0; j < alto1; j++) {
                if (posEnemigos[i][j]) {
                    xEnemigos[cont]=i;
                    yEnemigos[cont]=j;
                    cont++;
                }
            }
        }
        
        JFrame frame = new JFrame (titulo1);
        Game game = new Game();
        frame.add(game);
        frame.setSize(ancho1*30, alto1*30);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	while (true) {
		game.move();
		game.repaint();
		Thread.sleep(10);
	}
        
    }
    
}
