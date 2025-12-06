package codingTest;

public class Task01 {
	
//	결제 금액의 5프로를 적립해준다.
//	최소 천원, 최대 3만원 적립 해준다.
//	100원 단위 밑으로는 버린다.
//	예시) 33000원 결제 시, 적립금 1650원 => 최종 적립금: 1600원
	
	public int checkPoint(int price) {
//		int price = 0;
		
		int point = 0;
		int maxPoint = 30000;
		int minPoint = 1000;
		
		double getPoint = price * 0.05 ;
		
		int totalPoint = ((int)getPoint / 100) * 100;
		
		if(totalPoint > maxPoint) {
			point = maxPoint;
		} else if(totalPoint < minPoint){
			point = minPoint;
		} else {
			point = totalPoint;
		}
		
		return point;
	}

	public static void main(String[] args) {
		Task01 task = new Task01();
		
		int price = 30000;
		int point = task.checkPoint(price);
		System.out.println("결제 금액: " + price + ", 적립 포인트: " + point);
	}

}

