package com.ctfservice.pagesupplier.model.entity;

import lombok.Data;
import javax.persistence.*;

/**
 * The class representing a page in the database
 */
@Entity
@Data
public class Pages {

    @Id
    private String path;

    private String content;

}
