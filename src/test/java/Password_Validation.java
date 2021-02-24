import sun.security.util.Password;

public class Password_Validation {

   /* String -- Password Validation Task
Write a return method that can verify if a password is valid or not. requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit

if all requirements above are met, the method returns true, otherwise returns  false

    Solution 1:
    */

    public static void main(String[] args) {
        System.out.println("PassWordvalidation(\"Nepomnu155!\") = " + PassWordvalidation("Nepomnu155!"));
    }

    public static boolean PassWordvalidation(String password) {

        String lowercase="(.*[a-z].*)";

        String uppercase="(.*[A-Z].*)";

        String numbers="(.*[0-9].*)";

        String specialchars="(.*[ -/, :-@].*)";

        boolean  HasLower = password.matches(lowercase), //This method tells whether or not this string matches the given regular expression

                HasUppere = password.matches(uppercase),

                HasDigits = password.matches(numbers),

                HasSpecial = password.matches(specialchars),

                Valid = false;

        if(password.length() >= 6 && !password.contains(" "))

            if( HasLower && HasUppere && HasDigits && HasSpecial)

                Valid = true;

        return Valid;

    }
}
