package com.crypto.transformer;

import com.crypto.constants.Alphabets;

import java.util.ArrayList;

public class TextTransformer {

    public String moveLettersOnRightPosition(int pos, String text) {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> textArray = new ArrayList<>();
        ArrayList<String> newAlphabet = prepareAlphabet(pos, 1);

        for (int i = 0; i < text.length(); i++) {
            textArray.add(i, String.valueOf(text.toCharArray()[i]));

            for (int j = 0; j < Alphabets.ENGLISH_ALPHABET.size(); j++) {
                if (textArray.get(i).equals(Alphabets.ENGLISH_ALPHABET.get(j))) {
                    result.add(i, newAlphabet.get(j));
                }
            }
        }

        return String.join("", result);
    }

    public String moveLettersOnLeftPosition(int pos, String text) {
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> textArray = new ArrayList<>();
        ArrayList<String> newAlphabet = prepareAlphabet(pos, 0);
        ArrayList<String> oldAlphabet = Alphabets.ENGLISH_ALPHABET;
        for (int i = 0; i < text.length(); i++) {
            textArray.add(i, String.valueOf(text.toCharArray()[i]));

            for (int j = 0; j < oldAlphabet.size(); j++) {
                if (textArray.get(i).equals(newAlphabet.get(j))) {
                    result.add(i, oldAlphabet.get(j));
                }
            }
        }
        return String.join("", result);
    }

    private ArrayList<String> prepareAlphabet(int move, int mode) {
        ArrayList<String> newAlphabet = new ArrayList<>();

        if (move > Alphabets.ENGLISH_ALPHABET.size()) {
            move = move % Alphabets.ENGLISH_ALPHABET.size();
        }

        if (mode == 1) { // if mode = 1 move letters on right position
            for (int i = 0; i < Alphabets.ENGLISH_ALPHABET.size(); i++) {
                if (move >= Alphabets.ENGLISH_ALPHABET.size()) {
                    move = 0;
                }

                newAlphabet.add(i, Alphabets.ENGLISH_ALPHABET.get(move));
                move++;
            }
        }

        if (mode == 0) { // if mode = 0 move letters on left position
            for (int i = 0; i < Alphabets.ENGLISH_ALPHABET.size(); i++) {
                newAlphabet.add(Alphabets.ENGLISH_ALPHABET.get((i + move) % Alphabets.ENGLISH_ALPHABET.size()));
            }
        }
        return newAlphabet;
    }
}
