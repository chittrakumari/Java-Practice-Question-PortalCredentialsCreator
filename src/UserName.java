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

public class UserName {
    private String userName;

    public UserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserName userName1 = (UserName) o;
        return Objects.equals(userName, userName1.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName);
    }

    @Override
    public String toString() {
        return "UserName{" +
                "userName='" + userName + '\'' +
                '}';
    }
}

