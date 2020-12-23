package Lab9;
public class StudentNotFoundException extends Exception {

    StudentNotFoundException(String errorMessage){
        super(errorMessage);
    }
}