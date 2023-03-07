package day17;

public class ChessBoard {
    ChessBoard[][] chessBoard = new ChessBoard[8][8];

    public ChessBoard(ChessBoard[][] chessBoard) {
        this.chessBoard = chessBoard;
    }
    public static void print(ChessPiece[][] chessBoard) {
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard.length; j++) {
                System.out.print(chessBoard[i][j].getSymbol() + " ");
            }
            System.out.println();
        }

    }
}
