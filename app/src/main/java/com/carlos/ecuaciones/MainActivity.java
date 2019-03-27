package com.carlos.ecuaciones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bb;
    EditText ax,bx,cx;
    TextView xx1,xx2, mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bb = (Button) findViewById(R.id.Resolver);
        ax = (EditText) findViewById(R.id.IngreA);
        bx = (EditText) findViewById(R.id.IngresarB);
        cx = (EditText) findViewById(R.id.IngreseC);
        xx1 = (TextView) findViewById(R.id.valorx);
        xx2 = (TextView) findViewById(R.id.valory);
        mensaje = (TextView) findViewById(R.id.mensaje);

        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a= Double.parseDouble(ax.getText().toString());
                double b= Double.parseDouble(bx.getText().toString());
                double c= Double.parseDouble(cx.getText().toString());

                double x1 = (- b + (Math.sqrt(Math.pow(b,2)-(4*a*c)))) / 2*a;
                double x2 = (- b - (Math.sqrt(Math.pow(b,2)-(4*a*c)))) / 2*a;
                double D = Math.pow(b,2)-(4*a*c);

                xx1.setText(x1 +"");
                xx2.setText(x2 +"");

                if (D>=0){

                    mensaje.setText("Tiene solucion");

                }else {

                    mensaje.setText("No tiene solucion");
                }
                limpiar();
            }
        });

    }

    public void limpiar(){

        ax.setText("");
        bx.setText("");
        cx.setText("");
    }
}
