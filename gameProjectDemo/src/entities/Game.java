package entities;

public class Game {
	
	private int id;
	private String nameOfGame;
	private double priceOfGame;
	
    public Game(int id,String nameOfGame,double priceOfGame) {
		this.setId(id);
		this.setNameOfGame(nameOfGame);
		this.setPriceOfGame(priceOfGame);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameOfGame() {
		return nameOfGame;
	}
	public void setNameOfGame(String nameOfGame) {
		this.nameOfGame = nameOfGame;
	}
	public double getPriceOfGame() {
		return priceOfGame;
	}
	public void setPriceOfGame(double priceOfGame) {
		this.priceOfGame = priceOfGame;
	}

}
