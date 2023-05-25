import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Task 1
        /*
        Staff staff = new Staff();
        staff.initialize1();
        System.out.println("\nStaff Details:");
        staff.print1();

        staff.salaryToPay(160, 40);
        staff.salaryForOvertime(45, 10.0);

        boolean shouldReceiveBonus = Salary.shouldReceiveBonus(5);
        System.out.println("Should Receive Bonus: " + shouldReceiveBonus);

         */

        //Task 2
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Buddy", 3, 10.5);
        animals[1] = new Pigeon("Pidgey", 2, 1.5, "Gray", "Rock Dove");
        animals[2] = new Blowfish("Spike", 1, 0.2);



    }
}


/*
Interfaces are made for showing what is going on in class but not realize it. For example we create an interface with classes that we can
 */

interface Salary{
    void salaryToPay(int hours, double rate);

    default void salaryForOvertime(int hours, double rate) {
        double overtimePay = (hours - 40) * rate * 1.5;
        System.out.println("Overtime Pay: " + overtimePay);
    }

    static boolean shouldReceiveBonus(int yearsOfExperience) {
        return yearsOfExperience >= 5;
    }
}


//                      Code from task1 in exercise 7 file with changes

    class Person {
        protected String surname, firstName, street, zipCode, city;

        public void initialize() {          // creating constructor
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter surname: ");
            surname = sc.nextLine();
            System.out.print("Enter first name: ");
            firstName = sc.nextLine();
            System.out.print("Enter street: ");
            street = sc.nextLine();
            System.out.print("Enter zip code: ");
            zipCode = sc.nextLine();
            System.out.print("Enter city: ");
            city = sc.nextLine();
        }

        public void print() {                    // giving information about class
            System.out.println("Surname: " + surname);
            System.out.println("First name: " + firstName);
            System.out.println("Street: " + street);
            System.out.println("Zip code: " + zipCode);
            System.out.println("City: " + city);
        }

    }


class Staff extends Person implements Salary {
    private String education;
    private String position;

    @Override
    public void salaryToPay(int hours, double rate) {
        double salary = hours * rate;
        System.out.println("Salary: " + salary);
    }

    public void initialize1() {
        initialize();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter education: ");
        education = scanner.nextLine();
        System.out.print("Enter position: ");
        position = scanner.nextLine();
    }

    public void print1() {
        print();

        System.out.println("Education: " + education);
        System.out.println("Position: " + position);
    }
}


//                          Task2
