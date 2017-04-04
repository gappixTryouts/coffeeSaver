package org.tryout.gappix.coffeesaver;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import org.tryout.gappix.coffeesaver.databinding.ActivityMainBinding;
import org.tryout.gappix.coffeesaver.model.CoffeeCounter;
import org.tryout.gappix.coffeesaver.model.CounterManager;

public class MainActivity extends AppCompatActivity {


    //..................................................................................................................
    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //binding inside MainActivity
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        //create new class accessed by layout binding
        CoffeeCounter coffeeCounter = new CoffeeCounter();

        //create a new Manager
        CounterManager manager = new CounterManager(coffeeCounter);


        //assign classes to binder
        binding.setCoffee(coffeeCounter);
        binding.setManager(manager);


    }//end onCreate method


}//end MainActivityClass
