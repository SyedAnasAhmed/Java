public class GameBoard {
    public static final char EMPTY_CELL = '\u0000';

    char [][] cellContents = new char[7][6];

    GameBoard(){
        assert cellContents [0][0] == EMPTY_CELL;
    }

    char pieceAt (int column, int row) {
        return cellContents[column][row];
    }

    void dropPieceDownColumn (char piece , int column) {
        int bottomMostVacantRow = 0;
        cellContents[column][bottomMostVacantRow] = piece;
    }
}
