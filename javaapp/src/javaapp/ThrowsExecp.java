package javaapp;
class ThrowsExecp { 
 
    static void fun() throws Exception 
    { 
        System.out.println("Inside fun() "); 
        throw new Exception("demo"); 
    } 
    public static void main(String args[]) 
    { 
        try { 
            fun(); 
        } 
        catch (Exception e) { 
            System.out.println("caught in main."); 
        } 
    } 
} 
