package com.example;

import com.example.model.Todo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Todo objToDo= new Todo("Ghulam Mozammil");
        System.out.println(objToDo.getTodoName());
    }
    
    
}
