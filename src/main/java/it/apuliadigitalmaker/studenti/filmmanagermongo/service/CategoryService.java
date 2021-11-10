package it.apuliadigitalmaker.studenti.filmmanagermongo.service;


import java.util.List;

import it.apuliadigitalmaker.studenti.filmmanagermongo.requestDto.CategoryRequestDto;
import it.apuliadigitalmaker.studenti.filmmanagermongo.responseDto.CategoryResponseDto;

public interface CategoryService {
	
	public List<CategoryResponseDto> findCategories(String name) ;
	
	//public CategoryResponseDto findCategoryById(Long id);
	
	//public CategoryResponseDto createCategory(CategoryRequestDto categoryRequest);
	
	//public CategoryResponseDto updateCategory(CategoryRequestDto categoryRequest, Long categoryId);
	
	//public boolean deleteCategory(Long id);

	public CategoryResponseDto findCategoryById(String id);

	public CategoryResponseDto updateCategory(CategoryRequestDto categoryRequest, String categoryId);

	public boolean deleteCategory(String id);

	public CategoryResponseDto createCategory(CategoryRequestDto categoryRequest);

}
