public class TestGameBoard {
    public static void main(String[] args) {

    }

    public static void testEmptyCell() {
        GameBoard board = new GameBoard();
        int row = 0;
        int column = 0;

        assert board.pieceAt(column, row) == GameBoard.EMPTY_CELL;
    }

    public static void testDropPiece() {
        GameBoard board = new GameBoard();
        board.dropPieceDownColumn('X', 0);
        board.dropPieceDownColumn('O', 2);

        assert board.pieceAt(0, 0) == 'X';
        assert board.pieceAt(1, 0) == GameBoard.EMPTY_CELL;
        assert board.pieceAt(2, 0) == 'O';
        assert board.pieceAt(0, 1) == GameBoard.EMPTY_CELL;
    }


}
