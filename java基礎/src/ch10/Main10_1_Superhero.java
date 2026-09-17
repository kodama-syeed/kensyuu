package ch10;

import ch8.Main8_2_Hero;

public class Main10_1_Superhero extends Main8_2_Hero {
	boolean flying;

	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}

	public void land() {
		this.flying = false;
		System.out.println("着地した!");
	}

	public void run() {
		System.out.println(this.name + "は撤退した");
	}
}
