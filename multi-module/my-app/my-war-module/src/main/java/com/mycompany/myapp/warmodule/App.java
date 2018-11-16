package com.mycompany.myapp.warmodule;
 
import com.mycompany.myapp.jarmodule.Core;
 
public class App {
 
    public String retrieveTime() {
 
        return String.format("The time is %s", Core.currentTime());
    }
}