package fr.apir.marvel.api.util;

import fr.apir.marvel.api.objects.Image;

/**
 * Created by Piroelle on 05/03/14.
 */
public class ImageUtil {

    public static String getImageUrl(Image image) {
        return getImageUrl(image, ImageAspectRatio.STANDARD_XLARGE);
    }

    public static String getImageUrl(Image image, ImageAspectRatio imageAspectRatio) {
        if (imageAspectRatio == ImageAspectRatio.FULL_SIZE) {
            return image.getPath() + "." + image.getExtension();
        } else {
            return image.getPath() + "/" + imageAspectRatio + "." + image.getExtension();
        }

    }

    public enum ImageAspectRatio {
        PORTRAIT_SMALL("portrait_small"),
        PORTRAIT_MEDIUM("portrait_medium"),
        PORTRAIT_XLARGE("portrait_xlarge"),
        PORTRAIT_FANTASTIC("portrait_fantastic"),
        PORTRAIT_UNCANNY("portrait_uncanny"),
        PORTRAIT_INCREDIBLE("portrait_incredible"),

        STANDARD_SMALL("standard_small"),
        STANDARD_MEDIUM("standard_medium"),
        STANDARD_LARGE("standard_large"),
        STANDARD_XLARGE("standard_xlarge"),
        STANDARD_FANTASTIC("standard_fantastic"),
        STANDARD_AMAZING("standard_amazing"),

        LANDSCAPE_SMALL("landscape_small"),
        LANDSCAPE_MEDIUM("landscape_medium"),
        LANDSCAPE_LARGE("landscape_large"),
        LANDSCAPE_XLARGE("landscape_xlarge"),
        LANDSCAPE_FANTASTIC("landscape_fantastic"),
        LANDSCAPE_INCREDIBLE("landscape_incredible"),

        DETAIL("detail"),
        FULL_SIZE("fullsize");

        private String label;

        private ImageAspectRatio(String value) {
            this.label = value;
        }

        @Override
        public String toString() {
            return this.label;
        }
    }
}
