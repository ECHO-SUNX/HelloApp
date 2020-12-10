package com.example.helloapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.helloapp.databinding.ActivityMainBinding;
import com.example.helloapp.viewmodel.MyViewModel;

public class MainActivity extends AppCompatActivity {

    private static String LOG_TAG="mylog";
    MyViewModel myViewModel;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG,"onCreate...");
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        //viewModel 获取方式随着api更新做出调整
        myViewModel = new ViewModelProvider(
                this,
                ViewModelProvider.AndroidViewModelFactory.getInstance(this.getApplication())
        ).get(MyViewModel.class);
        binding.setVm(myViewModel);
        binding.setLifecycleOwner(this);
    }

}