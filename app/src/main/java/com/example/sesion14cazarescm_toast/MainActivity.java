package com.example.sesion14cazarescm_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {//inicia clase

    Button btnPrimero,btnSegundo,btnTercero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {//inicia método onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPrimero=findViewById(R.id.btnPrimero);
        btnSegundo=findViewById(R.id.btnSegundo);
        btnTercero=findViewById(R.id.btnTercero);
    }//termina método onCreate

    public void primerToast(View view){//inicia método primerToast
        Context context=getApplicationContext();
        CharSequence mensaje="Mensaje TOAST \nMauricio Cázares \nCM";
        int duration=Toast.LENGTH_LONG;

        Toast toast=Toast.makeText(context,mensaje,duration);

        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();

        //Toast integrado
        Toast.makeText(this,"Ventana Emergente 1er Toast",Toast.LENGTH_LONG).show();
    }//termina método primerToast


    public void segundoToast(View view){//inicia método segundoToast
        Context context=getApplicationContext();
        CharSequence mensaje="Mensaje Segundo TOAST \nPráctica 2 de \nCM";
        int duration=Toast.LENGTH_LONG;

        Toast toast=Toast.makeText(context,mensaje,duration);

        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();

        //Toast integrado
        Toast.makeText(this,"Ventana Emergente 2do Toast",Toast.LENGTH_LONG).show();
    }//termina método segundoToast


    public void tercerToast(View view){//inicia método tercerToast
        Context context=getApplicationContext();
        CharSequence mensaje="Mensaje Tercer TOAST \n¡Feliz día del padre!\nAtte: Fam Cázares Trejo";
        int duration=Toast.LENGTH_LONG;

        Toast toast=Toast.makeText(context,mensaje,duration);

        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();

        //Toast integrado
        Toast.makeText(this,"Ventana Emergente 3er Toast",Toast.LENGTH_LONG).show();
    }//termina método tercerToast


    //Toast personalizado con XML
    public void toastPersonalizadoXML1(View view){//inicia método

        //Inflater => Ejecución, visualización, desplegado de una vista
        LayoutInflater inflater =getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast2,null);

        Toast toastXML = new Toast(getApplicationContext());
        toastXML.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toastXML.setDuration(Toast.LENGTH_LONG);
        //Integración de los elementos
        toastXML.setView(layout);
        toastXML.show();
    }//termina método

}//termina clase