package com.crypto;

import com.crypto.service.BruteForceService;
import com.crypto.service.EncryptService;
import com.crypto.util.Run;

import java.io.File;

import static com.crypto.util.ImputValidation.*;

public class Main {
    private static final int COMMAND_ARGUMENT_POSITION = 0;
    private static final int FILE_PATH_ARGUMENT_POSITION = 1;
    private static final int KEY_ARGUMENT_POSITION = 2;

    public static void main(String[] args) {
        validateInput(args);
        validateCommand(args[COMMAND_ARGUMENT_POSITION]);
        validateFilePath(args[FILE_PATH_ARGUMENT_POSITION]);
        validateKey(args[KEY_ARGUMENT_POSITION]);
        Run.run(args);
    }
}
