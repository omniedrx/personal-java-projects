public class Task {
    private String description;
    private boolean completed;

    public Task(String initialDescription) {
        this.description = initialDescription;
        this.completed = false;
    }

    public void markComplete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        if (!this.completed) {
            return "[ ] " + this.description;
        } else {
            return "[X] " + this.description;
        }
    }
}
