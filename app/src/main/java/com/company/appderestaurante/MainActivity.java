package com.company.appderestaurante;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.company.appderestaurante.Adapter.FoodAdapter;
import com.company.appderestaurante.Model.Food;
import com.company.appderestaurante.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FoodAdapter foodAdapter;
    private ArrayList<Food> foodlist =new ArrayList();

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerViewFood = binding.RecyclerViewFood;
        recyclerViewFood.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewFood.setHasFixedSize(true);
        foodAdapter = new FoodAdapter(foodlist, this);
        recyclerViewFood.setAdapter(foodAdapter);
        getFood();

    }

    private void getFood(){
        Food food1 =  new Food(R.drawable.food1, "RODIZIO", "O rodízio de sushi é uma maneira maravilhosa de explorar a culinária japonesa", "120,00");
        foodlist.add(food1);
        Food food2 =  new Food(R.drawable.food2, "À LA CARTE", " Selecione as entradas, pratos principais, acompanhamentos e sobremesas de forma independente", "Valor Variavel");
        foodlist.add(food2);
        Food food3 =  new Food(R.drawable.food3, "TEMAKI", "Popular e delicioso prato da culinária japonesa que se destaca por sua apresentação única e sabor marcante.", "25,00");
        foodlist.add(food3);
        Food food4 =  new Food(R.drawable.food4, "CEVICHE", "Prato de frutos do mar cru ou peixe cru que é cozido em suco de limão ou limão, resultando em uma mistura refrescante e saborosa.", "20,00");
        foodlist.add(food4);
        Food food5 =  new Food(R.drawable.food5, "NIGIRI", " Consistindo em pequenos pedaços de arroz de sushi com uma fatia de peixe cru ou frutos do mar no topo", "3,00");
        foodlist.add(food5);
    }

}