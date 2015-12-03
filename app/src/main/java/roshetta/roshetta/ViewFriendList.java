package roshetta.roshetta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Context;
import android.view.View;
import android.widget.Button;


public class ViewFriendList extends AppCompatActivity {
Context context = this;
    Button profile;
    Button message;
    Button removeFriend1;
    Button messageFriend1;
    Button viewFriend1;

    Button removeFriend2;
    Button messageFriend2;
    Button viewFriend2;

    Button removeFriend3;
    Button messageFriend3;
    Button viewFriend3;

    Button myTimeline;
    Button myProfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_friend_list);


        profile=(Button) findViewById(R.id.doctorProfileButton);
        message=(Button) findViewById(R.id.doctorMessageButton);
        removeFriend1=(Button) findViewById(R.id.removeFriend1);
        messageFriend1=(Button) findViewById(R.id.messageFriend1);
        viewFriend1= (Button) findViewById(R.id.viewProf1);

        removeFriend2=(Button) findViewById(R.id.removeFriend2);
        messageFriend2=(Button) findViewById(R.id.messageFriend2);
        viewFriend2= (Button) findViewById(R.id.viewProfile2);

        removeFriend3=(Button) findViewById(R.id.removeFriend3);
        messageFriend3=(Button) findViewById(R.id.messageFriend3);
        viewFriend3= (Button) findViewById(R.id.viewProfile3);

        myTimeline= (Button) findViewById(R.id.myTimeline);

        myProfile= (Button) findViewById(R.id.myProfile);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DoctorProfile.class);
                startActivity(i);
            }
        });

        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, MessageFriend.class);
                startActivity(i);
            }
        });
        viewFriend1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, FriendProfile.class);
                startActivity(i);
            }
        });
        removeFriend1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, RemoveFriend.class);
                startActivity(i);
            }
        });

       messageFriend1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, MessageFriend.class);
                startActivity(i);
            }
        });
        removeFriend2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, RemoveFriend.class);
                startActivity(i);
            }
        });
        messageFriend2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, MessageFriend.class);
                startActivity(i);
            }
        });

        viewFriend2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, FriendProfile.class);
                startActivity(i);
            }
        });

        removeFriend3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, RemoveFriend.class);
                startActivity(i);
            }
        });

        messageFriend3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, MessageFriend.class);
                startActivity(i);
            }
        });

        viewFriend3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, FriendProfile.class);
                startActivity(i);
            }
        });

        myTimeline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, Timeline.class);
                startActivity(i);
            }
        });

        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, ProfileActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_view_friend_list, menu);
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
