package com.crypto.service;

import java.io.File;
import java.io.IOException;

public class BruteForceService {
    private DecryptService decryptService = new DecryptService();
    FileService fileService = new FileService();
    BruteForceHelper bruteForceHelper = new BruteForceHelper();

    public void decrypt(File file) {
        String filename = file.getName();
        String stringFile = fileService.readUsingFiles(filename);
        char [] array = stringFile.toCharArray();
        int key = bruteForceHelper.getBruteForceKey(String.valueOf(array[array.length-1]));// get bruteForce key
        decryptService.decrypt(file, key);
    }
}
