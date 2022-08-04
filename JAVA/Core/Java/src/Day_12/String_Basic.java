package Day_12;

public class String_Basic {
    public static void main(String[] args) {
        //letral way
        String name = "Coditas";

        String name1 = "ELTP";

        System.out.println("Name of firm is : "+name+" "+name1);

        String name3 = name.concat("hello");
        System.out.println(name.concat("hello"));
        System.out.println(name3);

        name = name.concat("hello");
        System.out.println(name);

        System.out.println("***********equal**************");
        //equal
        String f_name = "coditas";
        String l_name = "Coditas";
        String l_name_new = new String("Coditas");

        System.out.println(f_name.equals(l_name_new));

        System.out.println(f_name.equals(l_name_new));//check_1

        //way 2
        System.out.println(f_name == l_name);      //=== check data type
        System.out.println(f_name==l_name_new);     //check_1


        //way3
        //exact value then return 0
        //else if 1st no is greater then 2nd it return positive value
        //and vice-versa
        System.out.println(f_name.compareTo(l_name_new));
        System.out.println(f_name.compareTo(l_name));


        System.out.println("*****************************************************");
        String check_null = null;
        System.out.println(check_null.length());
    }
}
