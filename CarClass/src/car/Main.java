package car;

public class Main {

	public static void main(String[] args) {
		
		//1台目
		Car car1 = new Car("フェラーリ", "赤");
		car1.printData();
		car1.inputData();
		car1.go(car1.getTime());
		int x1 = car1.getX();
		
		//2台目
		System.out.println("=================");
		Car car2 = new Car("ポルシェ", "黒");
		car2.printData();
		car2.inputData();
		car2.back(car2.getTime());
		int x2 = car2.getX();
		
		diff(x1, x2);
		
	}
	
	//2つのvehicleの現在地の差
	public static void diff(int x1, int x2) {
		
		if(x1 >= x2) {
			System.out.println("距離の差は" + (x1 - x2) + "kmです");
		}else {
			System.out.println("距離の差は" + (x1 - x2) + "kmです");
		}
	}

}
