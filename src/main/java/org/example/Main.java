package org.example;

public class Main {
    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();

        // Добавление новых игрушек
        Toy toy1 = new Toy(1, "Барби", 3, 20);
        Toy toy2 = new Toy(2, "Футбольный Мяч", 5, 30);
        Toy toy3 = new Toy(3, "Танк", 2, 60);

        toyShop.addToy(toy1);
        toyShop.addToy(toy2);
        toyShop.addToy(toy3);

        // Изменение веса выпадения игрушек
        toyShop.changeWeight(15, 60);

        // Организация розыгрыша игрушек
        for (int i = 0; i < 10; i++)
            toyShop.organizeGiveaway();


            // Получение призовой игрушки
            Toy prizeToy = toyShop.getPrizeToy();
            if (prizeToy != null) {
                System.out.println("Вы получили призовую игрушку: " + prizeToy.getName());
            } else {
                System.out.println("Все игрушки выдали");
            }
            prizeToy = toyShop.getPrizeToy();
            if (prizeToy != null) {
                System.out.println("Вы получили призовую игрушку: " + prizeToy.getName());
            } else {
                System.out.println("Все игрушки выдали");
            }
            prizeToy = toyShop.getPrizeToy();
            if (prizeToy != null) {
                System.out.println("Вы получили призовую игрушку: " + prizeToy.getName());
            } else {
                System.out.println("Все игрушки выдали");
            }
        }
    }