package com.crypto;

import com.crypto.service.BruteForceService;
import com.crypto.service.EncryptService;
import com.crypto.util.Run;

import java.io.File;

import static com.crypto.util.ImputValidation.*;

public class Main {
    public static final int COMMAND_ARGUMENT_POSITION = 0;
    public static final int FILE_PATH_ARGUMENT_POSITION = 1;
    public static final int KEY_ARGUMENT_POSITION = 2;

    public static void main(String[] args) {

        Run.run(args);

    }
}
