package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {

    @GetMapping("/{sequence}")
    public StringData stringInfo(@PathVariable("sequence") String sequence) {

        int numbers = 0;
        int upperCase = 0;
        int lowerCase = 0;
        int specialCharacters = 0;

        for (int i = 0; i < sequence.length(); i++) {

            if (Character.isDigit(sequence.charAt(i))){
                numbers++;
            }else if (Character.isLowerCase(sequence.charAt(i))){
                lowerCase++;
            }else if (Character.isUpperCase(sequence.charAt(i))){
                upperCase++;
            }else {
                specialCharacters++;
            }
        }
        return new StringData(lowerCase, upperCase, numbers, specialCharacters);
    }
}
