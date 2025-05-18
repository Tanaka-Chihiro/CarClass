package car;

import java.util.Scanner;

public class Vehicle {
	Scanner scanner = new Scanner(System.in);
	
	private String name;
	private String color;
	protected int distance = 0;
	private int x = 0;
	private int velocity = 0;
	private int time = 0;
	
	//コンストラクタ
	Vehicle(String name, String color){
		
		this.name = name;
		this.color = color;		
	}
	
	//ゲッター
	public String getName() {
		return this.name;
	}
	public String getColor() {
		return this.color;
	}
	public int getDistance() {
		return this.distance;
	}
	public int getX() {
		return this.x;
	}
	public int getTime() {
		return this.time;
	}
	
	//セッター
	public void setName(String name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	
	//速度・時間の入力
	public void inputData() {
		
		System.out.println("-----------------");
		while(true) {
			//速度の入力
			System.out.print("速度を入力してください：");
			int carVelocity = scanner.nextInt();
			//時間の入力
			System.out.print("走行時間を入力してください：");
			int carTime = scanner.nextInt();
			
			if(carVelocity > 0 && carTime > 0) {
				this.velocity = carVelocity;
				this.time = carTime;
				break;
			}else {
				System.out.println("速度・時間は整数で入力してください");
			}
		}
		
	}
	
	//データの表示
	public void printData() {
		System.out.println("【車の情報】");
		System.out.println("名前：" + this.name);
		System.out.println("色：" + this.color);
		System.out.println("走行距離：" + this.distance + "km");
		System.out.println("現在地：" + this.x + "km");
	}
	
	//xの増加
	public void go(int time) {
		this.x += this.velocity * time;
		System.out.println("現在地：" + this.x + "km");
	}
	//xの減少
	public void back(int time) {
		this.x -= this.velocity * time;
		System.out.println("現在地：" + this.x + "km");
	}
}
