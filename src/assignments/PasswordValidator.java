package assignments;
/*
PASSWORD VALIDATOR:
validate the complexity of a proposed password
ensuring it meets these following set of rules
- Must contain an upperCase letter
- must not be less than 8 characters long
- must contain special characters
- must not contain the userName
- must not be the same as the old password
 */
import java.util.Scanner;

public class PasswordValidator {
    static Scanner scanner = new Scanner(System.in);

    //DECLARE KNOWN FIELDS;
    private String password;
    private String oldPassword;
    private String userName;
     private static int requiredLength = 8;
    public static void main (String[] args){
      PasswordValidator newUser =  new PasswordValidator();
      newUser.passWordBouncer();
    }


    //Setters
    public String setPassword (){
        System.out.println("Enter Your Password Here: ");
        password = scanner.next();
        return password;
    }

    public String setUserName (){
        System.out.println("Enter Your Username Here: ");
        userName = scanner.next().trim();
        return userName;
    }

    public String setOldPassword (){
        System.out.println("Enter Your Old Password");
        oldPassword = scanner.next();
        return oldPassword;
    }

    //Getter methods
    public String getPassword (){
        return password;
    }

    public String getUserName (){
        return userName;
    }

    public String getOldPassword(){
        return oldPassword;
    }

    private boolean isLength(){
        if(password.length() < requiredLength || password.length() == 0){
            System.out.println("Password length must not be lower than 8 characters!");
            return false;
        }
        return true;
    }

    private boolean isUppercase (){
        for (char ch :  password.toCharArray()){
            if(Character.isUpperCase(ch)){
               return true;
            }
        }
       System.out.println("Password should contain at least an uppercase letter!");
        return false;
    }

    private boolean isSpecialCharacters (){
        String specials = "!@#$%^&*()_+-={}[]|:;\"'<>,.?/~`" ;
        char[] specialChars = specials.toCharArray();
        for(char pass : password.toCharArray()){
            for(char sChar: specialChars){
                if(pass == sChar){
                    return true;
                }
            }
        }
        System.out.println("Password must contain a special character!");
        return false;
    }

    private boolean isUsernamePresent(){
        if(!password.contains(userName)){
            return true;
        }
        System.out.println("Password must not contain username!");
        return false;
    }

    private boolean isOldPassword(){
        if(!password.equals(oldPassword)){
            return true;
        }
        System.out.println("Password Must not contain Old-Password!");
        return false;
    }
    public void passWordBouncer (){
        String again;
        do {
            setUserName();
            setOldPassword();
            setPassword();

            //METHOD Returned VALUES:
            boolean checkLength = isLength();
            boolean checkUppercase = isUppercase();
            boolean checkSpecialChar = isSpecialCharacters();
            boolean checkUsername = isUsernamePresent();
            boolean checkOldUsername = isOldPassword();

            if( checkLength && checkUppercase && checkSpecialChar && checkUsername && checkOldUsername){
                System.out.println("Password Updated Successfully");
            }else{
                System.out.println("Password not updated. Please follow the correct format.");
            }
            System.out.println("Do you wish to open another account? YES/NO");
            again = scanner.next().toLowerCase();
        }while (again.contains("yes"));

    }
}
