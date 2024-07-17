package com.example.gsondemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.google.gson.Gson;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Lab 05");

        Button button = new Button("Click here");
        button.setOnAction(event -> parseJSON());

        VBox vbox = new VBox(button);
        Scene scene = new Scene(vbox, 180, 120);

        stage.setScene(scene);
        stage.show();
    }

    public void parseJSON() {
        String jsonString = "{\"productID\":1,\"productName\":\"cellphone\",\"orderDate\":\"2025-07-15\",\"manufacturer\":\"Apple\"}";
        Gson gson = new Gson();
        Product product = gson.fromJson(jsonString, Product.class);
        System.out.println("Product ID: " + product.productID);
        System.out.println("Product Name: " + product.productName);
        System.out.println("Order Date: " + product.orderDate);
        System.out.println("Manufacturer: " + product.manufacturer);

        String jsonOutput = gson.toJson(product);
        System.out.println("The output for JSON: " + jsonOutput);
    }

    public static void main(String[] args) {
        launch();
    }
}
