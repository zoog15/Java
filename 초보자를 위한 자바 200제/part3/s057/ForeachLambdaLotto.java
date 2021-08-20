package kr.co.infopub.chapter.s057;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForeachLambdaLotto {
	public static void main(String[] args) {
		List<Integer> mmlists = Arrays.asList(1,6,16,22,23,33);
		mmlists.forEach( // List의 forEach 메서드, index없이 순서대로 한개씩 작업
				m -> {System.out.printf(m+"\t");} // List<Integer>로 선언했을때 m = int(Integer)
		);
		System.out.println();
		
		// 위와 똑같지만 작동원리를 보여줌
		Consumer<Integer> consume = (Integer m) -> {System.out.printf(m+"\t");};
		mmlists.forEach(consume);
	}
}
