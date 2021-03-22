package RegularExpressions;
import java.util.*;
import java.util.regex.Pattern;
public class MobileNumberValidate {
	public static void main(String[] args) {

		System.out.println(Pattern.matches("[789]{1}[0-9]{9}","8501862893"));
		System.out.println(Pattern.matches("[^abc]?","u"));
		System.out.println(Pattern.matches("[abc]?","c"));
		System.out.println(Pattern.matches("[^abc]+","ua"));
	}
}
