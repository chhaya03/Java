class mynewEmployee {

    private int id;
    private String name;

    public mynewEmployee() { // constructor

        id = 45;
        name = "chhaya";
    }

    public mynewEmployee(int id) { // constructor

        id = 4;
        name = "chhayaMI";
    }

    public String getName() {

        return name;
    }

    public int getId() {
        return id;
    }

}

class constructor {

    public static void main(String[] args) {

        mynewEmployee shraddha = new mynewEmployee();

        System.out.println("name is=" + shraddha.getName());
        System.out.println("id is=" + shraddha.getId());

    }
}