package com.crypto.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BruteForceHelper {
    public Integer getBruteForceKey(String value) {
        Map<Integer, String> keys = bruteForceSymbols();
        ArrayList<Integer> keySet = new ArrayList<>(keys.keySet());
        for (Integer key : keySet) {
            String str = keys.get(key);
            if (key != 0 && value.equals(str)) {
                    return key;
            }
        }
        return null;
    }

    public String addBruteForce(int key) {
        Map<Integer, String> keys = bruteForceSymbols();
        String bruteForce = keys.get(key);
        return bruteForce;
    }

    private Map<Integer, String> bruteForceSymbols() {
        Map<Integer, String> keyMap = new HashMap<>();
        keyMap.put(1, "!");
        keyMap.put(2, "@");
        keyMap.put(3, "#");
        keyMap.put(4, "$");
        keyMap.put(5, "%");
        keyMap.put(6, "^");
        keyMap.put(7, "&");
        keyMap.put(8, "*");
        keyMap.put(9, "(");
        keyMap.put(10, ")");
        keyMap.put(11, "_");
        keyMap.put(12, "+");
        return keyMap;
    }
}
