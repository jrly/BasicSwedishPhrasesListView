package com.example.jimmy.basicswedishphrasesimproved;


import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import static java.util.Arrays.asList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = (ListView) findViewById(R.id.myListView);

        final ArrayList<String> swedishPhrases = new ArrayList<String>(asList(
                "ENGLISH\t\t\t\t\t\t\t\t\tSWEDISH",
                "Hello\n\t\t\t\t\t\t\t\t\t\t\t\t\tHej",
                "Goodbye\n\t\t\t\t\t\t\t\t\t\t\t\t\tHej då",
                "Goodmorning\n\t\t\t\t\t\t\t\t\t\t\t\t\tGod morgon",
                "Goodevening\n\t\t\t\t\t\t\t\t\t\t\t\t\tGod kväll",
                "How are you?\n\t\t\t\t\t\t\t\t\t\t\t\t\tHur är det?",
                "What is your name?\n\t\t\t\t\t\t\t\t\t\t\t\t\tVad heter du?",
                "Pleased to meet you\n\t\t\t\t\t\t\t\t\t\t\t\tTrevligt att träffas",
                "My name is...\n\t\t\t\t\t\t\t\t\t\t\t\t\tJag heter...",
                "Excuse me\n\t\t\t\t\t\t\t\t\t\t\t\t\tUrsäkta",
                "Where is the toilet?\n\t\t\t\t\t\t\t\t\t\t\t\t Var är toaletten?",
                "Thanks\n\t\t\t\t\t\t\t\t\t\t\t\t\tTack",
                "Sorry\n\t\t\t\t\t\t\t\t\t\t\t\t\tFörlåt",
                "I don't understand\n\t\t\t\t\t\t\t\t\t\t\t\t\t Jag förstår inte",
                "Have a nice day\n\t\t\t\t\t\t\t\t\t\t\t\t Ha en trevlig dag!"));


        //array adapter: converts array list into a different format (listview format)

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, swedishPhrases);
        //We created an array adapter which is a new array adapter of strings. created from myfamily array list. converted that array into a new style (simplelistitem1)
        myListView.setAdapter(arrayAdapter);


        //make list view interactive
        //setonitemclicklistener for when the list is clicked

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            //adapter view with the ? is a generic cause we don't know what type it is
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    MediaPlayer phrase;


                    switch (position) {

                        case 1:

                            phrase = MediaPlayer.create(MainActivity.this, R.raw.hello);
                            phrase.start();
                            Toast.makeText(getApplicationContext(), "Hej", Toast.LENGTH_SHORT).show();
                            break;

                        case 2:
                            phrase = MediaPlayer.create(MainActivity.this, R.raw.goodbye);
                            phrase.start();
                            Toast.makeText(getApplicationContext(), "Hej då", Toast.LENGTH_SHORT).show();
                            break;

                        case 3:
                            phrase = MediaPlayer.create(MainActivity.this, R.raw.goodmorning);
                            phrase.start();
                            Toast.makeText(getApplicationContext(), "God morgon", Toast.LENGTH_SHORT).show();
                            break;

                        case 4:
                            phrase = MediaPlayer.create(MainActivity.this, R.raw.goodevening);
                            phrase.start();
                            Toast.makeText(getApplicationContext(), "God kväll", Toast.LENGTH_SHORT).show();
                            break;

                        case 5:
                            phrase = MediaPlayer.create(MainActivity.this, R.raw.howareyou);
                            phrase.start();
                            Toast.makeText(getApplicationContext(), "Hur är det?", Toast.LENGTH_SHORT).show();
                            break;

                        case 6:
                            phrase = MediaPlayer.create(MainActivity.this, R.raw.name);
                            phrase.start();
                            Toast.makeText(getApplicationContext(), "Vad heter du?", Toast.LENGTH_SHORT).show();
                            break;

                        case 7:
                            phrase = MediaPlayer.create(MainActivity.this, R.raw.pleasedtomeetyou);
                            phrase.start();
                            Toast.makeText(getApplicationContext(), "Trevligt att träffas", Toast.LENGTH_LONG).show();
                            break;

                        case 8:
                            phrase = MediaPlayer.create(MainActivity.this, R.raw.mynameis);
                            phrase.start();
                            Toast.makeText(getApplicationContext(), "Jag heter...", Toast.LENGTH_SHORT).show();
                            break;

                        case 9:
                            phrase = MediaPlayer.create(MainActivity.this, R.raw.excuseme);
                            phrase.start();
                            Toast.makeText(getApplicationContext(), "Ursäkta", Toast.LENGTH_SHORT).show();
                            break;

                        case 10:
                            phrase = MediaPlayer.create(MainActivity.this, R.raw.whereisthetoilet);
                            phrase.start();
                            Toast.makeText(getApplicationContext(), "Var är toaletten?", Toast.LENGTH_LONG).show();
                            break;

                        case 11:
                            phrase = MediaPlayer.create(MainActivity.this, R.raw.thanks);
                            phrase.start();
                            Toast.makeText(getApplicationContext(), "Tack", Toast.LENGTH_SHORT).show();
                            break;

                        case 12:
                            phrase = MediaPlayer.create(MainActivity.this, R.raw.sorry);
                            phrase.start();
                            Toast.makeText(getApplicationContext(), "Förlåt", Toast.LENGTH_SHORT).show();
                            break;

                        case 13:
                            phrase = MediaPlayer.create(MainActivity.this, R.raw.idontunderstand);
                            phrase.start();
                            Toast.makeText(getApplicationContext(), "Jag förstår inte", Toast.LENGTH_LONG).show();
                            break;

                        case 14:
                            phrase = MediaPlayer.create(MainActivity.this, R.raw.haveaniceday);
                            phrase.start();
                            Toast.makeText(getApplicationContext(), "Ha en trevlig dag!", Toast.LENGTH_LONG).show();
                            break;


                        default:
                            break;
                    }

                }




        });

    }
}
