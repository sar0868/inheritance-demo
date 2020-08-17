package ru.toofast.live.pet.service;

import ru.toofast.live.pet.model.Cat;
import ru.toofast.live.pet.model.CatType;
import ru.toofast.live.pet.repository.CatRepository;
import ru.toofast.live.pet.repository.CertifiedCatRepository;

import java.util.Collections;
import java.util.Optional;

public class CatExhibitionService {

    private CatRepository certifiedCatRepository;
    private CatValidator catValidator;

    public CatExhibitionService(CatRepository certifiedCatRepository, CatValidator catValidator) {
        this.certifiedCatRepository = certifiedCatRepository;
        this.catValidator = catValidator;
    }

    public Optional<Cat> findBride(Cat cat) {
        if (cat.isCertified()) {
            Cat bride = certifiedCatRepository.getBride();
            return Optional.of(bride);
        } else {
            boolean passed = catValidator.tryToCertify(cat);
            if (passed) {
                Cat bride = certifiedCatRepository.getBride();
                return Optional.of(bride);
            } else {
                return Optional.empty();
            }
        }
    }


}
