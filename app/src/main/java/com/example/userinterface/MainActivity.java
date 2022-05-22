package com.example.userinterface;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private TextView txtWel, txtLike, txtQut, txtOpn;
    private RadioGroup rdgOpn;
    private CheckBox chckCoff, chckDg, chckCt, chckMilk, chckAdvs, chckSwmg, chckSng, chckTea, chckSqrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtWel = findViewById(R.id.txtWel);
        txtLike = findViewById(R.id.txtLike);
        txtQut = findViewById(R.id.txtQut);
        txtOpn = findViewById(R.id.txtOpn);
        rdgOpn = findViewById(R.id.rdgOpn);
        chckCoff = findViewById(R.id.chckCoff);
        chckTea = findViewById(R.id.chckTea);
        chckMilk = findViewById(R.id.chckMilk);
        chckDg = findViewById(R.id.chckDg);
        chckCt = findViewById(R.id.chckCt);
        chckAdvs = findViewById(R.id.chckAdvs);
        chckSwmg =findViewById(R.id.chckSwmg);
        chckSng = findViewById(R.id.chckSng);
        chckSqrl = findViewById(R.id.chckSqrl);

        chckCoff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    Toast.makeText(MainActivity.this, "Do you want some coffee ☕..?", Toast.LENGTH_SHORT).show();
            }
        });

        chckTea.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivity.this, "Do you want to take cup of Tea 🫖..?", Toast.LENGTH_SHORT).show();
            }
        });

        chckMilk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivity.this, "So, you want to try something new hmm 🥛...!", Toast.LENGTH_SHORT).show();
            }
        });

        chckCt.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivity.this, "You like Cats 😺...!", Toast.LENGTH_SHORT).show();
            }
        });

        chckDg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivity.this, "So, You like Dogs 🐶..!", Toast.LENGTH_SHORT).show();
            }
        });

        chckSqrl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivity.this, "So, You like Squirral 🐿️..!", Toast.LENGTH_SHORT).show();
            }
        });

        chckAdvs.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivity.this, "Ready to go for adventures ...!", Toast.LENGTH_SHORT).show();
            }
        });

        chckSwmg.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivity.this, "Ready for Swimming...! ", Toast.LENGTH_SHORT).show();
            }
        });

        chckSng.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(MainActivity.this, "Please Sing A Song For Us...!", Toast.LENGTH_SHORT).show();
            }
        });

        int chckbtn = rdgOpn.getCheckedRadioButtonId();
        switch (chckbtn) {
            case R.id.rbGd:
                Toast.makeText(MainActivity.this, "😊", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbTfn:
                Toast.makeText(MainActivity.this, "😅", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rbKg:
                Toast.makeText(MainActivity.this, "For Sure...! 😁👍", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

       rdgOpn.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(RadioGroup radioGroup, int checkId) {
               switch (checkId) {
                   case R.id.rbGd:
                       Toast.makeText(MainActivity.this, "😊", Toast.LENGTH_SHORT).show();
                       break;
                   case R.id.rbTfn:
                       Toast.makeText(MainActivity.this, "😅", Toast.LENGTH_SHORT).show();
                       break;
                   case R.id.rbKg:
                       Toast.makeText(MainActivity.this, "For Sure...! 😁👍", Toast.LENGTH_SHORT).show();
                       break;
                   default:
                       break;
               }
           }
       });



        Button btnPrs = findViewById(R.id.btnPrs);

        btnPrs.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this, "Thanks For Using My App 😇", Toast.LENGTH_SHORT).show();
                return true;
            }
        });



    }
}