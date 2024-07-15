package com.example.assignment08;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // 변수 정의
    EditText nameInput;
    EditText mobileInput;
    TextView dogNumber;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    TextView dogName;
    TextView dogMobile;
    ImageView selectedDogImage;
    LinearLayout container;
    ImageView imageOutput1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    // 눈에는 보이지 않지만 강아지 객체를 담는 ArrayList
    public ArrayList<Dog> dogList = new ArrayList<Dog>();

    // 화면에 있는 요소 초기화
    void init() {
        // 입력값 상자를 변수에 연결
        nameInput = findViewById(R.id.input1);
        mobileInput = findViewById(R.id.input2);
        dogNumber = findViewById(R.id.numberOutput);
        dogName = findViewById(R.id.textOutput1);
        dogMobile = findViewById(R.id.textOutput2);
        selectedDogImage = findViewById(R.id.imageOutput1);

        // 강아지 만들기 버튼
        Button createDogButton = findViewById(R.id.createDogButton);

        // 강아지 전시대
        container = findViewById(R.id.linearLayout2);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);





        // 리스트의 인덱스 역할을 하는 selected
        int selected = 0;


        createDogButton.setOnClickListener(v -> {
            // 강아지 객체 생성
            Dog dog = createDog();

            // 생성된 강아지 객체를 리스트에 넣기
            dogList.add(dog);

            // 강아지의 이미지를 전시대 안 이미지뷰에 표시
            if (dogList.size() == 1) {
                imageView1.setImageResource(dogList.get(0).image);
            } else if (dogList.size() == 2) {
                imageView2.setImageResource(dogList.get(1).image);
            } else if (dogList.size() == 3) {
                imageView3.setImageResource(dogList.get(2).image);
            }

        });



        // 전시대 버튼 누르기
        imageView1.setOnClickListener(v -> printData(0));

        imageView2.setOnClickListener(v -> printData(1));

        imageView3.setOnClickListener(v -> printData(2));








    }




    // 강아지 객체를 생성하는 함수
    Dog createDog() {

        //

        // input 상자에 입력된 값 가져오기
        String name = nameInput.getText().toString();
        String mobile = mobileInput.getText().toString();

        // 가져온 값을 이용하여 객체 생성하기
        Dog dog = new Dog(name, mobile);
        return dog;

    }

    // 전시대 버튼을 클릭할 때 값을 출력하는 함수
    void printData(int selected) {
        selectedDogImage.setImageResource(dogList.get(selected).image);
        dogName.setText(dogList.get(selected).name);
        dogMobile.setText(dogList.get(selected).mobile);
    }
}