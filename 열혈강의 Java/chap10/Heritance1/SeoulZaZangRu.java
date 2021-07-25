package chap10.Heritance1;

public class SeoulZaZangRu extends ZaZangRu {
	public void makeZamBong() {
		System.out.println("짬뽕을 만들 수 있습니다.");
	}
	public static void main(String[] args) {
		SeoulZaZangRu sz = new SeoulZaZangRu();
		sz.makeZaZang();
		sz.makeZamBong();
	}
}
