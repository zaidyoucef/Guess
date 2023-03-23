package com.joe.guess;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int result;
    static int getRandomNumber(int max, int min)
    {
        return (int)((Math.random()
                * (max - min)) + min);
    }

    public void makeToast(String str)
    {
        Toast.makeText(
                        MainActivity.this, str, Toast.LENGTH_SHORT).show();
    }
    public void clickFunction(View view)
    {
        int userGuessing;
        EditText variable = (EditText)findViewById(R.id.editId);
        userGuessing = Integer.parseInt(variable.getText().toString());
        if (userGuessing < result) {
            makeToast("Plus haut");
        }
        else if (userGuessing > result) {
            makeToast("Plus bas");
        }
        else {
            makeToast(
                    "Félicitations");
        }
    }

    @Override
    protected void onCreate(
            Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int min = 1;
        int max = 10;
        result = getRandomNumber(min, max);
    }
}
