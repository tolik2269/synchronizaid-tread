package com.company;

public class Main {

    public static void main(String[] args) {
			final Shopauto shopauto=new Shopauto();
	new Thread(null, shopauto::sellAuto, "Покупатель").start();
System.out.println("Покупатель1: хочет купить авто");

new Thread(null, shopauto::sellAuto, "Покупатель2").start();
System.out.println("Покупатель2: хочет купить авто");
	new Thread(null, shopauto::acceptAuto, "Завод изготовитель").start();



    }
}
