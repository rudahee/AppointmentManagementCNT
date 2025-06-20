package org.cnt.appointmentmanagementtest.person_in_need.model.db.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cnt.appointmentmanagementtest.appointment.model.db.entities.Appointment;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonInNeed {

    @Id
    @GeneratedValue
    private UUID id;
    private String name;
    private String phone;
    private String email;

    @OneToMany(mappedBy = "personInNeed")
    private List<Appointment> appointments;

}
