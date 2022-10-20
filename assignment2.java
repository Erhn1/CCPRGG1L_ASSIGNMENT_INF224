public class assignment2 {
    public static void main(String[] args) throws Exception {

        //1. Use a while loop to print your FIRSTNAME three times.
        
        System.out.println ("1. Using while loop");
        int firstName = 0;
        while (firstName != 3) {
            System.out.println ("CHARLES");
            firstName ++;
        }

        //2. Use a do-while loop to print your MIDDLENAME four times.
        
        System.out.println ("2. Using do-while loop");
        
        int middleName = 0;
        do {
            System.out.println ("SIA");
            middleName ++;
        } while (middleName != 4);

        //3. Use a for loop to print your SURNAME five times.

        System.out.println ("3. Using for loop");
        
        for (int surName = 0; surName != 5; surName ++) {
            System.out.println ("ALEJAGA");
        }
        
        //4. Create a char array that consists all of the characters of your FIRSTNAME and use a for loop to print each character of your FIRSTNAME.

        System.out.println ("4. Array and for loop");
        
        char[] firstNameArr = {'C','H','A','R','L','E','S'};
        for (int firstNameChar = 0; firstNameChar < firstNameArr.length; firstNameChar ++) {
            System.out.println (firstNameArr[firstNameChar]);
        }
        
        //5. Use a for loop to print the char array of your FIRSTNAME in REVERSE order.

        System.out.println ("5. Reverse using for loop");
        
        char[] firstNameReV = {'C','H','A','R','L','E','S'};
        for (int rev = firstNameReV.length-1; rev >= 0; rev --) {
            System.out.println (firstNameReV[rev]);
        }
    
    }
}
