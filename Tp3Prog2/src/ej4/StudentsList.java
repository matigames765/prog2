package ej4;
import java.util.ArrayList;

public class StudentsList {

    private ArrayList<Student> students;

    public StudentsList() {
        this.students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void showList(){
        for (Student student : students){
            System.out.println("Nombre: " + student.getName() + ", Edad: " + student.getAge() + ", Nota: " + student.getNote());
        }
    }

    public void calculateTheHalf(){
        double noteAddition = 0;
        for (Student student : students){
            noteAddition += student.getNote();
        }

        System.out.println("La media de los alumnos es: " + (noteAddition / students.size()));
    }

    public void greaterNoteStudent(){
        double greaterNote = 0.0;
        Student bestNoteStudent = null;
        for (Student student : students){
            if (student.getNote() > greaterNote){
                greaterNote = student.getNote();
                bestNoteStudent = student;
            }
        }

        System.out.println("El alumno con la mayor nota es " + bestNoteStudent.getName());
    }

    public void searchStudent(String name){
        for (Student student : students){
            if (student.getName().equals(name)){
                System.out.println("Nombre: " + student.getName() + ", Edad: " + student.getAge() + ", Nota: " + student.getNote());
            }
        }
    }
}
