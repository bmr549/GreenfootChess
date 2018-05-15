import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A ChessPiece is a controllable piece able to be moved around the board with a given set of rules.
 * A ChessPiece on itself is not a complete ChessPiece, a subclass for each individual should be made.
 * Subclasses of ChessPiece shall have their own rules for movement.
 * 
 * @author Brenden Roland
 * @version 0.0.1
 */
public class ChessPiece extends Actor {
    private int xPos; // x-position of the ChessPiece
    private int yPos; // y-position of the ChessPiece
    private int moves; // number of the time this ChessPiece has moved
    private Color side; // side this ChessPiece belongs to (black or white)
    
    /**
     * AddedToWorld - records the current position of the ChessPiece.
     * This method is called once when the ChessPiece has been added to the world.
     */
    protected void addedToWorld() {
        xPos = getX();
        yPos = getY();
    }
    
    /**
     * CapturePiece - captures the ChessPiece that this ChessPiece is touching.
     * Capturing a ChessPiece removes that ChessPiece from play.
     */
    private void capturePiece() {
        getWorld().removeObject(getOneIntersectingObject(ChessPiece.class));
    }
    
    /**
     * MoveTo - moves the ChessPiece to the specified location.
     * Any ChessPiece already on the location will be captured.
     * @param column - the column to move the ChessPiece to.
     * @param row - the row to move the ChessPiece to.
     */
    public void moveTo(int column, int row) {
        setLocation(column, row);
        
        if (isTouching(ChessPiece.class)) {
            capturePiece();
        }
    }
    
    /**
     * GetNumberOfMoves - return the number of times this ChessPiece has moved.
     * @return int representing the number of moves.
     */
    public int getNumberOfMoves() {
        return moves;
    }
    
    /**
     * Act - check to see if this ChessPiece has been selected. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        
    }    
}
