package hangbt.hust.androidbasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv0, tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv00, tv_cong, tv_tru, tv_nhan, tv_chia, tv_bang;
    TextView tv_result;
    int value1 = -1, value2 = -1;
    boolean cong, tru, nhan ,chia;
    String txtresult = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findId();

        cong = false; tru = false; nhan = false; chia = false;

        tv0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult += "0";
                tv_result.setText(txtresult);
            }
        });

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult += "1";
                tv_result.setText(txtresult);
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult += "2";
                tv_result.setText(txtresult);
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult += "3";
                tv_result.setText(txtresult);
            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult += "4";
                tv_result.setText(txtresult);
            }
        });

        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult += "5";
                tv_result.setText(txtresult);
            }
        });

        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult += "6";
                tv_result.setText(txtresult);
            }
        });

        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult += "7";
                tv_result.setText(txtresult);
            }
        });

        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult += "8";
                tv_result.setText(txtresult);
            }
        });

        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult += "9";
                tv_result.setText(txtresult);
            }
        });

        tv00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresult += "00";
                tv_result.setText(txtresult);
            }
        });

        tv_cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tru || nhan|| chia){
                    tru = false; nhan = false; chia = false;
                }

                if(!txtresult.equals("")){
                    value1 = Integer.valueOf(txtresult);
                    cong = true;
                    txtresult = "";
                }
            }
        });

        tv_tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cong || nhan|| chia){
                    cong = false; nhan = false; chia = false;
                }

                if(!txtresult.equals("")){
                    value1 = Integer.valueOf(txtresult);
                    tru = true;
                    txtresult = "";
                }
            }
        });

        tv_nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tru || cong|| chia){
                    tru = false; cong = false; chia = false;
                }

                if(!txtresult.equals("")){
                    value1 = Integer.valueOf(txtresult);
                    nhan = true;
                    txtresult = "";
                }
            }
        });

        tv_chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tru || nhan|| cong){
                    tru = false; nhan = false; cong = false;
                }

                if(!txtresult.equals("")){
                    value1 = Integer.valueOf(txtresult);
                    chia = true;
                    txtresult = "";
                }
            }
        });

        tv_bang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value2 = Integer.valueOf(txtresult);

                if(cong == true){
                    tv_result.setText(String.valueOf(value1+value2));
                    txtresult = "";
                    cong = false;
                }

                if(tru == true){
                    tv_result.setText(String.valueOf(value1-value2));
                    txtresult = "";
                    tru = false;
                }

                if(nhan == true){
                    tv_result.setText(String.valueOf(value1*value2));
                    txtresult = "";
                    nhan = false;
                }

                if(chia == true){
                    if(value2 == 0){
                        txtresult = "";
                        Toast.makeText(MainActivity.this,"Số chia phải khác 0!!!",Toast.LENGTH_SHORT).show();
                    }else{
                        tv_result.setText(String.valueOf(value1/value2));
                        txtresult = "";
                        chia = false;
                    }
                }
            }
        });
    }

    private void findId(){
        tv0 = findViewById(R.id.tv0);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        tv7 = findViewById(R.id.tv7);
        tv8 = findViewById(R.id.tv8);
        tv9 = findViewById(R.id.tv9);
        tv00 = findViewById(R.id.tv00);
        tv_cong = findViewById(R.id.tv_cong);
        tv_tru = findViewById(R.id.tv_tru);
        tv_nhan = findViewById(R.id.tv_nhan);
        tv_chia = findViewById(R.id.tv_chia);
        tv_bang = findViewById(R.id.tv_bang);
        tv_result = findViewById(R.id.tv_ketqua);
    }
}