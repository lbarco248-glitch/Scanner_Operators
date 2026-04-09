package com.projectmoonfan;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[]arg)
{
    Scanner scanner =  new Scanner(System.in);
    System.out.print("First Name: ");
    String name = scanner.nextLine();
    System.out.println("Hello " + name);
}
}
