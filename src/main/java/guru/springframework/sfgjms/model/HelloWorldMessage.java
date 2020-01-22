package guru.springframework.sfgjms.model;

import java.io.Serializable;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

public class HelloWorldMessage implements Serializable {
    // Serializable =if sending a jms object

    static final long serialVersionUID= -4347409917915495373L;

    private UUID id;
    private String message;
}
