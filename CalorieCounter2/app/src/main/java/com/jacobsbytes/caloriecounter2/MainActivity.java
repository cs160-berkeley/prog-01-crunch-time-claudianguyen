package com.jacobsbytes.caloriecounter2;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    ImageButton pushups; ImageButton situps; ImageButton squats; ImageButton leglifts;
    ImageButton plank; ImageButton jumpingjacks; ImageButton pullups; ImageButton cycling;
    ImageButton walking; ImageButton jogging; ImageButton swimming; ImageButton stairclimbing;

    EditText textpushups; EditText textsitups; EditText textsquats; EditText textleglifts;
    EditText textplank; EditText textjumpingjacks; EditText textpullups; EditText textcycling;
    EditText textwalking; EditText textjogging; EditText textswimming; EditText textstairclimbing;

    Button convertbutton; Button resetbutton;
    int totalCalories;
    HashMap<String, Integer> input;

    HashMap<String,Integer> conversion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = new HashMap<String, Integer>();

        convertbutton = (Button) findViewById(R.id.convertbutton);
        resetbutton = (Button) findViewById(R.id.resetbutton);
        totalCalories = 0;

        pushups = (ImageButton) findViewById(R.id.pushups);
        situps = (ImageButton) findViewById(R.id.situps);
        squats = (ImageButton) findViewById(R.id.squats);
        leglifts = (ImageButton) findViewById(R.id.leglifts);
        plank = (ImageButton) findViewById(R.id.plank);
        jumpingjacks = (ImageButton) findViewById(R.id.jumpingjacks);
        pullups = (ImageButton) findViewById(R.id.pullups);
        cycling = (ImageButton) findViewById(R.id.cycling);
        walking = (ImageButton) findViewById(R.id.walking);
        jogging = (ImageButton) findViewById(R.id.jogging);
        swimming = (ImageButton) findViewById(R.id.swimming);
        stairclimbing = (ImageButton) findViewById(R.id.stairclimbing);

        //text boxes
        textpushups = (EditText) findViewById(R.id.textpushups);
        textsitups = (EditText) findViewById(R.id.textsitups);
        textsquats = (EditText) findViewById(R.id.textsquats);
        textleglifts = (EditText) findViewById(R.id.textleglifts);
        textplank = (EditText) findViewById(R.id.textplank);
        textjumpingjacks = (EditText) findViewById(R.id.textjumpingjacks);
        textpullups = (EditText) findViewById(R.id.textpullups);
        textcycling = (EditText) findViewById(R.id.textcycling);
        textwalking = (EditText) findViewById(R.id.textwalking);
        textjogging = (EditText) findViewById(R.id.textjogging);
        textswimming = (EditText) findViewById(R.id.textswimming);
        textstairclimbing = (EditText) findViewById(R.id.textstairclimbing);


        // Setting onclicklisteners
        pushups.setOnClickListener(this);
        situps.setOnClickListener(this);
        squats.setOnClickListener(this);
        leglifts.setOnClickListener(this);
        plank.setOnClickListener(this);
        jumpingjacks.setOnClickListener(this);
        pullups.setOnClickListener(this);
        cycling.setOnClickListener(this);
        walking.setOnClickListener(this);
        jogging.setOnClickListener(this);
        swimming.setOnClickListener(this);
        stairclimbing.setOnClickListener(this);
        convertbutton.setOnClickListener(this);
        resetbutton.setOnClickListener(this);

        textpushups.setOnClickListener(this);
        textsitups.setOnClickListener(this);
        textsquats.setOnClickListener(this);
        textleglifts.setOnClickListener(this);
        textplank.setOnClickListener(this);
        textjumpingjacks.setOnClickListener(this);
        textpullups.setOnClickListener(this);
        textcycling.setOnClickListener(this);
        textwalking.setOnClickListener(this);
        textjogging.setOnClickListener(this);
        textswimming.setOnClickListener(this);
        textstairclimbing.setOnClickListener(this);

        // hashmap of sexericse: formula
        conversion = new HashMap<String, Integer>();

        conversion.put("pushups", 350);
        conversion.put("situps", 200); conversion.put("squats", 225);
        conversion.put("leglifts", 25); conversion.put("plank", 25); conversion.put("jumpingjacks", 10);
        conversion.put("pullups", 100); conversion.put("cycling", 12); conversion.put("walking", 20);
        conversion.put("jogging", 12); conversion.put("swimming", 13); conversion.put("stairclimbing", 15);
    }

    public int calorieConvert(int input, String exerciseName) {
        int number = conversion.get(exerciseName);
        int calories = (input * 100) / number;
        return calories;
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.resetbutton:
                totalCalories = 0;
                System.out.println("DID I PRESS RESET?");
                for (String key : input.keySet()) {
                    if (key == "pushups") {
                        textpushups.setText("");
                        textpushups.setVisibility(View.INVISIBLE);
                        pushups.setVisibility(View.VISIBLE);
                    }
                    else if (key == "situps") {
                        textsitups.setText("");
                        textsitups.setVisibility(View.INVISIBLE);
                        situps.setVisibility(View.VISIBLE);
                    }
                    else if (key == "squats") {
                        textsquats.setText("");
                        textsquats.setVisibility(View.INVISIBLE);
                        squats.setVisibility(View.VISIBLE);
                    }
                    else if (key == "leglifts") {
                        textleglifts.setText("");
                        textleglifts.setVisibility(View.INVISIBLE);
                        leglifts.setVisibility(View.VISIBLE);
                    }
                    else if (key == "plank") {
                        textplank.setText("");
                        textplank.setVisibility(View.INVISIBLE);
                        plank.setVisibility(View.VISIBLE);
                    }
                    else if (key == "jumpingjacks") {
                        textjumpingjacks.setText("");
                        textjumpingjacks.setVisibility(View.INVISIBLE);
                        jumpingjacks.setVisibility(View.VISIBLE);
                    }
                    else if (key == "pullups") {
                        textpullups.setText("");
                        textpullups.setVisibility(View.INVISIBLE);
                        pullups.setVisibility(View.VISIBLE);
                    }
                    else if (key == "cycling") {
                        textcycling.setText("");
                        textcycling.setVisibility(View.INVISIBLE);
                        cycling.setVisibility(View.VISIBLE);
                    }
                    else if (key == "walking") {
                        textwalking.setText("");
                        textwalking.setVisibility(View.INVISIBLE);
                        walking.setVisibility(View.VISIBLE);
                    }
                    else if (key == "jogging") {
                        textjogging.setText("");
                        textjogging.setVisibility(View.INVISIBLE);
                        jogging.setVisibility(View.VISIBLE);
                    }
                    else if (key == "swimming") {
                        textswimming.setText("");
                        textswimming.setVisibility(View.INVISIBLE);
                        swimming.setVisibility(View.VISIBLE);
                    }
                    else {
                        textstairclimbing.setText("");
                        textstairclimbing.setVisibility(View.INVISIBLE);
                        stairclimbing.setVisibility(View.VISIBLE);
                    }
                    input.remove(key);


                }
                System.out.println("total cal: " + totalCalories);
                System.out.println("hashmap after reset input: " + input);
                break;
            case R.id.pushups:
                textpushups.setVisibility(View.VISIBLE);
                pushups.setVisibility(View.INVISIBLE);
                break;
            case R.id.textpushups:
                String pushUpNum = textpushups.getText().toString();
                if (pushUpNum != null) {
                    int reps = Integer.parseInt(pushUpNum);
                    input.put("pushups", reps);
                }
                break;

            case R.id.situps:
                textsitups.setVisibility(View.VISIBLE);
                situps.setVisibility(View.INVISIBLE);
                break;
            case R.id.textsitups:
                String sitUpsNum = textsitups.getText().toString();
                if (sitUpsNum != null) {
                    int reps = Integer.parseInt(sitUpsNum);
                    input.put("situps", reps);
                }
                break;
            case R.id.squats:
                textsquats.setVisibility(View.VISIBLE);
                squats.setVisibility(View.INVISIBLE);
                break;
            case R.id.textsquats:
                String squatsNum = textsquats.getText().toString();
                if (squatsNum != null) {
                    int reps = Integer.parseInt(squatsNum);
                    input.put("squats", reps);
                }
                break;
            case R.id.leglifts:
                textleglifts.setVisibility(View.VISIBLE);
                leglifts.setVisibility(View.INVISIBLE);
                break;
            case R.id.textleglifts:
                String legLiftsNum = textleglifts.getText().toString();
                if (legLiftsNum != null) {
                    int reps = Integer.parseInt(legLiftsNum);
                    input.put("leglifts", reps);
                }
                break;
            case R.id.plank:
                textplank.setVisibility(View.VISIBLE);
                plank.setVisibility(View.INVISIBLE);
                break;
            case R.id.textplank:
                String plankNum = textplank.getText().toString();
                if (plankNum != null) {
                    int reps = Integer.parseInt(plankNum);
                    input.put("plank", reps);
                }
                break;
            case R.id.jumpingjacks:
                textjumpingjacks.setVisibility(View.VISIBLE);
                jumpingjacks.setVisibility(View.INVISIBLE);
                break;
            case R.id.textjumpingjacks:
                String jacksNum = textjumpingjacks.getText().toString();
                if (jacksNum != null) {
                    int reps = Integer.parseInt(jacksNum);
                    input.put("jumpingjacks", reps);
                }
                break;
            case R.id.pullups:
                textpullups.setVisibility(View.VISIBLE);
                pullups.setVisibility(View.INVISIBLE);
                break;
            case R.id.textpullups:
                String pullUpsNum = textpullups.getText().toString();
                if (pullUpsNum != null) {
                    int reps = Integer.parseInt(pullUpsNum);
                    input.put("pullups", reps);
                }
                break;

            case R.id.cycling:
                textcycling.setVisibility(View.VISIBLE);
                cycling.setVisibility(View.INVISIBLE);
                break;
            case R.id.textcycling:
                String cycleNum = textcycling.getText().toString();
                if (cycleNum != null) {
                    int reps = Integer.parseInt(cycleNum);
                    input.put("cycling", reps);
                }
                break;
            case R.id.walking:
                textwalking.setVisibility(View.VISIBLE);
                walking.setVisibility(View.INVISIBLE);
                break;
            case R.id.textwalking:
                String walkNum = textwalking.getText().toString();
                if (walkNum != null) {
                    int reps = Integer.parseInt(walkNum);
                    input.put("walking", reps);
                }
                break;
            case R.id.jogging:
                textjogging.setVisibility(View.VISIBLE);
                pushups.setVisibility(View.INVISIBLE);
                break;
            case R.id.textjogging:
                String jogNum = textjogging.getText().toString();
                if (jogNum != null) {
                    int reps = Integer.parseInt(jogNum);
                    input.put("jogging", reps);
                }
                break;
            case R.id.swimming:
                textswimming.setVisibility(View.VISIBLE);
                swimming.setVisibility(View.INVISIBLE);
                break;
            case R.id.textswimming:
                String swimNum = textswimming.getText().toString();
                if (swimNum != null) {
                    int reps = Integer.parseInt(swimNum);
                    input.put("swimming", reps);
                }
                break;
            case R.id.stairclimbing:
                textstairclimbing.setVisibility(View.VISIBLE);
                stairclimbing.setVisibility(View.INVISIBLE);
                break;
            case R.id.textstairclimbing:
                String stairNum = textstairclimbing.getText().toString();
                if (stairNum != null) {
                    int reps = Integer.parseInt(stairNum);
                    input.put("stairclimbing", reps);
                }
                break;

            case R.id.convertbutton:
                System.out.println("input hashy in convertbutton: " + input);
                for (String key : input.keySet()) {
                    int inputVal = input.get(key);
                    int convertedVal = calorieConvert(inputVal, key);
//                    System.out.println("converted val: " + convertedVal);
                    totalCalories += convertedVal;
                }
                Toast.makeText(MainActivity.this, "Total calories you burned is: " + totalCalories, Toast.LENGTH_SHORT).show();
                System.out.println(totalCalories);
                break;

            }
        }
    }