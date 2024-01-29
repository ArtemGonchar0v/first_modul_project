package com.crypto.util;

import com.crypto.service.BruteForceService;
import com.crypto.service.DecryptService;
import com.crypto.service.EncryptService;

import java.io.File;

import static com.crypto.Main.*;
import static com.crypto.model.Mode.*;
import static com.crypto.util.ImputValidation.*;
import static com.crypto.util.ImputValidation.validateKey;

public class Run {
    private static EncryptService encryptService = new EncryptService();
    private static DecryptService decryptService = new DecryptService();
    private static BruteForceService bruteForceService = new BruteForceService();
    public static void run (String[] args){
        validateInput(args);
        validateCommand(args[COMMAND_ARGUMENT_POSITION]);
        validateFilePath(args[FILE_PATH_ARGUMENT_POSITION]);
        validateKey(args[KEY_ARGUMENT_POSITION]);

        if (args[0].equals(ENCRYPT.toString())){
            encryptService.encrypt(new File(args[1]), Integer.parseInt(args[2]));
        }
        else if (args[0].equals(DECRYPT.toString())){
            decryptService.decrypt(new File(args[1]), Integer.parseInt(args[2]));
        }
        else {
            bruteForceService.decrypt(new File(args[1]));
        }
    }
}
