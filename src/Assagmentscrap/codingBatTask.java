package Assagmentscrap;

public class codingBatTask {
    public static void main(String[] args) {

    }

    public int sumNumbers(String str) {

        int sum = 0;
        out:
        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                String temp = "";
                temp += str.charAt(i);
                for (int j = i + 1; j < str.length(); j++) {
                    if (Character.isDigit(str.charAt(j))) {
                        if (j == str.length() - 1) {
                            // break out;
                            i = j + 1;
                        }
                        temp += str.charAt(j);
                    } else {
                        i = j;
                        break;
                    }

                }

                sum += Integer.valueOf(temp);
            }


        }
        return sum;
    }

}

//Given a string, return the sum of the numbers appearing in the string, ignoring
// all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char)
// tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
//sumNumbers("abc123xyz") → 123
//sumNumbers("aa11b33") → 44
//sumNumbers("7 11") → 18

