public class FindValueArray {
    public static void main(String[] args) {
        String[] students = {"Hung", "Hieu", "Thanh", "Khoa", "The"};
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter name student searh:");
        String input_name = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                check = true;
                break;
            }
        }
        if (!check)
            System.out.println("Not found " + input_name + " in the list.");
    }
}
