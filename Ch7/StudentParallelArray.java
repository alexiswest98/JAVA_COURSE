package Ch7;

public class StudentParallelArray {
    // Parallel arrays to store student data
    private String[] names;
    private int[] ids;
    private double[] grades;
    private int size;

    // Constructor to initialize arrays with a given capacity
    public StudentParallelArray(int capacity) {
        names = new String[capacity];
        ids = new int[capacity];
        grades = new double[capacity];
        size = 0;
    }

    // Method to add a new student
    public void addStudent(String name, int id, double grade) {
        if (size < names.length) {
            names[size] = name;
            ids[size] = id;
            grades[size] = grade;
            size++;
        } else {
            System.out.println("No more space to add new students.");
        }
    }

    // Method to print student information
    public void printStudents() {
        System.out.println("Student Information:");
        for (int i = 0; i < size; i++) {
            System.out.println("Name: " + names[i] + ", ID: " + ids[i] + ", Grade: " + grades[i]);
        }
    }

    // Method to get the grade of a student by ID
    public double getGradeById(int id) {
        for (int i = 0; i < size; i++) {
            if (ids[i] == id) {
                return grades[i];
            }
        }
        return -1; // Return -1 if student not found
    }

    public static void main(String[] args) {
        StudentParallelArray studentList = new StudentParallelArray(3);

        studentList.addStudent("Alice", 101, 85.5);
        studentList.addStudent("Bob", 102, 90.2);
        studentList.addStudent("Charlie", 103, 78.4);

        studentList.printStudents();

        int searchId = 102;
        System.out.println("Grade for student with ID " + searchId + ": " + studentList.getGradeById(searchId));
    }
}
