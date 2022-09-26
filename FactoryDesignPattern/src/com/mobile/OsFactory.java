package com.mobile;

public class OsFactory {
    public OS getInstance(String str) {
        if (str.equals("Open"))
            return new Android();
        else if (str.equals("Closed"))
            return new ios();
        else
            return new windows();
    }
}
