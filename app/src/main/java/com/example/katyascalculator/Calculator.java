package com.example.katyascalculator;

import android.os.Parcel;
import android.os.Parcelable;

public class Calculator implements Parcelable {
    public String first_number;
    public String second_number;
    public double result;

    protected Calculator(Parcel in) {
        first_number = in.readString();
        second_number = in.readString();
        result = in.readDouble();
    }

    public static final Creator<Calculator> CREATOR = new Creator<Calculator>() {
        @Override
        public Calculator createFromParcel(Parcel income) {
            return new Calculator(income);
        }

        @Override
        public Calculator[] newArray(int size) {
            return new Calculator[size];
        }
    };

    public Calculator() {
        first_number = "";
        second_number = "";
        result = 0.0;
    }

    public void Sum() {
        result = Double.parseDouble(first_number) + Double.parseDouble(second_number);
    }

    public void Min() {
        result = Double.parseDouble(first_number) - Double.parseDouble(second_number);
    }

    public void Mult() {
        result = Double.parseDouble(first_number) * Double.parseDouble(second_number);
    }

    public void Div() {
        result = Double.parseDouble(first_number) / Double.parseDouble(second_number);
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(first_number);
        dest.writeString(second_number);
        dest.writeDouble(result);
    }
}
