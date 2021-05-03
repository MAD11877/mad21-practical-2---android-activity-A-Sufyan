package sg.edu.np.practical2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private final static String TAG = "Main Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(TAG, "On Create");

        User user1 = new User("John", "Test", 1, false);

        Button follow = findViewById(R.id.follow);
        Button message = findViewById(R.id.message);


        follow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (user1.followed == false){
                    follow.setText("UNFOLLOW");
                    Log.v(TAG, "Followed");
                    user1.setFollowed(true);
                }
                else if (user1.followed == true){
                    follow.setText("FOLLOW");
                    Log.v(TAG, "Unfollowed");
                    user1.setFollowed(false);
                }
            }
        }
        );
    }

}
