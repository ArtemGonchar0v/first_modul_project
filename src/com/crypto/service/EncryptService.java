package com.crypto.service;

import com.crypto.transformer.TextTransformer;

import java.io.*;

public class EncryptService {

    private TextTransformer textTransformer = new TextTransformer();
    private FileService fileService = new FileService();
    private BruteForceHelper bruteForceHelper = new BruteForceHelper();

    public void encrypt(File file, int key) {
            String fileName = file.getName();
            String text = "";
            text = fileService.readUsingFiles(fileName);
            text = textTransformer.moveLettersOnRightPosition(key, text);
            fileService.writeStringInFile("[ENCRYPTED]" + fileName,text + bruteForceHelper.addBruteForce(key));// add brute force point
    }

}