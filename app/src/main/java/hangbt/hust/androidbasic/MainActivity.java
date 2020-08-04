package hangbt.hust.androidbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView[] textNumber= new TextView[10];
    private TextView textResult, textAdd, textSub, textMul, textDiv, text00, textEqual;
    int value1 = -1, value2 = -1;
    boolean add, sub, mul, div;
    String txtResult = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findId();

        add = false; sub = false; mul = false; div = false;

        for(int i = 0; i < 10; i ++){
            final int finalI = i;
            textNumber[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    txtResult += String.valueOf(finalI);
                    textResult.setText(txtResult);
                }
            });
        }

        text00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResult += "00";
                textResult.setText(txtResult);
            }
        });

        textAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sub || div|| mul){
                    sub = false; mul = false; div = false;
                }

                if(!txtResult.equals("")){
                    value1 = Integer.valueOf(txtResult);
                    add = true;
                    txtResult = "";
                }
            }
        });

        textSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(add || mul|| div){
                    add = false; mul = false; div = false;
                }

                if(!txtResult.equals("")){
                    value1 = Integer.valueOf(txtResult);
                    sub = true;
                    txtResult = "";
                }
            }
        });

        textMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(add || sub|| div){
                    add = false; sub = false; div = false;
                }

                if(!txtResult.equals("")){
                    value1 = Integer.valueOf(txtResult);
                    mul = true;
                    txtResult = "";
                }
            }
        });

        textDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sub || mul|| add){
                    sub = false; mul = false; add = false;
                }

                if(!txtResult.equals("")){
                    value1 = Integer.valueOf(txtResult);
                    div = true;
                    txtResult = "";
                }
            }
        });

        textEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value2 = Integer.valueOf(txtResult);

                if(add == true){
                    textResult.setText(String.valueOf(value1+value2));
                    txtResult = "";
                    add = false;
                }

                if(sub == true){
                    textResult.setText(String.valueOf(value1-value2));
                    txtResult = "";
                    sub = false;
                }

                if(mul == true){
                    textResult.setText(String.valueOf(value1*value2));
                    txtResult = "";
                    mul = false;
                }

                if(div == true){
                    if(value2 == 0){
                        txtResult = "";
                        Toast.makeText(MainActivity.this,"Số chia phải khác 0!!!",Toast.LENGTH_SHORT).show();
                    }else{
                        textResult.setText(String.valueOf(value1/value2));
                        txtResult = "";
                        div = false;
                    }
                }
            }
        });
    }

    private void findId(){
        textNumber[0] = findViewById(R.id.text0);
        textNumber[1] = findViewById(R.id.text1);
        textNumber[2] = findViewById(R.id.text2);
        textNumber[3] = findViewById(R.id.text3);
        textNumber[4] = findViewById(R.id.text4);
        textNumber[5] = findViewById(R.id.text5);
        textNumber[6] = findViewById(R.id.text6);
        textNumber[7] = findViewById(R.id.text7);
        textNumber[8] = findViewById(R.id.text8);
        textNumber[9] = findViewById(R.id.text9);
        text00 = findViewById(R.id.text00);
        textAdd = findViewById(R.id.textAdd);
        textSub = findViewById(R.id.textSub);
        textMul = findViewById(R.id.textMul);
        textDiv = findViewById(R.id.textDiv);
        textEqual = findViewById(R.id.textEqual);
        textResult = findViewById(R.id.textResult);

    }
}