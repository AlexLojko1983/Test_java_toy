package org.example;

public class Main {
    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();

        // Добавление новых игрушек
        Toy toy1 = new Toy(1, "Кукла", 3, 30);
        Toy toy2 = new Toy(2, "Мяч", 5, 30);
        Toy toy3 = new Toy(3, "Машинка", 2, 40);

        toyShop.addToy(toy1);
        toyShop.addToy(toy2);
        toyShop.addToy(toy3);

        // Изменение веса выпадения игрушек
        toyShop.changeWeight(15, 60);

        // Организация розыгрыша игрушек
        toyShop.organizeGiveaway();
        toyShop.organizeGiveaway();



        // Получение призовой игрушки
        Toy prizeToy = toyShop.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Вы получили призовую игрушку: " + prizeToy.getName());
        } else {
            System.out.println("Призовые игрушки закончились");
        }
        prizeToy = toyShop.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Вы получили призовую игрушку: " + prizeToy.getName());
        } else {
            System.out.println("Призовые игрушки закончились");
        }
        prizeToy = toyShop.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Вы получили призовую игрушку: " + prizeToy.getName());
        } else {
            System.out.println("Призовые игрушки закончились");
        }
    }
}