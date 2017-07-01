package Entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zby on 2017/6/29.
 */
public class Student implements Serializable {
    private List<String> courses;

    public Student() {
        super();
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }
}
