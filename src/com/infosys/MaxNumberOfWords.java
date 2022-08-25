package com.infosys;

public class MaxNumberOfWords {
    public static void main(String[] args) {
        String [] sentence = {"please wait", "continue to fight", "continue to win"};
        System.out.println(mostWordsFound(sentence));
    }
    static int mostWordsFound(String[] sentences) {
        int words = 0;
        for (int i = 0; i < sentences.length; i++){
            String[] wordCount = sentences[i].split(" ");
            if (wordCount.length > words){
                words=wordCount.length;
            }

        }

        return words;
    }

}
