package at.itkollegimst.studentenverwaltung.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ExceptionDTO {

    private String code;
    private String message;
}
