package com.softrasol.ahmed.pulisherdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;


import com.softrasol.ahmed.pulisherdesign.Adapters.ExpandableListAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FaqActivity extends AppCompatActivity {
    private ExpandableListAdapter listAdapter;
    private ExpandableListView expListView;
    private List<String> listQuestions;
    private HashMap<String, List<String>> listQuestionAndAnswers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        Button btnBack = findViewById(R.id.btn_back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        expListView = findViewById(R.id.lvExp);
        setData();
        listAdapter = new ExpandableListAdapter(this, listQuestions, listQuestionAndAnswers);

        expListView.setAdapter(listAdapter);
    }

    private void setData() {
        listQuestions = new ArrayList<String>();
        listQuestionAndAnswers = new HashMap<>();

        listQuestions.add("What is Newsbag ?");
        listQuestions.add("How to subscribe to a newspaper ?");
        listQuestions.add("How to download a book ?");
        listQuestions.add("Question 4 ?");

        List<String> answersListQuestion1 = new ArrayList<String>();
        answersListQuestion1.add("The answer goes here The answer goes here The answer goes here The answer goes here The answer goes here");

        List<String> answersListQuestion2 = new ArrayList<String>();
        answersListQuestion2.add("Possible answer !");
        answersListQuestion2.add("Another possible answer to the question");
        answersListQuestion2.add("Another possible answer");

        List<String> answersListQuestion3 = new ArrayList<String>();
        answersListQuestion3.add("Answer to the question goes here");

        List<String> answersListQuestion4 = new ArrayList<String>();
        answersListQuestion4.add("The answer goes here");


        listQuestionAndAnswers.put(listQuestions.get(0), answersListQuestion1); // Header, Child data
        listQuestionAndAnswers.put(listQuestions.get(1), answersListQuestion2);
        listQuestionAndAnswers.put(listQuestions.get(2), answersListQuestion3);
        listQuestionAndAnswers.put(listQuestions.get(3), answersListQuestion4);
    }
}
