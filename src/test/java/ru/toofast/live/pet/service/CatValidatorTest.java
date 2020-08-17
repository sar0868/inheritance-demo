package ru.toofast.live.pet.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.toofast.live.pet.model.Cat;
import ru.toofast.live.pet.model.CatType;
import ru.toofast.live.pet.repository.CatRepository;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CatValidatorTest {

    @Test
    void tryToCertify() {
        Cat oriental = new Cat("Barsik", "red", CatType.ORIENTAL, false);
        CatValidator catValidator = cat -> true;
        CatRepository catRepository = () -> new Cat("Masha", "red", CatType.ORIENTAL, false);
        CatExhibitionService catExhibitionService = new CatExhibitionService(catRepository, catValidator);

        Optional<Cat> bride = catExhibitionService.findBride(oriental);

        Assertions.assertFalse(bride.isPresent());
        Assertions.assertEquals("Masha", bride.get().getName());
    }
}