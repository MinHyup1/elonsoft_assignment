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
		// 숫자에 대한 처리
		if(Character.isDigit(ch) || ch == '.'){
			// 다음 데이터가 숫자 또는 소수점이면 합친다.
			return numberParsing();
		}
		if(isOperator(ch)){

		}
		if(isBracket(ch)){

		}
		// 자동 * 처리를 하기 위해선 이전 ch가 필요하다.
		if(isAutoMultiply(ch)){

		}
		position++;
		return Character.toString(ch);
	}

	private boolean isAutoMultiply(char ch) {
		return true;
	}

	private boolean isBracket(char ch) {
		return true;
	}

	private boolean isOperator(char ch) {
		return true;
	}

	/**
	 * 현재 포지션 기준으로 다음 데이터가 숫자인지 판별해서 숫자만큼 합쳐서 돌려준다.
	 * @return
	 */
	private String numberParsing() {
		int currentPosition = this.position;
		int nextPosition = 1;
		String result = Character.toString(expression[currentPosition]);
		// 현재 데이터가 마지막 데이터 인지 확인
		if(isEndPosition(currentPosition + 1)){
			return result;
		}
		while (!isEndPosition(currentPosition + nextPosition) && isNumber(expression[currentPosition + nextPosition])){
			result += expression[currentPosition + nextPosition];
			nextPosition++;
		}
		logger.debug("result {} ", result);
		// 최종 Number 검증
		Double.parseDouble(result);
		return result;
	}

	private boolean isNumber(char ch) {
		logger.debug("isNumber {} ", ch);
		return Character.isDigit(ch) || ch == '.';
	}

	/**
	 * 입력 받은 포지션이 마지막 포지션인지 확인
	 * @param  position :  포지션 정보
	 * @return
	 */
	private boolean isEndPosition(int position) {
		return this.expressionLength < position;
	}
}
