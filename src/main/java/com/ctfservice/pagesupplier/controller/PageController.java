package com.ctfservice.pagesupplier.controller;

import com.ctfservice.pagesupplier.controller.interfaces.IRequest;
import com.ctfservice.pagesupplier.model.entity.Pages;
import com.ctfservice.pagesupplier.model.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/content")
public class PageController implements IRequest {

    @Autowired
    PageService service;

    @Override
    public Iterable<Pages> getAll() {
        return service.getAll();
    }

    @Override
    public Optional<Pages> getById(String path) {
        return service.getById(path);
    }

    @Override
    public ResponseEntity<String> createPage(Pages page) {
        //TODO Handle failure/errors and check vor validity
        service.createPage(page);
        return null;
    }

    @Override
    public ResponseEntity<Pages> updatePage(String path, Pages page) {
        //TODO Handle failure/errors and check vor validity
        service.updatePage(path, page);
        return null;
    }

    @Override
    public ResponseEntity<String> deletePage(String path) {
        //TODO Handle failure/errors and check vor validity
        service.deletePage(path);
        return null;
    }
}
