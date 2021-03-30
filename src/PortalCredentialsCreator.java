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







import java.util.ArrayList;
import java.util.List;
public class  PortalCredentialsCreator {
     public List<UserName> createListOfUserNames(List<Student>
                                                          studentsList) {
         List<UserName> userNameList=new ArrayList<>();
         for (Student k:studentsList) {
             int classRollNumber=k.getClassRollNo();
             String firstName=k.getFirstName();
             byte currentYear=k.getCurrentYear();
             String lastName=k.getLasttName();
             String username=String.format("%d","%d","%s","%s",classRollNumber,currentYear,firstName,lastName);
             UserName un=new UserName(username);

         }


         return userNameList;
    }
        
}
