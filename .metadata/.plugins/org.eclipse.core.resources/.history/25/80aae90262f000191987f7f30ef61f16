package business;

public class Student implements Comparable {

    private String firstName;
    private String lastName;
    private double score;

    public Student(String firstName, String lastName, double score) {
        this.firstName = firstName;
        this.score = score;
        this.lastName = lastName;
    }

    // Get & Set Methods
    public double getstudentScore() {
        return score;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
        }
    

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;

        if (s.lastName.equals(lastName)) {
            return firstName.compareToIgnoreCase(s.firstName);
        } else {
            return lastName.compareToIgnoreCase(s.lastName);}
            }
            

    public String toString() {
        return lastName + ", " + firstName + ": " + score;
    }
        }
        	
        