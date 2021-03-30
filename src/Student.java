/* Q.Create a java class file called Student.java. The Student.java
class should contain the following members:
        1. a private field to store the class roll number of a student,
        as a primitive byte type value.
        2. a private field to store the first name of a student, as a
        reference String type value. This should be immutable!
        3. a private field to store the last name of a student, as a
        reference String type value. This should be immutable!
        4. a private field to store the current year of a student, as a
        primitive byte type value.
        5. the necessary getter/setter methods for the private fields,
        at least two constructors for this class, the equals(),
        toString() and the hashCode() methods.

Create a java class file called PortalCredentialsCreator.java. The
class should contain the following two methods:
    1. public List<UserName> createListOfUserNames(List<Student>
       studentsList) {}
    This method inputs a list of Student type defined above, and
    creates a list of UserName type. Create a java class file
    called UserName.java and create a private field called
    userName, to store the user name of a student as a reference
    String value. No two user names in the list should be the
    same.

 */






import java.util.Objects;

public class Student {
     private int classRollNo;
     private final String firstName;
    private final String lasttName;
    private byte currentYear;

    public int getClassRollNo() {
        return classRollNo;
    }

    public void setClassRollNo(int classRollNo) {
        this.classRollNo = classRollNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public byte getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(byte currentYear) {
        this.currentYear = currentYear;
    }

    public Student(int classRollNo, String firstName, String lasttName, byte currentYear) {
        this.classRollNo = classRollNo;
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.currentYear = currentYear;
    }

    //default constructor will help us initialize default values. Null for string.
    // (har reference ki default value null hoti hai.
    public Student() {
        this.firstName="Anthony";
        this.lasttName="Gonzawis";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return classRollNo == student.classRollNo &&
                currentYear == student.currentYear &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(lasttName, student.lasttName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classRollNo, firstName, lasttName, currentYear);
    }

    @Override
    public String toString() {
        return "Student{" +
                "classRollNo=" + classRollNo +
                ", firstName='" + firstName + '\'' +
                ", lasttName='" + lasttName + '\'' +
                ", currentYear=" + currentYear +
                '}';
    }

}
