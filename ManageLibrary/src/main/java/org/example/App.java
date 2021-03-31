package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Managelibrary ma = new Managelibrary("123","vananh",1000);
        ManageBook ma = new ManageBook ("123","vananh",1000,"ducthinh",100);
        System.out.println(ma.Display());

    }
}
