package mk.ukim.finki.wp.exam.example.service;

import mk.ukim.finki.wp.exam.example.model.Category;

import java.util.List;
import java.util.Optional;

/**
 * 5 points
 */
public interface CategoryService {
    /**
     *
     * @param id
     * @return mk.ukim.finki.wp.exam.example.model.exceptions.InvalidCategoryIdException when there is no category with the given Id
     */
    Category findById(Long id);

    List<Category> listAll();

    Category create(String name);
}
