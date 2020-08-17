package ru.toofast.live.pet.service;

import ru.toofast.live.pet.model.Cat;
import ru.toofast.live.pet.model.CatType;

interface CatValidator {

    public boolean tryToCertify(Cat cat);
}
