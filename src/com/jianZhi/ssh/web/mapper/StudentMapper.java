package com.jianZhi.ssh.web.mapper;

import com.jianZhi.ssh.entities.School;
import com.jianZhi.ssh.entities.Student;
import com.jianZhi.ssh.web.StudentRegister;
import org.springframework.stereotype.Component;

/**
 * @author sgyh
 */
@Component
public class StudentMapper {

    public Student toStudent(StudentRegister studentRegister) {
        Student student = new Student();
        student.setSchoolName(studentRegister.getSchoolName());
        student.setEmail(studentRegister.getEmail());
        student.setPassword(studentRegister.getPassword());
        student.setTelphone(studentRegister.getTelphone());
        student.setUsername(studentRegister.getUsername());
        student.setName(studentRegister.getName());
        return student;
    }

    public School toSchool(StudentRegister studentRegister) {
        School school = new School();
        school.setSchoolName(studentRegister.getSchoolName());
        school.setAddress(studentRegister.getAddress());
        school.setCity(studentRegister.getCity());
        school.setDistrict(studentRegister.getDistrict());
        return school;
    }

}
