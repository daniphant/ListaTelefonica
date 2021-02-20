public class PhoneNumber {
    static final char[] allowedCharsInPhoneNumber = new char[] {'1','2', '3', '4', '5', '6', '7', '8', '9', '(', ')', ' ', '+', '-', '#', '*'};
     
    public static boolean isValidPhoneNumber(String number) {
        boolean digitIsValid = false;
        
        for(char phoneDigit : number.toCharArray()) {
            for(int i = 0; i < allowedCharsInPhoneNumber.length; i++) {
                if(phoneDigit == allowedCharsInPhoneNumber[i])
                    digitIsValid = true;
            }
            if (!digitIsValid) return false;
        }
        
        return true;        
    }
}
