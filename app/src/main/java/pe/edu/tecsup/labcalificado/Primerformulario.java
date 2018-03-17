package pe.edu.tecsup.labcalificado;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class Primerformulario extends AppCompatActivity {
    private Spinner spinner1;
    private RadioGroup radioGroup;
    private CheckBox checkBox;private CheckBox checkBox2;
    private EditText direccion;
    double asig, boxprecio ,total;
private String name,stringcheck,radiobutton,item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primerformulario);
        spinner1 = (Spinner) findViewById(R.id.spinner);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        direccion= (EditText)findViewById(R.id.direccion);

        checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> arg) {

            }

        });

    }


    //spinner
    public void showvalue(View view) {

    } //

    //radio button

    public void answer(View view) {

      item =  spinner1.getSelectedItem().toString();
      if (item.equalsIgnoreCase("Americana")){
           asig=38;
      }else if(item.equalsIgnoreCase("Pepperoni")){
           asig=42;
    }else if(item.equalsIgnoreCase("Hawaiana")){
    asig=36;
      }else if(item.equalsIgnoreCase("Meat Lover")) {
          asig = 56;
      }
        int radioButtonId = radioGroup.getCheckedRadioButtonId();
        if (radioButtonId == -1) {
            Toast.makeText(this, "Tiene que elegir una opcion", Toast.LENGTH_LONG).show();
        } else {

            // Dinamic selected
            RadioButton radioButton = (RadioButton) findViewById(radioButtonId);
            radiobutton=radioButton.getText().toString();
        }
//checkbox

                if (checkBox.isChecked()) {
                    stringcheck = checkBox.getText().toString();
                    boxprecio=4;

                }  else if (checkBox2.isChecked()) {
                    stringcheck = checkBox2.getText().toString();
                    boxprecio = 8;
                }

         total=asig+boxprecio;
        //text
        String getFirstName = direccion.getText().toString();
        if(getFirstName.length() == 0 ) {
            Toast.makeText(this, "These fields are required", Toast.LENGTH_LONG).show();
        }else{
           name = direccion.getText().toString();

    }

        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("Confirmacion de pedido");
        alertDialog.setMessage("Su pedido de " + item +" con "  +  radiobutton  + " y " +stringcheck+  " a S/." +total +"  esta en proceso de envio." );
        // Alert dialog button
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Alert dialog action goes here
                        dialog.dismiss();// use dismiss to cancel alert dialog
                    }
                });
        alertDialog.show();

    }





}



