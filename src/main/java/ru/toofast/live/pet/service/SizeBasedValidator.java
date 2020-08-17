package ru.toofast.live.pet.service;

import ru.toofast.live.pet.model.Cat;

public class SizeBasedValidator implements CatValidator {
    @Override
    public boolean tryToCertify(Cat cat) {
        return false;
    }
}
