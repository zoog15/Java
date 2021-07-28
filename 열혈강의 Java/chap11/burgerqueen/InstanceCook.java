package chap11.burgerqueen;

public class InstanceCook implements BurgerCook{

	@Override
	public void makeBurger() {
		System.out.println("냉동 햄버거");
	}

	@Override
	public void makeSalad() {
		System.out.println("냉동 샐러드");
	}
}
