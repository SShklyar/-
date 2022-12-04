
public interface Playable {
    /**
     * This method is called to let the player place a piece.
     *
     * @param board The current chess board object.
     */
    void place(Board board);

    /**
     * Checks whether this player can put a piece on the board.
     *
     * @param board The current chess board object.
     * @return true if the player can have valid move and false otherwise
     */
    boolean placeable(Board board);
}
