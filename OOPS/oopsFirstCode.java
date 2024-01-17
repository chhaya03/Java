class Employee {

    int id;
    long contact;
    String name;
    int salary;

    // by methods
    public void myDetails() {
        System.out.println("my id is=" + id);
        System.out.println("my name is=" + name);
        System.out.println("my number is=" + contact);
        System.out.println("my salary is=" + salary);

    }
}

class oopsFirstCode {

    public static void main(String[] args) {

        System.out.println("This is our costum class!");

        Employee chhaya = new Employee();

        // setting attribute for chhaya
        chhaya.id = 6;
        chhaya.name = "Chhayamishra";
        chhaya.contact = 7862951738l;
        chhaya.salary = 100000;

        // by normal method we can use methods concept for print details otherwise we
        // can use this method also
        // System.out.println(chhaya.id);
        // System.out.println(chhaya.name);
        // System.out.println(chhaya.contact);
        // System.out.println(chhaya.id);

        chhaya.myDetails();
    }
}