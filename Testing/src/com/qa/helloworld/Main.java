package com.qa.helloworld;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //System.out.println(doubleChar("happy"));
        //System.out.println(getSandwich("bread"));

    }


    public static String doubleChar(String input) {

        String result = "";

        for (int i = 0; i< input.length(); i++){
            result += input.charAt(i) + "" + input.charAt(i) ;
        }

        return result;

    }
    public static String getSandwich(String input) {

        boolean word = false;




        String stringToRet = "";
        String variableWord ;

        if (input.length()<11){
            return "";
        }

        int start = 0;
        int end = 0;

        for (int i = 0; i < input.length() - 6; i++) {
            variableWord = input.substring(i, i + 7);


            if (variableWord.equals("bread") && word == true) {
                end = i;
            }
            if (variableWord.equals("bread") && word == false) {
                start = i + 5;
                word = true;
            }

            switch (input) {
                case "bread":
                    if (variableWord.equals("bread") && word == true) {
                        end = i;
                    }
                    if (variableWord.equals("bread") && word == false) {
                        start = i + 5;
                        word = true;
                    }
                    break;
                case "breadyy":
                    if (variableWord.equals("breadyy") && word == true) {
                        end = i;
                    }
                    if (variableWord.equals("breaddy") && word == false) {
                        start = i + 7;
                        word = true;
                    }
                    break;
                case "xxbread":
                    if (variableWord.equals("xxbread") && word == true) {
                        end = i;
                    }
                    if (variableWord.equals("xxbread") && word == false) {
                        start = i + 7;
                        word = true;
                    }
                    break;


            }
            stringToRet = input.substring(start, end);

        }
        return stringToRet;


    }

}
