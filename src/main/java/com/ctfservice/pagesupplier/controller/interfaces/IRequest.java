package com.ctfservice.pagesupplier.controller.interfaces;

import com.ctfservice.pagesupplier.model.entity.Pages;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping
public interface IRequest {

    @GetMapping("/")
    Iterable<Pages> getAll();

    @GetMapping("/{path}")
    Optional<Pages> getById(@PathVariable String path);

    @PostMapping
    public ResponseEntity<String> createPage(@RequestBody Pages page);

    @PutMapping("/{path}")
    public ResponseEntity<Pages> updatePage(@PathVariable String path, @RequestBody Pages page);

    @DeleteMapping("/{path}")
    public ResponseEntity<String> deletePage(@PathVariable String path);
}
