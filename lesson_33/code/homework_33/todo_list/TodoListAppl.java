package homework_33.todo_list;

import java.util.Scanner;

public class TodoListAppl {
    public static void main(String[] args) {
        System.out.println("Welcome to your to-do list");

        boolean flag = true;
        TodoList[] todoLists = TodoList.values();
        Scanner scanner = new Scanner(System.in);

        while (flag){
            System.out.println("Input your choice: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1, 2, 3, 4 -> {
                    System.out.println("Your choice is: " + todoLists[choice - 1].getTask());
                }
                case 5 -> flag = false;
                default -> System.out.println("Wrong choice");

            }








        }







    }






}
