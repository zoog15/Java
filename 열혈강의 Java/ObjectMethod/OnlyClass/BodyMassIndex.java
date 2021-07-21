package ObjectMethod.OnlyClass;

public class BodyMassIndex {
	public char getResult(float indexValue) {
		if(indexValue > 30) {
			return 'A'; //비만
		}
		else if(indexValue>24) {
			return 'B'; // 과체중
		}
		else if(indexValue>20) {
			return 'C'; // 정상
		}
		else if(indexValue>15) {
			return 'D'; // 저체중
		}
		else if(indexValue>13) {
			return 'E'; // 마름
		}
		else {
			return 'G'; //소모증
		}
		}
	public float calculate(float height, float weight) {
		//키의 제곱
		float hData = height * height;
		//몸무게를 나눈다
		float result = weight/hData;
		
		return result;
	}
	public static void main(String[] args) {
		BodyMassIndex m = new BodyMassIndex();
		
		float h = 1.8F;
		float w = 77F;
				
		float index = m.calculate(h,w);
		System.out.println("비만 지수 : "+index);
		System.out.println("건강지수 : " + m.getResult(index));
	}
}
