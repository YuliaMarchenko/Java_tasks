package com.company;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Collections;

import java.util.Collections;
import java.util.stream.Collectors;

public class FileService {

    private static String File_name = "test.txt";

    public FileService() {
    }
//// ??????
    public List<String> loadStringsFormFile(String fileName){
        try {
            return List < String > strings = Files.lines(Path.get(fileName)).collect(Collectors.toList());
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            return Collections.emptyList();
        }
    }
}
