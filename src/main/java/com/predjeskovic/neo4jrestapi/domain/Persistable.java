package com.predjeskovic.neo4jrestapi.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;

import java.util.Objects;

public class Persistable {

    @Id @GeneratedValue
    @Getter @Setter(AccessLevel.PROTECTED)
    private Long id;

    public boolean isNew(){
        return id==null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persistable that = (Persistable) o;
        return Objects.equals(id, that.id);
    }

}