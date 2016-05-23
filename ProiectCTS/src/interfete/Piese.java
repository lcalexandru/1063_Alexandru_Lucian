package interfete;

public interface Piese {
	public void descriere();
	public void adaugaPiesa(Piese doc);
	public void stergePiesa(Piese doc);
	public Piese getChild(int i);
}
