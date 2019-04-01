package com.example.inclassassignment09_thomass;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference; //new libraries
import com.google.firebase.database.FirebaseDatabase;  //new libraries
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.UUID;

public class SecondPage extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private TextView displayText;

    private FirebaseDatabase database = FirebaseDatabase.getInstance(); //linked to the Firebase
    private DatabaseReference businessRef = database.getReference("Business Type");
    private DatabaseReference myBusinessRef = database.getReference("Multi Business"); // This is the location
    //private ArrayList<Business> people = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        mAuth = FirebaseAuth.getInstance();

        displayText = (TextView) findViewById(R.id.display_text);
        businessRef.addValueEventListener(new ValueEventListener() { //if values chnage they can be pulled
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Business b = dataSnapshot.getValue(Business.class); //object - where we are looking
                displayText.setText(b.toString()); //on

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Toast.makeText(SecondPage.this, "Error", Toast.LENGTH_SHORT).show();
            }

        });
    }

    public void setBusiness(View view) { //push this
        businessRef.setValue(new Business("Pratt Institute", "Clinton Hill", 10000000, true));//new object Business
    }

    public void addBusiness(View view) {
        myBusinessRef.push().setValue(new Business("Teachers College", "Manhattan", 10000000, true)); //push always starts a new one
    }
}
