package com.example.jujuassembly.domain.category.dto;

import com.example.jujuassembly.domain.category.entity.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CategoryResponseDto {


  private Long id;

  private String name;

  private String image;

  public CategoryResponseDto(Category category) {
    id = category.getId();
    name = category.getName();
    image = category.getImage();
  }
}