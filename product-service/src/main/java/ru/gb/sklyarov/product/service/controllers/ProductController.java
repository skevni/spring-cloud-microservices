package ru.gb.sklyarov.product.service.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gb.sklyarov.common.dtos.ProductDto;
import ru.gb.sklyarov.product.service.entities.Product;

import java.util.List;

public interface ProductController {
    @RequestMapping("/products")
    List<ProductDto> findAllProducts();

    @RequestMapping("/products/add")
    Product add();

    @RequestMapping("/products/remove{productId}")
    void remove(@PathVariable String productId);

}
