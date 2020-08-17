package ru.toofast.live.pet.repository;

import ru.toofast.live.pet.model.Cat;

import java.util.Set;

public class CertifiedCatRepository implements CatRepository {

    private Set<Cat> cats;

    public CertifiedCatRepository(Set<Cat> cats) {
        this.cats = cats;
    }

    @Override
    public Cat getBride(){
        return cats.iterator().next();
    }

}
