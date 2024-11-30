//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr= s.solution(0,6,5,5);

        for (int i=0; i<2;i++){
            System.out.println(arr[i]);
        }
    }

}
