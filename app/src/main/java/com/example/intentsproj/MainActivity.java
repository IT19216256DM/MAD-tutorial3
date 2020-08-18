
package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.view.Gravity.*;

public class MainActivity<TOP, LEFT> extends AppCompatActivity {
    private Button button;
    Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickButtonLister();


    }
    public void OnClickButtonLister(){
            button = (Button)findViewById(R.id.button);
            button.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Context context = getApplicationContext();
                            CharSequence text = "Navigating Activity 2";
                            int duration = Toast.LENGTH_SHORT;
                            toast = Toast.makeText(context,text,duration);
                            toast.setGravity(Gravity.CENTER_VERTICAL, 0,  0);
                            toast.show();
                            Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                            startActivity(intent);
                        }
                    }
            );

    }


}