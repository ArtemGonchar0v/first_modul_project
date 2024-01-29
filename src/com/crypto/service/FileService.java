package com.crypto.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileService {
    public String readUsingFiles(String fileName) {
        try {
            return new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return "";
    }

    public Path writeStringInFile(String fileName, String fileValue) {
        try {
            return Files.writeString(Path.of(fileName), fileValue);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return Path.of(""); //I don't quite understand what should be here
    }
}
