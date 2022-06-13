package tokenizer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TokenizerTest {
	private static final Logger logger = LogManager.getLogger(TokenizerTest.class);
	// 추가 엘리 먼트가 존재하는지 확인
	@Test
	void hasMoreElementsMoreElements() {
		// given
		String text = "1 + 2 + 3";
		Tokenizer tokenizer = new Tokenizer(text);

		// when
		tokenizer.nextToken();
		tokenizer.nextToken();
		tokenizer.nextToken();

		// then
		assertEquals(tokenizer.hasMoreElements(), true);
	}
	// 추가 엘리 먼트가 미 존재 하는지 확인
	@Test
	void hasMoreElementsEndElements() {
		// given
		String text = "1 + 2 + 3";
		Tokenizer tokenizer = new Tokenizer(text);
		// when
		tokenizer.nextToken();
		tokenizer.nextToken();
		tokenizer.nextToken();
		tokenizer.nextToken();
		tokenizer.nextToken();
		// then
		assertEquals(tokenizer.hasMoreElements(), false);
	}

	@Test
	public void test_연속된숫자Parsing() throws Exception {
	    // given
		String text = "1.22 + 25 + 36";
		Tokenizer tokenizer = new Tokenizer(text);

	    // when
		String result = tokenizer.nextToken();
	    // then
		assertEquals(result, "1.22");
	}

	@Test
	public void test_연산자Parsing() throws Exception {
		// given
		String text = "1.22 ++++ 25 + 36";
		Tokenizer tokenizer = new Tokenizer(text);

		// when
		String result = tokenizer.nextToken();
		result = tokenizer.nextToken();
		// then
		assertEquals(result, "+");
	}
}
