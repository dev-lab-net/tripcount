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
public class Trip {

    @Property
    private String name;
    @Property
    private String currency;
    @Property
    private LocalDateTime creationDate;
    @Reference
    @Property
    private List<Participant> participants;
}
