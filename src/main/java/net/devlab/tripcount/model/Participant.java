package net.devlab.tripcount.model;

import java.util.List;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Property;
import dev.morphia.annotations.Reference;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class Participant {

    @Property
    private String name;
    @Property
    private Double weight;
    @Reference
    @Property
    private List<Expense> expenses;
}
