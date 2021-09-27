package main;

import io.cucumber.java.en.Given;

class isItNamedBarry {
    static String isItNamedBarry(String name){
        return "Barry".equals(name) ? "Yes":"No";
    }
}

