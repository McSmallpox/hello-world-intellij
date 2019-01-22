package edu.cnm.deepdive.prework;

public class HelloWorld {

  public static void main(String[] args)
  {
      String greeting = salutation(args);
      salute(salutation);
  }
private static String salutation(String args)
{
return "Hello, " + ((args.length > 0) ? args[0] : "World");
}
  private static void salute(String target)
{
  System.out.println("Hello, " + target + "!");
}
}
