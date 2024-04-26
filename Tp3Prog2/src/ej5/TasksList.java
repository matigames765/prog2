package ej5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

public class TasksList implements Iterable<Task>{

    private ArrayList<Task> tasks;

    public TasksList() {
        this.tasks = new ArrayList<>();
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTasks(Task task){
        tasks.add(task);
    }

    public void removeTask(Task task){
        tasks.remove(task);
    }

    public int numberOfTasks(){
        return tasks.size();
    }

    public Iterator<Task> iterator(){
        return new MyIterator();
    }

    public void orderList(){
        Collections.sort(tasks,Comparator.comparingInt(Task::getPriority).reversed());
    }

    public void showList(){
        for (Task task : tasks){
            System.out.println("Descripcion: " + task.getDescription() + ", Prioridad: " + task.getPriority());
        }
    }

    public void removeByDescription(String description){
        Task removeTask = null;
        for (Task task : tasks){
            if (task.getDescription().toLowerCase().equals(description.toLowerCase())){
                removeTask = task;
            }
        }
        tasks.remove(removeTask);
    }

    private class MyIterator implements Iterator<Task>{
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < tasks.size();
        }

        @Override
        public Task next() {
            return tasks.get(index++);
        }
    }
}
