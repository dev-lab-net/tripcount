package net.devlab.tripcount.model;

import java.time.LocalDateTime;
import java.util.List;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Property;
import dev.morphia.annotations.Reference;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Entity
public class Expense {

    @Reference
    @Property
    private Participant spender;
    @Property
    private Double amount;
    @Property
    private LocalDateTime time;
    @Reference
    @Property
    private List<Participant> beneficiaries;
}
