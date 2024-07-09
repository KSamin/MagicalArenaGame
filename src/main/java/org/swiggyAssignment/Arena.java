package org.swiggyAssignment;


public class Arena {
    private Player playerA;
    private Player playerB;
    private Dice dice;

    public Arena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.dice = new Dice();
    }

    public void startFight() {
        while (playerA.isAlive() && playerB.isAlive()) {
            if (playerA.getHealth() < playerB.getHealth()) {
                attack(playerA, playerB);
            } else {
                attack(playerB, playerA);
            }

            // Switch turns
            if (playerB.isAlive()) {
                attack(playerB, playerA);
            }

            if (!playerA.isAlive()) {
                System.out.println("Player 2 wins!");
            } else if (!playerB.isAlive()) {
                System.out.println("Player 1 wins!");
            }
        }
    }

    private void attack(Player attacker, Player defender) {
        int attackRoll = dice.roll();
        int defendRoll = dice.roll();

        int attackDamage = attacker.getAttack() * attackRoll;
        int defendDamage = defender.getStrength() * defendRoll;

        int damageDealt = Math.max(0, attackDamage - defendDamage);
        defender.reduceHealth(damageDealt);

        System.out.println("Attacker rolled: " + attackRoll + " (Attack Damage: " + attackDamage + ")");
        System.out.println("Defender rolled: " + defendRoll + " (Defend Damage: " + defendDamage + ")");
        System.out.println("Damage dealt to defender: " + damageDealt);
        System.out.println("Defender's remaining health: " + defender.getHealth());
    }
}
