package car;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//1台目
		Car car1 = new Car("フェラーリ", "赤");
		car1.printData();
		
		System.out.println("-----------------");
		//速度の入力
		System.out.print("速度を入力してください：");
		int car1Velocity= scanner.nextInt();
		car1.setVelocity(car1Velocity);
		//時間の入力
		System.out.print("走行時間を入力してください：");
		int car1Time= scanner.nextInt();
		car1.go(car1Time);
		int x1 = car1.getX();
		
		//2台目
		System.out.println("=================");
		Car car2 = new Car("ポルシェ", "黒");
		car2.printData();
			
		System.out.println("-----------------");
		//速度の入力
		System.out.print("速度を入力してください：");
		int car2Velocity= scanner.nextInt();
		car2.setVelocity(car2Velocity);
		//時間の入力
		System.out.print("走行時間を入力してください：");
		int ca2rTime= scanner.nextInt();
		car2.back(ca2rTime);
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
