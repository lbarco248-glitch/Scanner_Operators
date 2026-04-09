package com.projectmoonfan;

public class notes {
    public static void main(String[] args) {
        int id = 10134;
        String name = "Angel";
        float salary = 5235.8834f;

        String message = String.format("Luis %s id:%d Salary:$%.2f", name, id, salary);
        System.out.println(message);

        System.out.printf("Luis %s id:%d Salary:$%.2f", name, id, salary);
        // By right-clicking a variable, we can rename all instances of said variable.
    }
}
