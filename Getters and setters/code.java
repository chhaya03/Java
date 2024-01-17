class myEmployee {

    private int id;
    private String name;

    public String getName() {

        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

}

class code {

    public static void main(String[] args) {

        myEmployee shraddha = new myEmployee();

        // shraddha.id = 5656;
        // shraddha.name = "CodeWithShraddha"; // throws an error due to private access
        // modifier

        shraddha.setName("nCodeWithShraddha");
        System.out.println("name is=" + shraddha.getName());
        shraddha.setId(56565);
        System.out.println("name is=" + shraddha.getId());

    }
}