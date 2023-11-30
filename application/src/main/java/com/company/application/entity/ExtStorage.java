package com.company.application.entity;

import com.company.inventorycontrolsystem.entity.Storage;
import io.jmix.core.entity.annotation.ReplaceEntity;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalTime;

@JmixEntity
@Entity
@ReplaceEntity(Storage.class)
public class ExtStorage extends Storage {
    @Column(name = "ACTIVE")
    private Boolean active;

    @Column(name = "WORKS_FROM")
    private LocalTime worksFrom;

    @Column(name = "WORKS_TO")
    private LocalTime worksTo;

    public LocalTime getWorksTo() {
        return worksTo;
    }

    public void setWorksTo(LocalTime worksTo) {
        this.worksTo = worksTo;
    }

    public LocalTime getWorksFrom() {
        return worksFrom;
    }

    public void setWorksFrom(LocalTime worksFrom) {
        this.worksFrom = worksFrom;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}