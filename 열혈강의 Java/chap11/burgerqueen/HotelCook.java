package chap11.burgerqueen;

public class HotelCook implements BurgerCook{

	@Override
	public void makeBurger() {
		System.out.println("5성급 호텔 주방장의 햄버거");
	}

	@Override
	public void makeSalad() {
		System.out.println("호텔급 샐러드");
	}	
}
