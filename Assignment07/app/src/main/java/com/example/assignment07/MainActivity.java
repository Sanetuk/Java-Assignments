package com.example.assignment07;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText animalName;
    EditText animalAge;
    EditText animalMobile;
    Animal animal;
    ImageView outputImage;
    TextView outputText;

    @Override // 화면에 표시되는 부분
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animalName = findViewById(R.id.animalName);
        animalAge = findViewById(R.id.animalAge);
        animalMobile = findViewById(R.id.animalMobile);

        outputImage = findViewById(R.id.outputImage);
        outputText = findViewById(R.id.outputText);


        //// 버튼 모음

        /// 만들기 버튼

        // 강아지 만들기 버튼
        Button makeDogButton = findViewById(R.id.makeDogButton);
        // 강아지 만들기 버튼을 누를 경우
        makeDogButton.setOnClickListener(v -> {
            createDog();
        });

        // 고양이 만들기 버튼
        Button makeCatButton = findViewById(R.id.makeCatButton);
        // 고양이 만들기 버튼을 누를 경우
        makeCatButton.setOnClickListener(v -> {
            createCat();
        });

        /// 행동 버튼

        // 서 있어 버튼
        Button stand = findViewById(R.id.stand);

        // 서 있어 버튼을 누를 경우
        stand.setOnClickListener(v -> {
            animal.stand(outputImage);
        });


        // 앉아 버튼
        Button sit = findViewById(R.id.sit);

        // 앉아 버튼을 누를 경우
        sit.setOnClickListener(v -> {
            animal.sit(outputImage);
        });


        // 뛰어 버튼
        Button jump = findViewById(R.id.jump);

        // 뛰어 버튼을 누를 경우
        jump.setOnClickListener(v -> {
            animal.jump(outputImage);
        });
    }

    void createDog() {

        // 입력상자에서 변수로 데이터 옮겨오기
        String name = animalName.getText().toString();
        String ageStr = animalAge.getText().toString();
        String mobile = animalMobile.getText().toString();

        int age = Integer.parseInt(ageStr);


        // Dog 객체 생성
        animal = new Dog(name, age, mobile);

        // 결과 업데이트
        outputText.setText("강아지 만듦");


    }

    void createCat() {

        // 입력상자에서 변수로 값 가져오기
        String name = animalName.getText().toString();
        String ageStr = animalAge.getText().toString();
        String mobile = animalMobile.getText().toString();

        int age = Integer.parseInt(ageStr);

        // Cat 객체 생성
        animal = new Cat(name, age, mobile);

        // 결과 업데이트
        outputText.setText("고양이 만듦");
    }







}