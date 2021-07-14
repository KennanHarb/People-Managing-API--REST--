package one.digital.innovation.peopleapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digital.innovation.peopleapi.enums.PhoneType;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {
    private Long id;
    private PhoneType type;
    private String number;
}
