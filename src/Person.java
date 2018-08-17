//package review;
//
//public class Person implements Greeter {
////  class variable  \\
////    private String name;
////
////// prints the person's name
////    public String getName() {
////        return this.name;
////    }
////
////// changes name property to passed value
////    public void setName(String name) {
////        this.name = name;
////    }
////
////// print message to console using the person's name
////    public void sayHello() {
////        System.out.println("Hello! My name is: " + this.name);
////    }
////
////    public review.Person (String name) {
////        this.name = name;
////    }
//
//
//
//    // ========= private name props  ========= \\
//
//  private String firstName;
//  private String lastName;
//
////    private int userID;
////    private String universityAttended;
////    private boolean hasKids;
////    private double collegeGPA;
////    private static String Planet = "Earth";
//
//    public Person(){
//        //   default constructor
//    }
//
//    public Person(String firstName, String lastName){
//        if (firstName == null || firstName.equals("") || lastName == null || lastName.equals("")){
//            throw new IllegalArgumentException("Name cannot be null, or empty. Please try again.");
//        } else {
//            this.firstName = firstName;
//            this.lastName = lastName;
//        }
//
//    //    this.userID = userID;
//    //    this.hasKids = hasKids;
//    //    this.collegeGPA = collegeGPA;
//    //    this.universityAttended = universityAttended;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//
////        if (firstName == null){
////            throw new IllegalArgumentException("name cannot be null. enter another value");
////        }
//        this.firstName = firstName;
//
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
////        if (lastName == null){
////            throw new IllegalArgumentException("name cannot be null. enter another value");
////        }
//        this.lastName = lastName;
//    }
//
//
////    public String getFirstName() {
////        return firstName;
////    }
////
////    public String getLastName() {
////        return lastName;
////    }
////
////    public int getUserID() {
////        return userID;
////    }
////
////    public String getUniversityAttended() {
////        return universityAttended;
////    }
////
////    public boolean isHasKids() {
////        return hasKids;
////    }
////
////    public double getCollegeGPA() {
////        return collegeGPA;
////    }
////
////    public static String getPlanet() {
////        return Planet;
////    }
//
//    // ========= method start  ========= \\
//    public static void main(String[] args) {
//// part 1
////        review.Person p1 = new review.Person();
////        p1.setName("Frank");
////        p1.sayHello();
//
////part 2-a: code blocks
////        review.Person person1 = new review.Person("John");
////        review.Person person2 = new review.Person("John");
////        System.out.println(person1.getName().equals(person2.getName()));
////        System.out.println(person1 == person2);
//
////part 2-b: code blocks
////        review.Person person1 = new review.Person("John");
////        review.Person person2 = person1;
////        System.out.println(person1 == person2);
//
//
//
////part 2-c: code blocks
////        review.Person person1 = new review.Person("John");
////        review.Person person2 = person1;
////        System.out.println(person1.getName());
////        System.out.println(person2.getName());
////        person2.setName("Jane");
////        System.out.println(person1.getName());
////        System.out.println(person2.getName());
//
////
//
//    }
//}
//
