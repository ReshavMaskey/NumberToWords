package com.example.numbertowords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.numbertowords.logic.ConvertNumberToWord;

public class MainActivity extends AppCompatActivity {

    Button btnConvert,btnClose;
    TextView txtResult;
    EditText txtNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClose = findViewById(R.id.btnClose);
        btnConvert= findViewById(R.id.btnConvert);
        txtNumber = findViewById(R.id.txtNumber);
        txtResult = findViewById(R.id.txtResult);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConvertNumberToWord cnw = new ConvertNumberToWord();
                int num = Integer.parseInt(txtNumber.getText().toString());
                if(num == 0){
                    txtResult.setText("Zero");
                }else{
                    txtResult.setText(""+"[ "+cnw.numberToWord(num)+" ]");
                }
            }
        });
//        try {
//            number = scanner.nextInt();
//            if (number == 0) {
//                System.out.print("Number in words: Zero");
//            } else {
//                System.out.print(numberToWord(number));
//            }
//        } catch (Exception e) {
//            System.out.println("invalid number");
//        }
    }
}
