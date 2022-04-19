package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImageDescriptorService {

    private FileService fileService;

    public ImageDescriptorService(FileService fileService) {
        this.fileService = fileService;
    }

    public List<ImageDescription> geteImageDescriptors(String fileName) {
       /* List<ImageDescriptor> imageDescriptors = new ArrayList<>();

        List<String> strings = fileService.loadStringsFormFile(fileName);

        for (int i=0; i<strings.size();i++){
            String s = strings.get(i);
            ImageDescriptor id = stringToImageDescriptor(s);
            imageDescriptors.add(id);
        }*/

     return fileService.loadStringsFormFile(fileName).stream()
                .map(s -> stringToImageDescriptor(s))
                .collect(Collectors.toList());
    }

    private static ImageDescription stringToImageDescriptor(String string){
        String[] split = string.split((";"));
        return new ImageDescription(split[0], split[1]);
    }
}
