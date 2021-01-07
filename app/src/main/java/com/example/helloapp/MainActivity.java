package com.example.helloapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.helloapp.databinding.ActivityMainBinding;
import com.example.helloapp.viewmodel.MyViewModel;

import static androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.getInstance;

public class MainActivity extends AppCompatActivity {

    private static String LOG_TAG="mylog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavController navController = Navigation.findNavController(this,R.id.fragment);
        NavigationUI.setupActionBarWithNavController(this,navController);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController controller = Navigation.findNavController(this,R.id.fragment);
        return controller.navigateUp();
    }
}