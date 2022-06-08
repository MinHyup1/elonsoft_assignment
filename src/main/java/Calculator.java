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
    private String mathExpression;
    /**
     * 게산 실행
     * @param mathExpression 수식
     */
    public void run(String mathExpression) {
        this.mathExpression = mathExpression;
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
    }

    /**
     * 수식 검증
     */
    private void verification() {


    }
}
