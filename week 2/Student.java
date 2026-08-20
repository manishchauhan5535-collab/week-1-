class Student {
   
    String name;
    int rollNo;
    String course;

   
    void displayInfo() {
        System.out.println("Student Information");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        
        Student s1 = new Student();

        
        s1.name = "Manish Kumar";
        s1.rollNo = 101;
        s1.course = "B.Tech CSE";

        
        s1.displayInfo();
    }
}