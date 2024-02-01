package com.crypto.util;

import com.crypto.exception.InvalidArgumentException;
import com.crypto.model.Mode;

import java.nio.file.Files;
import java.nio.file.Path;
public class InputValidation {
    public static void validateInput(String[] args) {
        int minArguments = 2;
        int maxArguments = 3;

        if (args.length < minArguments) {
            throw new InvalidArgumentException("Command and File are required!");
        }
        if (args.length > maxArguments) {
            throw new InvalidArgumentException("More than 3 arguments");
        }
    }

    public static void validateCommand(String command) {
        boolean isCommandExist = false;
        for (Mode mode : Mode.values()) {
            if (mode.toString().equals(command)) {
                isCommandExist = true;
                break;
            }
        }

        if (!isCommandExist) {
            throw new InvalidArgumentException("Command is not exist!");
        }
    }

    public static void validateFilePath(String path) {
        if (path.isBlank()) {
            throw new InvalidArgumentException("Filename is empty!");
        }
        if (!Files.exists(Path.of(path))) {
            throw new InvalidArgumentException("File not found!");
        }
    }

    public static void validateKey(String key){
        boolean isOnlyDigits = true;
        int num = Integer.parseInt(key);
        int maxKeyValue = 12;
        for(int i = 0; i < key.length() && isOnlyDigits; i++) {
            if(!Character.isDigit(key.charAt(i))) {
                isOnlyDigits = false;
                throw new InvalidArgumentException("The key must be a number!");
            }
            if (num <= 0){
                throw new InvalidArgumentException("The key must be > 0");
            }
            if (num > maxKeyValue){
                throw new InvalidArgumentException("The key must be no more than 12");
            }
        }
    }
}
