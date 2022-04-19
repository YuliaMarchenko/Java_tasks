package com.company;

import java.util.List;

public class ImageProcessor {
    public static void main(String[] args){
        String fileName = args[0];

        FileService fileService = new FileService();
        ImageDescriptorService imageDescriptorService = new ImageDescriptorService(fileService);

        List<ImageDescription> imageDescriptors = imageDescriptorService.geteImageDescriptors(fileName);

        imageDescriptors.stream().forEach(s-> System.out.println(s));
    }
}
