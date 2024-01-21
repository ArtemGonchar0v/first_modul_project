package com.crypto.service;

import com.crypto.transformer.TextTransformer;

import java.io.*;

public class DecryptService {
    TextTransformer textTransformer = new TextTransformer();
    FileService fileService = new FileService();

    public void decrypt(File file, int key) {
        String fileName = file.getName();
        File f = new File("D:\\JavaRushProjects\\test.txt");
        String text = "";
        text = fileService.readUsingFiles(fileName);
        text = textTransformer.moveLettersOnLeftPosition(key, text);
        fileService.writeStringInFile("[DECRYPTED]" + f.getName(), text);


    }
}
