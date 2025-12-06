package codingTest;

public class Task02 {

//	시퀀스에서 키 변경 횟수 세기
//	단, 대문자와 소문자는 변경되지 않은 것으로 간주한다.
//	예시) 'w', 'W', 'a', 'A', 'b', 'B' 의 값은 2 
	
	int solution(char[] recording) {
		int changeCount = 0;
		
		for(int i = 1; i < recording.length; i++) {
			if(Character.toLowerCase(recording[i]) != Character.toLowerCase(recording[i - 1])) {
				changeCount++;
			}
		}
		
		return changeCount;
	}
	
	public static void main(String[] args) {
		Task02 task = new Task02();
//		char[] recording = {'w', 'W', 'a', 'A', 'B', 'c'};
		char[] recording = {'a', 'A', 'b', 'c', 'd', 'e', 'f', 'g'};
		
		int result = task.solution(recording);
		System.out.println(result);
	}

}
