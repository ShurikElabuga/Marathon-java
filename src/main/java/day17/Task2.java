package day17;

import static day17.ChessPiece.*;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece[][] chessBoard = new ChessPiece[8][8];
        for (var i = 0; i < chessBoard.length; i++) {
            for (var j = 0; j < chessBoard.length; j++) {
                chessBoard[i][j] = EMPTY;
            }
        }
        chessBoard[0][0] = chessBoard[0][5] = ROOK_BLACK;
        chessBoard[0][6] = KING_BLACK;
        chessBoard[1][1] = chessBoard[7][5] = ROOK_WHITE;
        chessBoard[1][4] = chessBoard[1][5] = chessBoard[1][7] = chessBoard[2][0] = chessBoard[2][6] = PAWN_BLACK;
        chessBoard[2][2] = KNIGHT_BLACK;
        chessBoard[3][0] = QUEEN_BLACK;
        chessBoard[3][3] = chessBoard[5][4] = BISHOP_WHITE;
        chessBoard[4][3] = BISHOP_BLACK;
        chessBoard[4][4] = chessBoard[5][5] = chessBoard[6][0] = chessBoard[6][5] = chessBoard[6][7] = PAWN_WHITE;
        chessBoard[6][3] = QUEEN_WHITE;
        chessBoard[7][6] = KING_WHITE;
        ChessBoard.print(chessBoard);

    }
}
