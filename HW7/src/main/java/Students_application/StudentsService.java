package Students_application;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {
    private StudentsRep studentsRep;

    @Autowired
    public void setStudentsRep(StudentsRep studentsRep) {
        this.studentsRep = studentsRep;
    }

    public Students saveOrUpdate(Students student) {
        return studentsRep.save(student);
    }

    public Students findById(Long id) {
        return studentsRep.findById(id).orElseThrow(() -> new RuntimeException("Can't found student with id = " + id));
    }

    public List<Students> findAll() {
        return studentsRep.findAll();
    }

    public void deleteAll() {
        studentsRep.deleteAll();
    }

    public void deleteById(Long id) {
        studentsRep.deleteById(id);
    }

    public boolean existsById(Long id) {
        return studentsRep.existsById(id);
    }

}