package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ToyShop {
    private List<Toy> toys;
    private List<Toy> prizeToys;

    public ToyShop() {
        toys = new ArrayList<>();
        prizeToys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void changeWeight(int toyId, int weight) {
        for (Toy toy : toys) {
            if (toy.getId() == toyId) {
                toy.setWeight(weight);
                break;
            }
        }
        System.out.println("Нет такой игрушки!!");
    }

    public void organizeGiveaway() {
        Random random = new Random();
        int randomNum = random.nextInt(100);
        System.out.println(randomNum);
        for (Toy toy : toys) {
//            int randomNum = random.nextInt(100);
//            System.out.println(randomNum);
            if (randomNum < toy.getWeight()) {
                prizeToys.add(toy);
                toy.setQuantity(toy.getQuantity() - 1);
                System.out.printf("%s осталось количеством: %s%n ", toy.getName(), toy.getQuantity());
                break;
            }
        }
    }

    public Toy getPrizeToy() {
        if (prizeToys.size() > 0) {
            Toy prizeToy = prizeToys.get(0);
            prizeToys.remove(0);
            writeToFile(prizeToy);
            return prizeToy;
        } else {
            return null;
        }
    }

    private void writeToFile(Toy toy) {
        try (FileWriter writer = new FileWriter("prize_toys.txt", true)) {
            writer.write(toy.getName() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
