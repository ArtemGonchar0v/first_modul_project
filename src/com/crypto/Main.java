package com.crypto;

import com.crypto.service.DecryptService;
import com.crypto.service.EncryptService;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File startFile = new File("D:\\JRprojects\\first_modul_project\\test.txt");
        EncryptService encryptService = new EncryptService();
        encryptService.encrypt(startFile, 2);
        File encrypted = new File("D:\\JRprojects\\first_modul_project\\[ENCRYPTED]test.txt");
        DecryptService decryptService = new DecryptService();
        decryptService.decrypt(encrypted,2);
    }
}
