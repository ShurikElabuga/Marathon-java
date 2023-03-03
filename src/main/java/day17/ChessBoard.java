package day17;

public class ChessBoard {
    ChessBoard[][] chessBoard = new ChessBoard[8][8];

    public ChessBoard(ChessBoard[][] chessBoard) {
        this.chessBoard = chessBoard;
    }
    public static void print(ChessPiece[][] chessPieces) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(chessPieces[i][j].getSymbol() + " ");
            }
            System.out.println();
        }

    }
}
