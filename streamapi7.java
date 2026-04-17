// import java.util.*;
// import java.util.stream.*;

// class Student {
//     String name;
//     int age;

//     Student(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public String getName() {
//         return name;
//     }
// }

// public class streamapi7 {
//     public static void main(String[] args) {

//         List<Student> list = Arrays.asList(
//                 new Student("Amit", 20),
//                 new Student("Neha", 22),
//                 new Student("Rahul", 21)
//         );

//         list.stream()
//             .map(Student::getName)
//             .forEach(System.out::println);
//     }
// }


// import java.util.*;
// import java.util.stream.*;

// public class streamapi7 {
//     public static void main(String[] args) {

//         List<Integer> list = Arrays.asList(10, 55, 60, 30, 80, 45);

//         List<Integer> newList = list.stream().filter(n -> n > 50).collect(Collectors.toList());

//         System.out.println("Numbers greater than 50: " + newList);
//     }
// }


// import java.util.*;
// import java.util.stream.*;

// public class streamapi7 {
//     public static void main(String[] args) {

//         List<Integer> list = Arrays.asList(-10, 5, 25, 30, -5, 15, 40);

//         List<Integer> result = list.stream().filter(n -> n > 20).collect(Collectors.toList());

//         System.out.println("Positive numbers greater than 20: " + result);
//     }
// }


// import java.util.*;
// import java.util.stream.*;
// public class streamapi7 {
//     public static void main (String [] args){
//         List<String> list = Arrays.asList("Amit", "Neha", "Ankit", "Rahul", "Akash");
//         List<String> result = list.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
// System.out.println("Strings starting with A: " + result);

//     }
// }


// import java.util.*;
// import java.util.stream.*;

// public class streamapi7 {
//     public static void main(String[] args) {

//         List<Integer> list = Arrays.asList(-10, 5, -3, 20, 0, 15, -7);

//         List<Integer> result = list.stream().filter(n -> n > 0).collect(Collectors.toList());

//         System.out.println("Positive numbers: " + result);
//     }
// }


// import java.util.*;
// import java.util.stream.*;

// public class streamapi7 {
//     public static void main(String[] args) {

//         List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35, 40);

//         List<Integer> result = list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());

//         System.out.println("Odd numbers: " + result);
//     }
// }


// import java.util.*;
// import java.util.stream.*;

// public class streamapi7 {
//     public static void main(String[] args) {

//         List<String> list = Arrays.asList("Java", "Python", "Spring", "C", "Hibernate", "Go");

//         List<String> result = list.stream().filter(s -> s.length() > 5).collect(Collectors.toList());

//         System.out.println("Strings length > 5: " + result);
//     }
// }


// import java.util.*;
// import java.util.stream.*;

// public class streamapi7 {
//     public static void main(String[] args) {

//         List<Integer> list = Arrays.asList(3, 5, 9, 10, 12, 15, 20);

//         List<Integer> result = list.stream().filter(n -> n % 3 == 0).collect(Collectors.toList());

//         System.out.println("Numbers divisible by 3: " + result);
//     }
// }


// import java.util.*;
// import java.util.stream.*;

// public class streamapi7 {
//     public static void main(String[] args) {

//         List<String> list = Arrays.asList("java", "python", "spring", "hibernate");

//         List<String> upperList = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());

//         System.out.println("Uppercase List: " + upperList);
//     }
// }


// import java.util.*;
// import java.util.stream.*;

// public class streamapi7 {
//     public static void main(String[] args) {

//         List<Integer> list = Arrays.asList(5, 10, 15, 20);

//         List<Integer> newList = list.stream().map(n -> n + 10).collect(Collectors.toList());

//         System.out.println("Updated List: " + newList);
//     }
// }