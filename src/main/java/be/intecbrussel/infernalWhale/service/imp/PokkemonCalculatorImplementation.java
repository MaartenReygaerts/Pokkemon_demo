package be.intecbrussel.infernalWhale.service.imp;

import be.intecbrussel.infernalWhale.model.Pokkemon;
import be.intecbrussel.infernalWhale.service.DustCalculatorService;
import be.intecbrussel.infernalWhale.service.IvCalculatorService;
import be.intecbrussel.infernalWhale.service.PokkemonCalculator;
import org.springframework.beans.factory.annotation.Autowired;

public class PokkemonCalculatorImplementation implements PokkemonCalculator {

    @Autowired(required = false)
        private IvCalculatorService Ivservice;
    @Autowired(required = false)
        private DustCalculatorService dustCalculatorService;

    /*public PokkemonCalculatorImplementation(IvCalculatorService iv, DustCalculatorService dust){
        this.Ivservice = iv;
        this.dustCalculatorService = dust;
    }*/

    @Override
    public Pokkemon parsePokkemon(Pokkemon pokkemon) {




        return null;
    }
}
