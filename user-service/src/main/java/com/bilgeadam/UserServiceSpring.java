package com.bilgeadam;

import com.bilgeadam.repository.*;
import com.bilgeadam.repository.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class UserServiceSpring implements CommandLineRunner {

    private final IBranchRepository iBranchRepository;
    private final ICourseRepository iCourseRepository;
    private final IEmployeeRepository iEmployeeRepository;
    private final IStudentRepository iStudentRepository;
    private final ITeacherRepository iTeacherRepository;
    private final ITopicRepository iTopicRepository;

    public UserServiceSpring(IBranchRepository iBranchRepository, ICourseRepository iCourseRepository,
                             IEmployeeRepository iEmployeeRepository, IStudentRepository iStudentRepository,
                             ITeacherRepository iTeacherRepository, ITopicRepository iTopicRepository) {
        this.iBranchRepository = iBranchRepository;
        this.iCourseRepository = iCourseRepository;
        this.iEmployeeRepository = iEmployeeRepository;
        this.iStudentRepository = iStudentRepository;
        this.iTeacherRepository = iTeacherRepository;
        this.iTopicRepository = iTopicRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserServiceSpring.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Student student = Student.builder().firstname("Veli").province("Istanbul").build();
        iStudentRepository.save(student);


    }
}
