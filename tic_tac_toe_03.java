package Todo2020;
/*
 * 3.	Escribe un programa para saber si alguien ganó en un juego de tic-tac-toe. 
 * (Utiliza los principios de programación orientada a objetos). 

*/
import java.io.IOException;


public class tic_tac_toe_03 {
    
    public static char[][] TableroTicTacToe = new char[3][3];

   public static void DibujarTablero(){
	   System.out.println("---------------------------");
        System.out.println("Tablero de Tic Tac Toe: ");
        System.out.println("---------------------------");
        for (char[] Tablero : TableroTicTacToe) {
            for (int j = 0; j<TableroTicTacToe.length; j++) {
                System.out.print("    " + Tablero[j]);
           
                
            }
            System.out.println();
           
        }
            
    }
    
    public static boolean RevisarRenglon(char JUGADA){
    	  
        for (char[] Tablero : TableroTicTacToe) {
            if (Tablero[0] == JUGADA && Tablero[1] == JUGADA && Tablero[2] == JUGADA) {
            	 System.out.println(JUGADA);
            	return true;
               
            }
        }
        return false;
    }
 
 
   public static boolean RevisarColumna(char JUGADA){
	  
        for (int i=0; i<TableroTicTacToe.length; i++){
             if (TableroTicTacToe[0][i] == JUGADA && TableroTicTacToe[1][i]==JUGADA && TableroTicTacToe[2][i] == JUGADA)
                 return true;
         }
        return false;
    }  
    
  public static boolean RevisarDiagonales(char JUGADA){   
	 
        if (TableroTicTacToe[0][0] == JUGADA && TableroTicTacToe[1][1]==JUGADA && TableroTicTacToe[2][2] == JUGADA)
            return true;
        if (TableroTicTacToe[0][2] == JUGADA && TableroTicTacToe[1][1]==JUGADA && TableroTicTacToe[2][0] == JUGADA)
            return true; 
     
        return false;
    } 
   
    public static boolean Ganador(char JUGADA){
    	  
        if ( RevisarRenglon(JUGADA) )
            return true;
        if ( RevisarColumna(JUGADA))
            return true;
        if ( RevisarDiagonales(JUGADA))
            return true;
        return false;    
}

    //SE DIBUJA EL TABLERO CON UN GANADOR 
    public static void DIBUJATablero(){
        for(int i=0;i<TableroTicTacToe.length; i++)
            for(int j=0;j<TableroTicTacToe.length; j++)
            	TableroTicTacToe[i][j] = 'O';
        TableroTicTacToe[0][0]='O';
        TableroTicTacToe[0][1]='X';
        TableroTicTacToe[0][2]='O';
        TableroTicTacToe[1][0]='X';
        TableroTicTacToe[1][1]='X';
        TableroTicTacToe[1][2]='O';
        TableroTicTacToe[2][0]='O';
        TableroTicTacToe[2][1]='X';
        TableroTicTacToe[2][2]='X';
    }

   
    public static void main(String[] args) throws IOException {
       
       char letra = 'X';
       boolean terminar = false;
       DIBUJATablero();
       do{
        
    	   DibujarTablero();
           if ( Ganador(letra)){
        	   System.out.println("*****************************************");
               System.out.println("FIN DEL JUEGO - EL GANADOR ES: "+ letra);
               System.out.println("*****************************************");
               terminar = true;
           }
           else {
                   if (letra == 'X')
                	   letra = 'O';
                   else
                	   letra = 'X';
           }
       } while ( !terminar);
        
    }
}
