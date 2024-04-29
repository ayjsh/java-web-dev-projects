package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y)
    {
        // Write code here!
        int solution = 0;
        try {
            solution = x / y;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("ERROR");
            return;
        }
        System.out.println(solution);
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        int lastIndexOfDot = fileName.lastIndexOf('.');
        if (fileName.isBlank()) {
            try {
                throw new FileException("File is Null");
            } catch (FileException e) {
                e.printStackTrace();
                return -1;
            }
        } else if (fileName.substring(lastIndexOfDot + 1).equals("java")) {
            return 1;
        }
        return 0;
    }
}