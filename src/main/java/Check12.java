import com.cryptohash.Day;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.util.Locale;

public class Check12 {
    public static void main(String[] args) {

        Runtime.Version version = Runtime.version();
        System.out.println(version.version());
        System.out.println(version.feature());
        System.out.println(version.interim());
        System.out.println(version.update());
        System.out.println(version.patch());

        /**
         * Switch Expression
         */
        int day = 2;
        String s = switch (day) {
            case 1, 2, 3, 4, 5 -> "weekday";
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };
        System.out.println(s);

        Day d = Day.SUNDAY;
        String ss = switch (d) {
            case MONDAY, TUESDAY, WEDNESDAY:
                break "weekday";
            default:
                break "NOT DEFINED";
        };

        System.out.println(ss);


        /**
         * Files.mismatch()---> is same return -1 else return index of mismatch character
         */

        try {
            Path path1 = Files.writeString(Files.createTempFile("nil", ".txt"), "This is nilesh");
            Path path2 = Files.writeString(Files.createTempFile("nilesh", ".txt"), "This is nilesh");
            long mismatch = Files.mismatch(path1, path2);
            System.out.println("MisMatch ?");
            System.out.println(mismatch);
            Files.deleteIfExists(path1);
            Files.deleteIfExists(path2);

            Path path11 = Files.writeString(Files.createTempFile("nil", ".txt"), "This is nilesh ");
            Path path22 = Files.writeString(Files.createTempFile("nilesh", ".txt"), "This is nilesh");
            System.out.println(Files.mismatch(path11,path22));
            Files.deleteIfExists(path11);
            Files.deleteIfExists(path22);
        } catch (IOException e) {
            e.printStackTrace();
        }


        /**
         * Number Format in Short and Long like M for million
         */


        NumberFormat upVote = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        upVote.setMaximumFractionDigits(2);
        System.out.println(upVote.format(1231223));


        NumberFormat upVoteLong = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);
        upVoteLong.setMaximumFractionDigits(2);
        System.out.println(upVoteLong.format(1231223));






    }
}
