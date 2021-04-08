package com.ctfservice.pagesupplier.controller;

import com.ctfservice.pagesupplier.controller.interfaces.IRequest;
import com.ctfservice.pagesupplier.model.entity.Pages;
import com.ctfservice.pagesupplier.model.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/")
public class PageController implements IRequest {

    @Autowired
    PageService service;

    /**
     * @return all Pages stored in the database
     */
    @Override
    public Iterable<Pages> getAll() {
        return service.getAll();
    }

    /**
     * Gets a specific page by its id
     * @param path the id
     * @return the requested page
     */
    @Override
    public Optional<Pages> getById(String path) {
        return service.getById(path);
    }

    /**
     * Converts the page send into a database entry
     * @param page a page object
     * @return
     */
    @Override
    public ResponseEntity<String> createPage(Pages page) {
        //TODO Handle failure/errors and check vor validity
        service.createPage(page);
        return null;
    }

    /**
     * Updates the values of the page
     * @param path the page to be updated
     * @param page the updated page
     * @return
     */
    @Override
    public ResponseEntity<Pages> updatePage(String path, Pages page) {
        //TODO Handle failure/errors and check vor validity
        service.updatePage(path, page);
        return null;
    }

    /**
     * Deletes the page by its id from the database
     * @param path the pages id
     * @return
     */
    @Override
    public ResponseEntity<String> deletePage(String path) {
        //TODO Handle failure/errors and check vor validity
        service.deletePage(path);
        return null;
    }
}
