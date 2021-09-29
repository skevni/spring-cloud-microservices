package ru.gb.sklyarov.front.controllers;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import ru.gb.sklyarov.common.dtos.ProductDto;

import java.util.List;


@FeignClient("product-service-client")
public interface FrontController {
    @GetMapping("/products")
    List<ProductDto> findAllProducts();
}
