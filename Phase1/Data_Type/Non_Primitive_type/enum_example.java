package Data_Type.Non_Primitive_type;

// Enum means a special "class" that represents a group of constants (unchangeable variables, like final variables).
enum enum_cls {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class enum_example {
    public static void main(String[] args) {
        enum_cls day = enum_cls.MONDAY;
        System.out.println("Day: " + day);
    }
}
