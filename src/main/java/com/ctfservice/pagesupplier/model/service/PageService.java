package com.ctfservice.pagesupplier.model.service;

import com.ctfservice.pagesupplier.model.entity.Pages;
import com.ctfservice.pagesupplier.repo.IPageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.util.Optional;

@Service
public class PageService {

    @Autowired
    private IPageRepository pageRepository;
    @Autowired
    EntityManager em;

    public Iterable<Pages> getAll() {
        return pageRepository.findAll();
    }

    public Optional<Pages> getById(String path) {
        return pageRepository.findById(path);
    }

    public void createPage(Pages page) {
        pageRepository.save(page);
    }

    public void updatePage(String path, Pages page) {
        Optional<Pages> _oldPage = pageRepository.findById(path);
        if(_oldPage.isPresent()){
            Pages oldPage = _oldPage.get();
            oldPage.setContent(page.getContent());
            pageRepository.save(oldPage);
        }

    }

    public void deletePage(String path) {
        pageRepository.deleteById(path);
    }
}
