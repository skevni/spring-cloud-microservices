package ru.gb.sklyarov.front.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.sklyarov.common.dtos.ProductDto;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FrontControllerImpl {
    private final FrontController frontController;

    @RequestMapping("/products")
    public List<ProductDto> findAllProducts() {
        return frontController.findAllProducts();
    }
}
