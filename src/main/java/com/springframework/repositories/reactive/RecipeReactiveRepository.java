package com.springframework.repositories.reactive;

import com.springframework.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface RecipeReactiveRepository  extends ReactiveMongoRepository<Recipe, String> {
}
