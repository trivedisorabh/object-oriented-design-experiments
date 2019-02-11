package teachers;

import school.CourseInstructor;
import school.SchoolStaff;

public class ScienceTeacher extends SchoolStaff implements CourseInstructor {

    @Override
    public void teach() {
        System.out.println("Taught science ...");

    }
}
