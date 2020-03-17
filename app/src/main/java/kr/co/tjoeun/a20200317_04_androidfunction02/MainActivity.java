package kr.co.tjoeun.a20200317_04_androidfunction02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.co.tjoeun.a20200317_04_androidfunction02.databinding.ActivityMainBinding;

// 20200317_04_AndroidFunction02
public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }
}
