package javaproject;

// Exercice 1 : "La garde des fruits"
public class StockFruit {
	int stockNbPomme = 100;
	
	public int getStockNbPomme() {
		return stockNbPomme;
	}

	public void setStockNbPomme(int stockNbPomme) {
		this.stockNbPomme = stockNbPomme;
	}
	
	public boolean isStockPommeSuffisant() {
		return (stockNbPomme > 100);
	}
	public static void main(String[] args) {
		StockFruit stockFruit = new StockFruit();
		System.out.println("Stock : "+ (stockFruit.isStockPommeSuffisant() ? "suffisant !" : "insuffisant !"));
		stockFruit.setStockNbPomme(101);
		System.out.println("Stock : "+ (stockFruit.isStockPommeSuffisant() ? "suffisant !" : "insuffisant !"));
	}
}
