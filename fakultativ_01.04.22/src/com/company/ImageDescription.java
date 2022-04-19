package com.company;

public class ImageDescription {
    private String imageUrlName;
    private String actionName;

    public ImageDescription(String imageUrlName, String actionName) {
        this.imageUrlName = imageUrlName;
        this.actionName = actionName;
    }

    public String getImageUrlName() {
        return imageUrlName;
    }

    public String getActionName() {
        return actionName;
    }

    @Override
    public String toString() {
        return "ImageDescription{" +
                "imageUrlName='" + imageUrlName + '\'' +
                ", actionName='" + actionName + '\'' +
                '}';
    }
}
