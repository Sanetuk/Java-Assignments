package com.example.assignment07;

import android.widget.ImageView;

public class Dog extends Animal {

    // Constructor 상속해오기
    Dog (String name, int age, String mobile) {
        super(name, age, mobile);
    }

    // stand method override
    void stand(ImageView outputImage) {

        outputImage.setImageResource(R.drawable.dogstand);

    }

    // sit method override
    void sit(ImageView outputImage) {

        outputImage.setImageResource(R.drawable.dogsit);

    }


    // jump method override
    void jump(ImageView outputImage) {

        outputImage.setImageResource(R.drawable.dogjump);

    }

}
