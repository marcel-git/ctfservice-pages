package com.ctfservice.pagesupplier.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ctfservice.pagesupplier.model.entity.Pages;

public interface IPageRepository extends JpaRepository<Pages, String>{
}
