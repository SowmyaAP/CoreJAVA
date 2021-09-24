class primitiveToNonPrimitive{

public static void main(String[] value)
{
int age=12;
Integer converter=Integer.valueOf(age);
System.out.println(converter);
double numbers=15868965;
Double converter1=Double.valueOf(numbers);
System.out.println(converter1);
char gender='F';
Character converter2=Character.valueOf(gender);
System.out.println(converter2);
float marks=78;
Float converter3=Float.valueOf(marks);
System.out.println(converter3);
boolean val= true;
Boolean converter4=Boolean.valueOf(val);
System.out.println(converter4);
long phoneNo=1234567890;
Long converter5=Long.valueOf(phoneNo);
System.out.println(converter5);
short noOfStudents=100;
Short converter6=Short.valueOf(noOfStudents);
System.out.println(converter6);
byte number=123;
Byte converter7=Byte.valueOf(number);
System.out.println(converter7);

}

}