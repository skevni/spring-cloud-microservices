package ru.gb.sklyarov.common.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductDto {
    private Long id;
    private String title;
    private int price;

    public ProductDto(Long id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }
}
