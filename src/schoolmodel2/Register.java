package schoolmodel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Register {
    private List<Student> students;

    public Register(List<Student> students) {
        this.students = students;
    }

    public List<String> getRegister(){
        List<String> studentNames = new ArrayList<>();
        for(Student student: students){
            studentNames.add(student.getName());
        }

        return studentNames;
    }

    public List<String> getRegisterByLevel(Level level){
        List<String> studentLevelNames = new ArrayList<>();
        for(Student student: students){
            if(student.getLevel() == level){
                studentLevelNames.add(student.getName());
            }
        }
        return studentLevelNames;

    }
}
