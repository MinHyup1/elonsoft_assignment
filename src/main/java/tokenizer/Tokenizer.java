package tokenizer;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * 수식을 토큰화 하는 객체
 */
public class Tokenizer {
	private static final Logger logger = LogManager.getLogger(Tokenizer.class);
	// 수식 배열화
	private final char[] expression;
	// 배열화된 expression size
	private final int expressionLength;
	// 현재 token 위치 원본 데이터의 보존을 위해 원본 데이터를 변경하지 않고 현재 접근 가능한 위치를 사용
	private int position = 0;

	public Tokenizer(String expression) {
		this.expression = expression.trim().toCharArray();
		this.expressionLength = this.expression.length;
	}

	/**
	 * 추가 토큰이 존재 하는지 확인
	 * @return
	 */
	public boolean hasMoreElements() {
		return this.expression.length > position;
	}

	/**
	 * 수식에 필요한 데이터만 토큰화 해서  돌려준다.
	 * @return
	 */
	public String nextToken() {
		char ch = expression[position];
		// 공백 확인
		while (Character.isWhitespace(ch)){
			ch = expression[++position];
		}
		position++;
		return Character.toString(ch);
	}
}
