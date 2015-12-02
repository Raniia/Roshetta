package roshetta.roshetta;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {

    Context context = this;
    TextView editWakeTime;
    TextView editSleepTime;
    Button viewFriends;
    Button ViewMedications;
    Button ViewSuggestedFriends;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        editWakeTime = (TextView) findViewById(R.id.editWake);
        editWakeTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, EditWakeTime.class);
                startActivity(intent);
            }
        });

        editSleepTime = (TextView) findViewById(R.id.editSleep);
        editSleepTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, EditSleepTime.class);
                startActivity(intent);

            }
        });
        viewFriends = (Button) findViewById(R.id.ViewFriendsButton);
        viewFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ViewFriendList.class);
                startActivity(intent);
            }

        });
        ViewMedications = (Button) findViewById(R.id.viewMedicationButton);
        ViewMedications.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(context, viewMedication.class);
                startActivity(intent);
            }

        });

        ViewSuggestedFriends= (Button) findViewById(R.id.suggestedFriendsButton);
        ViewSuggestedFriends.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(context, suggestedFriends.class);
                startActivity(intent);
            }

        });





    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_profile, menu);
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
