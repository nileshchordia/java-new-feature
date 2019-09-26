import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Check11 {
    public static void main(String[] args) throws IOException {
        /**
         * String new method
         * isBlank() and isEmpty() and line()
         */
        String blankString="   ";
        System.out.println(blankString.isBlank());
        String nonBlankString="Nilesh";
        System.out.println(nonBlankString.isBlank());
        System.out.println(blankString.isEmpty());
        String emptyString="";
        System.out.println(emptyString.isEmpty());
        String files="NILESH\nnilesh\nNILESH";
        List<String> collect = files.lines().collect(Collectors.toList());
        System.out.println(collect);


        /**
         * strip(),stripLeading() and stripTrailing()
         */

        String linesWithSpace=" NILESH ";
        System.out.print("START");
        System.out.print(linesWithSpace.strip());
        System.out.println("END");
        System.out.print("START");
        System.out.print(linesWithSpace.stripLeading());
        System.out.println("END");
        System.out.print("START");
        System.out.print(linesWithSpace.stripTrailing());
        System.out.println("END");

        System.out.print("START");
        System.out.print(linesWithSpace.trim());
        System.out.println("END");

        /**
         * repeat
         */

        String repeat = "=".repeat(2);
        System.out.println(repeat);


        /*
        *local variable type inference
         */

        var strings = new ArrayList<>();
        strings.add("nilesh");
        strings.add("jain");
        System.out.println(strings);


        /**
         * writeString  and readString
         */

        Path path = Files.writeString(Files.createTempFile("nil", ".txt"), "This is nilesh");
        System.out.println(path);
        String s = Files.readString(path);
        System.out.println(s);

    }
}
