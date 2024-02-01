package com.crypto;

import com.crypto.util.Run;

public class Main {
    public static final int COMMAND_ARGUMENT_POSITION = 0;
    public static final int FILE_PATH_ARGUMENT_POSITION = 1;
    public static final int KEY_ARGUMENT_POSITION = 2;

    public static void main(String[] args) {

        Run run = new Run();
        run.run(args);

    }
}
