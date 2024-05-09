package org.example.productcatalogserviceproxy.Controllers;

import org.example.productcatalogserviceproxy.Services.ICategoryService;

public class CategoryController {

    ICategoryService categoryService;

    public CategoryController( ICategoryService categoryService) {
        this.categoryService = categoryService;
    }
}
