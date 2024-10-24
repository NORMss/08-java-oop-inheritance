package com.eltex;

import com.eltex.data.AttachmentType;
import com.eltex.data.WallService;

public class Main {
    public static void main(String[] args) {
        final var service = new WallService();
        System.out.println(service.getPost() + "\n\n");
        service.setCoordinates(1, 2);
        service.setAttachment("https://normno.ru/image/norm_logo.svg", AttachmentType.IMAGE);
        System.out.println(service.getPost());
    }
}