package interfejs;

class Button{
    private int x;
    private int y;
    private int szerokość;
    private int wysokość;
    private String tekst;
    private int[] kolorTła = new int[4];
    private int[] kolorTekstu = new int[4];
    private int[] kolorTłaAktywny = new int[4];
    private int[] kolorTekstuAktywny = new int[4];
    public Button(){

    }
    public Button(int x, int y, String tekst){

    }
    public Button(int x, int y, int szerokość, int wysokość, String tekst){

    }
    public Button(int x, int y, int szerokość, int wysokość, String tekst, int[] kolorTła, int[] kolorTekstu, int[] kolorTłaAktywny, int[] kolorTekstuAktywny){

    }
    public void Rysuj(){

    }
    /*public void DodajAkcj�(ActionListener a)
    {

    }*/
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSzerokość() {
		return szerokość;
	}
	public void setSzerokość(int szerokość) {
		this.szerokość = szerokość;
	}
	public int getWysokość() {
		return wysokość;
	}
	public void setWysokość(int wysokość) {
		this.wysokość = wysokość;
	}
	public String getTekst() {
		return tekst;
	}
	public void setTekst(String tekst) {
		this.tekst = tekst;
	}
	public int[] getKolorTła() {
		return kolorTła;
	}
	public void setKolorTła(int[] kolorTła) {
		this.kolorTła = kolorTła;
	}
	public int[] getKolorTekstu() {
		return kolorTekstu;
	}
	public void setKolorTekstu(int[] kolorTekstu) {
		this.kolorTekstu = kolorTekstu;
	}
	public int[] getKolorTłaAktywny() {
		return kolorTłaAktywny;
	}
	public void setKolorTłaAktywny(int[] kolorTłaAktywny) {
		this.kolorTłaAktywny = kolorTłaAktywny;
	}
	public int[] getKolorTekstuAktywny() {
		return kolorTekstuAktywny;
	}
	public void setKolorTekstuAktywny(int[] kolorTekstuAktywny) {
		this.kolorTekstuAktywny = kolorTekstuAktywny;
	}
}
