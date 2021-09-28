package com.yazid.tugas2.bagian2;

public class GameCharacter {
    private String name;
    private int attackHitPoint, attackKickPoint, lifePoint;

    public GameCharacter(String name, int attackHitPoint, int attackKickPoint) {
        this.lifePoint = 100;
        this.name = name;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public void hit(GameCharacter karB) {
        System.out.println(this.getName() + " memukul " + karB.getName());
        karB.lifePoint = karB.getLifePoint() - this.attackHitPoint;
        System.out.println("Lifepoint " + karB.getName() + ": " + karB.getLifePoint());
        System.out.println();
    }
    
    public void kick(GameCharacter karB) {
        System.out.println(this.getName() + " menendang " + karB.getName());
        karB.lifePoint = karB.getLifePoint() - this.attackKickPoint;
        System.out.println("Lifepoint " + karB.getName() + ": " + karB.getLifePoint());
        System.out.println();
    }

    public int getLifePoint() {
        return this.lifePoint;
    }

    public String getName() {
        return this.name;
    }
}
