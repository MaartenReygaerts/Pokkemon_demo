package be.intecbrussel.infernalWhale.service.imp;

import be.intecbrussel.infernalWhale.model.Pokkemon;
import be.intecbrussel.infernalWhale.model.PokkemonType;
import be.intecbrussel.infernalWhale.service.IvCalculatorService;

public class IVCalculatorServiceImplementation implements IvCalculatorService{



    @Override
    public Pokkemon calculateIV(Pokkemon pokkemon) {
        Integer sumBase = calcBaseSum(pokkemon.getType());
        Integer difference = pokkemon.getCombatPower() - sumBase;
        distributeValues(pokkemon,difference);



        return pokkemon;
    }

    private void distributeValues(Pokkemon pokkemon, Integer difference) {
        // TODO: 08/10/2019
        Integer increment = difference / 3;
        Integer leftOver = difference %3;

        pokkemon.setIvAttack(pokkemon.getType().getBaseAttack() + (leftOver > 0 ? increment + 1: increment));
        pokkemon.setIvDefence(pokkemon.getType().getBaseDefence() + (leftOver > 1 ? increment + 1: increment));
        pokkemon.setIvHitpoints(pokkemon.getType().getBaseHitpoints() + increment);
    }

    private Integer calcBaseSum(PokkemonType type) {
        return type.getBaseAttack() +
                type.getBaseDefence() +
                type.getBaseHitpoints();

    }


}
