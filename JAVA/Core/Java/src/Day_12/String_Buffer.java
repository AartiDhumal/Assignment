package Day_12;

import java.util.StringTokenizer;

public class String_Buffer {

    public static void main(String[] args) {
        String name = "Coditas";
        StringBuffer stringbuffer = new StringBuffer("Coditas");

        name.concat("ELTP");
        System.out.println(name);

        stringbuffer.append("ELTP");
        System.out.println(stringbuffer);

        stringbuffer.reverse();
        System.out.println(stringbuffer);

        stringbuffer.insert(3,"Fun");
        System.out.println(stringbuffer);


        StringBuffer intern = new StringBuffer();
        StringBuffer inten1 = new StringBuffer("Hellojhgdhdhgsmdhsghfbs");
        System.out.println("Default capacity "+intern.capacity());
        System.out.println(""+inten1.capacity());


        inten1.ensureCapacity(100);
        System.out.println(inten1.capacity());

        StringTokenizer stringTokenizer = new StringTokenizer("HelloQjavaQclass how are you","Q", true);
        System.out.println(stringTokenizer.countTokens());
        while (stringTokenizer.hasMoreTokens())
            System.out.println(stringTokenizer.nextToken());
    }
}
