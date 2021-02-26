package com.ctfservice.pagesupplier.model.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
public class Pages {

    @Id
    private String path;

    private String content;

}
