package com.example.socket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);

    }

    public void button1_click(View v) {
        b1.setText("T");
        b1.setEnabled(false);
        checkIfPlayer1Win();
    }

    public void button2_click(View v) {
        b2.setText("T");
        b2.setEnabled(false);
        checkIfPlayer1Win();
    }

    public void button3_click(View v) {
        b3.setText("T");
        b3.setEnabled(false);
        checkIfPlayer1Win();
    }

    public void button4_click(View v) {
        b4.setText("T");
        b4.setEnabled(false);
        checkIfPlayer1Win();
    }

    public void button5_click(View v) {
        b5.setText("T");
        b5.setEnabled(false);
        checkIfPlayer1Win();
    }

    public void button6_click(View v) {
        b6.setText("T");
        b6.setEnabled(false);
        checkIfPlayer1Win();
    }

    public void button7_click(View v) {
        b7.setText("T");
        b7.setEnabled(false);
        checkIfPlayer1Win();
    }

    public void button8_click(View v) {
        b8.setText("T");
        b8.setEnabled(false);
        checkIfPlayer1Win();
    }

    public void button9_click(View v) {
        b9.setText("T");
        b9.setEnabled(false);
        checkIfPlayer1Win();
    }

    private void checkIfPlayer1Win() {
        if (b1.getText().toString().equals("T") && b2.getText().toString().equals("T") && b3.getText().toString().equals("T")) {
            Toast.makeText(getApplicationContext(), "Jogador 1 venceu", Toast.LENGTH_LONG).show();

            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");

            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);

        } else if (b1.getText().toString().equals("T") && b4.getText().toString().equals("T") && b7.getText().toString().equals("T")) {
            Toast.makeText(getApplicationContext(), "Jogador 1 venceu", Toast.LENGTH_LONG).show();

            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");

            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);

        } else if (b2.getText().toString().equals("T") && b5.getText().toString().equals("T") && b8.getText().toString().equals("T")) {
            Toast.makeText(getApplicationContext(), "Jogador 1 venceu", Toast.LENGTH_LONG).show();

            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");

            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);

        } else if (b3.getText().toString().equals("T") && b6.getText().toString().equals("T") && b9.getText().toString().equals("T")) {
            Toast.makeText(getApplicationContext(), "Jogador 1 venceu", Toast.LENGTH_LONG).show();

            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");

            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);

        }else if (b1.getText().toString().equals("T") && b4.getText().toString().equals("T") && b7.getText().toString().equals("T")) {
            Toast.makeText(getApplicationContext(), "Jogador 1 venceu", Toast.LENGTH_LONG).show();

            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");

            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);

        }else if (b1.getText().toString().equals("T") && b5.getText().toString().equals("T") && b9.getText().toString().equals("T")) {
            Toast.makeText(getApplicationContext(), "Jogador 1 venceu", Toast.LENGTH_LONG).show();

            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");

            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);

        }else if (b3.getText().toString().equals("T") && b5.getText().toString().equals("T") && b7.getText().toString().equals("T")) {
            Toast.makeText(getApplicationContext(), "Jogador 1 venceu", Toast.LENGTH_LONG).show();

            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");

            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);

        }else if (b4.getText().toString().equals("T") && b5.getText().toString().equals("T") && b6.getText().toString().equals("T")) {
            Toast.makeText(getApplicationContext(), "Jogador 1 venceu", Toast.LENGTH_LONG).show();

            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");

            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);

        }else if (b7.getText().toString().equals("T") && b8.getText().toString().equals("T") && b9.getText().toString().equals("T")) {
            Toast.makeText(getApplicationContext(), "Jogador 1 venceu", Toast.LENGTH_LONG).show();

            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");
            b9.setText("");

            b1.setEnabled(true);
            b2.setEnabled(true);
            b3.setEnabled(true);
            b4.setEnabled(true);
            b5.setEnabled(true);
            b6.setEnabled(true);
            b7.setEnabled(true);
            b8.setEnabled(true);
            b9.setEnabled(true);
            
        }
    }
}
