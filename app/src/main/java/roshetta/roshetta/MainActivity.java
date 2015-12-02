package roshetta.roshetta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;


public class MainActivity extends AppCompatActivity {
    Context context = this;
    Button login;
    Button loginFb;
    EditText patientName;
    EditText patientPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login = (Button) findViewById(R.id.loginButton);
        loginFb=(Button) findViewById(R.id.loginFBbutton);
        patientName = (EditText) findViewById(R.id.patientName);
        patientPassword = (EditText) findViewById(R.id.patientPassword);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String checkuser = patientName.getText().toString();
                String checkpass = patientPassword.getText().toString();
                if(checkuser.matches("")) {
                    Toast.makeText(context, "Fill the UserName ", LENGTH_SHORT).show();
                   return;
                }

               else if( checkpass.matches("")) {
                    Toast.makeText(context, "Fill the Password", LENGTH_SHORT).show();
                     return;
                }
                    else{
                    Intent i = new Intent(context, ProfileActivity.class);
                    startActivity(i);
                }
            }
        });

        loginFb.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent i = new Intent(context, ProfileActivity.class);
                startActivity(i);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
