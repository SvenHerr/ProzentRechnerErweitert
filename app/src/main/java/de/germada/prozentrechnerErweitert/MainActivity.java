package de.germada.prozentrechnerErweitert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button zehn;
    Button zwanzig;
    Button dreißig;
    Button vierzig;
    Button fünfzig;
    Button sechzig;
    Button siebzig;
    Button achzig;
    Button neunzig;
    Button reset;
    Button berechne;

    EditText inputText;
    EditText input1Text;
    TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zehn = (Button) findViewById(R.id.zehn);
        zwanzig = (Button) findViewById(R.id.zwanzig);
        dreißig = (Button) findViewById(R.id.dreißig);
        vierzig = (Button) findViewById(R.id.vierzig);
        fünfzig = (Button) findViewById(R.id.fünfzig);
        sechzig = (Button) findViewById(R.id.sechzig);
        siebzig = (Button) findViewById(R.id.siebzig);
        achzig = (Button) findViewById(R.id.achzig);
        neunzig = (Button) findViewById(R.id.neunzig);
        reset = (Button) findViewById(R.id.reset);
        berechne = (Button) findViewById(R.id.berechne);

        inputText = (EditText) findViewById(R.id.inputText);
        input1Text =(EditText) findViewById(R.id.input1Text);
        outputText = (TextView) findViewById(R.id.outputText);
        // outputText.setText("Funktionier dass?");
    }
    public void convert (View view)
    {
        String inputStr = inputText.getText().toString();
        if (inputStr.length() < 1)
        {
            Toast warning = Toast.makeText(this, R.string.invalid_input, Toast.LENGTH_LONG);
            warning.show();
            return;
        }
        Double inputValue = Double.parseDouble(inputStr);

        switch (view.getId())
        {
            case R.id.zehn:
                zehn(inputValue);
                break;
            case R.id.zwanzig:
               zwanzig(inputValue);
                break;
            case R.id.dreißig:
                dreißig(inputValue);
                break;
            case R.id.vierzig:
                vierzig(inputValue);
                break;
            case R.id.fünfzig:
                fünfzig(inputValue);
                break;
            case R.id.sechzig:
                sechzig(inputValue);
                break;
            case R.id.siebzig:
                siebzig(inputValue);
                break;
            case R.id.achzig:
                achzig(inputValue);
                break;
            case R.id.neunzig:
                neunzig(inputValue);
                break;
            case R.id.berechne:
                    String inputStr1 = input1Text.getText().toString();
                        if (inputStr1.length()<1)
                         {
                             Toast warning = Toast.makeText(this, R.string.no_value, Toast.LENGTH_LONG);
                             warning.show();
                             return;
                         }
                    Double inputValue1 = Double.parseDouble(inputStr1);

                berechne(inputValue,inputValue1);
                break;
        }
    }
    public void reset(View view)
    {
        inputText.setText("");
        input1Text.setText("");
        outputText.setText("");
        outputText.setVisibility(View.INVISIBLE);
    }
    protected void zehn(Double input)
    {
        showResult(input * 10/100);
    }
    protected void zwanzig(Double input)
    {
        showResult(input * 20/100);
    }
    protected void dreißig(Double input)
    {
        showResult(input * 30/100);
    }
    protected void vierzig(Double input)
    {
        showResult(input * 40/100);
    }
    protected void fünfzig(Double input)
    {
        showResult(input * 50/100);
    }
    protected void sechzig(Double input)
    {
        showResult(input * 60/100);
    }
    protected void siebzig(Double input)
    {
        showResult(input * 70 / 100);
    }
    protected void achzig(Double input)
    {
        showResult(input * 80/100);
    }
    protected void neunzig(Double input)
    {
        showResult(input * 90/100);
    }
    protected void berechne(Double input,Double inputValue1)
    {
        showResult(input * inputValue1/100);
    }
    protected void showResult(Double result)
    {
        String resultStr = getString(R.string.result) + result;
        outputText.setVisibility(View.VISIBLE);
        outputText.setText(resultStr);
    }
}