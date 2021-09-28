package com.yazid.tugas2.bagian2;

public class Main {
    public static void main(String[] args) {
        GameCharacter player1 = new GameCharacter("Raiden", 10, 20);
        GameCharacter player2 = new GameCharacter("Sub-Zero", 5, 25);

        player1.kick(player2);
        player2.kick(player1);
        for (int i = 0; i < 3; i++) {
            player2.hit(player1);
        }
        for (int i = 0; i < 4; i++) {
            player1.kick(player2);
        }

        System.out.println("Lifepoint " + player1.getName() + ": " + player1.getLifePoint());
        System.out.println("Lifepoint " + player2.getName() + ": " + player2.getLifePoint());

        if (player1.getLifePoint() == player2.getLifePoint()) {
            System.out.println("Seri");
        } else if (player1.getLifePoint() > player2.getLifePoint()) {
            System.out.println(player1.getName() + " menang!");
        } else {
            System.out.println(player2.getName() + " menang!");
        }
    }
}
