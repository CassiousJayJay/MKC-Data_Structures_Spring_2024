public class CS61B {
    public static String university;
    public String  semester;
    public CS61BStudent[] students;
    public int capacity;

        // Constructor
    public CS61B(int capacity, String semester, CS61BStudent[] signups){
        this.semester = semester;
        this.capacity = capacity;
        this.students = signups;
//        this.students = new CS61BStudent[capacity];
//        for (int i = 0; i < capacity; i++){
//            this.students[i] = signups[i];
//        }
    }
    //Method (part c)
    /**
     Makes every CS61BStudent enrolled in this semester of the course watch lecture.
     */
    public void makeStudentWatchLecture(){
        for(int i = 0; i < capacity; i++){
            students[i].watchLecture();
        }
    }

    /**
     Takes in a new university called newUniversity and changes the university for all semesters of CS61B to newUniversity
     */
    public static void changeUniversity( String newUniversity){
        university = newUniversity;

    }
    //Expand the course to the given capacity
    public void expand(int newCapacity){
        this.capacity = newCapacity;
    }
}

