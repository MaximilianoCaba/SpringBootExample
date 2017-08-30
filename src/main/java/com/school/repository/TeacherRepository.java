package com.school.repository;

import com.school.domain.Teacher;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface TeacherRepository extends CrudRepository<Teacher, Long> {

    List<Teacher> findAll();
}
