package ObjectMethod.This;

/** 메뉴와 수량을 입력받아 가격을 반환해주는 객체 */
public class FoodPrice {
	private int menuPrice;
	private int quantity;
	
	// 다른 패러미터 수의 FoodPrice method가 있지만 중복코드나 다름이 없음
	public FoodPrice(int menuPrice) {
//		this.menuPrice = menuPrice;
//		this.quantity = 1;
		this(menuPrice,1); // 이 객체 안에서 ()안의 패러미터를 가지는 method를 실행
	}
	public FoodPrice(int menuPrice, int quantity) {
		this.menuPrice = menuPrice;
		this.quantity = quantity;
	}
	
	public int getTotalPrice() {
		return menuPrice * quantity;
	}
}
