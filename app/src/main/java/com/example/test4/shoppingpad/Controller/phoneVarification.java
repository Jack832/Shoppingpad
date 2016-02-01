package com.example.test4.shoppingpad.Controller;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.example.test4.shoppingpad.MainActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by bridgelabz4 on 1/2/16.
 */
public class phoneVarification {

     public static String regex="^(?:9|8|7)[0-9]{9}$";
    public static int flag=0;


    public static int VerifyPhone(String Number){
        Log.e("heyyy",Number);
            Pattern p=Pattern.compile(regex);
            Matcher m=p.matcher(Number);
            if(m.matches()) {
                flag=1;
               return flag;

            }
        else
            return flag;

    }
    public static void VerifyOTP(int OTP){

    }
}
