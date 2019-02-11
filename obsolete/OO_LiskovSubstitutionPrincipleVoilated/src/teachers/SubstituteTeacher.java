package teachers;

public class SubstituteTeacher extends Teacher{

    /**
     * As we know that the substitute teacher doesn't teach any new lesson, so providing
     * the implementation for the same is of no use and voilates LSP. So just add a degenerate 
     * method like do-nothing or return null in this scenario.
     */
    
    @Override
    public void teach() {
        // These are Anti Patterns
        // Do nothing ... or by throwing some exception
        
        //throw new CannotTeachException();// for this we need to add throw clause to the abstract function,
        // which can become pain in the ass.
    }
}
