package com.company;

public class ToyotaCompani {

    private Shopauto shopauto;

    private static final int DEFAULT_RECEVE_TIME = 3000;
    private static final int DEFAULT_NOCAR_TIME = 1000;

    public ToyotaCompani(Shopauto shopauto) {
        this.shopauto = shopauto;
    }

    public synchronized void receiveAuto() {
        try {
            System.out.println("Салон авто: Принимаю автомобили Тойота от производителя");
            Thread.sleep(DEFAULT_RECEVE_TIME);
            shopauto.getAutos().add(new Auto());
            System.out.println("Салон авто: Прием авытомобилей завершен");
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
//    public synchronized Auto sellAuto2() {
//        try {
//            System.out.println("Салон авто: Продаю автомобиль");
//            while (shopauto.getAutos().size() == 0) {
//                System.out.println("Салон авто: Машины кончились");
//                wait();
//            }
//            Thread.sleep(DEFAULT_NOCAR_TIME);
//            System.out.println("Салон авто: Машина продана. Покупатель едет домой на ново авто");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return shopauto.getAutos().remove(0);
//    }

        public synchronized Auto sellAuto() {
        try {
            System.out.println("Салон авто: Продаю автомобиль");
            while (shopauto.getAutos().size() == 0) {
                System.out.println("Салон авто: Машины кончились");
                wait();
            }
            Thread.sleep(DEFAULT_NOCAR_TIME);
            System.out.println("Салон авто: Машина продана. Покупатель едет домой на ново авто");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return shopauto.getAutos().remove(0);
    }


}