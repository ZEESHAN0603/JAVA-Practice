package Data_Type.Non_Primitive_type;

// String cls called using obj on the main method
public class string_cls {
    String StudentName;
    int StudentRegNo;
    int StudentAge;

    public static void main(String[] args) {
        string_cls obj = new string_cls();
        obj.StudentName = "Zeeshan";
        obj.StudentRegNo = 12345;
        obj.StudentAge = 20;

        System.out.println("Student Name: " + obj.StudentName);
        System.out.println("Student Registration Number: " + obj.StudentRegNo);
        System.out.println("Student Age: " + obj.StudentAge);
    }
}
