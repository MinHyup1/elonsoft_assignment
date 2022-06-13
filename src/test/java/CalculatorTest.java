import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

	@Test
	public void 숫자괄호사칙연산자외제거() {
		String text = "( 2 + 2.3 df)=";
		text = text.replaceAll("[^\\d.\\(\\)\\+\\-\\/\\*]", "");
		assertEquals(text.equals("(2+2.3)"), true);

	}

	@Test
	public void 연속된사칙연산자제거() {
		String text = "( 2 +++++++++--////////******* 2 df)=";
		text = text.replaceAll("\\+{2,}", "+")
				.replaceAll("-{2,}", "-")
				.replaceAll("/{2,}", "/")
				.replaceAll("\\*{2,}", "*");
		assertEquals(text.matches("\\+{2,}|-{2,}|/{2,}|\\*{2,}"), false);
		System.out.println(text);
		assertEquals(text.equals("( 2 +-/* 2 df)="), true);
	}

	@Test
	public void 연속된사칙연산자확인() {
		String text = "( 2 /- 3 )";
		assertEquals(text.matches(".*[+-/*]{2,}.*"), true);
		text = "( 2 /- 3 )";
	}

	/**
	 * 중위표기식 => 피연산자 사이에 연산자를 두는 표기법
	 * 후위표기식 => 연산자를 피연산자 뒤에 두는 표기기법
	 * 순서대로 실행하는 컴퓨터에게는 후위 표기식이 적합
	 * STACK => LIFO
	 * push (추가), pop(마자막 제거) , clear(초기화), peek(마지막값 출력), empty(빈값여부)
	 * <p>
	 * STEP1. 피연산자는 그대로 출력
	 * STEP2. 연산자는 스택이 비어 있으면 스택에 추가
	 * STEP3. 스택이 비어있지 않다면
	 * - 자신보다 연산자가 낮은 연산자를 만날때까지 stack 을 pop 하고 스택에 추가
	 * - 여는 괄호는 다는 괄호가 아니면 pop 하지 않는다.
	 * - 닫는 괄호가 나올때 까지 꺼내서 출력
	 * STEP4. 마지막까지 완료하면 스택에서 차례로 꺼내서 출력
	 */
	@Test
	public void infixToPreFixStep1() {
		// STEP1. 피연산자는 그대로 출력
		String infix = "A+B*(C+D/E)";
		String result = "";
		for (char c : infix.toCharArray()) {
			if (Character.toString(c).matches("[^\\+\\/\\-\\+\\*\\(\\)]")) {
				result += c;
			}
		}
		assertEquals(result, "ABCDE");
	}

	@Test
	public void infixToPreFixStep2() {
		// STEP2. 연산자는 스택이 비어 있으면 스택에 추가
		String infix = "A+B*(C+D/E)";
		Stack<String> stacks = new Stack<>();
		for (char c : infix.toCharArray()) {
			if (Character.toString(c).matches("[\\+\\/\\-\\+\\*\\(\\)]")) {
				if (stacks.empty()) {
					stacks.push(Character.toString(c));
				}
			}
		}
		assertEquals(stacks.peek(), "+");
		System.out.println(stacks);
	}

	@Test
	public void infixToPrefixStep3() {
		/**
		 * STEP3. 스택이 비어있지 않다면
		 *   - 자신보다 연산자가 낮은 연산자를 만날때까지 stack 을 pop 하고 스택에 추가
		 *   - 여는 괄호는 닫는 괄호가 아니면 pop 하지 않는다.
		 *   - 닫는 괄호가 나올때 까지 꺼내서 출력
		 */

		String infix = "(1+2*3)/4";
		String prefix = "";
		Stack<Character> stacks = new Stack<>();
		for (char c : infix.toCharArray()) {
			// 연산자 여부 확인
			if(gradeOperand(c) > 0){
				while(!stacks.empty() && gradeOperand(stacks.peek()) >= gradeOperand(c)){
					prefix += stacks.pop();
				}
				stacks.push(c);
			}else if(gradeOperand(c) == 0){
				if(c == '('){
					stacks.push(c);
				}
				if(c == ')'){
					char popX = stacks.pop();
					while (popX != '('){
						prefix += popX;
						popX = stacks.pop();
					}
				}
			}else{
				prefix += c;
			}
		}
		// STEP4. 마지막까지 완료하면 스택에서 차례로 꺼내서 출력
		while(!stacks.empty()){
			prefix += stacks.pop();
		}
		System.out.println("prefix => " + prefix);
	}

	/**
	 * 우선순위 지정
	 * @param operand
	 * @return
	 */
	public int gradeOperand(Character operand) {
		switch (operand) {
			case '(':
			case ')':
				return 0;
			case '+':
			case '-':
				return 1;
			case '*':
			case '/':
				return 2;
		}
		return -1;
	}

	/**
	 * STEP1. 숫자와 연산자를 치환한다.
	 * STEP2. 우선순위 연산을 추가적인 괄호로 묶는다.
	 */
	@Test
	public void notGradeInfixToPrefix(){
		String infix = "(1.5+2*3)/4";
		String reInfix = infix.replaceAll("\\d*\\.?\\d+", "A");
		List<String> infixArray = Arrays.asList(infix.replaceAll("[\\(\\)]","").split("[\\(\\)\\+\\-\\+\\*\\/]"));
		Stack<Character> stacks = new Stack<>();
		// (A+A*A)/4
		System.out.println(reInfix);
		for (char c : reInfix.toCharArray()) {
			if(Character.toString(c).matches("[\\+\\-\\*\\/]")){
				if(c == '+' || c == '-'){
					stacks.push(c);
				}else{
					Stack<Character> grade = new Stack<>();
				}
			}else{
				stacks.push(c);
			}
		}
		System.out.println("stacks => "+ stacks);
	}
	/**
	 * 요구조건.
	 * 입력한 수식에 대한 계산 결과를 보여준다.
	 * - 수식입력 계산 조건
	 *   - 괄호는 쌍이 맞아야 한다.
	 *   - 괄호와 숫자가 붙어있으면 곱하기로 정의 한다.
	 *   - 중복된 연산자는 하나로 처리한다.
	 *   - 연산자 뒤에는 반드시 숫자가 와야 한다.
	 */
	@Test
	public void newCalculator1(){
		String text = "33.5 + 24  (31 + 1)";
		// [ 33.5, +, 24, *, (, 31, +, 1, )]"
		char [] textArray = text.trim().toCharArray();
		List<String> expressionArray = new ArrayList<>();
		for (int i = 0; i < textArray.length; i++) {
			char ch = textArray[i];
			// 	뒤를 비교해야 하는데 배열 내에서 뒤를 비교할 수 없다.
			//  뒤를 비교한 후 다음 비교대상에서는 제외되어야 하는데 제외 시킬 수 없다.
			//  외부에서 textArray 에 접근 하여 전체 순환을 하게 한다.
		}
	}

	/**
	 * 외부에서 textArray 의 다음 값을 호출 해야 하지만 호출 하는 입장에서 textArray 의 값에 관여 할 수 없다
	 * - 예를 들면 현재 textArray 가 모든 값을 처리 했는지?
	 * - 남은 값은 있지 않은지
	 * - StringTokenizer 방식을 활용한 데이터 parsing
	 */
	@Test
	public void newCalculator2(){
		String text = "33.5 + 24  (31 + 1)";
		// [ 33.5, +, 24, *, (, 31, +, 1, )]"
		TextArray textArray = new TextArray(text);
		// textArray 에게 parsing 위임
	}

	class TextArray{
		private char [] textArray;
		public TextArray(String text){
			this.textArray = text.trim().toCharArray();
		}
		public String nextToken(){
			return "";
		}
	}

}
