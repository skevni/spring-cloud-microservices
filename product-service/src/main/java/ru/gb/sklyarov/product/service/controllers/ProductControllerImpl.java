package ru.gb.sklyarov.product.service.controllers;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.sklyarov.common.dtos.ProductDto;
import ru.gb.sklyarov.product.service.entities.Product;
import ru.gb.sklyarov.product.service.services.ProductService;

import java.util.List;

@RestController
public class ProductControllerImpl implements ProductController {
    private final ProductService productService;
    @Autowired
    @Lazy
    private EurekaClient eurekaClient;
    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    public ProductControllerImpl(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public List<ProductDto> findAllProducts() {
        return productService.findAll();
    }

    @Override
    public Product add() {
        return null;
    }

    @Override
    public void remove(String productId) {

    }
}
