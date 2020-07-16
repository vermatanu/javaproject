package com.ncu.main;

import java.io.*;
import java.util.*;
class Expense
{
	String sno;                          //
	String amount;                    // details to be entered in file
	String purpose;                   //
      File file=new File("C:\\Users\\ABC\\Desktop\\unguidedproject\\DailyExpenseCalculator\\expenses\\expense.txt");
  
    void expenseAdd()                    // function to add expense details
    {
      try{
         Scanner sc = new Scanner(System.in);
        
        
        File file=new File("C:\\Users\\ABC\\Desktop\\unguidedproject\\DailyExpenseCalculator\\expenses\\expense.txt");
    	FileWriter fw=new FileWriter(file,true); 
        
        //to inptut serial number
       
        System.out.println("enter the serial number");
        sno=sc.nextLine();
        for (int i = 0; i < sno.length(); i++) 
            fw.write("\n"+sno.charAt(i)+","); 
        
        //to imnput purpose
        System.out.println("enter the purpose of the expense");
        purpose=sc.nextLine();
         for (int i = 0; i < purpose.length(); i++) 
            fw.write(purpose.charAt(i));       
        fw.write(",");
        //to input amount
        System.out.println("enter the amount");
        amount=sc.nextLine();
          for (int i = 0; i < amount.length(); i++) 
         fw.write(amount.charAt(i));  
        fw.close(); 
        }
        catch(Exception e)
        {System.out.println(e);}
          
          System.out.println("success..");
    }

    void expenseRead()
    {
         try
         {
            FileReader fr = new FileReader(file); 
            int i; 
            while ((i=fr.read()) != -1) 
                System.out.print((char) i); 
         
          }
         catch(Exception e)
         {
             System.out.println(e);
         }
          System.out.println("success..");
    }

}

class TestExpense
{
   public static void main(String[] args)
   {
       Expense ob=new Expense();
       ob.expenseAdd();
       ob.expenseRead();
   }
}