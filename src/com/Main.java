package com;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product prod1 = new Product("Полка с книгами", "Книга", 300,
                true, LocalDate.of(2020, 4, 15));
        Product prod2 = new Product("Полка с журналами", "Журнал", 200,
                true, LocalDate.of(2022, 1, 30));
        Product prod3 = new Product("Полка с книгами", "Книга", 150,
                false, LocalDate.of(2023, 8, 21));
        Product prod4 = new Product("Полка с газетами", "Газета", 120,
                true, LocalDate.of(2023, 2, 12));
        Product prod5 = new Product("Полка с книгами", "Книга", 900,
                true, LocalDate.of(2021, 9, 4));

        List<Product> products = new ArrayList<>();
        products.add(prod1);
        products.add(prod2);
        products.add(prod3);
        products.add(prod4);
        products.add(prod5);

        Product.getFilterByTypePrice(products);
        Product.getFilterByTypeDiscount(products);
        Product.getCheapestBook(products, "Книга");
        Product.getFilterByAddedDate(products);
        Product.getTotalPrice(products);
        Product.getSortByType(products);
    }
}
