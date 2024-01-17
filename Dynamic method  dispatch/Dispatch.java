class phone { // parent class

    public void greet() {
        System.out.println("Good morning!");
    }

    public void music() {
        System.out.println("playing music........");
    }

    public void on() {

        System.out.println("Turning on phone.......");
    }
}

class smartphone extends phone { // child class

    public void swagat() {
        System.out.println("aapka swagat hai!");
    }

    @Override

    public void on() { // method override

        System.out.println("Turning on smartphone.......");
    }

    public void music() { // method override

        System.out.println("playing music from smartphone........");
    }

}

class Dispatch {

    public static void main(String[] args) {

        // smartphone obj1=new phone(); // this method dispatch is not allowed

        phone obj = new smartphone(); // is allowed (reference of parent class is eqaul to object of child class)

        // obj.swagat(); it can not be run coz only runs overriden method

        obj.on();
        obj.greet();
        obj.music();

    }
}