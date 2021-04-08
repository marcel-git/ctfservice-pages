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

    /**
     * Accesses the page repository and returns all of its entry
     * @return all pages
     */
    public Iterable<Pages> getAll() {
        return pageRepository.findAll();
    }

    /**
     * Returns a entry by its id
     * @param path the id
     * @return the requested page
     */
    public Optional<Pages> getById(String path) {
        return pageRepository.findById(path);
    }

    /**
     * Saves the page to the repository
     * @param page
     */
    public void createPage(Pages page) {
        pageRepository.save(page);
    }

    /**
     * Updates the contents of page path to the contents of Page page
     * @param path
     * @param page
     */
    public void updatePage(String path, Pages page) {
        Optional<Pages> _oldPage = pageRepository.findById(path);
        if(_oldPage.isPresent()){
            Pages oldPage = _oldPage.get();
            oldPage.setContent(page.getContent());
            pageRepository.save(oldPage);
        }

    }

    /**
     * Deletes the page specified by path
     * @param path
     */
    public void deletePage(String path) {
        pageRepository.deleteById(path);
    }
}
