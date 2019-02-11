package teachers;

import school.CourseInstructor;
import school.SchoolStaff;

public class MathTeacher extends SchoolStaff implements CourseInstructor {

    @Override
    public void teach() {
        System.out.println("Taught maths ...");

    }
}
