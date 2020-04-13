package day19;

public class JavaMethodReturnType2 {

    //Michael Jackson
    //initials: M. J.


    public static void main(String[] args) {
        String firstName = "Michael";
        String lastName = "Jackson";

        String nameInitial = initial(firstName);
        String surnameInitial = initial(lastName);
        System.out.println(nameInitial + surnameInitial);

        System.out.println(initial("Furkat") + initial("Ali"));
        System.out.println(initial("Yusuf") + initial("Esenboga"));
    }

    private static String initial(String name) {
        return name.charAt(0) + ".";
    }

}
