import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A Pawn is a ChessPiece that can capture diagonally and move forward by one square for each move except its first move.
 * A Pawn can also turn into any other subclass of a ChessPiece when it has reached the far edge of the board.
 * 
 * @author Brenden Roland
 * @version 0.0.1
 */
public class Pawn extends ChessPiece {
    public Pawn() {
        
    }
        
    /**
     * Act - move the Pawn after it has been told to move by the user. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        if (getNumberOfMoves() > 0) {
            System.out.println("Woah");
        }
    }    
}
