package ro.ase.cise.cts.sem8.dp.adapter;

public interface ActiuniDisney {

	public String getNume();
	public int getPower();

	public void move(int x, int y);
	public void primesteLovitura(int power);
	public void reincarca(int power);
	public void jump();
}
