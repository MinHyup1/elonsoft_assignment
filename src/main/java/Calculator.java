/**
 * 계산기
 * STEP1. 전처리
 *   중복된 기호 제거
 *   = 제거
 *   후위표현식으로 변경
 * STEP2. 수식에 대한 검증
 *   수식의 존재 여부
 * STEP3. 결과 출력
 */
public class Calculator {
    // 입력 받은 원본 수식
    private String inputMathExpression;
    /**
     * 게산 실행
     * @param inputMathExpression 수식
     */
    public void run(String inputMathExpression) {
        this.inputMathExpression = inputMathExpression;
        // STEP1. 전처리
        preprocessing();
        // STEP2. 수식에 대한 검증
        verification();
        // STEP3. 결과 출력
        print();
    }

    /**
     * 촐력
     */
    private void print() {

    }

    /**
     * 전처리
     */
    private void preprocessing() {
        // 숫자 괄호 사칙연산 이외의 문자 제거
        this.inputMathExpression = inputMathExpression.replaceAll("[^\\d.\\(\\)+-/*]", "");
        // 연속된 사직연산자 제거
        this.inputMathExpression = this.inputMathExpression.replaceAll("\\+{2,}", "+")
                .replaceAll("-{2,}", "-")
                .replaceAll("/{2,}", "/")
                .replaceAll("\\*{2,}", "*");
    }

    /**
     * 수식 검증
     */
    private void verification() {
        // 잘못된 연산자 표현 확인
        if(this.inputMathExpression.matches(".*[+-/*]{2,}.*")){
            throw new RuntimeException("invalid expression");
        }
        // 괄호의 미완성 확인
        long startBracketCount = this.inputMathExpression.chars().filter(ch -> ch == '(').count();
        long endBracketCount = this.inputMathExpression.chars().filter(ch -> ch == ')').count();
        if(startBracketCount != endBracketCount){
            throw new RuntimeException("invalid expression");
        }
    }
}
