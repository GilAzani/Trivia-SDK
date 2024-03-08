package com.gilazani.triviasdk;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.gilazani.trivia_sdk.model.Category;
import com.gilazani.trivia_sdk.model.DifficultyLevel;
import com.gilazani.trivia_sdk.model.Question;
import com.gilazani.trivia_sdk.model.QuestionType;
import com.gilazani.trivia_sdk.sdk.TriviaSDK;
import com.gilazani.trivia_sdk.sdk.callbacks.TriviaQuestionsCallback;

import java.lang.reflect.Type;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }
}