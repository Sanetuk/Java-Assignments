package com.example.assignment08;

import java.util.ArrayList;

public class Dog {

    // 이름
    String name;

    // 전화번호
    String mobile;

    // 이미지
    int image;





    // 이미지 카운트
    static int count = 0;





    Dog(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;

        int image = 0;

        if(count == 0){
            image = R.drawable.dog_run;
        } else if (count == 1) {
            image = R.drawable.dog_sit;
        } else if (count == 2) {
            image = R.drawable.dog_stand;
        }

        this.image = image;

        // 카운터 작동
        count += 1;





    }

}
