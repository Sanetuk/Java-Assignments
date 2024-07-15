package com.example.assignment07;

import android.widget.ImageView;

public class Cat extends Animal {

    // Constructor 상속해오기
    Cat (String name, int age, String mobile) {
        super(name, age, mobile);
    }

    // stand method override
    void stand(ImageView outputImage) {
        outputImage.setImageResource(R.drawable.catstand);
    }

    // sit method override
    void sit(ImageView outputImage) {
        outputImage.setImageResource(R.drawable.catsit);
    }

    // jump method override
    void jump(ImageView outputImage) {
        outputImage.setImageResource(R.drawable.catjump);
    }
}
