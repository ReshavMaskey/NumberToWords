package com.example.numbertowords.logic;

public class ConvertNumberToWord {

    public String numberToWord(int number) {
        String words = "";

        String numberArray[] = {"zero", "one", "two", "three", "four", "five", "six",
                "seven", "eight", "nine", "ten", "eleven", "twelve",
                "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen"};
        String tensArray[] = {"zero", "ten", "twenty", "thirty", "forty", "fifty",
                "sixty", "seventy", "eighty", "ninety"};

        if (number == 0) {//comparing with equal
            return "zero";
        }

        if (number < 0) {
            String numberStr = "" + number;
            numberStr = numberStr.substring(1);
            System.out.println(numberStr + " vairable numberStr");
            return "minus " + numberToWord(Integer.parseInt(numberStr));
        }
        //1 million
        int million = (number / 1000000);
        if (million > 0) {
            words += numberToWord(million) + " million ";
            number %= 1000000;

        }
        //1 thousand
        int thousand = (number / 1000);
        if (thousand > 0) {
            words += numberToWord(thousand) + " thousand ";
            number %= 1000;
            System.out.println("Thousand :" + (number %= 1000));
        }
        //1 hundred
        int hundred = (number / 100);
        if (hundred > 0) {
            words += numberToWord(hundred) + " hundred ";
            number %= 100;
            System.out.println("Hundred :" + (number %= 100));
        }

        if (number > 0) {
            // check if number is within teens
            if (number < 20) {
                // fetch the appropriate value from unit array
                words += numberArray[number];
                System.out.println("words : " + (numberArray[number]));
            } else {
                // fetch the appropriate value from tens array
                words += tensArray[number / 10];

                if ((number % 10) > 0) {
                    words += "-" + numberArray[number % 10];
                }
            }
        }

        return words;
    }
}
