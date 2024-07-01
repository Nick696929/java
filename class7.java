class class7 {

    public static void main(String[] args) {
        char gender = 'F';
        int age = 2;
        if (gender == 'M') {
            if (age >= 23) {
                System.out.println("Eligible for marriage");
            } else {
                System.out.println("not Eligible for marriage");
            }

        } else if (gender == 'F') {
            if (age >= 18) {
                System.out.println("Eligible for marriage");
            } else {
                System.out.println("not Eligible for marriage");
            }
        }
    }
}