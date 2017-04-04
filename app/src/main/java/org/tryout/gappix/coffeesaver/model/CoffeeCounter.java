package org.tryout.gappix.coffeesaver.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;
import org.tryout.gappix.coffeesaver.BR;

/**
 * Created by gazzopa1 on 04/04/2017.
 */

public class CoffeeCounter extends BaseObservable {


    // Coffee price
    private int price;
    // Coffee liquid quantity
    private double liquid;
    // Counter
    private int counter;


    //..................................................................................................................
    /**
     * Constructor for Coffee Counter
     */
    public CoffeeCounter() {

        this.price = 1;
        this.liquid = 0.035;
        this.counter = 0;
    }




    /*------------------------------------*
     *   GETTERS AND SETTERS
     *------------------------------------*/


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getLiquid() {
        return liquid;
    }

    public void setLiquid(double liquid) {
        this.liquid = liquid;
    }

    @Bindable
    public String getCounter() {
        return String.valueOf(counter);
    }


    @Bindable
    public String getStringTotalSave(){

        return String.valueOf(counter*price) + " €";

    }


    /*------------------------------------*
     *   COUNTER INTERACTIONS
     *------------------------------------*/


    public void resetCounter(){
        this.counter = 0;

        //notify an update on data
        notifyPropertyChanged(BR.counter);
        notifyPropertyChanged(BR.stringTotalSave);
    }


    public void increaseCounter(View view){
        this.counter += 1;

        //method to notify update happened
        notifyPropertyChanged(BR.counter);
        notifyPropertyChanged(BR.stringTotalSave);

    }



}//end CoffeeCounter class
