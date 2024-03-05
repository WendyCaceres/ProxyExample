package com.upb.proxy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Images!!!");
        RealImage image1 = new RealImage("Sticker.jpg");
        RealImage image2 = new RealImage("CocaCola.jpg");
        RealImage image3 = new RealImage("Noentiendo.jpg");

        // Crear instancias de ProxyImage
        Image proxyImage1 = new ProxyImage("Sticker.jpg");
        Image proxyImage2 = new ProxyImage("CocaCola.jpg");
        Image proxyImage3 = new ProxyImage("Noentiendo.jpg");

        // Mostrar imágenes a través de ProxyImage
        proxyImage1.display(); // Se carga y muestra la imagen Sticker.jpg
        proxyImage2.display(); // Se carga y muestra la imagen CocaCola.jpg
        proxyImage3.display(); // No se vuelve a cargar, se muestra la imagen ya cargada
        // Image image = new ProxyImage("example.jpg");
        //image.display();
        //image.display();

    }
}
