package com.edifecs.wordprocessor;

import org.apache.commons.io.IOUtils;

import java.io.IOException;

public class WordFileReader {

    public static void main(String[] args){

        WordFileReader obj = new WordFileReader();
        System.out.println(obj.getFileWithUtil("test.docx"));
    }

    private String getFileWithUtil(String fileName) {
        String result = "";
        ClassLoader classLoader = getClass().getClassLoader();
        try{
            result = IOUtils.toString(classLoader.getResourceAsStream(fileName));

        } catch (IOException e) {
            System.out.println(fileName + ": file is not accessible or not present");
        }
        return result;
    }

}
