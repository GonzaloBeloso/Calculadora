package com.gonzalo.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.TextView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button uno, dos, sumar, restar,multi,divi, igual,borra,cero,ce,tre,cua,cin,sei,sie,och,nue;
    TextView texto;
    double contador, op1, op2, res;
    int ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }
    public void acciones() {
        igual.setOnClickListener(this);
        sumar.setOnClickListener(this);
        restar.setOnClickListener(this);
        multi.setOnClickListener(this);
        divi.setOnClickListener(this);
        borra.setOnClickListener(this);
        cero.setOnClickListener(this);
        uno.setOnClickListener(this);
        dos.setOnClickListener(this);
        tre.setOnClickListener(this);
        cua.setOnClickListener(this);
        cin.setOnClickListener(this);
        sei.setOnClickListener(this);
        sie.setOnClickListener(this);
        och.setOnClickListener(this);
        nue.setOnClickListener(this);


    }

    public void instancias() {

        igual = this.findViewById(R.id.igual);
        texto = this.findViewById(R.id.txt);
        sumar = this.findViewById(R.id.suma);
        restar = this.findViewById(R.id.resta);
        multi = this.findViewById(R.id.multiplicacion);
        divi = this.findViewById(R.id.division);
        borra = this.findViewById(R.id.borrar);
        cero = this.findViewById(R.id.cero);
        uno = this.findViewById(R.id.uno);
        dos = this.findViewById(R.id.dos);
        tre=this.findViewById(R.id.tres);
        cua=this.findViewById(R.id.cuatro);
        cin=this.findViewById(R.id.cinco);
        sei=this.findViewById(R.id.seis);
        sie=this.findViewById(R.id.siete);
        och=this.findViewById(R.id.ocho);
        nue=this.findViewById(R.id.nueve);
    }



    public void onClick(View v) {
        if (v.getId() == R.id.suma) {
            try {
                String aux = texto.getText().toString();
                op1 = Double.parseDouble(aux);
            } catch (NumberFormatException nfe) {
            }
            texto.setText("");
            ope = 1;
        }

        else if (v.getId() == R.id.resta) {
            try {
                String aux = texto.getText().toString();
                op1 = Double.parseDouble(aux);
            } catch (NumberFormatException nfe) {
            }
            texto.setText("");
            ope = 2;
        }
        else  if (v.getId() == R.id.multiplicacion) {
            try {
                String aux = texto.getText().toString();
                op1 = Double.parseDouble(aux);
            } catch (NumberFormatException nfe) {
            }
            texto.setText("");
            ope = 3;
        }
        else if (v.getId() == R.id.division) {
            try {
                String aux = texto.getText().toString();
                op1 = Double.parseDouble(aux);
            } catch (NumberFormatException nfe) {
            }
            texto.setText("");
            ope = 4;
        }
        else if (v.getId() == R.id.borrar) {
            try {
                String aux = texto.getText().toString();
                op1 = Double.parseDouble(aux);
            } catch (NumberFormatException nfe) {
            }
            texto.setText(" ");
            ope = 9;
        }
        else if (v.getId() == R.id.igual) {
            try {
                String aux2 = texto.getText().toString();
                op2 = Double.parseDouble(aux2);
            } catch (NumberFormatException nfe) {
            }
            texto.setText(" ");
            if (ope == 1) {
                res = op1 + op2;
            } else if (ope == 2) {
                res = op1 - op2;
            }else if (ope == 3) {
                res = op1 * op2;
            }else if (ope == 4) {
                res = op1 / op2;
            }
            texto.setText(""+res);

        } else if (v.getId() == R.id.cero) {
            String cap = texto.getText().toString();
            cap = cap + "0";
            texto.setText(cap);

        } else if (v.getId() == R.id.uno) {
            String cap = texto.getText().toString();
            cap = cap + "1";
            texto.setText(cap);

        }else if (v.getId() == R.id.dos) {
            String cap = texto.getText().toString();
            cap = cap + "2";
            texto.setText(cap);

        }
        else if (v.getId() == R.id.tres) {
            String cap = texto.getText().toString();
            cap = cap + "3";
            texto.setText(cap);

        }
        else if (v.getId() == R.id.cuatro) {
            String cap = texto.getText().toString();
            cap = cap + "4";
            texto.setText(cap);

        }
        else if (v.getId() == R.id.cinco) {
            String cap = texto.getText().toString();
            cap = cap + "5";
            texto.setText(cap);

        }else if (v.getId() == R.id.seis) {
            String cap = texto.getText().toString();
            cap = cap + "6";
            texto.setText(cap);

        }
        else if (v.getId() == R.id.siete) {
            String cap = texto.getText().toString();
            cap = cap + "7";
            texto.setText(cap);

        }else if (v.getId() == R.id.ocho) {
            String cap = texto.getText().toString();
            cap = cap + "8";
            texto.setText(cap);

        }
        else if (v.getId() == R.id.nueve) {
            String cap = texto.getText().toString();
            cap = cap + "9";
            texto.setText(cap);

        }

    }
}

