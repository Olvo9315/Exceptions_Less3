public class Person {
    private String lastName;
    private String firstName;
    private String middleName;
    private String birthdate;
    private long phoneNumber; 
    private char gender;
    
    public Person(String lastName, String firstName, String middleName, String birthdate, long phoneNumber, char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthdate = birthdate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return String.format("<%s><%s><%s><%s><%s><%s>", lastName, firstName, middleName, birthdate, phoneNumber, gender);
    }
}