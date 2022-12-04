

abstract class Piece {
    /**
     * The color of this piece
     */
    Color color;

    /**
     * Default constructor of the abstract class, used by the child classes.
     */
    Piece() {
    }

    /**
     * Display the prompt line on the screen.
     */
    abstract void personPrompt();

    /**
     * Checks whether this player can put a piece on the board.
     *
     * @param board  The current chess board object.
     * @param isUser if the caller player is user
     * @return true if the player can have valid move and false otherwise
     */
    abstract boolean placeable(Board board, boolean isUser);

    /**
     * Returns a string representation of the object.
     * This is used to print the entire chess board.
     *
     * @return a string representation of the object.
     */
    @Override
    abstract public String toString();
}
