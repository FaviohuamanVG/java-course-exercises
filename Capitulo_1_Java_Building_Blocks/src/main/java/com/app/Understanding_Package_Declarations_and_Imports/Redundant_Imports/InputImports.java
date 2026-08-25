package com.app.Understanding_Package_Declarations_and_Imports.Redundant_Imports;

import java.nio.file.*; // import con wildcard

public class InputImports {
    public void read(Files files) {
        Paths.get("name");
    }
}