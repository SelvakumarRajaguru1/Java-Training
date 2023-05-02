package com.mph;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ClassTest
{
  public static void main (String[] args)
  {
    Employee emp = new Employee ();
    Class c=emp.getClass ();
    System.out.println (c.getName ());
    Method[] m= c.getDeclaredMethods ();
    for (int i = 0; i < m.length; i++)
      {
        System.out.println (m[i]);
      }
    Field[] f=c.getDeclaredFields ();
    for (int i = 0; i < f.length; i++)
      {
        System.out.println (f[i]);
      }
    
    // Class object will be created only once //But 2 employee objects will be
    // created 
    Employee emp2 = new Employee();
    Class c2= emp2.getClass ();
    System.out.println (c.hashCode ());
    System.out.println (c2.hashCode ());
  }
}
