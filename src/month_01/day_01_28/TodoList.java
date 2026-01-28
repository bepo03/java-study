package month_01.day_01_28;

import java.util.ArrayList;

class Todo {
    private String task;
    private boolean completed;

    public Todo(String task) {
        this.task = task;
        this.completed = false;
    }

    public void complete() {
        this.completed = true;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public String getTask() {
        return this.task;
    }

    @Override
    public String toString() {
        return (this.completed ? "[완료] " : "[미완료] ") + this.task;
    }
}

public class TodoList {
    private ArrayList<Todo> todos = new ArrayList<>();

    public void add(String task) {
        this.todos.add(new Todo(task));
    }

    public void complete(int index) {
        if (index >= 0 && index < this.todos.size()) {
            this.todos.get(index).complete();
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < this.todos.size()) {
            this.todos.remove(index);
        }
    }

    public void printAll() {
        System.out.println("=== 할일 목록 ===");
        for (int i = 0; i < this.todos.size(); i++) {
            System.out.printf("%d. %s\n", i, this.todos.get(i));
        }
    }

    public static void main(String[] args) {
        TodoList list = new TodoList();

        list.add("Java 공부하기");
        list.add("Spring 예제 실습");
        list.add("알고리즘 문제 풀기");

        list.printAll();

        list.complete(0);
        list.complete(2);

        System.out.println("\n완료 후:");
        list.printAll();
    }
}
