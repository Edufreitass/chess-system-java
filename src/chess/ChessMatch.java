package chess;

import boardgame.Board;

// class that contains the rules of chess
public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
	}

	// returns an array of chess pieces corresponding to that match
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}

}
