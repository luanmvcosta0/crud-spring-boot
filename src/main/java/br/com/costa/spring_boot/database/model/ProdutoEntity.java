package br.com.costa.spring_boot.database.model;

import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ProdutoEntity {

    private Integer id;
    private String name;
    private BigDecimal price;
    private Integer stock;

    private static final List<ProdutoEntity> PRODUTOS = List.of(
            ProdutoEntity.builder()
                    .id(1)
                    .name("Iphone")
                    .price(new BigDecimal (6.600))
                    .stock(5)
                    .build(),
            ProdutoEntity.builder()
                    .id(2)
                    .name("Notebook")
                    .price(new BigDecimal (4.500))
                    .stock(9)
                    .build(),
            ProdutoEntity.builder()
                    .id(3)
                    .name("Mouse")
                    .price(new BigDecimal (340))
                    .stock(22)
                    .build()
    );
}
