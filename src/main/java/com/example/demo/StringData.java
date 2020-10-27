package com.example.demo;

public class StringData {
    private int lowerCase;
    private int upperCase;
    private int numbers;
    private int specialCharacters;

    public StringData(int lowerCase, int upperCase, int numbers, int specialCharacters) {
        this.lowerCase = lowerCase;
        this.upperCase = upperCase;
        this.numbers = numbers;
        this.specialCharacters = specialCharacters;
    }

    public int getLowerCase() {
        return lowerCase;
    }

    public void setLowerCase(int lowerCase) {
        this.lowerCase = lowerCase;
    }

    public int getUpperCase() {
        return upperCase;
    }

    public void setUpperCase(int upperCase) {
        this.upperCase = upperCase;
    }

    public int getNumbers() {
        return numbers;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public int getSpecialCharacters() {
        return specialCharacters;
    }

    public void setSpecialCharacters(int specialCharacters) {
        this.specialCharacters = specialCharacters;
    }
}
