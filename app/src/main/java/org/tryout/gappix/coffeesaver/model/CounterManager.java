package org.tryout.gappix.coffeesaver.model;

/**
 * Created by gazzopa1 on 04/04/2017.
 */

public class CounterManager {

    private CoffeeCounter coffeeCounter;


    public CounterManager(CoffeeCounter coffeeCounter) {
        this.coffeeCounter = coffeeCounter;
    }


    //..................................................................................................................
    /**
     *
     */
    public void resetAllCounters(){


        coffeeCounter.resetCounter();

    }//end resetAllCounters method//



}//end CounterManager Class //////////////////////////////////////
