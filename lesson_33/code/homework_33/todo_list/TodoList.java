package homework_33.todo_list;

public enum TodoList {
    CLE("Clean the house", 1),COO("Cook food",2),
    WAS("Wash clothes",3),PLA("Play music",4)
    ;


    private String task;
    private int choice;

    TodoList(String task, int choice) {
        this.task = task;
        this.choice = choice;
    }

    public String getTask() {
        return task;
    }

    public int getChoice() {
        return choice;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TodoList{");
        sb.append("task='").append(task).append('\'');
        sb.append(", choice=").append(choice);
        sb.append('}');
        return sb.toString();
    }
}
