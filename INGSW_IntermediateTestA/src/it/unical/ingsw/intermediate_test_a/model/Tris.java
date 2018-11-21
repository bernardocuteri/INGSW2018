package it.unical.ingsw.intermediate_test_a.model;

public class Tris {

	public static final int X = 1;
	public static final int O = 2;
	public static final int PAREGGIO = 3;

	int matrix[][];
	int winner;
	int nextPlayer;

	public Tris() {
		reset();
	}
	
	public void reset() {
		matrix = new int[3][3];
		winner = 0;
		nextPlayer = X;
	}

	// esempio tris.play(0, 0)
	// restituisce vero se la partita è finita, falso altrimenti
	// se la partita è finita, winner memorizza il vincitore o PAREGGIO in caso di parità
	public boolean play(int row, int col) {
		if (winner != 0) {
			throw new InvalidPlayException("Il gioco è già finito");
		}
		if (matrix[row][col] != 0) {
			throw new InvalidPlayException("La posizione è già occupata");
		}
		matrix[row][col] = nextPlayer;

		int r = 0;
		int c = 0;
		int d1 = 0;
		int d2 = 0;
		boolean fullMatrix = true;
		for (int i = 0; i < 3; i++) {
			if (matrix[row][i] == nextPlayer)
				r++;
			if (matrix[i][col] == nextPlayer)
				c++;
			if (matrix[i][i] == nextPlayer)
				d1++;
			if (matrix[i][2 - i] == nextPlayer)
				d2++;
			for (int j = 0; j < 3; j++)
				if (matrix[i][j] == 0)
					fullMatrix = false;
		}
		if (r == 3 || c == 3 || d1 == 3 || d2 == 3) {
			winner = nextPlayer;
			return true;
		}
		if (fullMatrix) {
			winner = PAREGGIO;
			return true;
		}

		if (nextPlayer == Tris.O) {
			nextPlayer = Tris.X;
		} else {
			nextPlayer = Tris.O;
		}
		return false;
	}

	
	public int getWinner() {
		return winner;
	}

	public void print() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}


}
