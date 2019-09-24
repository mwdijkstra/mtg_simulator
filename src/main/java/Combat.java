public class Combat {

    public Battlefield executeCombat(Battlefield battlefield) {

        Card attackingCreature = battlefield.playerOne.get(0);
        Card defendingCreature = battlefield.playerTwo.get(0);

        System.out.println(attackingCreature.getName() + " attacks " + defendingCreature.getName());

        if (defendingCreature.getToughness() <= attackingCreature.getStrength()) {

            battlefield.playerTwo.remove(0);

            System.out.println(defendingCreature.getName() + " is killed in combat!");

        }

        if (attackingCreature.getToughness() <= defendingCreature.getStrength()) {

            battlefield.playerTwo.remove(0);

            System.out.println(attackingCreature.getName() + " is killed in combat!");

        }

        return battlefield;

    }

}
