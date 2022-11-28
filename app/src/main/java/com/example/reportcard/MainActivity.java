package com.example.reportcard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard studentOne = new ReportCard(12345);

        List<String>subjectList = new ArrayList<>();
        subjectList.add("Maths");
        subjectList.add("Objective-C");
        subjectList.add("Android Development");

        studentOne.setSubjects(subjectList);

        List<Integer> gradesList = new ArrayList<>();
        gradesList.add(8);
        gradesList.add(7);
        gradesList.add(6);

        studentOne.setGrades(gradesList);

        List<Integer> attendanceList = new ArrayList<>();
        attendanceList.add(190);
        attendanceList.add(150);
        attendanceList.add(200);

        studentOne.setAttendance(attendanceList);

        String messageToParents = "Have a great summer";
        studentOne.setMessageToParents(messageToParents);

        Log.v("Main Activity", "studentOne" + studentOne);

        }
    }
