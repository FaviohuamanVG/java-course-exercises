package com.app.Understanding_Package_Declarations_and_Imports.Redundant_Imports;

import java.lang.System; // Redundante (java.lang se importa solo)
import java.lang.*;      // Redundante (java.lang se importa solo)
import java.util.Random;
import java.util.*;      // Redundante (Random ya está importado arriba)

public class ImportExample {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}