
        package com.example.intentsproj;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    int n1,n2;
    TextView text;
    EditText etNum1 , etNum2;
    String number1 , number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etNum1 = findViewById(R.id.editTextNumberPassword2);
        etNum2 = findViewById(R.id.editTextNumberPassword4);
        text = findViewById(R.id.text);

        Intent intent = getIntent();

        number1 =intent.getStringExtra("n1");
        number2 =intent.getStringExtra("n2");

        etNum1.setText(number1);
        etNum2.setText(number2);

        n1 = Integer.parseInt(number1);
        n2 = Integer.parseInt(number2);







    }

    public void add(View view){
        text.setText(number1 +"+" + number2 + "=" + (n1+n2));
    }

    public void subtract(View view){
        text.setText(number1 +"-" + number2 + "=" + (n1-n2));
    }

    public void multiply(View view ){
        text.setText(number1 +"*" + number2 + "=" + (n1*n2));
    }

    public void devide(View view){
        text.setText(number1 +"/" + number2 + "=" + (n1/n2));
    }

}