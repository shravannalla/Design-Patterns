package com.company;
import com.mobile.*;

public class Main
{
    public static void main(String args[])
    {
        OsFactory osf=new OsFactory();
        OS obj = osf.getInstance("Closed");
        obj.spec();
    }
}