package domain;

/**
 * Create a snake that with each use is cut in half
 * 
 * @author Sebastian Zamora
 * @author Johann Amaya
 * @version 1.3
 */
public class SDebil extends Serpiente {

	/**
	 * Constructor of the snake with a random table.
	 * 
	 * @param size the table's size.
	 */
	public SDebil(int size, int x, int y, int w, int z) {
		Casillas[][] casillas = (Table.getInstance(size)).getGameTable();
		inicio = (NCasilla) casillas[x][y];
		fin = (NCasilla) casillas[w][z];
	}

	/**
	 * Constructor of the snake with a specific tale.
	 * 
	 * @param size the table's size.
	 * @param x    the x position of the start of the snake.
	 * @param y    the y position of the start of the snake.
	 * @param w    the x position of the end of the snake.
	 * @param z    the y position of the end of the snake.
	 */
	public SDebil(int size) {
		putInicio(size);
	}

	@Override
	public int movimiento(int position) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'movimiento'");
	}

}
