class Solution {
	public int solution(int[] numbers) {
		int answer = 0;
		boolean[] check = new boolean[10]; // 0~9까지 체크 기본 false
		for(int i=0;i<numbers.length;i++){
			check[numbers[i]]=true;
		}

		for(int i=0;i<check.length;i++){
			if(check[i]==false){
				answer+=i;
			}
		}
		return answer;
	}
}
/* 다른 사람의 풀이.. 신박하다~
class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
    }
}
*/